package javafxapplication7.UsuarioDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class UsuarioDAO {
    
	Conexao conexao = new Conexao();
	//static Scanner sc = new Scanner(System.in);

	//Usuario u1 = new Usuario();

	//Cadastra um usuario no banco de dados
	public void cadastrarcliente(Usuario usuario) {

		Connection com = Conexao.getConnection();

		String sql = "";
		sql += "INSERT INTO Usuario";
		sql += "(Nome, Cpf, email, Datanasc, Login, Senha)";
		sql += "VALUES";
		sql += "(?,?,?,?,?,?)";

		try {
			PreparedStatement comando = com.prepareStatement(sql);
			comando.setString(1, usuario.getNome());
			comando.setString(2, usuario.getCPF());
			comando.setString(3, usuario.getEmail());
			comando.setString(4, usuario.getDatanascimento());
			comando.setString(5, usuario.getLogin());
			comando.setString(6, usuario.getSenha());

			comando.execute();
			comando.close();

		} catch (SQLException e) {
			System.out.println("Erro ao fechar conexao.");
		}

		conexao.fecharConexao();
	}
}