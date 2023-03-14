package dev.ikhtiyor.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/test")
public class AController {


    @Get("/1")
    public String re1() {
        System.out.println("ddddd");
        return null;
    }

    @Get("/2")
    public String re2() {
        System.out.println("ffff");
        return "null";
    }
}
