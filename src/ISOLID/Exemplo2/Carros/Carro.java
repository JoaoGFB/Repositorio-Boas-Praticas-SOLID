package ISOLID.Exemplo2.Carros;

import ISOLID.Exemplo2.Veiculos.Veiculo;

public class  Carro implements Veiculo {
    @Override
    public void dirigir() {
        System.out.println("Carro está dirigindo na estrada...");
    }
}

