/***********************************************************************
 * Module:  FeuSignalisation.java
 * Author:  PC
 * Purpose: Defines the Class FeuSignalisation
 ***********************************************************************/

import java.util.*;

/** @pdOid 0747a518-782f-41cc-8902-8a8cab7b70c9 */
public class FeuSignalisation {
   /** @pdOid a0501022-8ce9-48a0-8798-ace9c8338fe3 */
   private int idFeuSignalisation;
   
   /** @pdOid 00dd65e8-f8e6-494e-b537-134fae722585 */
   protected String etat;
   
   /** @pdRoleInfo migr=no name=Borne assc=association1 mult=1..1 side=A */
   public Borne borne;
   
   /** @pdOid 7c7355ab-32b3-4358-9e5a-5dfbb31e1701 */
   public void changerFeu() {
      // TODO: implement
   }

}