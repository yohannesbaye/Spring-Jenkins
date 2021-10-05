package edu.miu.CICDwithJenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class CicdWithJenkinsApplicationTests {

	@Test
	void contextLoads() {

		assertEquals(true, true);
	}

}
