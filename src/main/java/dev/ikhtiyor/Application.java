package dev.ikhtiyor;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                title = "product-ms",
                version = "0.1",
                description = "Product MS",
                license = @License(name = "MIT")

        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }

}