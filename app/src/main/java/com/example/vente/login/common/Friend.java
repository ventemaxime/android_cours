package com.example.vente.login.common;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static com.example.vente.login.activities.OtherActivity.friends;

/**
 * Created by vente on 28/01/2019.
 */

public class Friend implements Serializable {

    private int id;
    @SerializedName("token")
    private String token;
    @SerializedName("last_name")
    private String nom;
    @SerializedName("first_name")
    private String prenom;
    @SerializedName("profile_url")
    private String image;
    private int score;

    public Friend(int id, String token, String prenom, String nom, int score, String image){
        this.id = id;
        this.token = token;
        this.prenom = prenom;
        this.nom = nom;
        this.score = score;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static Friend getFrienFromJson(String json){
        return new Gson().fromJson(json, Friend.class);
    }

    public static ArrayList<Friend> getListOfFriendsFromJson(String json){
        Type type = new TypeToken<List<Friend>>(){}.getType();
        return new Gson().fromJson(json, type);
    }


    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", token='" + token + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", score=" + score +
                '}';
    }
}
