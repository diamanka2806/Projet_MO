/***********************************************************************
 * Module:  ListeBorne.java
 * Author:  PC
 * Purpose: Defines the Class ListeBorne
 ***********************************************************************/

import java.util.*;

/** @pdOid ced38a54-b3d3-4939-be33-4269bd93d1db */
public class ListeBorne {
   /** @pdRoleInfo migr=no name=Borne assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Borne> borne;
   
   /** @pdOid 96e20813-c36b-4650-890e-b5c5070ec9c1 */
   public Borne ajouterBorne() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid d4a09435-4277-479d-a1d9-6357a716e425 */
   public void afficherBorne() {
      // TODO: implement
   }
   
   /** @pdOid a0216c6d-d5ed-4c0a-9194-2624f2ed19ff */
   public void modifierBorne() {
      // TODO: implement
   }
   
   /** @pdOid 9f75bcf0-e53f-4007-8fa0-89b7dfb4d142 */
   public void supprimerBorne() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Borne> getBorne() {
      if (borne == null)
         borne = new java.util.HashSet<Borne>();
      return borne;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBorne() {
      if (borne == null)
         borne = new java.util.HashSet<Borne>();
      return borne.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBorne */
   public void setBorne(java.util.Collection<Borne> newBorne) {
      removeAllBorne();
      for (java.util.Iterator iter = newBorne.iterator(); iter.hasNext();)
         addBorne((Borne)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBorne */
   public void addBorne(Borne newBorne) {
      if (newBorne == null)
         return;
      if (this.borne == null)
         this.borne = new java.util.HashSet<Borne>();
      if (!this.borne.contains(newBorne))
         this.borne.add(newBorne);
   }
   
   /** @pdGenerated default remove
     * @param oldBorne */
   public void removeBorne(Borne oldBorne) {
      if (oldBorne == null)
         return;
      if (this.borne != null)
         if (this.borne.contains(oldBorne))
            this.borne.remove(oldBorne);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBorne() {
      if (borne != null)
         borne.clear();
   }

}