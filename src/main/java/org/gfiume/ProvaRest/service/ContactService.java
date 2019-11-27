package org.gfiume.ProvaRest.service;

import com.google.common.collect.ImmutableList;
import org.gfiume.ProvaRest.bean.Contact;
import org.gfiume.ProvaRest.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;


import java.util.List;
import java.util.Optional;

import static java.lang.String.format;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;



    public List<Contact> getList(){
        return contactRepository.findAll();
    }

    public Optional<Contact> getById(String id){
        return contactRepository.findById(id);
    }

    public Contact create(Contact contact){
        return contactRepository.insert(contact);
    }

    public Contact update(String id, Contact contact){
        System.out.println("Aggiornamento Contatto: " + contact.toString());
        contact.setId(id);
        return contactRepository.save(contact);
    }

    public void delete(String id){
        contactRepository.deleteById(id);
    }
}
