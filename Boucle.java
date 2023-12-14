/***********************************************************************
 * Module:  Boucle.java
 * Author:  PC
 * Purpose: Defines the Class Boucle
 ***********************************************************************/


public class Boucle {
  
   private int idBoucle;
   
   protected int status;
   protected String numeroDetecte;
   protected String position;
   public Borne borne;
   
   public void detecterVoiture() {
      setStatus(1);
   }
   
   public void changerStatus() {
      setStatus((status==1)?0:1);
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
            oldBorne.removeBoucle(this);
         }
         if (newBorne != null)
         {
            this.borne = newBorne;
            this.borne.addBoucle(this);
         }
      }
   }

   public int getIdBoucle() {
      return idBoucle;
   }

   public void setIdBoucle(int idBoucle) {
      this.idBoucle = idBoucle;
   }

   public int getStatus() {
      return status;
   }

   public void setStatus(int status) {
      this.status = status;
   }

   public String getNumeroDetecte() {
      return numeroDetecte;
   }

   public void setNumeroDetecte(String numeroDetecte) {
      this.numeroDetecte = numeroDetecte;
   }

   public String getPosition() {
      return position;
   }

   public void setPosition(String position) {
      this.position = position;
   }

}