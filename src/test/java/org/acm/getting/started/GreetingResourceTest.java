package org.acm.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/12/8 9:55
 * @Version: v1.0
 * @Modified：
 * @Description:
 */
@QuarkusTest
public class GreetingResourceTest {
    @Test
    public void testHelloEndpoint() {
        given().when()
                .get("/hello")
                .then()
                .statusCode(200)
                .body(is("hello"));
    }

    @Test
    public void testGreetingEndpoint() {
        String uuid = UUID.randomUUID().toString();
        given()
                .pathParam("name", uuid)
                .when()
                .get("/hello/greeting/{name}")
                .then()
                .statusCode(200)
                .body(is("hello " + uuid));

//        String uuid = UUID.randomUUID().toString();
//        given()
//                .pathParam("name", uuid)
//                .when().get("/hello/greeting/{name}")
//                .then()
//                .statusCode(200)
//                .body(is("hello " + uuid));
    }
}
