import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }
}
