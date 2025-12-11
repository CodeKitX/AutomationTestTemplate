package interview.api;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;


public class ApiClient {
    private final String baseUrl;

    public ApiClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Response get(String path) {
        return given()
                .baseUri(baseUrl)
                .when()
                .get(path);
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }
}
