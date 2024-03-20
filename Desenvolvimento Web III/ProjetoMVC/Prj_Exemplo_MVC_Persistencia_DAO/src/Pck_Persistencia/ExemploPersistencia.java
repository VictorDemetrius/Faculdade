package Pck_Persistencia;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Pck_DAO.ConexaoMySql;

import Pck_Model.ExemploModel;

public class ExemploPersistencia {
	
	
	CallableStatement oCall;
	ConexaoMySql oConectar = new ConexaoMySql();
	PreparedStatement oPrepared;
	ResultSet oResultSet;
	//String login = oConectar.getLogin(login);
	//String senha = oConectar.getSenha(senha);
	
	String login = "root";
	String senha = "alunofatec";
	
	
	public void inserirExemplo (ExemploModel oExemploModel)
	{
		try {
			
			try {
					oCall = oConectar.getConnection(login,senha).prepareCall("CALL PROC_INSEXEMPLO(?)");
					oCall.setString(1, oExemploModel.getA01_nome());
					oCall.execute();
			}catch (SQLException e) {e.printStackTrace();}
		}finally {oConectar.desconectar();}
		
	}

}
