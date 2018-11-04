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
                new ContactEntity("a6edfe4f-fdce-48fd-b2dd-a1ba08d339f1","algals", "algals@alg.lt", "+37068238512", "Pilies5, Vilnius"),
                new ContactEntity("1d677424-1bbb-4e50-ab40-86667603dd8f","petras", "petras@petras.lt", "+37067378233", "Nemuno 78, Kaunas"),
                new ContactEntity("3d0f0406-a6ec-4b53-8b31-4525b23c9d2d","jonas", "jonas@jonas.lt", "+37965789666", "Kranto 8, Klaipeda")
        ).stream().forEach(x -> contactRepository.save(x));
    }

}
