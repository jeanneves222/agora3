package javafxapplication7.UsuarioDAO;

public class Usuario {
    
        private int Id_Usuario;
    	private String nome;
	private String CPF;
        private String email;
	private String Datanascimento;
	private String Login;
	private String Senha;
        
    public Usuario(){
            
    } 

    public int getId_Usuario() {
	return Id_Usuario;
    }
    
    public void setId_Usuario(int Id_Usuario) {
	this.Id_Usuario = Id_Usuario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDatanascimento() {
        return Datanascimento;
    }

    public void setDatanascimento(String Datanascimento) {
        this.Datanascimento = Datanascimento;
    }


    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }
    
}