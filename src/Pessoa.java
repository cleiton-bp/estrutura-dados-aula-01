public class Pessoa {
    private String Nome;
    private String Email;

    public String getNome(){
        return this.Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void logar() {
        System.out.println("Usuario logado");
    }


}
