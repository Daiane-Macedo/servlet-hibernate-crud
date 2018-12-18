package br.com.dac.dao;

import java.io.Serializable;
import java.util.List;

import br.com.dac.HibernateUtil;
import br.com.dac.entity.Bicicleta;

public class BicicletaDAO<T> extends HibernateDAO<T, Serializable>{

	public BicicletaDAO() {
		super(Bicicleta.class);
		// TODO Auto-generated constructor stub
	}
	
	public Bicicleta findByid(String id){
		List<Bicicleta> list = HibernateUtil.getSession().getNamedQuery("Bicicleta.findByIdBicicleta")
				.setString("id", id).list();
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}