package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add")
    @ResponseBody
    public int add(){
        return 3 + 4;
    }

    @GetMapping("/sub")
    @ResponseBody
    public int subtract(){
        return 3 - 10;
    }

    @GetMapping("/multi")
    @ResponseBody
    public int miltiply(){
        return 4 * 5;
    }

    @GetMapping("/divide")
    @ResponseBody
    public int divide(){
        return 6 / 3;
    }
}
