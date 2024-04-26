package com.lifeofal.calendar.model.response;

import com.lifeofal.calendar.model.common.CalendarItem;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class SingleDayResponse {
    private LocalDate date;
    private List<CalendarItem> calendarItemList;

}
