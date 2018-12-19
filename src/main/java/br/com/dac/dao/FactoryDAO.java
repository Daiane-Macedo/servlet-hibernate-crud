package br.com.dac.dao;

public abstract class FactoryDAO {
	
	private static final Class FACTORY_CLASS = HibernateFactoryDAO.class;

	public static FactoryDAO getFactory() {
		
		try {
			return (FactoryDAO) FACTORY_CLASS.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
	public abstract BicicletaDAO getBicicletaDAO();

	public abstract UsuarioDAO getUsuarioDAO();
	
	public abstract AdministradorDAO getAdministradorDAO();

	public abstract EstacaoDAO getEstacaoDAO();

	public abstract HistoricoDAO getHistoricoDAO();

}
