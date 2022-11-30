package com.example.bigxpbowl.Activity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Model
{
    private String activityDescription;
    private int activityPrice;

    public Model(String activityDescription, int activityPrice)
    {
        this.activityDescription = activityDescription;
        this.activityPrice = activityPrice;
    }

    @Override
    public String toString()
    {
        return "Model{" +
                "activityDescription='" + activityDescription + '\'' +
                ", activityPrice=" + activityPrice +
                '}';
    }
}
