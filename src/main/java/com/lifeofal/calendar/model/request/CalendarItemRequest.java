package com.lifeofal.calendar.model.request;

import lombok.Data;

@Data
public class CalendarItemRequest {
    //TODO: create enum validator for optimization
    //TODO: create validation for all fields
    private String date;
    private String title;
    private float amount;
    private String entryType;
    private String colorHex;
}
