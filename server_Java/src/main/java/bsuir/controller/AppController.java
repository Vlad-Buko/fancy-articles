package bsuir.controller;

import bsuir.entity.Product;
import bsuir.entity.Sale;
import bsuir.model.SaleDto;
import bsuir.repository.ProductRepo;
import bsuir.repository.SaleRepo;
import bsuir.service.ProductService;

import bsuir.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Vladislav Domaniewski
 */

@RestController
@RequestMapping
public class AppController {
    public AppController(SaleService saleService) {
        this.saleService = saleService;
    }

    private final SaleService saleService;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }

    @GetMapping("/sale")
    public List<SaleDto> listSale() {
        return saleService.getSale();
    }
}
