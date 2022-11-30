package com.example.bigbowlxp.Customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Model
{
   private String name;
   private String email;
   private int phoneNumber;

    public Model(String name, String email, int phoneNumber)
    {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString()
    {
        return "Model{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
