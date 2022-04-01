package com.grootan.jwtrolebasedauthorization.dao;

import com.grootan.jwtrolebasedauthorization.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
