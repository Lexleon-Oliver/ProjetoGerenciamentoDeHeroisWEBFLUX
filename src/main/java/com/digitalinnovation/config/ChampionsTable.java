package com.digitalinnovation.config;


import java.util.Arrays;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.digitalinnovation.constants.ChampionsConstant;


public class ChampionsTable {

  public static void main(String[] args) throws Exception {

    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
      .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ChampionsConstant.ENDPOINT_DYNAMO, ChampionsConstant.REGION_DYNAMO))
      .build();

    DynamoDB dynamoDB = new DynamoDB(client);

    String tableName = "Champions_Api_Table";

    try {
      System.out.println("Creating table, please wait...");
      Table table = dynamoDB.createTable(tableName,
        Arrays.asList(new KeySchemaElement("id", KeyType.HASH)
        ),
        Arrays.asList(new AttributeDefinition("id", ScalarAttributeType.S)

        ),
        new ProvisionedThroughput(5L, 5L));
      table.waitForActive();
      System.out.println("Success! Table was created. " + table.getDescription().getTableStatus());

    }
    catch (Exception e) {
      System.err.println("Error! Table was not created.");
      System.err.println(e.getMessage());
    }

  }

}
