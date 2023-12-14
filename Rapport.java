/***********************************************************************
 * Module:  Rapport.java
 * Author:  PC
 * Purpose: Defines the Class Rapport
 ***********************************************************************/

public class Rapport {
   
   private int idRapport;
   private String contenu;
   private java.util.Date dateRapport;
   public Borne borne;
   
   public void afficherRappaort() {
      System.out.println("borne: "+borne.getIdBorne()+"   date: "+this.dateRapport.toString());
      System.out.println(this.contenu);
   }
   
   public Borne getBorne() {
      return borne;
   }
   
   public void setBorne(Borne newBorne) {
      if (this.borne == null || !this.borne.equals(newBorne))
      {
         if (this.borne != null)
         {
            Borne oldBorne = this.borne;
            this.borne = null;
            oldBorne.removeRapport(this);
         }
         if (newBorne != null)
         {
            this.borne = newBorne;
            this.borne.addRapport(this);
         }
      }
   }

   public int getIdRapport() {
      return idRapport;
   }

   public void setIdRapport(int idRapport) {
      this.idRapport = idRapport;
   }

   public String getContenu() {
      return contenu;
   }

   public void setContenu(String contenu) {
      this.contenu = contenu;
   }

   public java.util.Date getDateRapport() {
      return dateRapport;
   }

   public void setDateRapport(java.util.Date dateRapport) {
      this.dateRapport = dateRapport;
   }

}