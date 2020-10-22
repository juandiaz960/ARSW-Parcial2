package edu.eci.arsw.exam.model;

import java.util.List;

public class CityData {
    
    private Coordinates coordinates;
    private List<Weather> weatherList;
    private String name;
    private long visibility;
    private long dt;
    private long id;    
    private long timeZone;


    public CityData(){
        
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getVisibility() {
        return visibility;
    }

    public void setVisibility(long visibility) {
        this.visibility = visibility;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(long timeZone) {
        this.timeZone = timeZone;
    }
    
    

    
}
