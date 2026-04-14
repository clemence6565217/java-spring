package org.esaip.ira32526.demoboot;

import org.esaip.ira32526.demoboot.service.BavardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoBootApplication {

    // Injection de dépendance
    @Autowired
    private BavardService bavardService;

    public static void main(String[] args) {
        SpringApplication.run(DemoBootApplication.class, args);
    }

    // 1ère route
    @GetMapping("hello")
    public String hello() {
        // Cela va s'afficher dans la console
        System.out.println(bavardService.parler());
        return "Hello World !";
    }

    // 2nd route
    @GetMapping("cours")
    public String cours() {
        return "Bienvenu dans le cours de Mr Sega Sylla";
    }
}