package interview.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class ApiTest {

    @Test
    void sanity_shouldCallPublicApi() {
        given()
            .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
            .then()
                .statusCode(200)
                .body("userId", notNullValue())
                .body("title", notNullValue());
    }
}
