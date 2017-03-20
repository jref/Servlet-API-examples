package ua.com.codespace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MessageServletClient {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:8080/message");
        URLConnection connection = url.openConnection();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            reader.lines().forEach(System.out::println);
        }
    }
}
