package za.co.insuranceapp.Models;

public class Appointment {
    String client;
    String location;
    String date;
    String time;
    String type;

    public Appointment(String client, String location, String date, String time) {
        this.client = client;
        this.location = location;
        this.date = date;
        this.time = time;
        this.type = type;
    }



    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
