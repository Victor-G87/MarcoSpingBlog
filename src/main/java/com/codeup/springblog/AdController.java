package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdController {
    @GetMapping("/ads")
//    @RequestMapping(value = "/ads", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "ads index page";
    }

    @GetMapping("/ads/{id}")
    @ResponseBody
    public String show(@PathVariable long id){
        return "view an individual ad with the id of: " + id;
    }

    @GetMapping("/ads/create")
    @ResponseBody
    public String showForm(){
        return "view the form for creating an ad";
    }

    @PostMapping("/ads/create")
    @ResponseBody
    public String save(){
        return "create a new ad";
    }
}