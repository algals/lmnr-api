package lt.luminor.lmnrapi.domain;

import java.io.Serializable;

public class User implements Serializable{

    private String id_token;

    public User(){};

    public User(String id_token) {
        this.id_token = id_token;
    }

    public String getId_token() {
        return id_token;
    }

    public void setId_token(String id_token) {
        this.id_token = id_token;
    }
}
