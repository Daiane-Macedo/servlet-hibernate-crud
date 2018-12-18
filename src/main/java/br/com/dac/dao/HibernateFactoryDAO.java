package br.com.dac.dao;

public class HibernateFactoryDAO extends FactoryDAO{

	@Override
	public BicicletaDAO getBiciletaDAO() {
		return null;
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return null;
	}
	
	
}
