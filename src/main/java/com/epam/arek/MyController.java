package com.epam.arek;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    private static int counter = 0;
    private static final String VIEW_INDEX = "index";
    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(MyController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome() { //ModelMap model

        //model.addAttribute("message", "Welcome");
        //model.addAttribute("counter", ++counter);


        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        model.addObject("message", "Welcome");
        model.addObject("counter", ++counter);
        logger.debug("[welcome] counter : {}", counter);
        return model;

        // Spring uses InternalResourceViewResolver and return back index.jsp
        //return VIEW_INDEX;

    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String welcomeName(@PathVariable String name, ModelMap model) {
        model.addAttribute("message", "Welcome " + name);
        model.addAttribute("counter", ++counter);
        logger.debug("[welcomeName] counter : {}", counter);
        return VIEW_INDEX;

    }

    public int myFunction() {
        return 1;
    }

}