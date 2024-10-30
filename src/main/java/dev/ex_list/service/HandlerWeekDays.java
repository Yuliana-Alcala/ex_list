package dev.ex_list.service;

import java.util.ArrayList;
import java.util.List;

public class HandlerWeekDays {
    //se crea este atributo de clase, se hizo para poder sacar los elemntos de la lista ya que es una funcion que no retorna nada.//
    //5
    public List<String> days;//debe ser público para poder acceder desde afuera

    //hacemos un consructor, que es el primer método que se crea al momento de crear el objeto es decir cuando hago new xxx se crea el constructor//
    //2
    public HandlerWeekDays() {
        //3
        createList();
       
    }
    //Geter Un método que retorne los días de la semana
    public List<String> getDays() {
        return days;
    }

    //Seter y getter modificar y recuperar atributos de clase
    public void setDays(List<String> days) {
        this.days = days;
    }
 

    //Un método que cree una lista con los días de la semana
    //Scope de un método(lo que esta dentro de un metodo), Scope de una clase(lo que esta dentro de una clase)
    private void createList() {//4
        days = new ArrayList<String>();//asignando un valor a days, tambien se puede colocar this.days se utiliza cuando se refiere a los atributos y métodos de la clase entera, puede haber un conflicto cuando el método recibe un parametro.

        //days = new ArrayList();// para que esta variable pueda salir de esta clase se debe convertir en un atributo de clase y luego se crea days de ese tipo.
     
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");
                
    }
    
 
    //Un método que retorne el largo de la lista
    public int getSizeList(){
        
        return days.size();

    }
   //Un método para eliminar un día de la semana
    public void deleteDay(){
        days.remove(0);
    
    }
    
  
    
   
    
}
