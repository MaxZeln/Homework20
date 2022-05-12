package ru.learnup.homework20.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.support.ResourceBundleMessageSource;
import ru.learnup.homework20.game.Guess_Scanner;
import ru.learnup.homework20.game.Guess_The_Number;
import ru.learnup.homework20.game.Randomizer;
import ru.learnup.homework20.translations.Resource;


@Configuration
public class AppConfig {

    @Bean
    public Randomizer randomizer () {
        return new Randomizer();
    }

    @Bean
    public Guess_Scanner guess_scanner() {
        return new Guess_Scanner();
    }

//    @Value("${app.baseName}")
//    private String basename;
//
//    @Value("${app.defaultLocale}")
//    private String defaultLocale;

    @Bean
    public Resource source() {
        return new Resource();
    }


    @Bean
    public Guess_The_Number guess_the_number(Randomizer randomizer, Guess_Scanner guess_scanner, Resource messageSource) {
        return new Guess_The_Number (randomizer, guess_scanner, messageSource);
    }
}
