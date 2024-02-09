import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {


    @Test
    public void helloNoName() {
        assertThat(HelloWorld.hello("")).isEqualTo("Hello, World!");
        assertThat(HelloWorld.hello(null)).isEqualTo("Hello, World!");
    }

    @Test
    public void emptyStringIsComparedByValue() {
        assertThat(HelloWorld.hello(new String(""))).isEqualTo("Hello, World!");
    }
    
    @Test
    public void helloSampleName() {
        assertThat(HelloWorld.hello("Alice")).isEqualTo("Hello, Alice!");
    }

    @Test
    public void helloAnotherSampleName() {
        assertThat(HelloWorld.hello("Bob")).isEqualTo("Hello, Bob!");
    }
}
