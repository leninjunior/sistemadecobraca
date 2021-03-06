package com.leninjunior.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TituloController {
	
	@RequestMapping("/")
	public String index() {
		
		return "CadastroTitulo";
	}

}
