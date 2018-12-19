package br.com.dac.dao;

import java.io.Serializable;
import java.util.List;

import br.com.dac.HibernateUtil;
import br.com.dac.entity.Historico;

public class HistoricoDAO<T> extends HibernateDAO<T, Serializable>{
	
	public HistoricoDAO() {
		super(Historico.class);
	}
	
	public Historico findByid(int id){
		
		List<Historico> list = HibernateUtil.getSession().getNamedQuery("Historico.findHistoricoById")
				.setInteger("id", id).list();
		
		if (list.isEmpty()){ 
			return null;
		}
		return list.get(0);
	}
}
