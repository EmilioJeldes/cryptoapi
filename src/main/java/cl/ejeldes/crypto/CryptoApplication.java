package cl.ejeldes.crypto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CryptoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CryptoApplication.class, args);
        System.out.println(CryptoApplication.class.getSimpleName() + ": DB_URL=" + System.getenv("DB_URL"));
    }

}

