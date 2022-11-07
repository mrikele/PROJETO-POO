public class User {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String sexo;
    
    public User(int id, String nome, String email, String telefone, String sexo){
        this.id=id;
        this.nome=nome;
        this.email=email;
        this.telefone=telefone;
        this.sexo=sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}