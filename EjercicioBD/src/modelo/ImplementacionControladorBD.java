package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import clases.Coche;
import clases.Propietario;

public class ImplementacionControladorBD implements ControladorDatos{

	private Connection conex;
	private PreparedStatement stmt;
	
	//Conexion
	private String url = "jdbc:mysql://localhost:3306/bdcoches?serverTimezone=Europe/Madrid&useSSL=false";
	private String usuario = "adminTemp";
	private String contraseņa = "abcd*1234";
	
	//SQL
	final String INSERTpropietario = "INSERT INTO propietario(ID_PROPIETARIO, NOMBRE, FECHA_NAC) VALUES(?,?,?)";
	
	public void openConnection() {
		try {
			conex = DriverManager.getConnection(url, usuario, contraseņa);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeConnection() throws SQLException{
		if (conex != null) {
			conex.close();
		}
		if (stmt != null) {
			stmt.close();
		}
	}
	
	@Override
	public void altaPropietario(Propietario prop) {
		openConnection();
		try {
			stmt = conex.prepareStatement(INSERTpropietario);
			
			stmt.setString(1, prop.getIdentificador());
			stmt.setString(2, prop.getNombre());
			stmt.setDate(3, Date.valueOf(prop.getFechaNacimiento()));
			
			stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				closeConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public Propietario buscarPropietario(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modificarPropietario(Propietario prop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPropietario(Propietario prop) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Propietario> listarPropietarios() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void altaCoche(Coche coch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Coche buscarCoche(String matricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modificarCoche(Coche coch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCoche(Coche coch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, Coche> listarCoches() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Coche> listarCochesPropietario(Propietario prop) {
		// TODO Auto-generated method stub
		return null;
	}

}
