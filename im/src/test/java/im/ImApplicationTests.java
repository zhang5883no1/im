package im;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import im.dao.ClientInfoRepository;
import im.entity.Constant;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImApplicationTests {

	@Autowired
	private ClientInfoRepository clientRepository;
	
	@Test
	public void clientInfoTest() {
		System.out.println("----------------------");
	}

}
