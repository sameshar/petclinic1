package com.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetClinicController {

	@GetMapping("/")
    public String loadIndex() {
        return "index";
	}
}
