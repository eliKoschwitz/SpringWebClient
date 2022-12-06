package de.neuefische.webclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class WebClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebClientApplication.class, args);

        String url = "https://eoq2vuf7lltn3qi.m.pipedream.net";

        WebClient getWebClient = WebClient.create(url);

        Animals animal = getWebClient.get()
                .uri("/2")
                .retrieve()
                .toEntity(Animals.class)
                .block()
                .getBody();

        System.out.println(animal.toString());

// ========================== POST ==========================================================

        String url2 = "https://eokz7vcsigzeiih.m.pipedream.net";

        WebClient postWebClient = WebClient.create(url2);

        Message message = postWebClient.post()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .bodyValue(new Message("mein Tier ist ein "+ animal.getAnimal())) //+ Animals.getAnimal() "Ich mag diese Antwort "
                .retrieve()
                .toEntity(Message.class)
                .block()
                .getBody();

        System.out.println(message);

    }
}

