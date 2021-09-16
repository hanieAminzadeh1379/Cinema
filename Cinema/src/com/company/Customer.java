package com.company;

public class Customer {
    private String customerName;
    private String gender;
    private String age;

    public String setCustomerName()
    {
        return customerName;
    }

    public String setGender()
    {
        return gender;
    }

    public String setAge()
    {
        return age;
    }

    public void buyTicket()
    {
        System.out.print("Pay the amount :");
    }

    public void choiceFilm()
    {
        System.out.print("Choose your movie genre :");
    }

}
