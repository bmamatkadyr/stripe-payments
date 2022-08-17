package stripepayments;

import com.stripe.Stripe;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Setter @Getter
public class StripePaymentsApplication {

    @Value("${stripe.api-key}")
    private String apiKey;

    @PostConstruct
    void init() {
        Stripe.apiKey = apiKey;
    }

    public static void main(String[] args) {
        SpringApplication.run(StripePaymentsApplication.class, args);
    }

}
