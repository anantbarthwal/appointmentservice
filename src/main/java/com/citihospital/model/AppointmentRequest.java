package com.citihospital.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
public class AppointmentRequest {
    private String patientId;
    private String doctorId;

    private LocalDate date;

    private LocalTime time;
}
