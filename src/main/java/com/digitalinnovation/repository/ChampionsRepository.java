package com.digitalinnovation.repository;

import com.digitalinnovation.document.Champions;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface ChampionsRepository extends CrudRepository<Champions, String>{
}
