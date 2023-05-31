package com.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
import javax.servlet.ServletContext;
import com.entities.allData;

@Controller
class Homectrl {
	@Autowired
	ServletContext context;

	@RequestMapping("/home")
	public String home(Model m) {
		String str = "home";
		m.addAttribute("page", str);
		List<allData> list = (List<allData>) context.getAttribute("list");
		m.addAttribute("todos", list);

		return "home";
	}

	@RequestMapping("/add")
	public String add(Model m) {

		allData data = new allData();
		m.addAttribute("page", "add");
		m.addAttribute("todo", data);

		return "home";
	}

	@RequestMapping(value = "/saveToDo", method = RequestMethod.POST)
	public String saveToDo(@ModelAttribute("todo") allData data, Model m) {
		System.out.println(data);

		List<allData> list = (List<allData>) context.getAttribute("list");
		list.add(data);

		m.addAttribute("msg", "successfully added...");
		return "home";
	}

}
