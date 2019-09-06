#!/bin/bash

REPOSITORY=/home/ec2-user/app/travis
APPNAME=spring-webservice
echo "Querying the pid of current application"

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

echo "> Copy Build file "

cp $REPOSITORY/build/build/libs/*.jar $REPOSITORY/jar/

JAR_NAME=$(ls -tr $REPOSITORY/jar/ |grep $APPNAME | tail -n 1)

echo "> JAR Name: $JAR_NAME"

nohup java -jar $REPOSITORY/jar/$JAR_NAME &

[ec2-user@ip-172-31-26-23 travis]$ ls
build  deploy.sh  jar  nohup.out  restartSpringWebService.sh
[ec2-user@ip-172-31-26-23 travis]$ cat restartSpringWebService.sh
#!/bin/bash

REPOSITORY=/home/ec2-user/app/travis
APPNAME=spring-webservice

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

JAR_NAME=$(ls -tr $REPOSITORY/jar |grep $APPNAME | tail -n 1)

echo "> JAR Name: $JAR_NAME"

nohup java -jar $REPOSITORY/jar/$JAR_NAME &
