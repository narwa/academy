package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        System.out.println("parampa");
        System.out.println("ini contoh conflict");

        SpringApplication.run(Application.class, args);

    }
}
