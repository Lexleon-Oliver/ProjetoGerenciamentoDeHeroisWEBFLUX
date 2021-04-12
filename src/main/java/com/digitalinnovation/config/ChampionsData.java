package com.digitalinnovation.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import static com.digitalinnovation.constants.ChampionsConstant.ENDPOINT_DYNAMO;
import static com.digitalinnovation.constants.ChampionsConstant.REGION_DYNAMO;

public class ChampionsData {
  public static void main(String[] args) throws Exception {

    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
      .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
      .build();
    DynamoDB dynamoDB = new DynamoDB(client);

    Table table = dynamoDB.getTable("Champions_Api_Table");

    Item champion = new Item()
            .withPrimaryKey("id", "01")
            .withString("name", "Aegon")
            .withString("class_champion", "Skill")
            .withNumber("tier", 5)
            .withString("rank", "5/65")
            .withNumber("lvl_signature_ability", 200);

    Item champion02 = new Item()
            .withPrimaryKey("id", "02")
            .withString("name", "Doctor Doom")
            .withString("class_champion", "Mystic")
            .withNumber("tier", 5)
            .withString("rank", "5/65")
            .withNumber("lvl_signature_ability", 50);

    Item champion03 = new Item()
            .withPrimaryKey("id", "03")
            .withString("name", "Captain Marvel")
            .withString("class_champion", "Cosmic")
            .withNumber("tier", 5)
            .withString("rank", "5/65")
            .withNumber("lvl_signature_ability", 80);

    Item champion04 = new Item()
            .withPrimaryKey("id", "04")
            .withString("name", "M.O.D.O.K.")
            .withString("class_champion", "Science")
            .withNumber("tier", 6)
            .withString("rank", "2/35")
            .withNumber("lvl_signature_ability", 20);

    Item champion05 = new Item()
            .withPrimaryKey("id", "05")
            .withString("name", "Warlock")
            .withString("class_champion", "Tech")
            .withNumber("tier", 5)
            .withString("rank", "5/65")
            .withNumber("lvl_signature_ability", 50);

    Item champion06 = new Item()
            .withPrimaryKey("id", "06")
            .withString("name", "Corvus Glaive")
            .withString("class_champion", "Cosmic")
            .withNumber("tier", 5)
            .withString("rank", "5/65")
            .withNumber("lvl_signature_ability", 20);

    Item champion07 = new Item()
            .withPrimaryKey("id", "07")
            .withString("name", "Iron Man (Infinity War)")
            .withString("class_champion", "Tech")
            .withNumber("tier", 6)
            .withString("rank", "2/35")
            .withNumber("lvl_signature_ability", 0);

    Item champion08 = new Item()
            .withPrimaryKey("id", "08")
            .withString("name", "Hyperion")
            .withString("class_champion", "Cosmic")
            .withNumber("tier", 5)
            .withString("rank", "5/65")
            .withNumber("lvl_signature_ability", 115);

    Item champion09 = new Item()
            .withPrimaryKey("id", "09")
            .withString("name", "Domino")
            .withString("class_champion", "Mutant")
            .withNumber("tier", 6)
            .withString("rank", "2/35")
            .withNumber("lvl_signature_ability", 0);

    Item champion10 = new Item()
            .withPrimaryKey("id", "10")
            .withString("name", "Human Torch")
            .withString("class_champion", "Science")
            .withNumber("tier", 6)
            .withString("rank", "2/35")
            .withNumber("lvl_signature_ability", 0);

    Item champion11 = new Item()
            .withPrimaryKey("id", "11")
            .withString("name", "Falcon")
            .withString("class_champion", "Skill")
            .withNumber("tier", 5)
            .withString("rank", "5/65")
            .withNumber("lvl_signature_ability", 0);

    Item champion12 = new Item()
            .withPrimaryKey("id", "12")
            .withString("name", "Venom")
            .withString("class_champion", "Cosmic")
            .withNumber("tier", 5)
            .withString("rank", "5/65")
            .withNumber("lvl_signature_ability", 50);

    Item champion13 = new Item()
            .withPrimaryKey("id", "13")
            .withString("name", "Quake")
            .withString("class_champion", "Science")
            .withNumber("tier", 5)
            .withString("rank", "5/65")
            .withNumber("lvl_signature_ability", 0);

    Item champion14 = new Item()
            .withPrimaryKey("id", "14")
            .withString("name", "Human Torch")
            .withString("class_champion", "Science")
            .withNumber("tier", 5)
            .withString("rank", "5/65")
            .withNumber("lvl_signature_ability", 80);

    Item champion15 = new Item()
            .withPrimaryKey("id", "15")
            .withString("name", "HulkBuster")
            .withString("class_champion", "Tech")
            .withNumber("tier", 6)
            .withString("rank", "2/35")
            .withNumber("lvl_signature_ability", 0);

    Item champion16 = new Item()
            .withPrimaryKey("id", "16")
            .withString("name", "Black Widow(Claire Voyant)")
            .withString("class_champion", "Mystic")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 70);

