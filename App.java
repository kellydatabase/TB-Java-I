//Desafio da aula 01/04/2024:
//- Crie um programa que armazene os seguintes dados: nome do funcionário, salário e cargo e imprima no console os 3 valores;

public class funcionarios {

    static String nomeFuncionario = "José da Silva";
    static String cargoFuncionario = "Analista de dados";
    static double salarioTFuncionario =  12500.00;

    public static void main(String[] args) throws Exception {
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Cargo: " + cargoFuncionario);
        System.out.println("Salário: R$ " + salarioTFuncionario);
    }
}
