package hello;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NostraTest {

    @InjectMocks
    GreetingController greetingController;

    @Test
    public void greetingTest() throws Exception{
        Greeting resultNostra = greetingController.greeting("Nostra", "Male");
        Assert.assertNotNull(resultNostra);
        Assert.assertEquals(resultNostra.getName(), "Hello, Nostra!");
    }
}
