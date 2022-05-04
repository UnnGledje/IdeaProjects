package com.example.springphonebook.Phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookDAO {
    List<Person> phoneBook;
    private Person PhoneBook;

    public PhoneBookDAO() {setPhoneBook();}

    private void setPhoneBook () {
        this.phoneBook = new ArrayList<>();

        Person phone1 = new Person(1, "p1", "p1sson", "07312345678");
        Person phone2 = new Person(2, "p2", "p2sson", "07312345678");
        Person phone3 = new Person(3, "p3", "p3sson", "07312345678");
        Person phone4 = new Person(4, "p4", "p4sson", "07312345678");
        Person phone5 = new Person(5, "p5", "p5sson", "07312345678");

        this.phoneBook.add(phone1);
        this.phoneBook.add(phone2);
        this.phoneBook.add(phone3);
        this.phoneBook.add(phone4);
        this.phoneBook.add(phone5);
    }

    public void addPost(Person pb) {
        this.phoneBook.add(pb);
    }

    public List<Person> getAllEntries() {
        return phoneBook;
    }
    public Person getById(int i) {return phoneBook.get(i);}

    public Person getByFirstName(String firstname) {

        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getFirstname().equals(firstname))
                return phoneBook.get(i);
        }
        return null;
    }

    public Person getByLastName(String lastname) {

        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getLastname().equals(lastname))
                return phoneBook.get(i);
        }
        return null;
    }

    public Person getByPhoneNumber(String phoneNumber) {

        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getLastname().equals(phoneNumber))
                return phoneBook.get(i);
        }
        return null;
    }

}


