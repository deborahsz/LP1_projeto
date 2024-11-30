import java.util.ArrayList;
import java.util.List;

public class ConcessionariaService {
    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void listarVeiculos() {
        if (veiculos.isEmpty()) {
            System.out.println("Não há veículos cadastrados.");
        } else {
            for (Veiculo veiculo : veiculos) {
                System.out.println(veiculo);
            }
        }
    }

    public void buscarVeiculosPorTipo(VeiculoTipo tipo) {
        boolean encontrado = false;
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getTipo().equals(tipo.name())) {
                System.out.println(veiculo);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum veículo encontrado para o tipo " + tipo.name());
        }
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    public void buscarClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println(cliente);
                return;
            }
        }
        System.out.println("Cliente com CPF " + cpf + " não encontrado.");
    }
}
