package com.project2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "no_guests", nullable = false)
    private Integer no_guests;

    @Column(name = "no_bathrooms", nullable = false)
    private Integer no_bathrooms;

    @Column(name = "no_bedrooms", nullable = false)
    private Integer no_bedrooms;

    @Column(name = "price", nullable = false)
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNo_bedrooms() {
        return no_bedrooms;
    }

    public void setNo_bedrooms(Integer no_bedrooms) {
        this.no_bedrooms = no_bedrooms;
    }

    public Integer getNo_bathrooms() {
        return no_bathrooms;
    }

    public void setNo_bathrooms(Integer no_bathrooms) {
        this.no_bathrooms = no_bathrooms;
    }

    public Integer getNo_guests() {
        return no_guests;
    }

    public void setNo_guests(Integer no_guests) {
        this.no_guests = no_guests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}