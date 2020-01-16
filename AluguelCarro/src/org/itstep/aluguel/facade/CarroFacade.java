package org.itstep.aluguel.facade;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.itstep.aluguel.dao.JdbcDAOFactory;
import org.itstep.aluguel.model.Carro;

public class CarroFacade {

	public Carro buscaCarro(Integer codCarro) throws SQLException {

		Carro carro = new Carro();

		try {
			JdbcDAOFactory jdbc = new JdbcDAOFactory();

			String sql = "SELECT C_CODIGO, C_ANO, C_CHASSI, C_COR, C_MODELO, C_MARCA, C_PLACA FROM T20WPS2.CARRO";

			PreparedStatement ps = jdbc.getConexao().prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				if (rs.getInt("COD_CARRO") == codCarro) {

					carro.setCodCarro(rs.getInt("C_CODIGO"));
					carro.setModelo(rs.getString("C_MODELO"));
					carro.setMarca(rs.getString("C_MARCA"));
					carro.setAno(rs.getString("C_ANO"));
					carro.setChassi(rs.getString("C_CHASSI"));
					carro.setPlaca(rs.getString("C_PLACA"));
					carro.setCor(rs.getString("C_COR"));
				}
			}

		} catch (SQLException e) {
			System.out.println("Erro:" + e.getMessage());
		}
		return carro;
	}

}
