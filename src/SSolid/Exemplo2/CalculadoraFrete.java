package SSolid.Exemplo2;

public class CalculadoraFrete {
    private double taxa = 10.0;

    public double calcularFrete(DadosEncomenda dadosEncomenda) {
        return dadosEncomenda.getPeso()*taxa;
    }
}
