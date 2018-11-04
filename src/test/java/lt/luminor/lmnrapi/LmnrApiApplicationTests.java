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
	List<ContactEntity> z =	Arrays.asList(new ContactEntity("765","oid", "email", "phone"));
	z.stream().forEach(x->contactRepository.saveAndFlush(x));
	List<ContactEntity> list = contactRepository.findAll();

	ContactEntity donotExist = contactRepository.getContactByOid("765");
	ContactEntity donotExist2 = contactRepository.getContactByOid("7653");

	}

	public void save(ContactEntity c){
		contactRepository.saveAndFlush(c);
	}

}
