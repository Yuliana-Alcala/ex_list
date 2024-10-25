package dev.ex_list.service;


import java.util.ArrayList;
import java.util.List;

public class HandlerWeekDays {
    //atributo de clase//
    //5
    public List<String> days;//debe ser público para poder acceder desde afuera

    //hacemos un connsructor, que es el primer método que se crea al momento de crear el objeto es decir cuando hago new xxx se crea el constructor//
    //2
    public HandlerWeekDays() {
        //3
        createList();

       
    }
       //Geter
    public List<String> getDays() {
        return days;
    }

    //seter y getter modificar y recuperar atributos de clase
    public void setDays(List<String> days) {
        this.days = days;
    }
 

    //Scope de un método(lo que esta dentro de un metodo), Scope de una clase(lo que esta dentro de de una clase)
    public void createList() {//4
        days = new ArrayList<String>();//asignando un valor a days, tambien se puede colocar this.days se utiliza cuando se refiiere a los atributos y métodos de la clase entera, puede haber un conflicto cuando el método recibe un parametro
     
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");
                
    }
    //para poder acceder a un elemento desde cualquier parte de mi clase debo covertilo en un atributo de clase  

    public void render(){
        System.out.println(days);
    }
 


    
}
