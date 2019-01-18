package cl.ejeldes.crypto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by emilio on Jan 18, 2019
 */
@Controller
@RequestMapping("/")
@ApiIgnore
public class SwaggerController {

    @GetMapping
    public String setSwaggerToIndex() {
        return "redirect:/swagger-ui.html";
    }
}
