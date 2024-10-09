package ru.zamal.hw;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {
    public String message;

    public String getMessage() {
            return this.message;
    }

}
