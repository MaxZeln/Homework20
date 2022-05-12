package ru.learnup.homework20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnup.homework20.game.Guess_The_Number;


@SpringBootApplication
public class Homework20Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Homework20Application.class, args);

        Guess_The_Number guess_the_number = context.getBean(Guess_The_Number.class);
        guess_the_number.Guess();

    }

}
