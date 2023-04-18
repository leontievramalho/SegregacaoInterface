package br.edu.catolica.SegregacaoInterface.Model;

import br.edu.catolica.SegregacaoInterface.Interface.GolpeIronTail;
import br.edu.catolica.SegregacaoInterface.Interface.GolpeThunderWave;
import br.edu.catolica.SegregacaoInterface.Interface.GolpeThunderbolt;

public class Pikachu implements GolpeThunderbolt, GolpeIronTail, GolpeThunderWave {
    @Override
    public void caudaDeFerro() {
        System.out.println("Causou 50 de dano do tipo metal.");
    }

    @Override
    public void ondaDeTrovao() {
        System.out.println("Paralisou o inimigo.");
    }

    @Override
    public void choqueDoTrovao() {
        System.out.println("Causou 70 de dano do tipo elétrico.");
    }
}
