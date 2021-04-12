package com.digitalinnovation.controller;

import com.digitalinnovation.constants.ChampionsConstant;
import com.digitalinnovation.document.Champions;
import com.digitalinnovation.repository.ChampionsRepository;
import com.digitalinnovation.service.ChampionsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Slf4j

public class ChampionsController {
  ChampionsService championsService;

  ChampionsRepository championsRepository;

  private static final org.slf4j.Logger log =
    org.slf4j.LoggerFactory.getLogger(ChampionsController.class);

  public ChampionsController(ChampionsService championsService, ChampionsRepository championsRepository) {
    this.championsService = championsService;
    this.championsRepository = championsRepository;
  }

  @GetMapping(ChampionsConstant.CHAMPIONS_ENDPOINT_LOCAL)
  @ResponseStatus(HttpStatus.OK)
  public Flux<Champions> getAllItems() {
    log.info("Requesting the list of all champions");
    return championsService.findAll();

  }


  @GetMapping(ChampionsConstant.CHAMPIONS_ENDPOINT_LOCAL + "/{id}")
  public Mono<ResponseEntity<Champions>> findByIdChampion(@PathVariable String id) {
    log.info("Requesting the champion with id {}", id);
    return championsService.findByIdChampion(id)
      .map((item) -> new ResponseEntity<>(item, HttpStatus.OK))
      .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping(ChampionsConstant.CHAMPIONS_ENDPOINT_LOCAL)
  @ResponseStatus(HttpStatus.CREATED)
  public Mono<Champions> createChampion(@RequestBody Champions champions) {
    log.info("A new champion was created");
    return championsService.saveChampion(champions);

  }

  @DeleteMapping(ChampionsConstant.CHAMPIONS_ENDPOINT_LOCAL + "/{id}")
  @ResponseStatus(code = HttpStatus.NOT_FOUND)
  public Mono<HttpStatus> deletebyIDChampion(@PathVariable String id) {
    championsService.deletebyIDChampion(id);
    log.info("Deleting the champion with id {}", id);
    return Mono.just(HttpStatus.NOT_FOUND);
  }
}
