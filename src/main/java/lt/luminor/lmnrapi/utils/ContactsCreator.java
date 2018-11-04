package lt.luminor.lmnrapi.utils;

import lt.luminor.lmnrapi.dao.entity.ContactEntity;
import lt.luminor.lmnrapi.dao.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Arrays;

@Component
public class ContactsCreator {

    @Autowired
    ContactRepository contactRepository;

    @PostConstruct
    @Transactional
    public void createContactList(){
        Arrays.asList(
                new ContactEntity("a6edfe4f-fdce-48fd-b2dd-a1ba08d339f1","algals", "algals@alg.lt", "+37068238512"),
                new ContactEntity("234","oid", "email", "phone"),
                new ContactEntity("456","oid", "email", "phone")

        ).stream().forEach(x -> contactRepository.save(x));
    }

}