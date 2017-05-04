/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd;
import java.io.*;
import javax.xml.bind.annotation.*;

/**
 *
 * @author 12545404
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class User implements Serializable{
    @XmlElement(name = "email")
    private String email;
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "password")
    private String password;
    @XmlElement(name = "gender")
    private String gender;
    @XmlElement(name = "favouriteColour")
    private String favouriteColour;
    
    public User(String email, String name, String password, String gender, String favouriteColour) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.favouriteColour = favouriteColour;
    }
 
    
    public User () 
    {
        super();
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getFavouriteColour() {
        return favouriteColour;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFavouriteColour(String favouriteColour) {
        this.favouriteColour = favouriteColour;
    }
   
    
    
    
    
    
}
