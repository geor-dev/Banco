public class Cliente {
    private String Nome;
    private String Cpf;


    public Cliente(String nome, String cpf){
        this.Nome = nome;
        this.Cpf = cpf;
    }

    public String getNome() {
        return Nome;
    }

    public String getCpf() {
        return Cpf;
    }
}
