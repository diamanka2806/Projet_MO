/***********************************************************************
 * Module:  ProgrammePrincipale.java
 * Author:  PC
 * Purpose: Defines the Class ProgrammePrincipale
 ***********************************************************************/

import java.util.*;

/** @pdOid c5993c22-2913-40eb-8e23-0856a721ab21 */
public class ProgrammePrincipale {
   /** @pdRoleInfo migr=no name=ListeBorne assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<ListeBorne> listeBorne;
   /** @pdRoleInfo migr=no name=FenetreConnesxion assc=association11 mult=0..* type=Composition */
   public FenetreConnesxion[] fenetreConnesxion;
   /** @pdRoleInfo migr=no name=FenetreSuperviseur assc=association12 mult=0..* type=Composition */
   public FenetreSuperviseur[] fenetreSuperviseur;
   /** @pdRoleInfo migr=no name=FenetreCollaborateur assc=association13 mult=0..* type=Composition */
   public FenetreCollaborateur[] fenetreCollaborateur;
   /** @pdRoleInfo migr=no name=ListePersonne assc=association14 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<ListePersonne> listePersonne;
   
   /** @pdOid 8b6574c4-ad35-4a73-973e-8e5e5f4aad82 */
   public void main() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<ListeBorne> getListeBorne() {
      if (listeBorne == null)
         listeBorne = new java.util.HashSet<ListeBorne>();
      return listeBorne;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorListeBorne() {
      if (listeBorne == null)
         listeBorne = new java.util.HashSet<ListeBorne>();
      return listeBorne.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newListeBorne */
   public void setListeBorne(java.util.Collection<ListeBorne> newListeBorne) {
      removeAllListeBorne();
      for (java.util.Iterator iter = newListeBorne.iterator(); iter.hasNext();)
         addListeBorne((ListeBorne)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newListeBorne */
   public void addListeBorne(ListeBorne newListeBorne) {
      if (newListeBorne == null)
         return;
      if (this.listeBorne == null)
         this.listeBorne = new java.util.HashSet<ListeBorne>();
      if (!this.listeBorne.contains(newListeBorne))
         this.listeBorne.add(newListeBorne);
   }
   
   /** @pdGenerated default remove
     * @param oldListeBorne */
   public void removeListeBorne(ListeBorne oldListeBorne) {
      if (oldListeBorne == null)
         return;
      if (this.listeBorne != null)
         if (this.listeBorne.contains(oldListeBorne))
            this.listeBorne.remove(oldListeBorne);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllListeBorne() {
      if (listeBorne != null)
         listeBorne.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<ListePersonne> getListePersonne() {
      if (listePersonne == null)
         listePersonne = new java.util.HashSet<ListePersonne>();
      return listePersonne;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorListePersonne() {
      if (listePersonne == null)
         listePersonne = new java.util.HashSet<ListePersonne>();
      return listePersonne.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newListePersonne */
   public void setListePersonne(java.util.Collection<ListePersonne> newListePersonne) {
      removeAllListePersonne();
      for (java.util.Iterator iter = newListePersonne.iterator(); iter.hasNext();)
         addListePersonne((ListePersonne)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newListePersonne */
   public void addListePersonne(ListePersonne newListePersonne) {
      if (newListePersonne == null)
         return;
      if (this.listePersonne == null)
         this.listePersonne = new java.util.HashSet<ListePersonne>();
      if (!this.listePersonne.contains(newListePersonne))
         this.listePersonne.add(newListePersonne);
   }
   
   /** @pdGenerated default remove
     * @param oldListePersonne */
   public void removeListePersonne(ListePersonne oldListePersonne) {
      if (oldListePersonne == null)
         return;
      if (this.listePersonne != null)
         if (this.listePersonne.contains(oldListePersonne))
            this.listePersonne.remove(oldListePersonne);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllListePersonne() {
      if (listePersonne != null)
         listePersonne.clear();
   }

}