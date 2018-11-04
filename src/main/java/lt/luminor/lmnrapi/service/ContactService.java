package lt.luminor.lmnrapi.service;

import lt.luminor.lmnrapi.dao.entity.ContactEntity;

import java.util.List;

public interface ContactService {

    List<ContactEntity> getContactsByOid(String oid);

}
