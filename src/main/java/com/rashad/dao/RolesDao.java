package com.rashad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rashad.entity.Roles;
import com.rashad.repository.RolesRepository;

@Component
public class RolesDao {
	
	@Autowired
	RolesRepository repo;
	
	public String saveRole(Roles role) {
		repo.save(role);
		return "Successfully Inserted";
	}
	
	public String deleteRole(int roleId) {
		repo.deleteById(roleId);
		return "Deleted successfully";
	}
	
	
	public Roles updateRole(int roleId,Roles role) {
		Roles existingEnity=repo.getById(roleId);
		
		existingEnity.setRoleName(role.getRoleName());
		existingEnity.setCreatedDate(role.getCreatedDate());
		existingEnity.setRoleDesc(role.getRoleDesc());
		
		return repo.save(existingEnity);
	}
	
	public List<Roles> fetchAll(){
		return repo.findAll();
	}

}
