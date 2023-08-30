package net.koscielny.testframework.tests.api;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.koscielny.testframework.base.api.rest.BaseRestTest;
import net.koscielny.testframework.helpers.RestHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.containsString;


@Test
public class ApiTest1 extends BaseRestTest {

    @Value("${base.url}")
    private String baseUri;

    @Autowired
    private RestHelper restHelper;

    @BeforeClass
    public void beforeClass() {
//        super.beforeClass();
        restHelper.setBaseUri(baseUri);
    }

    public void test_1() throws MalformedURLException {
        System.out.println("example test1 from testng");
        System.out.println("head stat code: " + restHelper.getRequestHandle().when().get("https://httpbin.org/headers").getStatusCode());
        restHelper.getRequestHandle().when().accept(ContentType.JSON).get("https://httpbin.org/headers")
                .then().assertThat().statusCode(200)
                .and().body(containsString("\"headers\""));

        RequestSpecification rrr = restHelper.configureHandle(new URL(restHelper.getBaseUri()), "post", ContentType.JSON);
        Map<String, String> param1 = new HashMap<>();
        param1.put("key", "val");
        rrr.params(param1).post().getBody().prettyPrint();
//        rrr.post().getBody().prettyPrint();
//        rrr.post("post").getBody().prettyPrint();
//        }
    }

    public void test_2(){
        System.out.println("example test2 from testng");
//        System.out.println("head stat code: " + apiHelper.givenAnd().when().get("https://httpbin.org/headers").getStatusCode());
//        apiHelper.givenAnd().when().accept(ContentType.JSON).get("https://httpbin.org/headers")
//                .then().assertThat().statusCode(200)
//                .and().body(containsString("\"headers\""));
//        apiHelper.setBaseUri("local_value :)");
        System.out.println(restHelper.getResponse());

    }

    public void test_3(){
        System.out.println("example test3 from testng");
//        RequestSpecification r = given();
//        if (r != null) {
//            Response resp = r.get("/api/users?page=2");
        restHelper.loadUrl("status/200");
        Response resp = restHelper.getResponse();
        System.out.println("Status code: '" + resp.getStatusCode() + "'.");
    }
}
