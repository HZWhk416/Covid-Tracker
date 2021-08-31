package io.javabrains.covidtracker.models;

public class LocationsStats {

    private String state;
    private String country;
    private int latestTotalCases;
    private int differFromPrevDay;

    public int getDifferFromPrevDay() {
        return differFromPrevDay;
    }

    public void setDifferFromPrevDay(int differFromPrevDay) {
        this.differFromPrevDay = differFromPrevDay;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationsStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases='" + latestTotalCases + '\'' +
                '}';
    }

}
