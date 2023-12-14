/***********************************************************************
 * Module:  FeuSignalisation.java
 * Author:  PC
 * Purpose: Defines the Class FeuSignalisation
 ***********************************************************************/



public class FeuSignalisation {
  
   private int idFeuSignalisation;
   protected String etat;
   public Borne borne;
   
   public void changerFeu() {
      setEtat((etat.equals("rouge"))?"vert":"rouge");
   }

   public int getIdFeuSignalisation() {
      return idFeuSignalisation;
   }

   public void setIdFeuSignalisation(int idFeuSignalisation) {
      this.idFeuSignalisation = idFeuSignalisation;
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