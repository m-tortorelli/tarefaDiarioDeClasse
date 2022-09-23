package org.example;

import java.util.ArrayList;


public class Classe {
    public static void main(String[] args) {
        ArrayList<String> chamada = new ArrayList<>();
        ArrayList<String> datas = new ArrayList<>();

        datas.add("Aluno/Data:");
        datas.add(" ");
        datas.add(" ");
        datas.add(" ");
        datas.add("01/09");
        datas.add("|");
        datas.add(" ");
        datas.add(" ");
        datas.add(" ");
        datas.add("02/09");
        datas.add("|");
        datas.add(" ");
        datas.add(" ");
        datas.add(" ");
        datas.add("03/09");
        datas.add(" |");
        datas.add(" ");
        datas.add(" ");
        datas.add(" ");
        datas.add("04/09");
        datas.add(" |");
        datas.add(" ");
        datas.add(" ");
        datas.add(" ");
        datas.add("05/09");


        for (String dia: datas){
            System.out.print(dia);
        }

        chamada.add("  |");
        chamada.add("__________________________________________________________ |");
        chamada.add("Aline:        Pre  |   Aus  |   Pre   |   Pre   |   Pre    |");
        chamada.add("__________________________________________________________ |");
        chamada.add("Elizabeth:    Pre  |   Pre  |   Pre   |   Pre   |   Pre    |");
        chamada.add("__________________________________________________________ |");
        chamada.add("Louise:       Pre  |   Aus  |   Pre   |   Aus   |   Aus    |");
        chamada.add("__________________________________________________________ |");
        chamada.add("Samanta:      Aus  |   Aus  |   Pre   |   Pre   |   Pre    |");
        chamada.add("__________________________________________________________ |");
        chamada.add("Regina:       Aus  |   Aus  |   Pre   |   Aus   |   Pre    |");
        chamada.add("__________________________________________________________ |");

        for (String nome : chamada){
            System.out.println(nome);
    }




    }
}