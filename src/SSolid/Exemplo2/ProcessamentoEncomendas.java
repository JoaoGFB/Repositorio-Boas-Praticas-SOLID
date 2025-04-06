package SSolid.Exemplo2;

import java.util.Scanner;

public class ProcessamentoEncomendas {
    private CalculadoraFrete calculadora;
    private SalvarEncomenda salvarEncomenda;

    public ProcessamentoEncomendas() {
        this.calculadora = new CalculadoraFrete();
        this.salvarEncomenda = new SalvarEncomenda();
    }

    public void processarEncomenda() {
        try (Scanner scanner = new Scanner(System.in)) {
            DadosEncomenda encomenda = lerDados();
            encomenda.setFrete(calculadora.calcularFrete(encomenda));
            System.out.println("Valor do frete calculado: " + encomenda.getFrete());
            salvarEncomenda.salvarEncomendaEmArquivo(encomenda);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private DadosEncomenda lerDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID da encomenda: ");
        String id = scanner.nextLine();

        System.out.println("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        return new DadosEncomenda(id, peso);
    }
}
