import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Vendedor extends Funcionario {
    private Map<String, Double> vendasMensais = new HashMap<>();

    public Vendedor(String nome, LocalDate dataContratacao) {
        super(nome, dataContratacao);
    }

    public void registrarVenda(int mes, int ano, double valor) {
        String chave = String.format("%02d/%d", mes, ano);
        vendasMensais.put(chave, valor);
    }

    public double getVenda(int mes, int ano) {
        String chave = String.format("%02d/%d", mes, ano);
        return vendasMensais.getOrDefault(chave, 0.0);
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        return 12000 + 1800 * anosDeServico(mes, ano);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        return getVenda(mes, ano) * 0.30;
    }
}
