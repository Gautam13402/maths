package com.gautam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MathController {

    @Autowired
    private MathService mathService;

    @PostMapping("/test")
    public Result getAdditionResult(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2){

        return mathService.doAddition(num1, num2);
    }
}
