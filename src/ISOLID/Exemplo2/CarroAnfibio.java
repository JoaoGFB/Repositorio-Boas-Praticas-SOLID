package ISOLID.Exemplo2;

public class CarroAnfibio implements Veiculo, VeiculoAquatico{

    @Override
    public void dirigir() {
        System.out.println("O carro está dirigindo na estrada....");

    }

    @Override
    public void navegar() {
        System.out.println("O carro está navegando...");

    }
}
