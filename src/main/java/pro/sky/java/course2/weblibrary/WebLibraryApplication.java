package pro.sky.java.course2.weblibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class WebLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebLibraryApplication.class, args);
    }
}
