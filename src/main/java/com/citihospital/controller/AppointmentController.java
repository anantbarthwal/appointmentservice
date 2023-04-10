package com.citihospital.controller;

import com.citihospital.model.Appointment;
import com.citihospital.model.AppointmentRequest;
import com.citihospital.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;
    @PostMapping("/create")
    public Appointment createAppointment(@RequestBody AppointmentRequest appointmentRequest) {
        return appointmentService.createAppointment(appointmentRequest);
    }

}
