import java.time.LocalDate;

public class Secretario extends Funcionario {

    public Secretario(String nome, LocalDate dataContratacao) {
        super(nome, dataContratacao);
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        return 7000 + 1000 * anosDeServico(mes, ano);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        return calcularSalario(mes, ano) * 0.20;
    }
}