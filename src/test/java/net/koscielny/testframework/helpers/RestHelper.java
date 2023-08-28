package net.koscielny.testframework.helpers;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.net.URL;

@Component
public class RestHelper {

    private RequestSpecification requestSpecification;
//    @Autowired
    private Response response;

    @Value("${base.url}")
    private String baseUri;

    public RestHelper() {
    }
    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    public void loadUrl(String url) {
        RestAssured.baseURI = getBaseUri();
        requestSpecification = given();
        setResponse(requestSpecification.get(url));
    }

    public RequestSpecification configureHandle(URL url, String basePath, ContentType contentType) {
        RequestSpecification requestConfiguration = new RequestSpecBuilder()
                .setBaseUri(url.toString())
                .setBasePath(basePath)
                .build();
        return given().spec(requestConfiguration).accept(contentType);
    }

    public RequestSpecification getRequestHandle() {
        RestAssured.baseURI = getBaseUri();
        requestSpecification = given();
        return requestSpecification;
    }

    public Response getResponse() {
        if (response == null)
            throw new RuntimeException("url was not yet loaded!");
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
