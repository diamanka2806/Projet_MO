/***********************************************************************
 * Module:  Rapport.java
 * Author:  PC
 * Purpose: Defines the Class Rapport
 ***********************************************************************/

import java.util.*;

/** @pdOid aafb60f1-2784-4831-8d77-5a5d5acc936f */
public class Rapport {
   /** @pdOid a69ba163-1115-4730-b8f7-a56f469dd3be */
   private int idRapport;
   /** @pdOid d97873ed-79f3-4a96-bc0f-357b28856ea4 */
   private String contenu;
   /** @pdOid d7a47a1d-b8e0-4553-9d6d-7a7c1a73be7d */
   private java.util.Date dateRapport;
   
   /** @pdRoleInfo migr=no name=Borne assc=association22 mult=1..1 side=A */
   public Borne borne;
   
   /** @pdOid 74870855-d887-44d0-852c-9f74f13b00ff */
   public void afficherRappaort() {
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
            oldBorne.removeRapport(this);
         }
         if (newBorne != null)
         {
            this.borne = newBorne;
            this.borne.addRapport(this);
         }
      }
   }

}