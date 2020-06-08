package com.ken.yatota;

import com.google.gson.annotations.SerializedName;

public class InputmodelClass {
    @SerializedName("totalneckroll")
    private String TotalNeckroll;

    @SerializedName("barber1used")
    private String Barber1Used;

    @SerializedName("barber2used")
    private String Barber2Used;

    @SerializedName("barber3used")
    private String Barber3Used;

    @SerializedName("response")
    private String Response;

    public InputmodelClass() {
    }

    public String getTotalNeckroll() {
        return TotalNeckroll;
    }

    public void setTotalNeckroll(String totalNeckroll) {
        TotalNeckroll = totalNeckroll;
    }

    public String getBarber1Used() {
        return Barber1Used;
    }

    public void setBarber1Used(String barber1Used) {
        Barber1Used = barber1Used;
    }

    public String getBarber2Used() {
        return Barber2Used;
    }

    public void setBarber2Used(String barber2Used) {
        Barber2Used = barber2Used;
    }

    public String getBarber3Used() {
        return Barber3Used;
    }

    public void setBarber3Used(String barber3Used) {
        Barber3Used = barber3Used;
    }

    public String getResponse() {
        return Response;
    }
}
