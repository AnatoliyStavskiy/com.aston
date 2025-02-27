package lesson17;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPostmanEchoApi {
    private static PostmanEchoApi postmanEchoApi = new PostmanEchoApi();
    private static final String ASSERT_BODY = "This is expected to be sent back as part of response body.";

    @Test
    public void testGetWoopsRequest() {
        Response response = postmanEchoApi.getWoopsRequest();

        assertEquals(200, response.getStatusCode());
        assertEquals("bar1", response.jsonPath().getString("args.foo1"));
        assertEquals("bar2", response.jsonPath().getString("args.foo2"));
    }

    @Test
    public void testGetRequest() {
        Response response = postmanEchoApi.getRequest();

        assertEquals(200, response.getStatusCode());
        assertEquals("bar1", response.jsonPath().getString("args.foo1"));
        assertEquals("bar2", response.jsonPath().getString("args.foo2"));
    }

    @Test
    public void testPostRawTextRequest() {
        Response response = postmanEchoApi.postRawTextRequest();

        assertEquals(200, response.getStatusCode());
        assertEquals(ASSERT_BODY, response.jsonPath().getString("data"));
    }

    @Test
    public void testPostFormDataRequest() {
        Response response = postmanEchoApi.postFormDataRequest();

        assertEquals(200, response.getStatusCode());
        assertEquals("bar1", response.jsonPath().getString("form.foo1"));
        assertEquals("bar2", response.jsonPath().getString("form.foo2"));
    }

    @Test
    public void testPutRequest() {
        Response response = postmanEchoApi.putRequest();

        assertEquals(200, response.getStatusCode());
        assertEquals(ASSERT_BODY, response.jsonPath().getString("data"));
    }

    @Test
    public void testPatchRequest() {
        Response response = postmanEchoApi.patchRequest();

        assertEquals(200, response.getStatusCode());
        assertEquals(ASSERT_BODY, response.jsonPath().getString("data"));
    }

    @Test
    public void testDeleteRequest() {
        Response response = postmanEchoApi.deleteRequest();

        assertEquals(200, response.getStatusCode());
        assertEquals(ASSERT_BODY, response.jsonPath().getString("data"));
    }
}
