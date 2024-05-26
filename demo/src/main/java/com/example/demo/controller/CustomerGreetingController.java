package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Greeting;

@RestController
@RequestMapping("/api1")
public class CustomerGreetingController {
  private final AtomicLong count = new AtomicLong();
  private static final String greetingTemplate = "Hello, %s %s";
  @GetMapping("/geeting")
  public Greeting geeting(@RequestParam(value = "gender", defaultValue = "0") boolean gender,
  @RequestParam(value="name", defaultValue = "Customer") String name) {
    return Greeting.builder().id(count.incrementAndGet()).customerName(String.format(greetingTemplate,gender ? "Mr.":"Ms.", name)).build();
  };
}
