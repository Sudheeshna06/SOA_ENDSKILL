package com.example.ms1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ms1")
public class ProviderMicroservice {

    @GetMapping("/add")
    public String add(@RequestParam int a,
                      @RequestParam int b) {

        return "{\"addition\":" + (a + b) + "}";
    }
}
