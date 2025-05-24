import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        List<Vendedor> vendedores = new ArrayList<>();

        funcionarios.add(new Secretario("Jorge Carvalho", LocalDate.of(2018, 1, 1)));
        funcionarios.add(new Secretario("Maria Souza", LocalDate.of(2015, 12, 1)));

        Vendedor ana = new Vendedor("Ana Silva", LocalDate.of(2021, 12, 1));
        Vendedor joao = new Vendedor("João Mendes", LocalDate.of(2021, 12, 1));
        vendedores.add(ana);
        vendedores.add(joao);
        funcionarios.add(ana);
        funcionarios.add(joao);

        funcionarios.add(new Gerente("Juliana Alves", LocalDate.of(2017, 7, 1)));
        funcionarios.add(new Gerente("Bento Albino", LocalDate.of(2014, 3, 1)));

        // Ana Silva
        ana.registrarVenda(12, 2021, 5200);
        ana.registrarVenda(1, 2022, 4000);
        ana.registrarVenda(2, 2022, 4200);
        ana.registrarVenda(3, 2022, 5850);
        ana.registrarVenda(4, 2022, 7000);

        // João Mendes
        joao.registrarVenda(12, 2021, 3400);
        joao.registrarVenda(1, 2022, 7700);
        joao.registrarVenda(2, 2023, 5000);
        joao.registrarVenda(3, 2024, 5900);
        joao.registrarVenda(4, 2025, 6500);

        int mes = 5;
        int ano = 2025;

        System.out.println("========== FOLHA DE PAGAMENTO (" + String.format("%02d/%d", mes, ano) + ") ==========");
        System.out.printf("Total pago (salário + benefício): R$ %.2f\n", CalculadoraFolha.totalPago(funcionarios, mes, ano));
        System.out.printf("Total apenas em salários: R$ %.2f\n", CalculadoraFolha.totalSalarios(funcionarios, mes, ano));
        System.out.printf("Total apenas em benefícios: R$ %.2f\n", CalculadoraFolha.totalBeneficios(funcionarios, mes, ano));
        System.out.println();

        Funcionario maiorRecebimento = CalculadoraFolha.maiorRemuneracao(funcionarios, mes, ano);
        System.out.println("Funcionário que recebeu o maior valor no mês: " + maiorRecebimento.getNome());

        Funcionario maiorBeneficio = CalculadoraFolha.maiorBeneficio(funcionarios, mes, ano);
        System.out.println("Funcionário com maior benefício no mês: " + maiorBeneficio.getNome());

        Vendedor maiorVenda = CalculadoraFolha.maiorVenda(vendedores, mes, ano);
        System.out.println("Vendedor que mais vendeu no mês: " + maiorVenda.getNome());
    }
}