package com.example.bigxpbowl.Employee.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeModel
{
    private String name;
    private String username;
    private String password;

    public EmployeeModel(String name, String username, String password)
    {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "Model{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
