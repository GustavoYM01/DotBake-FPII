package objetos;

public class Usuario {
    
    static private String nome_usuario = "";
    static private String email = "";
    static private String senha = "";

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
    
    public void setNome_Usuario(String nomeUsuario) {
        this.nome_usuario = nomeUsuario;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
