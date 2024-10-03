import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seus dados abaixo");

        System.out.println("Qual o seu nome?");
        String nome = ler.nextLine();
        System.out.println("Digite seu tipo de conta");
        String tipoCOnta = ler.nextLine();
        System.out.println("Digite seus saldo");
        Double saldo = ler.nextDouble();
        ler.nextLine();
        System.out.println("""
                conta verificada! agora escolha qual serviço
                você deseja realizar.
                caso queira sair, apenas digite "sair".
                """);

        String menu = """
                \nSelecione sua opção:
                1 - consultar saldo
                2 - transferir valor
                3 - receber valor

                caso queira sair da aplicação digite "sair"

                """;

        String opcao = "";
        String opcaoSair = "sair";

        while (!opcao.equalsIgnoreCase(opcaoSair)){

            System.out.println(menu);
            opcao = ler.nextLine();

            if (opcao.equals("1")){
                System.out.println("seu saldo é: " + saldo);
            } else if (opcao.equals("2")) {
                System.out.println("Qual o valor que você deseja transferir? ");
                double valor = ler.nextDouble();
                ler.nextLine();
                if ( valor > saldo){
                    System.out.println("saldo insuficiente.");
                }else{
                    saldo = saldo - valor;
                    System.out.println("transferência realizada!\nseu saldo agora é: " + saldo);
                }
            } else if (opcao.equals("3")) {
                double valorRecebido = ler.nextDouble();
                ler.nextLine();

                saldo += valorRecebido;
                System.out.println("Valor " + valorRecebido + " recebido! " + "\n seu saldo atual é: " + saldo);
            } else if (!opcao.equals("sair")) {
                System.out.println("opção invalida! ");

            }
        }
    }
}