package edu.miu.CICDwithJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication
public class CicdWithJenkinsApplication {

	public static  Logger logger = Logger.getLogger(String.valueOf(CicdWithJenkinsApplication.class));

	@PostConstruct
	public void init(){
		logger.info("It is in the init method");
	}

	public static void main(String[] args) {
		new CicdWithJenkinsApplication().init();
		SpringApplication.run(CicdWithJenkinsApplication.class, args);
	}

}
