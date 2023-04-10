package com.citihospital.service;

import com.citihospital.domain.AppointmentDomain;
import com.citihospital.model.Appointment;
import com.citihospital.model.AppointmentRequest;
import com.citihospital.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment createAppointment(AppointmentRequest appointmentRequest) {
        AppointmentDomain appointmentDomain = new AppointmentDomain();
        appointmentDomain.setPatientId(appointmentRequest.getPatientId());
        appointmentDomain.setDoctorId(appointmentRequest.getDoctorId());
        appointmentDomain.setDate(appointmentRequest.getDate());
        appointmentDomain.setTime(appointmentRequest.getTime());
        return appointmentRepository.createAppointment(appointmentDomain).toModel();

    }

    public Appointment findAppointmentById(String id) {
        return appointmentRepository.findAppointmentById(id).toModel();
    }
}
