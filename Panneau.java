/***********************************************************************
 * Module:  Panneau.java
 * Author:  PC
 * Purpose: Defines the Class Panneau
 ***********************************************************************/

import java.util.*;

/** @pdOid 62b76458-5f45-4217-8cd8-73a4130d60f5 */
public class Panneau {
   /** @pdOid 28e71a27-8694-4552-9213-0b873712356c */
   private int idPanneau;
   
   /** @pdOid 52d42763-ad64-48ca-b0ef-c5bb34c35ebe */
   protected String prix;
   
   /** @pdRoleInfo migr=no name=Borne assc=association6 mult=1..1 side=A */
   public Borne borne;
   
   /** @pdOid 8bfc02db-9b36-4e20-9eff-ba3034d3761c */
   public void afficherMontant() {
      // TODO: implement
   }

}