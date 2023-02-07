package com.kakaoLogin;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String root() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "loginForm";
	}
	
	@Autowired
	KaKaoService ks;
	
	@GetMapping("/kakao/logout_callback")
	public String loginPage() {
		return "loginForm";
	}
	
	@GetMapping("/kakao/callback")
	public String getCI(@RequestParam String code, Model model) throws IOException{
		System.out.println("code = " + code);
		String access_token = ks.getToken(code);
		Map<String, Object> userInfo = ks.getUserInfo(access_token);
		model.addAttribute("code", code);
		model.addAttribute("access_token", access_token);
		model.addAttribute("userInfo", userInfo);
		
		return "index";
	}

}
