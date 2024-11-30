import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConcessionariaService concessionariaService = new ConcessionariaService();

        while (true) {
            System.out.println("\nBem-vindo à Concessionária!");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Listar veículos");
            System.out.println("3. Buscar veículos por tipo");
            System.out.println("4. Cadastrar cliente");
            System.out.println("5. Listar clientes");
            System.out.println("6. Buscar cliente por CPF");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    cadastrarVeiculo(scanner, concessionariaService);
                    break;
                case 2:
                    concessionariaService.listarVeiculos();
                    break;
                case 3:
                    buscarVeiculosPorTipo(scanner, concessionariaService);
                    break;
                case 4:
                    cadastrarCliente(scanner, concessionariaService);
                    break;
                case 5:
                    concessionariaService.listarClientes();
                    break;
                case 6:
                    buscarClientePorCpf(scanner, concessionariaService);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void cadastrarVeiculo(Scanner scanner, ConcessionariaService concessionariaService) {
        System.out.println("Digite o tipo do veículo (CARRO, MOTO, CAMINHÃO): ");
        String tipo = scanner.nextLine().toUpperCase();
        System.out.println("Digite a marca: ");
        String marca = scanner.nextLine();
        System.out.println("Digite o modelo: ");
        String modelo = scanner.nextLine();
        System.out.println("Digite o preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();  // Limpar buffer

        Veiculo veiculo = null;
        switch (tipo) {
            case "CARRO":
                veiculo = new Carro(marca, modelo, preco);
                break;
            case "MOTO":
                veiculo = new Moto(marca, modelo, preco);
                break;
            case "CAMINHÃO":
                veiculo = new Caminhao(marca, modelo, preco);
                break;
            default:
                System.out.println("Tipo de veículo inválido.");
                return;
        }

        concessionariaService.adicionarVeiculo(veiculo);
        System.out.println("Veículo cadastrado com sucesso!");
    }

    private static void buscarVeiculosPorTipo(Scanner scanner, ConcessionariaService concessionariaService) {
        System.out.println("Digite o tipo de veículo para buscar (CARRO, MOTO, CAMINHÃO): ");
        String tipo = scanner.nextLine().toUpperCase();
        concessionariaService.buscarVeiculosPorTipo(VeiculoTipo.valueOf(tipo));
    }

    private static void cadastrarCliente(Scanner scanner, ConcessionariaService concessionariaService) {
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, telefone);
        concessionariaService.adicionarCliente(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void buscarClientePorCpf(Scanner scanner, ConcessionariaService concessionariaService) {
        System.out.println("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        concessionariaService.buscarClientePorCpf(cpf);
    }
}
