package controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alexandre.hauffe
 */
@Controller
public class HelloWorldCintrolador {
    
    @RequestMapping("/ola")
    public String cumrimentar(){
        return "olamundo";
    }
}
