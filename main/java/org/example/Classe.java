package org.example;




import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Classe {
        public static void main(String[] args){
        Map<String, List<String>> presenca = new LinkedHashMap<>();

        presenca.put("19/09",List.of("Louise", "Elizabeth", "Regina"));
        presenca.put("20/09",List.of("Aline", "Louise", "Elizabeth", "Samanta", "Regina"));
        presenca.put("21/09",List.of("Aline", "Louise", "Samanta", "Regina"));
        presenca.put("22/09",List.of("Aline", "Louise", "Elizabeth", "Samanta", "Regina"));
        presenca.put("23/09",List.of("Samanta", "Regina"));

        System.out.println("--------------- Lista de Presenca ---------------");

        for(Map.Entry<String, List<String>> datas : presenca.entrySet()){
                System.out.println(datas.getKey()+" "+datas.getValue());


        }
                System.out.println("-------------------------------------------------");

        }

    }