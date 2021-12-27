package edu.fcc.cmis106.greetings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    private PrintStream originalOut;
    private ByteArrayOutputStream bos;

    @BeforeEach
    void setup() {
        originalOut = System.out;
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
    }

    @AfterEach
    void teardown() {
        System.setOut(originalOut);
    }

    private void toStdin(String s) {
        try (InputStream in = new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8))) {
            System.setIn(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void helloWorld() {
        toStdin("World");
        Greeting.main(null);
        assertEquals("Hello World", bos.toString().strip());
    }

    @Test
    void helloworld() {
        toStdin("world");
        Greeting.main(null);
        assertEquals("Hello world", bos.toString().strip());
    }

    @Test
    void helloAlice() {
        toStdin("Alice");
        Greeting.main(null);
        assertEquals("Hello Alice", bos.toString().strip());
    }
}
