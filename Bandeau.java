/***********************************************************************
 * Module:  Bandeau.java
 * Author:  PC
 * Purpose: Defines the Class Bandeau
 ***********************************************************************/


public class Bandeau {
   
   private int idBandeau;
   protected String etat;
   public Borne borne;
   
   public void ouvrirVoie() {
      etat="ouvert";
   }

   public void fermerVoie() {
      etat="ferme";
   }

   public int getIdBandeau() {
      return idBandeau;
   }

   public void setIdBandeau(int idBandeau) {
      this.idBandeau = idBandeau;
   }

   public String getEtat() {
      return etat;
   }

   public void setEtat(String etat) {
      this.etat = etat;
   }

   public Borne getBorne() {
      return borne;
   }

   public void setBorne(Borne borne) {
      this.borne = borne;
   }

}