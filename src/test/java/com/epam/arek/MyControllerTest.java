package com.epam.arek;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyControllerTest {

    @Before
    public void setup(){

    }
    @Test
    public void testShouldTest(){
        MyController myController = new MyController();
        assertEquals(myController.myFunction(), 1);
    }
    @After
    public void after(){

    }

}