package ISOLID.Exemplo2.Carros;

import ISOLID.Exemplo2.Veiculos.Veiculo;
import ISOLID.Exemplo2.Veiculos.VeiculoAquatico;

public class CarroAnfibio implements Veiculo, VeiculoAquatico {

    @Override
    public void dirigir() {
        System.out.println("O carro está dirigindo na estrada....");

    }

    @Override
    public void navegar() {
        System.out.println("O carro está navegando...");

    }
}
