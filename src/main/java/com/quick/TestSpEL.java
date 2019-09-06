/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quick;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author emergency
 */
public class TestSpEL {
    private int home;
    private String street;
    private float pi;
    private boolean ifalse;
    private double dblval;
    private double mathuse;
    private sgtPeppers sgt;
    private String artist;
    private String select;
    private List<Object> people;
    private String[] names;
    private Collection<Person> peoplesByIdentifier;
    private String[] namesOfPeopleByIdentifier;//оба среза сделать

    public String[] getNamesOfPeopleByIdentifier() {
        return namesOfPeopleByIdentifier;
    }

    public void setNamesOfPeopleByIdentifier(String[] namesOfPeopleByIdentifier) {
        this.namesOfPeopleByIdentifier = namesOfPeopleByIdentifier;
    }

    public String[] getNames() {
        return names;
    }
    
    public void setNames(String[] names) {
        this.names = names;
    }
    
    public TestSpEL() {
    }

    public TestSpEL(int home, String street, float pi, boolean ifalse, double dblval, double mathuse, sgtPeppers sgt, String artist, String select, List<Object> people, String[] names, Collection<Person> arrid) {
        this.home = home;
        this.street = street;
        this.pi = pi;
        this.ifalse = ifalse;
        this.dblval = dblval;
        this.mathuse = mathuse;
        this.sgt = sgt;
        this.artist = artist;
        this.select = select;
        this.people = people;
        this.names = names;
        this.peoplesByIdentifier = arrid;
    }

    public Collection<Person> getPeoplesByIdentifier() {
        return peoplesByIdentifier;
    }

    public void setPeoplesByIdentifier(Collection<Person> peoplesByIdentifier) {
        this.peoplesByIdentifier = peoplesByIdentifier;
    }

   

    
    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public boolean isIfalse() {
        return ifalse;
    }

    public void setIfalse(boolean ifalse) {
        this.ifalse = ifalse;
    }

    public double getDblval() {
        return dblval;
    }

    public void setDblval(double dblval) {
        this.dblval = dblval;
    }

    public double getMathuse() {
        return mathuse;
    }

    public void setMathuse(double mathuse) {
        this.mathuse = mathuse;
    }

    public sgtPeppers getSgt() {
        return sgt;
    }

    public void setSgt(sgtPeppers sgt) {
        this.sgt = sgt;
    }

    public List<Object> getPeople() {
        return people;
    }

    public void setPeople(List<Object> people) {
        this.people = people;
    }

    public String getArtist() {
        return artist;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "TestSpEL\n{" + "home=" + home + ", street=" + street + 
                ", pi=" + pi + ", ifalse=" + ifalse + 
                ", dblval=" + dblval + ", mathuse=" + mathuse +
                ",\n sgt=" + sgt + " artist=" + artist +
                ", select=" + select + "\n people=" + people + 
                ",\n names=" + Arrays.toString(names) + '}';
    }

  

   

  
   
}
