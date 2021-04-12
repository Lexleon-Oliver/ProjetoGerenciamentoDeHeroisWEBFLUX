package com.digitalinnovation.service;

import com.digitalinnovation.document.Champions;
import com.digitalinnovation.repository.ChampionsRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class ChampionsService {
  private final ChampionsRepository championsRepository;

  public ChampionsService(ChampionsRepository championsRepository) {
    this.championsRepository = championsRepository;
  }

  public Flux<Champions> findAll(){

    return Flux.fromIterable(this.championsRepository.findAll());
  }

  public  Mono<Champions> findByIdChampion(String id){

    return  Mono.justOrEmpty(this.championsRepository.findById(id));
  }


  public Mono<Champions> saveChampion(Champions champions){
    return  Mono.justOrEmpty(this.championsRepository.save(champions));
  }


  public Mono<Boolean> deletebyIDChampion(String id) {
    championsRepository.deleteById(id);
    return Mono.just(true);

  }

}

