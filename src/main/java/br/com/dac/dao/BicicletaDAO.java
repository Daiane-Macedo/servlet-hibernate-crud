package br.com.dac.dao;

import java.io.Serializable;
import java.util.List;

import br.com.dac.HibernateUtil;
import br.com.dac.entity.Bicicleta;

public class BicicletaDAO<T> extends HibernateDAO<T, Serializable>{

	public BicicletaDAO() {
		super(Bicicleta.class);
	}
	
	public Bicicleta findByEstacaoId(int idEstacao){
		List<Bicicleta> list = HibernateUtil.getSession().getNamedQuery("Bicicleta.findByEstacaoId")
				.setInteger("idEstacao", idEstacao).list();
		
		if (list.isEmpty())
			return null;
		
		return list.get(0);
		
	}
	public Bicicleta findByid(int id){
		
		List<Bicicleta> list = HibernateUtil.getSession().getNamedQuery("Bicicleta.findBicicletaById")
				.setInteger("id", id).list();
		
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}