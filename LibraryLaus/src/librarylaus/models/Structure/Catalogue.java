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
public class Catalogue {
    
    private int id;
    private int idChant;
    private String nom;
    private String description;
    
    public Catalogue(){
        
    }
    
//      Getters
    
    public int getId(){return this.id;}
    public int getIdChant(){return this.idChant;}
    public String getNom(){return this.nom;}
    public String getDescription(){return this.description;}
    
//    Setters
    
    public void setId(int id){this.id = id;}
    public void setIdChant(int idchant){this.idChant = idchant;}
    public void setNom(String nom){this.nom = nom;}
    public void setDescription(String description){this.description = description;}
    
    
}
