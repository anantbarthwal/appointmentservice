package com.citihospital.service;

import com.citihospital.domain.AppointmentDomain;
import com.citihospital.model.Appointment;
import com.citihospital.model.AppointmentRequest;
import com.citihospital.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static com.citihospital.domain.AppointmentDomain.*;

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
        List<AppointmentDomain> appointmentDomain = appointmentRepository.findAppointmentById(ID, id);
        return  appointmentDomain.get(0).toModel();
    }

    public List<Appointment> findPatientAppointmentById(String id) {
        List<AppointmentDomain> appointmentDomainList = appointmentRepository.findAppointmentById(PATIENT_ID, id);
        return appointmentDomainList.stream().map(domain-> domain.toModel()).collect(Collectors.toList());
    }

    public List<Appointment> findDoctorAppointmentById(String id) {
        List<AppointmentDomain> appointmentDomainList =  appointmentRepository.findAppointmentById(DOCTOR_ID, id);
        return appointmentDomainList.stream().map(domain-> domain.toModel()).collect(Collectors.toList());
    }
}
