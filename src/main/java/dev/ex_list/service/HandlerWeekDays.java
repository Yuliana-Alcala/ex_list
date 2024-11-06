package dev.ex_list.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HandlerWeekDays {
    
    public List<String> days;
    public HandlerWeekDays() {
        
       createList();
       
    }

    //retorne los días de la semana
    public List<String> getDays() {
        return days;
    }

    
    public void setDays(List<String> days) {
        this.days = days;
    }
 

    //crear la lista de los días de la semana
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
    
 
   //retorne el largo de la lista
    public int getSizeList(){
        
        return days.size();

    }
   
    //eliminar un día de la semana
    public String deleteDay(String dayDelete){
        for(Integer index=0; index < days.size(); index ++) {
            if (days.get(index).equals(dayDelete)){             
                days.remove(dayDelete);
                return "Día eliminado correctamente";
            }
                          
        }
        System.out.println(days.size());
        return "Día no encontrado";  
        
    
    }
    
    
   //retorne el día de la semana solicitado
    public String getSpecificDayById(String daySolicited){
                   
        for(Integer index=0; index < days.size(); index ++) {
          if (days.get(index).equals(daySolicited)){
            
            return days.get(index);
            
          }
                        
        }
       return "Día no encontrado";   
        
    }
     
    //retorne si el día solicitado existe en la lista
    public String dayExistInList(String daySolicited){
                   
        for(Integer index=0; index < days.size(); index ++) {
          if (days.get(index).equals(daySolicited)){
            
            return "El día si existe en la lista";
            
          }
                        
        }
        return "Día no xiste en la lista";

    }

    //ordenar la lista de días por orden alfabético
    public List<String> sortByAlphabeticalOrder() {
        Collections.sort(days);
        System.out.println("Días ordenados: " + days);
        return days;
    }

     //método para vaciar la lista
    public boolean emptyList(){
        days.clear();
        return days.isEmpty();
    }
    
}
