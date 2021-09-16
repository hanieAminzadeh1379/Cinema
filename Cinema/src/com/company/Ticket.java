package com.company;

public class Ticket {
    private String customerName;
    private int ticketNO;
    private int dateAndHour;
    private String genreFilm;
    private int seatNumber;


    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }

    public void setTicketNO(int ticketNO)
    {
        this.ticketNO=ticketNO;
    }

    public void setDateAndHour(int dateAndHour)
    {
        this.dateAndHour=dateAndHour;
    }

    public void setGenreFilm(String genreFilm)
    {
        this.genreFilm=genreFilm;
    }

    public void setSeatNumber(int seatNumber)
    {
        this.seatNumber=seatNumber;
    }

}
