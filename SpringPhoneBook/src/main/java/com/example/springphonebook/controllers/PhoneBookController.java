package com.example.springphonebook.controllers;

import com.example.springphonebook.Phonebook.Person;
import com.example.springphonebook.Phonebook.PhoneBookDAO;
import com.example.springphonebook.Phonebook.Response;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhoneBookController {

        PhoneBookDAO phoneDAO = new PhoneBookDAO();

        List<Person> phoneBook = phoneDAO.getAllEntries();



        @RequestMapping("/phonebook/show_all")
        public List <Person> parseByGetAllEntries() {
        return phoneDAO.getAllEntries();
        }


            //http://localhost:8080/phonebook/search_id/2
        @RequestMapping("/phonebook/search_id/{id}")
        public Person parseById(@PathVariable int id) {
            System.out.println("In parse buý ID");
            return phoneDAO.getById(id);
        }

        @RequestMapping("/phonebook/search_firstname/{firstname}")
        public Person parseByFirstName(@PathVariable String firstname) {

            return phoneDAO.getByFirstName(firstname);
        }

        @RequestMapping("/phonebook/search_lastname/{lastname}")
        public Person parseByLastName(@PathVariable String lastname) {

            return phoneDAO.getByLastName(lastname);
        }
        //localhost:8080/phonebook/add
        @PostMapping("/phonebook/add")
        public Response addPhoneBookEntry(@RequestBody Person pb){
            System.out.println(pb.getId() + " " +pb.getFirstname() + " " + pb.getLastname() + pb.getPhoneNumber());
            Response response = new Response("PhoneBook entry added", Boolean.FALSE);
            phoneBook.add(pb);
            response.setBool(Boolean.TRUE);

            return response;
        }

    }
