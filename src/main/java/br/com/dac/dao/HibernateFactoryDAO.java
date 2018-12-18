package br.com.dac.dao;

public class HibernateFactoryDAO extends FactoryDAO{

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAO();
	}

	@Override
	public EstacaoDAO getEstacaoDAO() {
		// TODO Auto-generated method stub
		return new EstacaoDAO();
	}

	@Override
	public BicicletaDAO getBicicletaDAO() {
		// TODO Auto-generated method stub
		return new BicicletaDAO();
	}

	@Override
	public HistoricoDAO getHistoricoDAO() {
		// TODO Auto-generated method stub
		return new HistoricoDAO();
	}

}

