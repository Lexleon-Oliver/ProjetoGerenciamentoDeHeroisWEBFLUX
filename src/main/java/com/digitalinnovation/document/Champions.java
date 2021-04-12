package com.digitalinnovation.document;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import org.springframework.data.annotation.Id;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@DynamoDBTable(tableName ="Champions_Api_Table")


public class Champions {
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getClass_champion() {
    return class_champion;
  }

  public void setClass_champion(String class_champion) {
    this.class_champion = class_champion;
  }

  public int getTier() {
    return tier;
  }

  public void setTier(int tier) {
    this.tier = tier;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public int getLvl_signature_ability() {
    return lvl_signature_ability;
  }

  public void setLvl_signature_ability(int lvl_signature_ability) {
    this.lvl_signature_ability = lvl_signature_ability;
  }

  @Id
  @DynamoDBHashKey (attributeName = "id")
  private String id;

  @DynamoDBAttribute (attributeName = "name")
  private String name;

  @DynamoDBAttribute (attributeName = "class_champion")
  private String class_champion;

  @DynamoDBAttribute (attributeName = "tier")
  private int tier;

  @DynamoDBAttribute (attributeName = "rank")
  private String rank;

  @DynamoDBAttribute (attributeName = "lvl_signature_ability")
  private int lvl_signature_ability;


  public Champions(String id, String name, String class_champion, int tier, String rank, int lvl_signature_ability) {
    this.id = id;
    this.name = name;
    this.class_champion = class_champion;
    this.tier = tier;
    this.rank = rank;
    this.lvl_signature_ability=lvl_signature_ability;
  }


}

