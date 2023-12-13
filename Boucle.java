/***********************************************************************
 * Module:  Boucle.java
 * Author:  PC
 * Purpose: Defines the Class Boucle
 ***********************************************************************/

import java.util.*;

/** @pdOid 72471262-71de-4d1c-aab2-531d679b27aa */
public class Boucle {
   /** @pdOid 067fc3a9-cc46-437e-bb64-8f51bf299b02 */
   private int idBoucle;
   
   /** @pdOid a613db27-37ed-4d3d-88e2-3a3cbbfc5ce4 */
   protected int status;
   /** @pdOid 7b3aa6c5-b058-43c9-996c-df04ce4b7b10 */
   protected String numeroDetecte;
   /** @pdOid 5817f6d8-921e-4f77-a85b-de39feda5aa6 */
   protected String position;
   
   /** @pdRoleInfo migr=no name=Borne assc=association3 mult=1..1 side=A */
   public Borne borne;
   
   /** @pdOid d93c52bc-79bc-48f9-a693-5bb1ff4cbecc */
   public void detecterVoiture() {
      // TODO: implement
   }
   
   /** @pdOid a7970d57-b427-40be-b4b4-71c44bc6e980 */
   public void changerStatus() {
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
            oldBorne.removeBoucle(this);
         }
         if (newBorne != null)
         {
            this.borne = newBorne;
            this.borne.addBoucle(this);
         }
      }
   }

}