#!/bin/bash
BASE_PATH=/home/ec2-user/app/nonstop
BUILD_PATH=$(ls $BASE_PATH/spring-webservice/build/libs/*.jar)
JAR_NAME=$(basename $BUILD_PATH)
echo "> build 파일명: $JAR_NAME"

JAR_NAME1=set1-spring-webservice.jar
JAR_NAME2=set2-spring-webservice.jar

DEPLOY_PATH=$BASE_PATH/jar/
ln -Tfs $DEPLOY_PATH$JAR_NAME $DEPLOY_PATH$JAR_NAME1
ln -Tfs $DEPLOY_PATH$JAR_NAME $DEPLOY_PATH$JAR_NAME2<Paste>
