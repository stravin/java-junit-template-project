package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testHellowWorld(){
        HelloWorld hello = new HelloWorld();
        assertEquals("A test for Hello World String", "Hello World", hello.sayHello());
    }

    @Test
    public void testAssertNull() {
        assertNull("should be null", null);
        String str = null;
        assertNull("should be null", str);
    }
}
