import java.util.Scanner;

public class AppAvioes {
    private Aeroporto aeroporto;
    private Scanner entrada;

    public AppAvioes() {
        aeroporto = new Aeroporto();
        entrada = new Scanner(System.in);
    }

    public void executar() {
        System.out.println("Rodando...");
        menu();
        int opcao = entrada.nextInt();
        entrada.nextLine();
        System.out.println("====================================");
        while(opcao != 0) {
            switch (opcao) {
                case 1:
                    cadastrarAviao();
                    break;
                case 2:
                    consultarAviaoPeloModelo();
                    break;
                case 0:
                    break;
                case 99:
                    easterEgg();
                    break;
                default:
                    System.out.println("Opcao invalida. Redigite.");
            }
            menu();
            opcao = entrada.nextInt();
            entrada.nextLine();
            System.out.println("====================================");
        }
        System.out.println("Fim da execucao...");
    }

    private void menu() {
        System.out.println("====================================");
        System.out.println("Opcoes:");
        System.out.println("[1] Cadastrar um aviao");
        System.out.println("[2] Consultar um aviao pelo modelo");
        System.out.println("[0] Sair");
        System.out.print("Digite a opcao desejada: ");
    }

    private void cadastrarAviao() {
        System.out.println("CADASTRAR UM AVIAO");
        System.out.print("Digite o modelo do aviao: ");
        String modelo = entrada.nextLine();
        System.out.print("Digite o numero de assentos do aviao: ");
        int numAssentos = entrada.nextInt();
        System.out.print("Digite a autonomia do aviao: ");
        double autonomia = entrada.nextDouble();
        entrada.nextLine();
        Aviao aviao = new Aviao(modelo,numAssentos,autonomia);
        aeroporto.cadastrarAviao(aviao);
        System.out.println("Aviao cadastrado!");
    }

    private void consultarAviaoPeloModelo() {
        System.out.println("CONSULTAR AVIAO POR MODELO");
        System.out.print("Digite o modelo do aviao: ");
        String modelo = entrada.nextLine();
        Aviao aviao = aeroporto.consultarPorModelo(modelo);
        if(aviao == null)
            System.out.println("Nenhum aviao encontrado com este modelo.");
        else {
            System.out.println("Modelo do aviao: " + aviao.getModelo());
            System.out.println("Numero de assentos do aviao: " + aviao.getNumeroAssentos());
            System.out.println("Autonomia do aviao: " + aviao.getAutonomia());
        }
    }

    // Cadastra alguns Aviaos
    private void easterEgg() {
        System.out.println("Easter egg!");
        Aviao aviao = new Aviao("Boing 777",550,17600.0);
        aeroporto.cadastrarAviao(aviao);
        aviao = new Aviao("Airbus A380",850,15700.0);
        aeroporto.cadastrarAviao(aviao);
        aviao = new Aviao("Embraer E170",124,15700.0);
        aeroporto.cadastrarAviao(aviao);
        aviao = new Aviao("Tupolev Tu-154",550,15700.0);
        aeroporto.cadastrarAviao(aviao);
    }
}
