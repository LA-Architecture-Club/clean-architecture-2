package io.pivotal.pulse;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * An example of how one can test a Spring Web MVC Controller, in isolation.
 *
 * See also:
 *
 * Examples:
 * https://github.com/spring-projects/spring-framework/tree/master/spring-test/src/test/java/org/springframework/test/web/servlet/samples/standalone
 *
 * Test matchers provided by "Hamcrest" (by way of Spring Boot):
 * https://code.google.com/p/hamcrest/wiki/Tutorial
 * http://hamcrest.org/JavaHamcrest/javadoc/
 */
public class SampleControllerUnitTest {
    private MockMvc mockMvc;

    private SampleService mockSampleService;

    @Before
    public void setup() {
        mockSampleService = mock(SampleService.class);
        this.mockMvc = MockMvcBuilders.standaloneSetup(new SampleController(mockSampleService)).build();
    }

    @Test
    public void test_that_controller_causes_side_effect() throws Exception {
        mockMvc.perform(get("/the-url"));
        verify(mockSampleService).causeSomeSideEffect();
    }



}
