package lt.luminor.lmnrapi.service.impl;

import lt.luminor.lmnrapi.dao.entity.ContactEntity;
import lt.luminor.lmnrapi.dao.repository.ContactRepository;
import lt.luminor.lmnrapi.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<ContactEntity> getContactsByOid(String oid) {
        return Arrays.asList(contactRepository.getContactByOid(oid));
    }
}
