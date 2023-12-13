/***********************************************************************
 * Module:  Alarme.java
 * Author:  PC
 * Purpose: Defines the Class Alarme
 ***********************************************************************/

import java.util.*;

public class Alarme {
  
   private int idAlarme;
   private java.util.Date dateAlarme;
   public TypeAlarme typeAlarme;
   public Borne borne;
   
   /** @pdOid c2ed9f0d-9a6b-43ba-ba1d-3fca11b469d1 */
   public String toString() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default parent getter */
   public Borne getBorne() {
      return borne;
   }
   
   /** @pdGenerated default parent setter
     * @param newBorne */
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

}