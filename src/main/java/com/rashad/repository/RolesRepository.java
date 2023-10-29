package com.rashad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rashad.entity.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer>{
	Roles getById(int roleId);
}
