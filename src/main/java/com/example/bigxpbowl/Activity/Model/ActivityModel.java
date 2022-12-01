package com.example.bigxpbowl.Activity.Model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActivityModel
{
    private String activityDescription;
    private int activityPrice;

    public ActivityModel(String activityDescription, int activityPrice)
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
