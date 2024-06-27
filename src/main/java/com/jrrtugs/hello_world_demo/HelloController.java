import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "<html><body style='background-color:#f0f0f0;'><h1 style='color:#336699;'>Hello, World!</h1></body></html>";
    }
}