/***********************************************************************
 * Module:  Bariere.java
 * Author:  PC
 * Purpose: Defines the Class Bariere
 ***********************************************************************/

public class Bariere {
   
   private int idBarriere;
   protected String etatBarriere;
   protected String position;
   public Borne borne;
   
   public void leverBarriere() {
      setPosition("lever");
   }
  
   public void fermerBarriere() {
      setPosition("baiser");
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
            oldBorne.removeBariere(this);
         }
         if (newBorne != null)
         {
            this.borne = newBorne;
            this.borne.addBariere(this);
         }
      }
   }

   public int getIdBarriere() {
      return idBarriere;
   }

   public void setIdBarriere(int idBarriere) {
      this.idBarriere = idBarriere;
   }

   public String getEtatBarriere() {
      return etatBarriere;
   }

   public void setEtatBarriere(String etatBarriere) {
      this.etatBarriere = etatBarriere;
   }

   public String getPosition() {
      return position;
   }

   public void setPosition(String position) {
      this.position = position;
   }

}