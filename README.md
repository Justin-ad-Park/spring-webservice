# spring-webservice [![Build Status](https://travis-ci.org/Justin-ad-Park/spring-webservice.svg?branch=master)](https://travis-ci.org/Justin-ad-Park/spring-webservice)

스프링으로 웹서비스 출시하기
https://jojoldu.tistory.com/259?category=635883

2019/2/24 6단계) Travis CI를 이용한 빌드까지 성공


# 상용 application.yml을 형상관리 서버에 커밋하지 않고, 분리함.
# 추후 spring configuration server로 이관을 통해 형상 관리 가능

sudo mkdir -p /app/config/springboot-webservice
sudo vim /app/config/springboot-webservice/real-application.yml

#아래 소스로 구성함

---
spring:
  profiles: set1
server:
  port: 8081

---
spring:
  profiles: set2

server:
  port: 8082



# Profile을 set1로 테스트 하려면...
RUN > Edit Configuration 에서
  VM에
  -Dspring.profiles.active=set1