# SpringBootBasic

CRUD 구현한 RESTful API

* 환경
  * Spring Boot
  * MySQL
  * mybatis
  
------------------


# 예시
```
/* 모든 User 정보 가져오기*/
GET방식
#http://localhost:8080/user

--------------------------------------------------------
/* 특정 User 정보 가져오기 (by userID)*/
GET방식
http://localhost:8080/user/kakao

--------------------------------------------------------
/* User 정보 등록 */
POST방식
http://localhost:8080/user

{
	"userNo" : 3
	,"userName" : "jaehun"
	,"userId" : "user1234"
	,"userPassword" : "1111"
}

--------------------------------------------------------
/* User 정보 수정 */
PUT방식
http://localhost:8080/user/user1234

{
	"userNo" : 3
	,"userName" : "jaehun111"
	,"userPassword" : "12314"
}

--------------------------------------------------------
/* User 정보 삭제 */
DEL방식
http://localhost:8080/user/user1234

```


