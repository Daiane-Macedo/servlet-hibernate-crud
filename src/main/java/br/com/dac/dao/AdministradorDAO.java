package br.com.dac.dao;

import java.io.Serializable;
import java.util.List;

import br.com.dac.HibernateUtil;
import br.com.dac.entity.Administrador;

public class AdministradorDAO<T> extends HibernateDAO<T, Serializable>{ 
	
	public AdministradorDAO() {
		super(Administrador.class);
	}
	
	public Administrador findByid(int id){
		
		List<Administrador> list = HibernateUtil.getSession().getNamedQuery("Administrador.findAdministradorById")
				.setInteger("id", id).list();
		
		if (list.isEmpty()){ 
			return null;
		}
		return list.get(0);
	}
}
