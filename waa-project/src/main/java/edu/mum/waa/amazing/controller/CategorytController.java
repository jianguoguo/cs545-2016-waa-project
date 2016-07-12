package edu.mum.waa.amazing.controller;

import edu.mum.waa.amazing.domain.Category;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.mum.waa.amazing.service.ICategoryService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/category")
public class CategorytController {
    @Autowired
    private ICategoryService categoryService;
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<Category> getAll() {
        return categoryService.findAll();    // dummy data
    }
}
