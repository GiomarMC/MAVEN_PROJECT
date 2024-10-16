package com.chicosdei.proshectobase;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ProshectobaseController {
    @GetMapping("/test")
    public String getMethodName() {
        return "HOLA MUNDO UwU";
    }
    
}
