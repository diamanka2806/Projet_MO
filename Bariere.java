/***********************************************************************
 * Module:  Bariere.java
 * Author:  PC
 * Purpose: Defines the Class Bariere
 ***********************************************************************/

import java.util.*;

/** @pdOid 8b65af9d-98c0-4479-9fbf-228e6f8a5a16 */
public class Bariere {
   /** @pdOid 8be311a7-0103-4be5-a4d1-b1e37532821c */
   private int idBarriere;
   
   /** @pdOid f05dc98a-3efc-4ee7-93fb-dd7ceae5e65f */
   protected String etatBarriere;
   /** @pdOid f40dfbef-cb8f-43b3-9c79-357bac2f3888 */
   protected String position;
   
   /** @pdRoleInfo migr=no name=Borne assc=association4 mult=1..1 side=A */
   public Borne borne;
   
   /** @pdOid b9be279f-c45e-40a8-a08a-8ff151cd9f3f */
   public void leverBarriere() {
      // TODO: implement
   }
   
   /** @pdOid b4dc4ca7-1acc-40ca-a6ca-aa8481a48684 */
   public void fermerBarriere() {
      // TODO: implement
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
            oldBorne.removeBariere(this);
         }
         if (newBorne != null)
         {
            this.borne = newBorne;
            this.borne.addBariere(this);
         }
      }
   }

}