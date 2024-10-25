package dev.ex_list.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class HandlerWeekDaysTest {

    @Test
    void testCreateList() {
        HandlerWeekDays handlerWeekDays = new HandlerWeekDays();//1
        
        assertThat(handlerWeekDays.days.size(), is(7));
        
    }

}
