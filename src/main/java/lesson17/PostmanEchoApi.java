package lesson17;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostmanEchoApi {

    private static final String BASE_URI = "https://postman-echo.com";
    private static final String BODY = "This is expected to be sent back as part of response body.";

    public Response getWoopsRequest() {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .contentType("application/json")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .log().all()
                .get("/get");
    }

    public Response getRequest() {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .log().all()
                .get("/get");
    }

    public Response postRawTextRequest() {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .body(BODY)
                .when()
                .log().all()
                .post("/post");
    }

    public Response postFormDataRequest() {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post");
    }

    public Response putRequest() {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .body(BODY)
                .when()
                .log().all()
                .put("/put");
    }

    public Response patchRequest() {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .body(BODY)
                .when()
                .log().all()
                .patch("/patch");
    }

    public Response deleteRequest() {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .body(BODY)
                .when()
                .log().all()
                .delete("/delete");
    }
}

