/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarylaus.models.Structure;

/**
 *
 * @author gaelmmg
 */
public class Chant {
    
    private int id;
    private String nom;
    private String auteur;
    private String type;
    
    
    public Chant(){}
    
//    Getters
    
    public int getId(){
        return this.id;
    }

    public String getType() {
        return type;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getNom() {
        return nom;
    }
    
//    Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
