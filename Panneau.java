/***********************************************************************
 * Module:  Panneau.java
 * Author:  PC
 * Purpose: Defines the Class Panneau
 ***********************************************************************/

public class Panneau {
   
   private int idPanneau;
   protected String prix;
   public Borne borne;
   
   public void afficherMontant() {
      System.out.println("prix a payer: "+this.prix);
   }

   public int getIdPanneau() {
      return idPanneau;
   }

   public void setIdPanneau(int idPanneau) {
      this.idPanneau = idPanneau;
   }

   public String getPrix() {
      return prix;
   }

   public void setPrix(String prix) {
      this.prix = prix;
   }

   public Borne getBorne() {
      return borne;
   }

   public void setBorne(Borne borne) {
      this.borne = borne;
   }

}