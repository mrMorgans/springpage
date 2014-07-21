package ru.developer.springpage.web;

import java.util.Map;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;






import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.developer.springpage.domain.User;
import ru.developer.springpage.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */


	
	@RequestMapping("/")
	public String home(Map<String, Object> map) {
		map.put("user", new User());
		return "home";
	}
	
}
