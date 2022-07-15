package com.m2i.jsf.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@ManagedBean(name = "hotelBean")
@SessionScoped
public class HotelBean {

    private Hotel hotel;
    private List<Hotel> hotels = new ArrayList<>(Arrays.asList(
    
           new Hotel(0, "Hotel 1", 31.37552, -7.59438, "Marrakech", 5)
    
    ));

    private MapModel simpleModel = new DefaultMapModel();
    private Marker marker;

    public HotelBean() {
        hotel = new Hotel();
        init();
    }

    public void init() {
        for (Hotel h : hotels) {
            createMarkerForHotel(h);
        }
    }
    
    public void createMarkerForHotel(Hotel h) {
        LatLng coords = new LatLng(h.getLatitude(), h.getLongitude());
            simpleModel.addOverlay(new Marker(coords, h.getNom()));
    }
    
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public MapModel getSimpleModel() {
        return simpleModel;
    }

    public void setSimpleModel(MapModel simpleModel) {
        this.simpleModel = simpleModel;
    }

    public String onCreate() {
        hotel.setId(hotels.size());
        hotels.add(hotel);
        
        createMarkerForHotel(hotel);
        
        hotel = new Hotel();
        return null;
    }

    public void onMarkerSelect(OverlaySelectEvent event) {
        marker = (Marker) event.getOverlay();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Hôtel : ", marker.getTitle()));
    }
}
