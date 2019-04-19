package ke.co.insuranceapp.Models;


import java.util.List;
import java.util.Map;

public class Data  {

    public String data;
    public List<Policy>policies;


    public Data(String data, List<Policy> policies) {
        this.data = data;
        this.policies = policies;
    }



    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }
}
