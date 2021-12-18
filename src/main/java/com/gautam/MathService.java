package com.gautam;

import com.gautam.Result;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Result doAddition(int number1, int number2){

            Result addition = new Result(number1+number2, "Addition done successfully");
            return addition;
    }
}
