package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


class PostmanApiTest {
@Test
void shouldCheckRequestPost(){
    given()
            .baseUri("https://postman-echo.com")
            .body("20.06.2020")
            .when()
            .post("/post")
            .then()
            .statusCode(200)
            .body("data", equalTo("20.08.2020"));
}
}
