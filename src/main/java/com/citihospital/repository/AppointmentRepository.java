package com.citihospital.repository;

import com.citihospital.domain.AppointmentDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class AppointmentRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public AppointmentDomain createAppointment(AppointmentDomain appointmentDomain) {
        return mongoTemplate.save(appointmentDomain);
    }

    public AppointmentDomain findAppointmentById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query, AppointmentDomain.class);
    }
}
