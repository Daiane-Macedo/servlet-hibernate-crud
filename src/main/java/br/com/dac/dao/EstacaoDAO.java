package br.com.dac.dao;

import java.io.Serializable;
import java.util.List;

import br.com.dac.HibernateUtil;
import br.com.dac.entity.Estacao;

public class EstacaoDAO<T> extends HibernateDAO<T, Serializable>{
	
	public EstacaoDAO() {
		super(Estacao.class);
	}
	
	public Estacao findByid(int id){
		
		List<Estacao> list = HibernateUtil.getSession().getNamedQuery("Estacao.findEstacaoById")
				.setInteger("id", id).list();
		
		if (list.isEmpty()){ 
			return null;
		}
		return list.get(0);
	}
	
	
}
