package com.teksystems.sdc;

public class ClubMember {

    private String name;
    private String city;
    private String state;
    private String language;

    public ClubMember(String firstName, String city, String state, String language) {
        this.name = firstName;
        this.city = city;
        this.state = state;
        this.language = language;

    }

    @Override
    public String toString() {
        return
                String.format("\nMember Name: %s\nLocation: %s, %s\nFavorite Language: %s\n\n", name, city, state, language);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
