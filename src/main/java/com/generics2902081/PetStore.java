package com.generics2902081;

import java.util.HashMap;
import java.util.Map;

import com.generics2902081.entities.Canario;
import com.generics2902081.entities.Gato;
import com.generics2902081.entities.Jaula;
import com.generics2902081.entities.Perro;

public class PetStore {
    public static void main(String[] args) {
        Map<String , Jaula<?>> PetStore= new HashMap<String, Jaula<?>>();

        PetStore.put("j1", 
                new Jaula<>(new Perro("canino"), new Gato("felino")));

        PetStore.put("j2", 
        new Jaula<>(new Canario("ave"), new Canario("ave")));

        //Evidencia final
        //recorrer el mapa para alimentar a nustras mascotas

        for(Map.Entry<String, Jaula<?>> m : PetStore.entrySet()){
            System.out.println("Identificar de jaula:"+ m.getKey());
            System.out.println("Jaula");
            System.out.println("tipo mascota1" + m.getValue().getPet2().getType());
            System.out.println("-----------------------");

            System.out.println("Identificar de jaula:"+ m.getKey());
            System.out.println("Jaula");
            System.out.println("tipo mascota1" + m.getValue().getPet1().getType());
            System.out.println("-----------------------");
        }


    
}

}

    
