package it.unical.mat.webapp22.Immobili.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:5432")
public class Auth {
	@GetMapping("/checkAuth")
	public Boolean isAuth(HttpServletRequest req, String jsessionid) {
		System.out.println(jsessionid);
		HttpSession session = (HttpSession) req.getServletContext().getAttribute(jsessionid);
		if (session != null) {
			return true;
		}else {
			return false;
		}
	}
}