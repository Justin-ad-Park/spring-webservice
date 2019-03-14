# spring-webservice [![Build Status](https://travis-ci.org/Justin-ad-Park/spring-webservice.svg?branch=master)](https://travis-ci.org/Justin-ad-Park/spring-webservice)

스프링으로 웹서비스 출시하기

https://justinadpark.tistory.com/category/Spring

2019/2/24 6단계) travis를 이용한 배포까지 구성
2019/2/26 7단계) nginx를 통한 무중단 배포
2019/2/27 8단계) RDS 연결

#아래 소스로 구성함#####################################

# 상용 application.yml을 형상관리 서버에 커밋하지 않고, 분리함.
# 추후 spring configuration server로 이관을 통해 형상 관리 가능

sudo mkdir -p /app/config/springboot-webservice
sudo vim /app/config/springboot-webservice/real-application.yml

---
spring:
  profiles: real-db
  datasource:
    url: jdbc:mariadb://springbootwebservice.c8exkgrujovs.ap-northeast-2.rds.amazonaws.com:3306/webservice
    username: dbuser
    password: qweasd23
    #driverclassName: org:mariadb:jdbc:Driver
    #driver-class-name: org:mariadb:jdbc:Driver
###################################################


#### 웹 서비스 자동 실행용 스크립트 ######################
sudo vim /etc/init/spring-webservice.conf

description "Hello spring-webservice"

# Start when the system is ready to do networking.
start on started elastic-network-interfaces

# Stop when the system is on its way down.
stop on shutdown

#respawn
script
    exec su --session-command="/bin/su - ec2-user /home/ec2-user/app/nonstop/execute-spring-webservice.sh"
end script
#####################################################



#### NGINX 서비스 자동 스타트 설정 ########################
cd /etc/init.d
sudo chkconfig nginx on
#####################################################

# Local에서 Profile을 이용 set1으로 테스트 하려면...
RUN > Edit Configuration 에서
  VM에
  -Dspring.profiles.active=set1

