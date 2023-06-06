package utilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AuthenticationMedunna {
    public AuthenticationMedunna() {
    }

    public static String generateToken() {
        String body = "{ \"password\": \"Mark.123\", \"rememberMe\": true, \"username\": \"mark_twain\"}";
        Response response = (Response) RestAssured.given().contentType(ContentType.JSON).body(body).post("https://medunna.com/api/authenticate", new Object[0]);
        return response.jsonPath().getString("id_token");
    }
}
