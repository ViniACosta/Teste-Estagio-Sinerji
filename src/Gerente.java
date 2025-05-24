import java.time.LocalDate;

public class Gerente extends Funcionario {

    public Gerente(String nome, LocalDate dataContratacao) {
        super(nome, dataContratacao);
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        return 20000 + 3000 * anosDeServico(mes, ano);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        return 0;
    }
}