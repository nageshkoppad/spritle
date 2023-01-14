package login.sign.student.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import login.sign.student.entity.DetailsEntity;
import login.sign.student.service.SignService;

@Component
@RequestMapping("/zero")
public class PageController {
  
	@Autowired
	private SignService service;
	
	public PageController() {

	}
	@PostMapping
	public String onSend(DetailsEntity entity,HttpServletRequest req) {
		boolean bool=service.saveAndValidate(entity);
		if(bool) {
			req.setAttribute("message", "value are saved");
			
			return "Index.jsp";
		}else {
			req.setAttribute("error", "value are not saved");
			req.setAttribute("entity", entity);
			return "Index.jsp";
		}
	}
	

	@GetMapping(path="/name")
	public String loginByStudent(@RequestParam String name,String password, Model model) {
		Optional<DetailsEntity> optionalList=service.LoginByMasterId(name, password);
		if(optionalList!=null) {
			DetailsEntity list=optionalList.get();
			model.addAttribute("list", list);
			return "StudentSignUp.jsp";
		}else {
			model.addAttribute("message", "value are not found");
			return "Index.jsp";
		}
		
	}
	@GetMapping
	public String findByAgeGreaterThan(@RequestParam String  name,String  password,Model model) {
		Optional<DetailsEntity> list1=service.LoginByStudentId(name, password);
		if(list1!=null) {
			model.addAttribute("list1", list1);
			return "searchResult.jsp";
		}else {
			model.addAttribute("message", "value are not found");
			return "search.jsp";
		}
	}
}
