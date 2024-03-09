package HWs.HW1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller
public class CalculatorURL {
    @RequestMapping(value={"/{operation}/{x}/{y}"})
    public @ResponseBody String getAttr(@PathVariable(value="operation") String operation,
                                        @PathVariable(value="x") String x,
                                        @PathVariable(value="y") String y) {
        float op1 = Float.parseFloat(x);
        float op2 = Float.parseFloat(y);
        switch (operation) {
            case "sum":
                return x + "+" + y + "=" + String.valueOf(op1 + op2);
            case "subtract":
                return x + "-" + y + "=" + String.valueOf(op1 - op2);
            case "mult":
                return x + "*" + y + "=" + String.valueOf(op1 * op2);
            case "div":
                return x + "/" + y + "=" + String.valueOf(op1 / op2);
            default:
                return "Wrong OP";
            
        }
            
    }
    
}
