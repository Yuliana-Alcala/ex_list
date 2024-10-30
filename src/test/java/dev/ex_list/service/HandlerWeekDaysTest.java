package dev.ex_list.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;
import java.util.List;

public class HandlerWeekDaysTest {

    @Test
    void testCreateList() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();//1

        //handlerWeekDays.createList();como createList no retorna nada no tengo forma de evaluar el valor que viene.En este caso necesitamos un constructor en el que se llamará al método createList.
        
        assertThat(handlerWeekDays.days.size(), is(7));
        
    }

    @Test
    void testGetDays() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();
        // Usa el getter para obtener la lista de días como la lista esperada

        List<String> expectedList = handlerWeekDays.getDays();
        assertThat(handlerWeekDays.getDays(), is(expectedList));
    }

    @Test
    void testGetSizeList() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();
       
        
        assertThat(handlerWeekDays.getSizeList(), is(7));
        
    }
    @Test
        void testDeleteDay() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();
        handlerWeekDays.deleteDay();

        assertThat(handlerWeekDays.days.size(), is(6)); 
    }

	@Test
	void testGetSpecificDayById() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();
        String expectedDay = "Lunes";

        assertThat(handlerWeekDays.getSpecificDayById(0), is(expectedDay));
    }

    @Test
    void testDayExistInList() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();
        String expectedMessage = "El día no existe en la lista";

        assertThat(handlerWeekDays.dayExistInList(7), is(expectedMessage));
        
    }
		
}

  


