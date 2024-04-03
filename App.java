// importar o Scanner para imprimir os dados
import java.util.Scanner;

public class App {
    // informar o método de entrada de dados
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inserir o nome do funcionário
        System.out.print("Insira o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();
        
        // Inserir o salário do funcionário
        System.out.print("Insira o salário do funcionário: R$ ");
        double salarioFuncionario = scanner.nextDouble();
        
        // Avançar para a próxima linha
        scanner.nextLine();
        
        // Inserir o cargo do funcionário
        System.out.print("Insira o cargo do funcionário: ");
        String cargoFuncionario = scanner.nextLine();
        
        // Imprimindo os dados inseridos
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Salário do funcionário: R$" + salarioFuncionario);
        System.out.println("Cargo do funcionário: " + cargoFuncionario);
              
        // Fechar o scanner
        scanner.close();
    }
}