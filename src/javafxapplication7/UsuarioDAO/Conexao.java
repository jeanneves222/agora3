package javafxapplication7.UsuarioDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
        private static String usuario 	= "postgres";
	private static String senha 	= "123";
	private static String banco 	= "Agora";
	private static String host 	= "localhost:5432";
	private static String driver	= "org.postgresql.Driver";
	private static Connection conexao = null;
	
	public static Connection getConnection() {
		System.out.println("Conectando..........");
		try {
			System.out.println("Buscando drive......");
			Class.forName(driver);
			System.out.println("Drive encontrado");
			if(conexao == null || conexao.isClosed()) {
				conexao = DriverManager.getConnection("jdbc:postgresql://"+host+"/"+banco, usuario, senha);
			}
			return conexao;
		}catch(ClassNotFoundException ex){
			System.out.println("Drive não encontrado");
		}catch(SQLException ex) {
			System.out.println("Erro de SQL!");
		}
		return conexao;
	}
	
	public static void fecharConexao() {
		try {
			if (conexao != null && conexao.isClosed()) {
				conexao.close();
				System.out.println("Conexão fechada com sucesso!");
			}
		}catch (SQLException e) {
			System.out.println("Erro ao fechar conexao.");
		}
	}
    
}
