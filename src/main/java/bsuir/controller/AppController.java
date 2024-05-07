package bsuir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vladislav Domaniewski
 */

@RestController
@RequestMapping
public class AppController {
    @GetMapping
    public String sayHello() {
        return "Hello world!";
    }
}
