/***********************************************************************
 * Module:  ListePersonne.java
 * Author:  PC
 * Purpose: Defines the Class ListePersonne
 ***********************************************************************/

import java.util.*;

/** @pdOid 4ffe6fab-9995-466b-8bb8-566f9f4e0e62 */
public class ListePersonne {
   /** @pdRoleInfo migr=no name=Personne assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Personne> personne;
   
   /** @pdOid bb6cc7fc-2440-45d7-b6bd-e17193e0891f */
   public void ajouterPersonne() {
      // TODO: implement
   }
   
   /** @pdOid 842e1ea2-e4b6-4cc6-9af3-d4311f45fcb2 */
   public void afficherPersonne() {
      // TODO: implement
   }
   
   /** @pdOid 889803f0-c517-4900-9c90-d674e83b059e */
   public void modifierPersonne() {
      // TODO: implement
   }
   
   /** @pdOid 677cbb72-54c0-423a-a5a2-d9ee421c743c */
   public void supprimerPersonne() {
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

}