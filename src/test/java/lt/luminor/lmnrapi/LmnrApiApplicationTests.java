package lt.luminor.lmnrapi;

import lt.luminor.lmnrapi.dao.entity.ContactEntity;
import lt.luminor.lmnrapi.dao.repository.ContactRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LmnrApiApplicationTests {

	@Autowired
	ContactRepository contactRepository;

	@Test
	public void contextLoads() {

	}

	public void save(ContactEntity c){
		contactRepository.saveAndFlush(c);
	}

}
