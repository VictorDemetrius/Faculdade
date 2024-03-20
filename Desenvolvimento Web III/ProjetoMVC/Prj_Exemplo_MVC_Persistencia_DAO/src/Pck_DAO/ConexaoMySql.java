package Pck_DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoMySql {

		public Connection obj_connection = null;
		
		private final String DRIVER = "com.mysql.jdbc.Driver";
		private final String URL = "jdbc:myslq://localhost";
	
			private final  String LOGIN = "root";
			private final String SENHA= "alunofatec";
			
				
			
			public boolean getConnection() 
			{
				try 
				{
					Class.forName(DRIVER);
					obj_connection = DriverManager.getConnection(URL,LOGIN,SENHA);
					System.out.println("Conexão realizada com sucesso");
					return true;
					
				}catch (ClassNotFoundException e) 
				{
					System.out.println("Classe não foi encontrada" +e.toString());
					return false;
				
				}catch (SQLException e) 
				{
					System.out.println("Falha na conexão"+e.toString());
					
					
					return false;

				}
			}
			
			public void desconectar() {
				try {
					if (obj_connection != null) {
						obj_connection.close();
						System.out.print("Desconectado");
						}
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}

			public Object getConnection(String login2, String senha2) {
				
					login2 = LOGIN;
							
				
					senha2 = SENHA;
							
				
				return login2;
				
			}
}
