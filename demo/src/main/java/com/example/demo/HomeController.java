package com.example.demo;


import org.stringframework.sterotype.Controller;
import org.stringframework.web.bind.annotation.RequestMapping;
import org.stringframework.web.bind.annotation.RequestParam;

@Controller

public class HomeControler {
@RequestMapping("say-hello")
public String sayHello() {
	return "hello"
}