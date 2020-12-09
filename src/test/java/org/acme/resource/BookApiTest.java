package org.acme.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/12/9 17:49
 * @Version: v1.0
 * @Modified：
 * @Description:
 */
@QuarkusTest
class BookApiTest {

    @Test
    void get() {
        final String id = "";
        given()
                .pathParam("id", id)
                .when()
                .get("/{id}")
                .then()
                .statusCode(200)
                .body(is(id));


    }

    @Test
    void post() {
    }

    @Test
    void put() {
    }

    @Test
    void delete() {
    }

    @Test
    void list() {
    }
}