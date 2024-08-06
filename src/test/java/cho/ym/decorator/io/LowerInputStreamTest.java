package cho.ym.decorator.io;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class LowerInputStreamTest {

    @Test
    void lowerInputStream() throws IOException {
        String input = "HeLLo WoRLD!";
        String expectedOutput = "hello world!";

        try (InputStream inputStream = new ByteArrayInputStream(input.getBytes());
             LowerInputStream lowerInputStream = new LowerInputStream(inputStream)) {

            int data;
            StringBuilder result = new StringBuilder();
            while ((data = lowerInputStream.read()) != -1) {
                result.append((char) data);
            }

            assertEquals(expectedOutput, result.toString());
        }
    }

}