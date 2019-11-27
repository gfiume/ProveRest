package org.gfiume.ProvaRest.configuration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MongoClient mongoClient(){
        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://gabriele:password.123@cluster0-rhfje.mongodb.net/test?retryWrites=true&w=majority");

       return new MongoClient(uri);
    }
}
