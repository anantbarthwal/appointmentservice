package com.citihospital.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Appointment {
    private String id;
    private String patientId;
    private String doctorId;
    private LocalDate date;
    private LocalTime time;
}
