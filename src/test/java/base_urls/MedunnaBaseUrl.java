package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import utilities.AuthenticationMedunna;

public class MedunnaBaseUrl {

    public static RequestSpecification spec;

    public static void setUp() {
        spec = (new RequestSpecBuilder()).addHeader("Authorization", "Bearer " + AuthenticationMedunna.generateToken()).setBaseUri("https://medunna.com").build();
    }
}