    Item champion17 = new Item()
            .withPrimaryKey("id", "17")
            .withString("name", "Spider-Ham")
            .withString("class_champion", "Science")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 50);

    Item champion18 = new Item()
            .withPrimaryKey("id", "18")
            .withString("name", "Omega Red")
            .withString("class_champion", "Mutant")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 100);

    Item champion19 = new Item()
            .withPrimaryKey("id", "19")
            .withString("name", "Spider-man (Stark Enhanced")
            .withString("class_champion", "Tech")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 50);

    Item champion20 = new Item()
            .withPrimaryKey("id", "20")
            .withString("name", "Archangel")
            .withString("class_champion", "Mutant")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 90);

    Item champion21 = new Item()
            .withPrimaryKey("id", "21")
            .withString("name", "Blade")
            .withString("class_champion", "Skill")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 40);

    Item champion22 = new Item()
            .withPrimaryKey("id", "22")
            .withString("name", "Venom The Duck")
            .withString("class_champion", "Cosmic")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion23 = new Item()
            .withPrimaryKey("id", "23")
            .withString("name", "Angela")
            .withString("class_champion", "Cosmic")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion24 = new Item()
            .withPrimaryKey("id", "24")
            .withString("name", "Elektra")
            .withString("class_champion", "Skill")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 90);

    Item champion25 = new Item()
            .withPrimaryKey("id", "25")
            .withString("name", "Iron-Man (Infinity War)")
            .withString("class_champion", "Tech")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 20);

    Item champion26 = new Item()
            .withPrimaryKey("id", "26")
            .withString("name", "Night Thrasher")
            .withString("class_champion", "Skill")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion27 = new Item()
            .withPrimaryKey("id", "27")
            .withString("name", "Emma Frost")
            .withString("class_champion", "Mutant")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion28 = new Item()
            .withPrimaryKey("id", "28")
            .withString("name", "Guillotine 2099")
            .withString("class_champion", "Tech")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 0);

    Item champion29 = new Item()
            .withPrimaryKey("id", "29")
            .withString("name", "Ghost")
            .withString("class_champion", "Tech")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 20);

    Item champion30 = new Item()
            .withPrimaryKey("id", "30")
            .withString("name", "Sentry")
            .withString("class_champion", "Science")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion31 = new Item()
            .withPrimaryKey("id", "31")
            .withString("name", "NightCrawler")
            .withString("class_champion", "Mutant")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion32 = new Item()
            .withPrimaryKey("id", "32")
            .withString("name", "NightCrawler")
            .withString("class_champion", "Mutant")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 20);

    Item champion33 = new Item()
            .withPrimaryKey("id", "33")
            .withString("name", "Symbiote Supreme")
            .withString("class_champion", "Mystic")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 0);

    Item champion34 = new Item()
            .withPrimaryKey("id", "34")
            .withString("name", "She-Hulk")
            .withString("class_champion", "Science")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 20);

    Item champion35 = new Item()
            .withPrimaryKey("id", "35")
            .withString("name", "Iron Fist")
            .withString("class_champion", "Mystic")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion36 = new Item()
            .withPrimaryKey("id", "36")
            .withString("name", "Sentinel")
            .withString("class_champion", "Tech")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 0);

    Item champion37 = new Item()
            .withPrimaryKey("id", "37")
            .withString("name", "Spider-Man (Symbiote)")
            .withString("class_champion", "Cosmic")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion38 = new Item()
            .withPrimaryKey("id", "38")
            .withString("name", "Captain America (WWII)")
            .withString("class_champion", "Science")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion39 = new Item()
            .withPrimaryKey("id", "39")
            .withString("name", "Ultron")
            .withString("class_champion", "Tech")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion40 = new Item()
            .withPrimaryKey("id", "40")
            .withString("name", "Spider-Man (Miles Morales)")
            .withString("class_champion", "Science")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion41 = new Item()
            .withPrimaryKey("id", "41")
            .withString("name", "Spider-Man (Classic)")
            .withString("class_champion", "Cosmic")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion42 = new Item()
            .withPrimaryKey("id", "42")
            .withString("name", "Ms. Marvel")
            .withString("class_champion", "Cosmic")
            .withNumber("tier", 6)
            .withString("rank", "1/25")
            .withNumber("lvl_signature_ability", 0);

    Item champion43 = new Item()
            .withPrimaryKey("id", "43")
            .withString("name", "Luke Cage")
            .withString("class_champion", "Science")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 0);

    Item champion44 = new Item()
            .withPrimaryKey("id", "44")
            .withString("name", "Magik")
            .withString("class_champion", "Mystic")
            .withNumber("tier", 5)
            .withString("rank", "4/55")
            .withNumber("lvl_signature_ability", 0);

    Item champion45 = new Item()
            .withPrimaryKey("id", "45")
            .withString("name", "Angela")
            .withString("class_champion", "Cosmic")
            .withNumber("tier", 5)
            .withString("rank", "3/45")
            .withNumber("lvl_signature_ability", 40);

    Item champion46 = new Item()
            .withPrimaryKey("id", "46")
            .withString("name", "Thing")
            .withString("class_champion", "Science")
            .withNumber("tier", 5)
            .withString("rank", "3/45")
            .withNumber("lvl_signature_ability", 50);

    Item champion47 = new Item()
            .withPrimaryKey("id", "47")
            .withString("name", "Mordo")
            .withString("class_champion", "Mystic")
            .withNumber("tier", 4)
            .withString("rank", "5/50")
            .withNumber("lvl_signature_ability", 99);

    Item champion48 = new Item()
            .withPrimaryKey("id", "48")
            .withString("name", "Red Skull")
            .withString("class_champion", "Tech")
            .withNumber("tier", 5)
            .withString("rank", "3/45")
            .withNumber("lvl_signature_ability", 40);

    Item champion49 = new Item()
            .withPrimaryKey("id", "49")
            .withString("name", "Quake")
            .withString("class_champion", "Science")
            .withNumber("tier", 4)
            .withString("rank", "5/50")
            .withNumber("lvl_signature_ability", 99);

    Item champion50 = new Item()
            .withPrimaryKey("id", "50")
            .withString("name", "Symbiote Supreme")
            .withString("class_champion", "Mystic")
            .withNumber("tier", 4)
            .withString("rank", "5/50")
            .withNumber("lvl_signature_ability", 99);






    PutItemOutcome outcome01 = table.putItem(champion);
    PutItemOutcome outcome02 = table.putItem(champion02);
    PutItemOutcome outcome03 = table.putItem(champion03);
    PutItemOutcome outcome04 = table.putItem(champion04);
    PutItemOutcome outcome05 = table.putItem(champion05);
    PutItemOutcome outcome06 = table.putItem(champion06);
    PutItemOutcome outcome07 = table.putItem(champion07);
    PutItemOutcome outcome08 = table.putItem(champion08);
    PutItemOutcome outcome09 = table.putItem(champion09);
    PutItemOutcome outcome10 = table.putItem(champion10);
    PutItemOutcome outcome11 = table.putItem(champion11);
    PutItemOutcome outcome12 = table.putItem(champion12);
    PutItemOutcome outcome13 = table.putItem(champion13);
    PutItemOutcome outcome14 = table.putItem(champion14);
    PutItemOutcome outcome15 = table.putItem(champion15);
    PutItemOutcome outcome16 = table.putItem(champion16);
    PutItemOutcome outcome17 = table.putItem(champion17);
    PutItemOutcome outcome18 = table.putItem(champion18);
    PutItemOutcome outcome19 = table.putItem(champion19);
    PutItemOutcome outcome20 = table.putItem(champion20);
    PutItemOutcome outcome21 = table.putItem(champion21);
    PutItemOutcome outcome22 = table.putItem(champion22);
    PutItemOutcome outcome23 = table.putItem(champion23);
    PutItemOutcome outcome24 = table.putItem(champion24);
    PutItemOutcome outcome25 = table.putItem(champion25);
    PutItemOutcome outcome26 = table.putItem(champion26);
    PutItemOutcome outcome27 = table.putItem(champion27);
    PutItemOutcome outcome28 = table.putItem(champion28);
    PutItemOutcome outcome29 = table.putItem(champion29);
    PutItemOutcome outcome30 = table.putItem(champion30);
    PutItemOutcome outcome31 = table.putItem(champion31);
    PutItemOutcome outcome32 = table.putItem(champion32);
    PutItemOutcome outcome33 = table.putItem(champion33);
    PutItemOutcome outcome34 = table.putItem(champion34);
    PutItemOutcome outcome35 = table.putItem(champion35);
    PutItemOutcome outcome36 = table.putItem(champion36);
    PutItemOutcome outcome37 = table.putItem(champion37);
    PutItemOutcome outcome38 = table.putItem(champion38);
    PutItemOutcome outcome39 = table.putItem(champion39);
    PutItemOutcome outcome40 = table.putItem(champion40);
    PutItemOutcome outcome41 = table.putItem(champion41);
    PutItemOutcome outcome42 = table.putItem(champion42);
    PutItemOutcome outcome43 = table.putItem(champion43);
    PutItemOutcome outcome44 = table.putItem(champion44);
    PutItemOutcome outcome45 = table.putItem(champion45);
    PutItemOutcome outcome46 = table.putItem(champion46);
    PutItemOutcome outcome47 = table.putItem(champion47);
    PutItemOutcome outcome48 = table.putItem(champion48);
    PutItemOutcome outcome49 = table.putItem(champion49);
    PutItemOutcome outcome50 = table.putItem(champion50);

  }

}

