package com.fabiomm.ngs_crud_backend.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Roles")
public class Role implements Serializable{
    @Id
    private String id;
    private String roleName;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRolename(String roleName) {
        this.roleName = roleName;
    }
    
}
