/***********************************************************************
 * Module:  Personne.java
 * Author:  PC
 * Purpose: Defines the Class Personne
 ***********************************************************************/

public class Personne {
  
   private int idPersonne;
   private String password;
   protected String nom;
   protected String prenom;
   protected String login;
   public Role role;

   public int getIdPersonne() {
      return idPersonne;
   }
   public void setIdPersonne(int idPersonne) {
      this.idPersonne = idPersonne;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
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
   public String getLogin() {
      return login;
   }
   public void setLogin(String login) {
      this.login = login;
   }
   public Role getRole() {
      return role;
   }
   public void setRole(Role role) {
      this.role = role;
   }
   
   public void afficher(){
      System.out.println(nom.toUpperCase() +"  "+prenom);
   }

}