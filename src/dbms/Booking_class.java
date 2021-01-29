
package dbms;

public class Booking_class {
    
    private int Booking_No;
    private String Date;
    private String Time;
    private String Reservation_Name;
    private String Phone;
    private String Route;
    private String Coach_Time;
    private String Seat_No;
    private String Quantity;
    private String Total;
    private String Bill_By;
    
    public Booking_class(int Booking_No, String Date, String Time, String Reservation_Name, String Phone, String Route, String Coach_Time, String Seat_No, String Quantity, String Total, String Bill_By){
        
        this.Booking_No = Booking_No;
        this.Date = Date;
        this.Time = Time;
        this.Reservation_Name = Reservation_Name;
        this.Phone = Phone;
        this.Route = Route;
        this.Coach_Time = Coach_Time;
        this.Seat_No = Seat_No;
        this.Quantity = Quantity;
        this.Total = Total;
        this.Bill_By = Bill_By;

    }
	
    
    public int getBooking_No()
    {
        return Booking_No;
    }
    public String getDate()
    {
        return Date;
    }
    public String getTime()
    {
        return Time;
    }
    public String getReservation_Name()
    {
        return Reservation_Name;
    }
    public String getPhone()
    {
        return Phone;
    }
    public String getRoute()
    {
        return Route;
    }
    public String getCoach_Time()
    {
        return Coach_Time;
    }
    public String getSeat_No()
    {
        return Seat_No;
    }
    public String getQuantity()
    {
        return Quantity;
    }
    public String getTotal()
    {
        return Total;
    }
    public String getBill_By()
    {
        return Bill_By;
    }

}