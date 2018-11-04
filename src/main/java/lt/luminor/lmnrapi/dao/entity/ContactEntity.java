package lt.luminor.lmnrapi.dao.entity;

import javax.persistence.*;

@Entity
@Table
public class ContactEntity {

    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String oid;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String address;

    public ContactEntity(){}

    public ContactEntity(String oid, String name, String email, String phone, String address) {
        this.oid = oid;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
