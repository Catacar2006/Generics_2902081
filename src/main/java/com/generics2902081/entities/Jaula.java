package com.generics2902081.entities;

public class Jaula<E extends pet & IEats> {

    private E pet1;
    private E pet2;

    //CONSTRUVTOR
    public Jaula(E pet1, E pet2) {
        this.pet1 = pet1;
        this.pet2 = pet2;
    }

    //setter and getter
    public E getPet1() {
        return pet1;
    }

    public void setPet1(E pet1) {
        this.pet1 = pet1;
    }

    public E getPet2() {
        return pet2;
    }

    public void setPet2(E pet2) {
        this.pet2 = pet2;
    }


    //ALIMENTAR LAS MASCOTAS ENJAULADAS

    public void alimentarMascotas(){
        this.pet1.eats();
        this.pet2.eats();
    }
    

    


    

    
    
}
