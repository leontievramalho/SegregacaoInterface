package br.edu.catolica.SegregacaoInterface.Model;

import br.edu.catolica.SegregacaoInterface.Interface.GolpeWaterGun;

public class Goldeen implements GolpeWaterGun {
    @Override
    public void armaDeAgua() {
        System.out.println("Causou 55 de dano do tipo água.");
    }
}
