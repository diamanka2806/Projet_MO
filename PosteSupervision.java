/***********************************************************************
 * Module:  PosteSupervision.java
 * Author:  PC
 * Purpose: Defines the Class PosteSupervision
 ***********************************************************************/

import java.util.*;

/** @pdOid 53ab4674-f987-425c-a464-0c773b3e2655 */
public class PosteSupervision {
   /** @pdOid 7669aca1-b01f-4c17-88f5-efcc632d1864 */
   private int idPoste;
   
   /** @pdRoleInfo migr=no name=Personne assc=association25 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Personne> personne;
   /** @pdRoleInfo migr=no name=Borne assc=association27 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Borne> borne;
   
   /** @pdOid f2c4f77d-b946-407c-b523-cdc36f64fea8 */
   public void consulterAlarme() {
      // TODO: implement
   }
   
   /** @pdOid 2de27bf4-612e-4a68-9c5e-8f260aa1d043 */
   public void consulterRapport() {
      // TODO: implement
   }
   
   /** @pdOid 153a0ab4-0f37-449e-8758-828ea13dc159 */
   public void consulterPaiement() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Personne> getPersonne() {
      if (personne == null)
         personne = new java.util.HashSet<Personne>();
      return personne;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorPersonne() {
      if (personne == null)
         personne = new java.util.HashSet<Personne>();
      return personne.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newPersonne */
   public void setPersonne(java.util.Collection<Personne> newPersonne) {
      removeAllPersonne();
      for (java.util.Iterator iter = newPersonne.iterator(); iter.hasNext();)
         addPersonne((Personne)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newPersonne */
   public void addPersonne(Personne newPersonne) {
      if (newPersonne == null)
         return;
      if (this.personne == null)
         this.personne = new java.util.HashSet<Personne>();
      if (!this.personne.contains(newPersonne))
         this.personne.add(newPersonne);
   }
   
   /** @pdGenerated default remove
     * @param oldPersonne */
   public void removePersonne(Personne oldPersonne) {
      if (oldPersonne == null)
         return;
      if (this.personne != null)
         if (this.personne.contains(oldPersonne))
            this.personne.remove(oldPersonne);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllPersonne() {
      if (personne != null)
         personne.clear();
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
      {
         this.borne.add(newBorne);
         newBorne.setPosteSupervision(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBorne */
   public void removeBorne(Borne oldBorne) {
      if (oldBorne == null)
         return;
      if (this.borne != null)
         if (this.borne.contains(oldBorne))
         {
            this.borne.remove(oldBorne);
            oldBorne.setPosteSupervision((PosteSupervision)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBorne() {
      if (borne != null)
      {
         Borne oldBorne;
         for (java.util.Iterator iter = getIteratorBorne(); iter.hasNext();)
         {
            oldBorne = (Borne)iter.next();
            iter.remove();
            oldBorne.setPosteSupervision((PosteSupervision)null);
         }
      }
   }

}