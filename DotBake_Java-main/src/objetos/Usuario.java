package objetos;

public class Usuario {
    
    static private String nome_usuario = "";
    static private String email = "";
    static private String senha = "";
    static private String emailUsuario = "";
    static private String nome_usuario2 = "";

    public Usuario(){ // CONSTRUTOR PADRÃO
    }
    
    // GET E SET
    public String getNome_Usuario(){
        return nome_usuario;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public String getEmailUsuario(){
        return emailUsuario;
    }
    public String getNomeUsuario2(){
        return nome_usuario2;
    }
    
    public void setNome_Usuario(String nomeUsuario) {
        this.nome_usuario = nomeUsuario;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }
    public void setNomeUsuario2(String nome_usuario2) {
        this.nome_usuario2 = nome_usuario2;
    }
}
