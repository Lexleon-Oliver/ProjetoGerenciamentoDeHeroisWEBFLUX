package com.digitalinnovation;

import org.springframework.boot.test.context.SpringBootTest;

import org.junit.Test;
import com.digitalinnovation.repository.ChampionsRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static com.digitalinnovation.constants.ChampionsConstant.CHAMPIONS_ENDPOINT_LOCAL;


@RunWith(SpringRunner.class)
@DirtiesContext
@AutoConfigureWebTestClient
@SpringBootTest
public class ChampionsApiApplicationTests {

  @Autowired
  WebTestClient webTestClient;

  @Autowired
  ChampionsRepository championsRepository;


  @Test
  public void getAChampionById(){

    webTestClient.get().uri(CHAMPIONS_ENDPOINT_LOCAL.concat("/{id}"),"03")
      .exchange()
      .expectStatus().isOk()
      .expectBody();


  }

  @Test
  public void getAChampionNotFound(){

    webTestClient.get().uri(CHAMPIONS_ENDPOINT_LOCAL.concat("/{id}"),"10")
      .exchange()
      .expectStatus().isNotFound();

  }


  @Test
  public void deleteChampion(){

    webTestClient.delete().uri(CHAMPIONS_ENDPOINT_LOCAL.concat("/{id}"),"01")
      .accept(MediaType.APPLICATION_JSON)
      .exchange()
      .expectStatus().isNotFound()
      .expectBody(Void.class);

  }

}


