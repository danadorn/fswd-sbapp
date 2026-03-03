package co.istad.chhaya.fswd_sbapp.swaggers;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Dana No Way Home",
                version = "2.0",
                description = "API for no way home guys",
                contact = @Contact(
                        name = "Marvel Studio",
                        email = "dorndana8899@email.com"
                )
        )
)
public class OpenAPIConfig {

}
