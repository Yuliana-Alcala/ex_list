package dev.ex_list.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandlerWeekDays {
    
    public List<String> days;
    public HandlerWeekDays() {
        
        createList();
       
    }

    
    public List<String> getDays() {
        return days;
    }

    
    public void setDays(List<String> days) {
        this.days = days;
    }
 


    
    private void createList() {
        days = new ArrayList<String>();
     
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");
                
    }
    
 
   
    public int getSizeList(){
        
        return days.size();

    }
   
    public void deleteDay(){
        days.remove(0);
    
    }
    
    
  
    public String getSpecificDayById(int index){
       
        if (index >= 0 && index < days.size()) {
            return days.get(index); 
        } else {
            return "Índice fuera de rango";
        }
        
    }
     

    public String dayExistInList(int index){
        if (index >= 0 && index < days.size()) {
            return "El día existe en la lista"; 
        } else {
            return "El día no existe en la lista";
        }

    }


    public void sortByAlphabeticalOrder(List<String> days) {       
        Collections.sort(days);
        System.out.println("Días ordenados: " + days);
    }

    public boolean emptyList(){
        days.clear();
        return days.isEmpty();


    }
    
}
