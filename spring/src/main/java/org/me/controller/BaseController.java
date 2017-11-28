package org.me.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BaseController {

    private final ProgrammeService prog;

    @Autowired
    public BaseController(ProgrammeService prog) {
        this.prog = prog;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(ModelMap model) {
        model.addAttribute("message", "Maven Web Project + Spring 3 MVC - welcome()");
        // Spring uses InternalResourceViewResolver and returns index.jsp
        return "index";
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String welcomeName(@PathVariable String name, ModelMap model) {
        model.addAttribute("message", "Maven Web Project + Spring 3 MVC - " + name);
        return "index";
    }

}