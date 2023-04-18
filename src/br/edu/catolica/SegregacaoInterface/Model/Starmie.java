package br.edu.catolica.SegregacaoInterface.Model;

import br.edu.catolica.SegregacaoInterface.Interface.GolpeThunderbolt;
import br.edu.catolica.SegregacaoInterface.Interface.GolpeWaterGun;

public class Starmie implements GolpeThunderbolt, GolpeWaterGun {
    @Override
    public void choqueDoTrovao() {
        System.out.println("Causou 45 de dano do tipo elétrico.");
    }

    @Override
    public void armaDeAgua() {
        System.out.println("Causou 60 de dano do tipo água.");
    }
}
