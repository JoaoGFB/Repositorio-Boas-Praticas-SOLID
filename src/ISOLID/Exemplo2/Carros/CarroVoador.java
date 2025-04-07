package ISOLID.Exemplo2.Carros;

import ISOLID.Exemplo2.Veiculos.Veiculo;
import ISOLID.Exemplo2.Veiculos.VeiculoVoador;

public class CarroVoador implements Veiculo, VeiculoVoador {
    @Override
    public void dirigir() {
        System.out.println("O carro está dirigindo na estrada...");

    }

    @Override
    public void voar() {
        System.out.println("O carro está voando no céu");

    }
}
