package com.citihospital.domain;

import com.citihospital.model.Appointment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Document("appointment")
@Getter
@Setter
@NoArgsConstructor
public class AppointmentDomain {
    @Id
    private String id;
    public static final String ID = "id";
    private String patientId;
    public static final String PATIENT_ID = "patientId";
    private String doctorId;
    public static final String DOCTOR_ID = "doctorId";
    private LocalDate date;
    private LocalTime time;

    public AppointmentDomain(String patientId, String doctorId, LocalDate date, LocalTime time){
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.date = date;
        this.time = time;
    }

    public Appointment toModel() {
        Appointment appointment = new Appointment();
        appointment.setId(id);
        appointment.setDate(date);
        appointment.setDoctorId(doctorId);
        appointment.setTime(time);
        appointment.setPatientId(patientId);

        return appointment;
    }
}
