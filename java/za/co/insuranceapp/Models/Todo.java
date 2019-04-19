package ke.co.insuranceapp.Models;

public class Todo {
    String title;
    String detail;
    String date;


    public Todo() {
    }

    public Todo(String title, String detail, String date) {
        this.title = title;
        this.detail = detail;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
