/***********************************************************************
 * Module:  Alarme.java
 * Author:  PC
 * Purpose: Defines the Class Alarme
 ***********************************************************************/


public class Alarme {
  
   private int idAlarme;
   private java.util.Date dateAlarme;
   public TypeAlarme typeAlarme;
   public Borne borne;
   
   public String toString() {
      return null;
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
            oldBorne.removeAlarme(this);
         }
         if (newBorne != null)
         {
            this.borne = newBorne;
            this.borne.addAlarme(this);
         }
      }
   }

   public int getIdAlarme() {
      return idAlarme;
   }

   public void setIdAlarme(int idAlarme) {
      this.idAlarme = idAlarme;
   }

   public java.util.Date getDateAlarme() {
      return dateAlarme;
   }

   public void setDateAlarme(java.util.Date dateAlarme) {
      this.dateAlarme = dateAlarme;
   }

   public TypeAlarme getTypeAlarme() {
      return typeAlarme;
   }

   public void setTypeAlarme(TypeAlarme typeAlarme) {
      this.typeAlarme = typeAlarme;
   }

}