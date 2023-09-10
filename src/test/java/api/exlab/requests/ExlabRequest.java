package api.exlab.requests;

import api.exlab.common.DataForApi;
import api.exlab.utilities.ApiUtils;
import api.exlab.utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ExlabRequest {

    public static Response response;
    public static int userID;
    public static String token;
    public static int experience_ID;
    public static String experience_job;

    public static Response registerNewUser(String name,String email,String password,String about,String terms){
       response = given().accept(ContentType.JSON)
                .and()
                .body(DataForApi.registerUserBody(name, email, password, about, terms))
                .when()
                .post(ConfigurationReader.get("postRegisterUser"));
       userID=response.path("id");
        System.out.println("userID = " + userID);
        token=response.path("token");

        return response;
    }
    public static Response postExperience(String job,String company,String location,String fromdate,String todate,String current,String description){
        response=given().accept(ContentType.JSON)
                .and()
                .headers(ApiUtils.getToken(ConfigurationReader.get("email"),ConfigurationReader.get("password")))
                .and()
                .body(DataForApi.userExperienceBody(job, company, location, fromdate, todate, current, description))
                .when()
                .post(ConfigurationReader.get("postExperience"));

        experience_ID=response.path("id");
        experience_job=response.path("job");

        return response;
    }
}
