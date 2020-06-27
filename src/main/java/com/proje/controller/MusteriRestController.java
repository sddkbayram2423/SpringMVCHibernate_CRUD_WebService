package com.proje.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proje.model.Musteri;
import com.proje.service.MusteriService;

@RestController
@RequestMapping(value = "/rest")
public class MusteriRestController {
	
	@Autowired
	private MusteriService musteriService;
	
		
	@RequestMapping(value = "/musteri/",method =RequestMethod.GET,headers = "Accept-application/json" )
	public List<Musteri> findAllMusteri() {
		List<Musteri> musteris=musteriService.findAllMusteri();
		return musteris;
	}
	
	@RequestMapping(value = "/musteri/{id}",method =RequestMethod.GET,headers = "Accept-application/json" )
	public Musteri findAllMusteriler(@RequestParam("id") long musteriId) {
		Musteri musteris=musteriService.findByMusteriId(musteriId);
		return musteris;
	}
	
	
	

}
