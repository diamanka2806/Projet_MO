/***********************************************************************
 * Module:  Bandeau.java
 * Author:  PC
 * Purpose: Defines the Class Bandeau
 ***********************************************************************/

import java.util.*;

/** @pdOid 70a64ae1-9a7c-431a-bd82-19b5801d40ac */
public class Bandeau {
   /** @pdOid 87ea330c-1e03-4aed-920e-62c762ece38c */
   private int idBandeau;
   
   /** @pdOid 919bc954-2033-4761-ac4e-7bdde95fef4a */
   protected String etat;
   
   /** @pdRoleInfo migr=no name=Borne assc=association5 mult=1..1 side=A */
   public Borne borne;
   
   /** @pdOid 6a8fdcc9-f5ec-4c84-9ad3-d90b51885dd9 */
   public void ouvrirVoie() {
      // TODO: implement
   }
   
   /** @pdOid 0f6bc08c-c103-4029-a892-25840a385d3a */
   public void fermerVoie() {
      // TODO: implement
   }

}