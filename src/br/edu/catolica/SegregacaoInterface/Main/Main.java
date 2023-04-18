package br.edu.catolica.SegregacaoInterface.Main;

import br.edu.catolica.SegregacaoInterface.Model.Goldeen;
import br.edu.catolica.SegregacaoInterface.Model.Pikachu;
import br.edu.catolica.SegregacaoInterface.Model.Starmie;

public class Main {
    public static void main(String[] args){
        Pikachu pikachu = new Pikachu();
        Starmie starmie = new Starmie();
        Goldeen goldeen = new Goldeen();

        pikachu.choqueDoTrovao();
        starmie.choqueDoTrovao();
        starmie.armaDeAgua();
        goldeen.armaDeAgua();
    }
}
