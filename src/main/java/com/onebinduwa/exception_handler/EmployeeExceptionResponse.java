package com.onebinduwa.exception_handler;

import java.util.Date;

public class EmployeeExceptionResponse {
    private String errorMessagae,description;
    private Date dateTime;

    public EmployeeExceptionResponse(String errorMessagae, String description, Date dateTime) {
        this.errorMessagae = errorMessagae;
        this.description = description;
        this.dateTime = dateTime;
    }

    public String getErrorMessagae() {
        return errorMessagae;
    }

    public void setErrorMessagae(String errorMessagae) {
        this.errorMessagae = errorMessagae;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
