package com.example.opstestrepository.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MyController {

    @GetMapping(path = "/")
    public Mono<String> printLog1() {
        return Mono.just("print log1");
    }

    @GetMapping(path = "/log")
    public Mono<String> printLog2() {
        return Mono.just("print log2");
    }

}
