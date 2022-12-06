package de.neuefische.webclient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootTest
class WebClientApplicationTests {

    /*
    @Test
    void contextLoads() {
    }

    @Test
    void tryingCodeOut(){
        WebClient webClient = WebClient.create("https://eoq2vuf7lltn3qi.m.pipedream.net");
        Character response = webClient.get()
                .uri("/2")
                .retrieve()
                .toEntity(Character.class)
                .block()
                .getBody();

        System.out.println(character2);

        Assertions.assertTrue(true);
    }

     */

}
