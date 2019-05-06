
package com.example.busproject.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrentBus {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("bus")
    @Expose
    private List<Bus> bus = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Bus> getBus() {
        return bus;
    }

    public void setBus(List<Bus> bus) {
        this.bus = bus;
    }

}
