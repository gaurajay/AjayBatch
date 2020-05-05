package APIAutomation.APIAuto;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetMethod {
  public static void main(String[] args) {
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .get("http://localhost:3000/friends");
	  
	  System.out.println("******Status code*******");
	  System.out.println("Status code is " +res.statusCode());
	  
	  System.out.println("***********Data is***********");
	  System.out.println("Data is "+res.asString());
	  
	  
}
}
