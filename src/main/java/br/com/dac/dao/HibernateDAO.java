package br.com.dac.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Criteria;

import br.com.dac.HibernateUtil;

public abstract class HibernateDAO<T, Type extends Serializable> implements GenericDAO<T, Type> {
	private Class<T> persistentClass;
	

	public HibernateDAO(Class persistentClass) {
		super();
		this.persistentClass = persistentClass;
	}

	@Override
	public void beginTransaction() {
		HibernateUtil.beginTransaction();
	}

	@Override
	public void commitTransaction() {
		HibernateUtil.commitTransaction();
	}

	public void rollbackTransaction(){
		HibernateUtil.rollBackTransaction();
	}
	
	@Override
	public void save(T entity) {
		HibernateUtil.getSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(T entity) {
		HibernateUtil.getSession().delete(entity);
	}

	@Override
	public List<T> listAll() {
		Criteria criteria = HibernateUtil.getSession().createCriteria(persistentClass);
		return criteria.list();
	}
}