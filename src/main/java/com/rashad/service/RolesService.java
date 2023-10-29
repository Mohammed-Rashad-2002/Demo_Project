package com.rashad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rashad.dao.RolesDao;
import com.rashad.entity.Roles;

@Service
public class RolesService {

	@Autowired
	RolesDao dao;

	public String saveRole(Roles role) {
		return dao.saveRole(role);
	}
	
	public String deleteRole(int roleId) {
		return dao.deleteRole(roleId);
	}
	
	
	public Roles updateRole(int rollId,Roles role) {
		return dao.updateRole(rollId, role);
	}
	
	public List<Roles> fetchAll(){
		return dao.fetchAll();
	}

}
