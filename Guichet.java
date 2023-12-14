/***********************************************************************
 * Module:  Guichet.java
 * Author:  PC
 * Purpose: Defines the Class Guichet
 ***********************************************************************/

import java.util.*;

public class Guichet {
  
   private int idGuichet;
   private Date dateService;
   public java.util.Collection<Personne> personne;
   public Borne borne;
   
   public java.util.Collection<Personne> getPersonne() {
      if (personne == null)
         personne = new java.util.HashSet<Personne>();
      return personne;
   }
   
   public java.util.Iterator<Personne> getIteratorPersonne() {
      if (personne == null)
         personne = new java.util.HashSet<Personne>();
      return personne.iterator();
   }
   
   public void setPersonne(java.util.Collection<Personne> newPersonne) {
      removeAllPersonne();
      for (java.util.Iterator<Personne> iter = newPersonne.iterator(); iter.hasNext();)
         addPersonne((Personne)iter.next());
   }
   
   public void addPersonne(Personne newPersonne) {
      if (newPersonne == null)
         return;
      if (this.personne == null)
         this.personne = new java.util.HashSet<Personne>();
      if (!this.personne.contains(newPersonne))
         this.personne.add(newPersonne);
   }
   
   public void removePersonne(Personne oldPersonne) {
      if (oldPersonne == null)
         return;
      if (this.personne != null)
         if (this.personne.contains(oldPersonne))
            this.personne.remove(oldPersonne);
   }
   
   public void removeAllPersonne() {
      if (personne != null)
         personne.clear();
   }

   public int getIdGuichet() {
      return idGuichet;
   }

   public void setIdGuichet(int idGuichet) {
      this.idGuichet = idGuichet;
   }

   public Date getDateService() {
      return dateService;
   }

   public void setDateService(Date dateService) {
      this.dateService = dateService;
   }

   public Borne getBorne() {
      return borne;
   }

   public void setBorne(Borne borne) {
      this.borne = borne;
   }

}