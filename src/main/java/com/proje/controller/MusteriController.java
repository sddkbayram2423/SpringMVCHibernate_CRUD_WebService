package com.proje.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.proje.model.Musteri;
import com.proje.service.MusteriService;

@Controller
public class MusteriController {
	
	@Autowired
	private MusteriService musteriService;
	
	@RequestMapping(value = "newMusteri",method =RequestMethod.GET )
	public ModelAndView newMusteri(@ModelAttribute Musteri musteri) {
		
		return new ModelAndView("musteriForm");
		
	}
	
	@RequestMapping(value = "editMusteri",method =RequestMethod.GET )
	public ModelAndView updateMusteri(@RequestParam long musteriId, @ModelAttribute Musteri musteri) {
		
		musteri=musteriService.findByMusteriId(musteriId);
		System.out.println(musteriId);
		System.out.println(musteri);
		return new ModelAndView("musteriForm","musteriObject",musteri);
	}
	
	
	@RequestMapping(value = "saveMusteri",method =RequestMethod.POST )
	public ModelAndView saveMusteri(@ModelAttribute Musteri musteri) {
		
			if(musteri.getMusteriId()==0) {
				musteriService.createMusteri(musteri);
			}else {
				musteriService.updateMusteri(musteri);
			}
		return new ModelAndView("redirect:findAllMusteri");
		
	}
	
	@RequestMapping(value = "findAllMusteri",method =RequestMethod.GET)
	public ModelAndView findAllMusteri() {
		
		List<Musteri> musteriList=musteriService.findAllMusteri();
		
		return new ModelAndView("musteriListele","musteriList",musteriList);
		
	}
	
	@RequestMapping(value = "deleteMusteri",method =RequestMethod.GET )
	public ModelAndView deleteMusteri(@RequestParam long musteriId) {
		musteriService.deleteMusteri(musteriId);
		
		return new ModelAndView("redirect:findAllMusteri");
	}
	
	@RequestMapping(value = "searchMusteri",method =RequestMethod.GET )
	public ModelAndView searchMusteri(@RequestParam("searchAdi") String searchAdi) {
		
		List<Musteri> musteriList=musteriService.findByMusteriName(searchAdi);
		
		return new ModelAndView("musteriListele","musteriList",musteriList);
	}
	

}
