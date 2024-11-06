package dev.ex_list.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;


import java.util.List;

public class HandlerWeekDaysTest {

    @Test
    void testCreateList() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();
       
        assertThat(handlerWeekDays.days.size(), is(7));
        
    }

    @Test
    void testGetDays() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();
     
        List<String> expectedList = handlerWeekDays.getDays();
        assertThat(handlerWeekDays.getDays(), is(expectedList));
    }

    @Test
    void testGetSizeList() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();
       
        assertThat(handlerWeekDays.getSizeList(),is(7));
        
    }
    @Test
        void testDeleteDay() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();
        String result = handlerWeekDays.deleteDay("Lunes");

        assertThat(result, is("Día eliminado correctamente")); 
    }

	@Test
	void testGetSpecificDayById() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();

        String result = handlerWeekDays.getSpecificDayById("Lunes");
        assertThat(result, is("Lunes"));     
       
    }

    @Test
    void testDayExistInList() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();

        String result = handlerWeekDays.dayExistInList("Lunes");
        assertThat(result, is("El día si existe en la lista"));     
    }

    @Test
    void testSortByAlphabeticalOrder() {
        
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();

        
        List<String> expectedList = List.of("Domingo", "Jueves", "Lunes", "Martes", "Miercoles", "Sabado", "Viernes");       
       
        assertThat(handlerWeekDays.sortByAlphabeticalOrder(), is(expectedList));       
        
    }
 
	@Test
	void testEmptylist() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();
        
        assertThat(handlerWeekDays.emptyList(), is(true));		
	}
	
}

  


