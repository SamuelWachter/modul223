package ch.zli.m223;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.core.Response;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculateNumbersTest {

    @Test
    public void testAddNumbersEndpoint() {
        given()
            .when().get("/calculator/add/12/30")
            .then()
            .statusCode(Response.Status.OK.getStatusCode())
            .body(is("42"));
    }
}
