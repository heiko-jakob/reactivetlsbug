package reactivetlsbug;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ReactiveGreetingResourceTest {

	@RestClient
	ReactiveGreetingResourceTestClient remoteService;

	@Test
	void testRemoteReactiveGreetingResource() {		
		assertEquals("Hello RESTEasy Reactive", remoteService.hello());		
	}

}