package ISOLID.Exemplo2.Carros;

import ISOLID.Exemplo2.Veiculos.SuperVeiculo;

public class SuperCarro implements SuperVeiculo {

    @Override
    public void dirigir() {
        System.out.println("O carro está dirigindo na estrada...");

    }

    @Override
    public void voar() {
        System.out.println("O caarro está voando no céu...");

    }

    @Override
    public void navegar() {
        System.out.println("O carro está navegando...");

    }
}
