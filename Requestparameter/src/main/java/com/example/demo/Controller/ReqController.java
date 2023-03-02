package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReqController {
@GetMapping("/hi")
public String name(@RequestParam String name) {
	return "hi "+name+" I love YOU";
}

}
