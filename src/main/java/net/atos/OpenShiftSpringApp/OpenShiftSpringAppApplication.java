package net.atos.OpenShiftSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenShiftSpringAppApplication {

	@GetMapping("/")
	public String getMessage() {
		return "hi ! OpenShift deployment is successful";
	}
	@PostMapping("/{name}")
	public String getMessage(@PathVariable String name) {
		return "hi"+name+"in Openshift Red hat ! ";
	}
	public static void main(String[] args) {

		SpringApplication.run(OpenShiftSpringAppApplication.class, args);
	}

}
