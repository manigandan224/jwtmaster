package com.grootan.jwtrolebasedauthorization.service;

import com.grootan.jwtrolebasedauthorization.entity.Role;
import com.grootan.jwtrolebasedauthorization.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
