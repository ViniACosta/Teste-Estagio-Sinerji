import java.util.*;

public class CalculadoraFolha {

    public static double totalPago(List<Funcionario> funcionarios, int mes, int ano) {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.calcularTotal(mes, ano);
        }
        return total;
    }

    public static double totalSalarios(List<Funcionario> funcionarios, int mes, int ano) {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.calcularSalario(mes, ano);
        }
        return total;
    }

    public static double totalBeneficios(List<Funcionario> funcionarios, int mes, int ano) {
        double total = 0;
        for (Funcionario f : funcionarios) {
            total += f.calcularBeneficio(mes, ano);
        }
        return total;
    }

    public static Funcionario maiorRemuneracao(List<Funcionario> funcionarios, int mes, int ano) {
        Funcionario maior = null;
        double maiorValor = 0;

        for (Funcionario f : funcionarios) {
            double total = f.calcularTotal(mes, ano);
            if (maior == null || total > maiorValor) {
                maior = f;
                maiorValor = total;
            }
        }
        return maior;
    }

    public static Funcionario maiorBeneficio(List<Funcionario> funcionarios, int mes, int ano) {
        Funcionario maior = null;
        double maiorValor = 0;

        for (Funcionario f : funcionarios) {
            double beneficio = f.calcularBeneficio(mes, ano);
            if (maior == null || beneficio > maiorValor) {
                maior = f;
                maiorValor = beneficio;
            }
        }
        return maior;
    }

    public static Vendedor maiorVenda(List<Vendedor> vendedores, int mes, int ano) {
        Vendedor maior = null;
        double maiorVenda = 0;

        for (Vendedor v : vendedores) {
            double valor = v.getVenda(mes, ano);
            if (maior == null || valor > maiorVenda) {
                maior = v;
                maiorVenda = valor;
            }
        }
        return maior;
    }
}