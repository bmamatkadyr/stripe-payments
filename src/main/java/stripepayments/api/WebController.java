package stripepayments.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Getter @Setter
public class WebController {

    @Value("${stripe.public-key}")
    private String stripePublicKey;

    @GetMapping("/")
    String home(Model model) {
        model.addAttribute("stripePublicKey", stripePublicKey);
        return "checkout";
    }
}
