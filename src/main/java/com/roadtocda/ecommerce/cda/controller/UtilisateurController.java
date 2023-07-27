package com.roadtocda.ecommerce.cda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.roadtocda.ecommerce.cda.model.Utilisateur;
import com.roadtocda.ecommerce.cda.repository.UtilisateurRepository;
import com.roadtocda.ecommerce.cda.service.UtilisateurService;

@Controller
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService UtilisateurService;
	
	@GetMapping("/Utilisateurs")
	public Iterable<Utilisateur>getUtilisateurs(){
		return UtilisateurService.getUtilisateurs();
		}
	
	@GetMapping("/Utilisateur")
	public String Utilisateur(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		((Model) model).addAttribute("name", name);
		
		model.addAttribute("LesUtilisateurs", UtilisateurService.getUtilisateurs());
        return "index";
	
}
}