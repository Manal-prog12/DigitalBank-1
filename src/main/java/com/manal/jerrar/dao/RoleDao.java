package com.manal.jerrar.dao;

import org.springframework.data.repository.CrudRepository;

import com.manal.jerrar.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}
