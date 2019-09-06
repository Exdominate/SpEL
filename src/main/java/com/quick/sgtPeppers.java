/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quick;

/**
 *
 * @author emergency
 */
public class sgtPeppers {
    private String artist;

    public sgtPeppers() {
    }

    public sgtPeppers(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public String SelectArtist(){
        return artist;
    }
    
}
