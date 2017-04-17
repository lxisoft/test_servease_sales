package com.diviso.servease.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EditSaleController {

	@RequestMapping("/editsale")
	 public String saveData()
	 {
		
		return "implemented edit sale";
	 }
	 
	 @RequestMapping("/refund")
	 public String saveData()
	 {
		
		return "implemented refund";
	 }

	
}
