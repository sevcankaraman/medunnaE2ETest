//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package stepdefinitions;

import base_urls.MedunnaBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiRoomStepDefs {
    public ApiRoomStepDefs() {
    }

    @Given("send get request")
    public void send_get_request() {
        //Set the url
        MedunnaBaseUrl.spec.pathParams("first", "api", new Object[]{"second", "rooms"}).
                       queryParams("sort", "createdDate,desc", new Object[0]);
        //Set the excepted data

        //Send the request and get the response
        Response response = (Response)RestAssured.given(MedunnaBaseUrl.spec).get("{first}/{second}", new Object[0]);
        response.prettyPrint();
    }

    @Then("validate body")
    public void validate_body() {
    }


}
