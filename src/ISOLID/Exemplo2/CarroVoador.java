package ISOLID.Exemplo2;

public class CarroVoador implements Veiculo, VeiculoVoador{
    @Override
    public void dirigir() {
        System.out.println("O carro está dirigindo na estrada...");

    }

    @Override
    public void voar() {
        System.out.println("O carro está voando no céu");

    }
}
