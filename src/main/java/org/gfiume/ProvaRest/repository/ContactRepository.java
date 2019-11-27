package org.gfiume.ProvaRest.repository;

import org.gfiume.ProvaRest.bean.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
}
