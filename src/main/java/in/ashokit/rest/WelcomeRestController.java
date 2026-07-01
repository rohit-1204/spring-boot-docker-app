package in.ashokit.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController :: Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
    logger.info("***** welcomeMsg() execution start *****");

    String msg = "Docker Demo App is running successfully 🚀";

    logger.info("App is running inside Docker container");
    logger.info("Container port: 8080 (mapped to host port)");
    logger.info("Image is built using multi-stage Docker build");
    logger.info("Base image: eclipse-temurin (Java 17)");
    logger.info("Docker helps to package app with all dependencies");

    logger.info("***** welcomeMsg() execution end *****");
    logger.info("******************************************************************");

    return msg;
}
	
	@GetMapping("/greet")
	public String greetMsg() {
		logger.info("***** greetMsg() execution start *****");
		String msg = "Good Morning, Welcome to Ashok IT";
		System.out.println("testing git collaboration");
		logger.info("***** greetMsg() execution end *****");
		int i = 10;
		logger.info("***** greetMsg() execution successfull *****");
		boolean status = false;
		logger.info("***** ***************************** *****");
		return msg;
	}
	
	
}
