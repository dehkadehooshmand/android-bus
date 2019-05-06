
package com.example.busproject.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bus {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lng")
    @Expose
    private Double lng;
    @SerializedName("notification_token")
    @Expose
    private String notificationToken;
    @SerializedName("capacity")
    @Expose
    private String capacity;
    @SerializedName("station_id")
    @Expose
    private String stationId;
    @SerializedName("station_name")
    @Expose
    private String stationName;
    @SerializedName("station_price")
    @Expose
    private Integer stationPrice;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("pelak")
    @Expose
    private String pelak;
    @SerializedName("last_name")
    @Expose
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getNotificationToken() {
        return notificationToken;
    }

    public void setNotificationToken(String notificationToken) {
        this.notificationToken = notificationToken;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getStationPrice() {
        return stationPrice;
    }

    public void setStationPrice(Integer stationPrice) {
        this.stationPrice = stationPrice;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPelak() {
        return pelak;
    }

    public void setPelak(String pelak) {
        this.pelak = pelak;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
