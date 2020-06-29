package com.ken.yatota.Models;


public class DownloadModel {

        private String id;
        private String date;
        private String totalneckroll;
        private String barber1used;
        private String barber2used;
        private String barber3used;

        public DownloadModel (String id, String date, String totalneckroll, String barber1used, String barber2used, String barber3used) {
            this.id = id;
            this.date = date;
            this.totalneckroll = totalneckroll;
            this.barber1used = barber1used;
            this.barber2used = barber2used;
            this.barber3used = barber3used;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotalneckroll() {
        return totalneckroll;
    }

    public void setTotalneckroll(String totalneckroll) {
        this.totalneckroll = totalneckroll;
    }

    public String getBarber1used() {
        return barber1used;
    }

    public void setBarber1used(String barber1used) {
        this.barber1used = barber1used;
    }

    public String getBarber2used() {
        return barber2used;
    }

    public void setBarber2used(String barber2used) {
        this.barber2used = barber2used;
    }

    public String getBarber3used() {
        return barber3used;
    }

    public void setBarber3used(String barber3used) {
        this.barber3used = barber3used;
    }
}

