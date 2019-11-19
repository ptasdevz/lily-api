package com.ptasdevz.lilyapi.config;

import com.ptasdevz.lilyapi.document.Product;
import com.ptasdevz.lilyapi.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
@Configuration
public class MongoDBConfig {

    //Used to inject data into the monHybrid tea rosesgo db when application starts
    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){

        return strings -> {
            productRepository.save(new Product(
                    1,"Hybrid tea",
                    "This is the most popular class of roses, which feature large ornate blooms" +
                            " with 30 to 50 petals, budding off of long stems. There are many thousands of" +
                            " hybrid tea roses that have been bred, with new introductions constantly replacing" +
                            " outdated varieties.",true, 1,30.0,50.0));

            productRepository.save(new Product(2,"Grandiflora ",
                    "This class can be regarded as a subgroup of hybrid tea roses. This type of rose" +
                            " is often very tall, with blooms that appear in clusters rather than individually on " +
                            "the stems.",true, 2, 45.5,55.5));

            productRepository.save(new Product(3,"Floribunda  ",
                    "Next to hybrid teas and grandifloras, this is the next most popular class. " +
                            "Like grandifloras, a floribunda rose bears its flowers in large clusters; but this type" +
                            " blooms continuously, whereas hybrid teas and grandifloras tend to bloom in six- to" +
                            " seven-week cycles. Foribundas tend to be much easier to care for than hybrid tea " +
                            "and grandiflora roses",true, 3, 25.5,35.5));
        };
    };
}
