package ru.zamal.hw;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Controller {

    static final Logger log = LoggerFactory.getLogger(Main.class);

    @Value("${app.message}")
    private String message;

    @GetMapping("/healthChecks/alive")
	public String healthz() {
		return "OK";
	}

    @GetMapping("/healthChecks/ready")
	public String ready() {
		return "OK";
	}

	@GetMapping("/")
	public String index() {
        log.info("INCOMING REQUEST");
        return message;
	}

}
