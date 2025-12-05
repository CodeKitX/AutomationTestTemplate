package interview.framework;

import org.junit.jupiter.api.Test;

import interview.api.ApiClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FrameworkSanityTest {

    @Test
    void sanity_shouldCreateApiClient() {
        ApiClient client = new ApiClient("https://example.com");
        assertNotNull(client);
        assertEquals("https://example.com", client.getBaseUrl());
    }
}
