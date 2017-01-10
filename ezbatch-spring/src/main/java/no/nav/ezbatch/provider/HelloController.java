package no.nav.ezbatch.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:leo-andreas.ervik@visma.com">ervikleo</a>
 * @version 1.0.0
 *          10.01.2017
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
