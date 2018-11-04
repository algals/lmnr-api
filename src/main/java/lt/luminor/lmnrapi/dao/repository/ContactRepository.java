package lt.luminor.lmnrapi.dao.repository;

import lt.luminor.lmnrapi.dao.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ContactRepository extends JpaRepository<ContactEntity, Long> {

   ContactEntity getContactByOid(@Param("oid") String oid);

}
