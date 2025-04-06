package SSolid.Exemplo2;

public class DadosEncomenda {
    private String id;
    private double peso;
    private double frete;

    public DadosEncomenda(String id, double peso) {
        this.id = id;
        this.peso = peso;
    }

    public String getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
    public double getFrete() {
        return frete;
    }
}
