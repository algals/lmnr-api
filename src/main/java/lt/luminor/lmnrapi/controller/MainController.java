package lt.luminor.lmnrapi.controller;

import lt.luminor.lmnrapi.dao.entity.ContactEntity;
import lt.luminor.lmnrapi.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class MainController {

    private ContactService contactService;

    public MainController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<ContactEntity> getContacts(@RequestParam("id") String oid){
        return contactService.getContactsByOid(oid);
    }

}
