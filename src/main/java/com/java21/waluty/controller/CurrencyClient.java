package com.java21.waluty.controller;

import com.java21.waluty.model.Example;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class CurrencyClient {


   // @EventListener(ApplicationReadyEvent.class)
    public Example getCurrencyRates(){

        RestTemplate restTemplate = new RestTemplate();
        Example forObject = restTemplate.getForObject("https://api.exchangeratesapi.io/latest?base=PLN", Example.class);
      //  System.out.println(forObjesct);

        return forObject;
    }

}
