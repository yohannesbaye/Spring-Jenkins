package edu.miu.CICDwithJenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CicdWithJenkinsApplication {
	public static Logger logger = LoggerFactory.getLogger(CicdWithJenkinsApplication.class);

	@PostConstruct
	public static void init(){
		logger.info("It is in the init method ============ \n ==========================================\n=====================");
	}

	public static void main(String[] args) {

		SpringApplication.run(CicdWithJenkinsApplication.class, args);
		init();
		logger.info("It is to check up the erunning jenkins");
//		System.out.println("This is boring thing in my life. \n I am wating it when well it be easy for me" );
	}

}
