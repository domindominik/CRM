package com.main.model;

import javax.persistence.*;

@Entity
public class CompanyModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private String nip;

    @Column
    private String regon;

    @Column
    private String krs;

    @Column
    private String region;

    @Column
    private String city;

    @Column
    private String street;

    @Column
    private String number;

    @Column
    private String postcode;

    @Column
    private String contactPersonName;

    @Column
    private String contactPersonSurname;

    @Column
    private String phoneNumber;

    @Column
    private String contactPersonName2;

    @Column
    private String contactPersonSurname2;

    @Column
    private String phoneNumber2;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getKrs() {
        return krs;
    }

    public void setKrs(String krs) {
        this.krs = krs;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonSurname() {
        return contactPersonSurname;
    }

    public void setContactPersonSurname(String contactPersonSurname) {
        this.contactPersonSurname = contactPersonSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactPersonName2() {
        return contactPersonName2;
    }

    public void setContactPersonName2(String contactPersonName2) {
        this.contactPersonName2 = contactPersonName2;
    }

    public String getContactPersonSurname2() {
        return contactPersonSurname2;
    }

    public void setContactPersonSurname2(String contactPersonSurname2) {
        this.contactPersonSurname2 = contactPersonSurname2;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }
}
