#!/bin/bash

REPOSITORY=/home/ec2-user/app/git
APPNAME=spring-webservice
cd $REPOSITORY/$APPNAME/

echo "> Restart SpringBoot Webservice"
echo "> Querying the pid of current application"

CURRENT_PID=$(pgrep -f $APPNAME)

echo "$CURRENT_PID"

if [ -z $CURRENT_PID ]; then
    echo "> There are any running appliction. so we doen't need to stop any process."
else
    echo "> kill $CURRENT_PID"
    kill $CURRENT_PID
    sleep 5
fi

CURRENT_PID=$(pgrep -f $APPNAME)
if [ $CURRENT_PID ]; then

    echo "> kill -9 $CURRENT_PID"
    kill -9 $CURRENT_PID
    sleep 5
fi
echo "> Deploy new application"

JAR_NAME=$(ls -tr $REPOSITORY/ |grep $APPNAME | tail -n 1)

echo "> JAR Name: $JAR_NAME"

nohup java -jar $REPOSITORY/$JAR_NAME &
tail -f nohup.out
