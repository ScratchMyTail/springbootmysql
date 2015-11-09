package demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by christerhansen on 01.10.15.
 */
@RestController
@RequestMapping(value="/")
public class HelloController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String hello(){
        return "hello";
    }
}
