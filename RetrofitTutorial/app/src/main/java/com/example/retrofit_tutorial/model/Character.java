package com.example.retrofit_tutorial.model;

import com.google.gson.annotations.SerializedName;

// passo 1
public class Character {

    @SerializedName("name")
    private String name;

    @SerializedName("real_name")
    private String real_name;

    @SerializedName("aliases")
    private String aliases;

    @SerializedName("birthday")
    private String birthday;

    @SerializedName("date_added")
    private String date_added;

    @SerializedName("deck")
    private String deck;

    @SerializedName("description")
    private  String description;

    @SerializedName("id")
    private int id;

    @SerializedName("first_appeared_in_game")
    private FirstAppeard first_apeard;

    @SerializedName("image")
    private CharacterImage image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FirstAppeard getFirst_apeard() {
        return first_apeard;
    }

    public void setFirst_apeard(FirstAppeard first_apeard) {
        this.first_apeard = first_apeard;
    }

    public CharacterImage getImage() {
        return image;
    }

    public void setImage(CharacterImage image) {
        this.image = image;
    }
}
