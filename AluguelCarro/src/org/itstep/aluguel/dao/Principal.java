package org.itstep.aluguel.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.itstep.aluguel.model.Carro;

public class Principal {

	public static void main(String[] args) throws SQLException {

		JdbcDAOFactory JdbcDAOFactory = new JdbcDAOFactory();

		System.out.println("Mostrar todos registros de carros");

		ArrayList<Carro> carros = new ArrayList<Carro>();
		
		String sql = "SELECT ID,MODELO,FABRICANTE,ANO,RESPONSAVEL FROM T20WPS2.CARRO";
		
		PreparedStatement ps = JdbcDAOFactory.getConexao().prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			Carro carro = new Carro();
			
			carro.setCodCarro(rs.getInt("ID"));
			carro.setModelo(rs.getString("MODELO"));
			carro.setMarca(rs.getString("FABRICANTE"));
			carro.setAno(rs.getString("ANO"));
			carro.setResponsavel(rs.getString("RESPONSAVEL"));
			carros.add(carro);
			
		}
		
		for (Carro c : carros) {
			
			System.out.println("ID: "+c.getCodCarro());
			System.out.println("MODELO: "+c.getModelo());
			System.out.println("FABRICANTE: "+c.getMarca());
			System.out.println("ANO: "+c.getAno());
			System.out.println("RESPONSAVEL: "+c.getResponsavel());
			
		}
	}

}
