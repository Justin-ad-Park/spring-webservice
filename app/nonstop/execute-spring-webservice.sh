#!/bin/bash

BASE_PATH=/home/ec2-user/app/nonstop
BUILD_PATH=$(ls $BASE_PATH/spring-webservice/build/libs/*.jar)
JAR_NAME=$(basename $BUILD_PATH)
echo "> build 파일명: $JAR_NAME"

JAR_NAME1=set1-spring-webservice.jar
JAR_NAME2=set2-spring-webservice.jar

DEPLOY_PATH=$BASE_PATH/jar/
ln -Tfs $DEPLOY_PATH$JAR_NAME $DEPLOY_PATH$JAR_NAME1
ln -Tfs $DEPLOY_PATH$JAR_NAME $DEPLOY_PATH$JAR_NAME2


echo '-------------------------------' >> /home/ec2-user/app/nonstop/start.log
date >> /home/ec2-user/app/nonstop/start.log
echo 'Starting spring-webservice' >> /home/ec2-user/app/nonstop/start.log

USER=ec2-user
JAVA=/usr/bin/java
PROFILE1=set1
PROFILE2=set2


echo "/bin/su - $USER $JAVA -jar -Dspring.profiles.active=$PROFILE1 $DEPLOY_PATH//$JAR_NAME1 &" >> /home/ec2-user/app/nonstop/start.log
nohup $JAVA -jar -Dspring.profiles.active=$PROFILE1  $DEPLOY_PATH/$JAR_NAME1 &

sleep 20

echo "/bin/su - $USER $JAVA -jar -Dspring.profiles.active=$PROFILE2 $DEPLOY_PATH/$JAR_NAME2 &" >> /home/ec2-user/app/nonstop/start.log
nohup $JAVA -jar -Dspring.profiles.active=$PROFILE2  $DEPLOY_PATH/$JAR_NAME2 &
