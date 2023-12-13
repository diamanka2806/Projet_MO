/***********************************************************************
 * Module:  Guichet.java
 * Author:  PC
 * Purpose: Defines the Class Guichet
 ***********************************************************************/

import java.util.*;

/** @pdOid 22ec300b-6073-4b37-8c34-65b15cf8bf17 */
public class Guichet {
   /** @pdOid d47ea700-38e5-4513-a6fc-bd80f89a72b4 */
   private int idGuichet;
   /** @pdOid 4aa7a42f-2251-460f-b046-d1b331266232 */
   private Date dateService;
   
   /** @pdRoleInfo migr=no name=Personne assc=association21 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Personne> personne;
   /** @pdRoleInfo migr=no name=Borne assc=association24 mult=1..1 side=A */
   public Borne borne;
   
   
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