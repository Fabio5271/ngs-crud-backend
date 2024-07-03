package com.fabiomm.ngs_crud_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiomm.ngs_crud_backend.entities.Role;
import com.fabiomm.ngs_crud_backend.repositories.RoleRepository;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    // creates a new role
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    // returns a role by id or null if it doesn´t exist
    public Role getRoleById(String id) {
        return roleRepository.findById(id).orElse(null);
    }

    // retrieves all roles from DB
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    // updates an existing role
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    // removes a role from the DB by id
    public void deleteRole(String id) {
        roleRepository.deleteById(id);
    }
}