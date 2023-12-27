package ru.ekfedorov.moneymanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("raw")
public class RawController {

    @GetMapping("test")
    public String getSuccess() {
        return "Победа";
    }
}
