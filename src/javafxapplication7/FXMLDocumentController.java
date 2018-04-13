package javafxapplication7;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafxapplication7.UsuarioDAO.Usuario;
import javafxapplication7.UsuarioDAO.UsuarioDAO;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label LabelClienteNome;
    
    @FXML
    private Label LabelClienteCpf;
    
    @FXML
    private Label LabelClienteEmail;
    
    @FXML
    private Label LabelClienteDataNascimento;
    
    @FXML
    private Label LabelClienteLogin;
    
    @FXML
    private Label LabelClienteSenha;
    
    @FXML
    private TextField TextFieldUsuarioNome;
    
    @FXML
    private TextField TextFieldUsuarioCpf;
    
    @FXML
    private TextField TextFieldUsuarioEmail;
    
    @FXML
    private TextField TextFieldUsuarioDataNascimento;
    
    @FXML
    private TextField TextFieldUsuarioLogin;
    
    @FXML
    private TextField TextFieldUsuarioSenha;
    
    @FXML
    private Button ButtonConfirmar;
    
    @FXML
    private Button ButtonCancelar;
    
    private Boolean ButtonConfirmarClicked = false;
    private Usuario Usuario = new Usuario();
    private UsuarioDAO u1 = new UsuarioDAO();

    public Boolean getButtonConfirmarClicked() {
        return ButtonConfirmarClicked;
    }

    public void setButtonConfirmarClicked(Boolean ButtonConfirmarClicked) {
        this.ButtonConfirmarClicked = ButtonConfirmarClicked;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }
    
    @FXML
    private void handleButtonConfirmar(){
        Usuario.setNome(TextFieldUsuarioNome.getText());
        Usuario.setCPF(TextFieldUsuarioCpf.getText());
        Usuario.setEmail(TextFieldUsuarioEmail.getText());
        Usuario.setDatanascimento(TextFieldUsuarioDataNascimento.getText());
        Usuario.setLogin(TextFieldUsuarioLogin.getText());
        Usuario.setSenha(TextFieldUsuarioSenha.getText());
        
        ButtonConfirmarClicked = true;
        
        u1.cadastrarcliente(Usuario);
    
    }
    
     /*@FXML
    private void handleButtonCancelar(){
    
    }*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}