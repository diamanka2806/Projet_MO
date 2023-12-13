/***********************************************************************
 * Module:  Borne.java
 * Author:  PC
 * Purpose: Defines the Class Borne
 ***********************************************************************/

import java.util.*;

/** @pdOid 769adc58-cdfa-4ba3-8929-4039e6f7fc11 */
public class Borne {
   /** @pdOid eb6f3a57-9682-4b11-9644-c2abbec92ed7 */
   private int idBorne;
   
   /** @pdRoleInfo migr=no name=FeuSignalisation assc=association1 mult=1..1 type=Aggregation */
   public FeuSignalisation feuSignalisation;
   /** @pdRoleInfo migr=no name=SystemePaiement assc=association2 mult=1..1 type=Aggregation */
   public SystemePaiement systemePaiement;
   /** @pdRoleInfo migr=no name=Boucle assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=2 type=Aggregation */
   public java.util.Collection<Boucle> boucle;
   /** @pdRoleInfo migr=no name=Bariere assc=association4 coll=java.util.Collection impl=java.util.HashSet mult=2 type=Aggregation */
   public java.util.Collection<Bariere> bariere;
   /** @pdRoleInfo migr=no name=Bandeau assc=association5 mult=1..1 type=Aggregation */
   public Bandeau bandeau;
   /** @pdRoleInfo migr=no name=Panneau assc=association6 mult=1..1 type=Aggregation */
   public Panneau panneau;
   /** @pdRoleInfo migr=no name=TypeBorne assc=association23 mult=1..1 */
   public TypeBorne typeBorne;
   /** @pdRoleInfo migr=no name=Guichet assc=association24 mult=0..1 */
   public Guichet guichet;
   /** @pdRoleInfo migr=no name=Rapport assc=association22 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Rapport> rapport;
   /** @pdRoleInfo migr=no name=Alarme assc=association26 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Alarme> alarme;
   /** @pdRoleInfo migr=no name=PosteSupervision assc=association27 mult=0..1 side=A */
   public PosteSupervision posteSupervision;
   
   /** @pdOid d9e5c6f0-2248-43b3-af9b-140d71f82ae7 */
   public void initBorne() {
      // TODO: implement
   }
   
   /** @pdOid 710509d7-c4aa-49b1-b406-64f486f69e4d */
   public void validerPaiement() {
      // TODO: implement
   }
   
   /** @pdOid be40ba83-ff85-4440-9510-b5b12f83b8fc */
   public void envoyerRappor() {
      // TODO: implement
   }
   
   /** @pdOid 45af139c-6b54-4a93-ab25-bb82c57bfe44 */
   public void verifierPlaque() {
      // TODO: implement
   }
   
   /** @pdOid 5e707f9a-14d9-4a04-a39f-9ef8a6127318 */
   public void declencheralarme() {
      // TODO: implement
   }
   
   /** @pdOid bc9bbd8a-c454-4255-a69c-0d94b71fc618 */
   public String toString() {
      // TODO: implement
      return null;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Boucle> getBoucle() {
      if (boucle == null)
         boucle = new java.util.HashSet<Boucle>();
      return boucle;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBoucle() {
      if (boucle == null)
         boucle = new java.util.HashSet<Boucle>();
      return boucle.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBoucle */
   public void setBoucle(java.util.Collection<Boucle> newBoucle) {
      removeAllBoucle();
      for (java.util.Iterator iter = newBoucle.iterator(); iter.hasNext();)
         addBoucle((Boucle)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBoucle */
   public void addBoucle(Boucle newBoucle) {
      if (newBoucle == null)
         return;
      if (this.boucle == null)
         this.boucle = new java.util.HashSet<Boucle>();
      if (!this.boucle.contains(newBoucle))
      {
         this.boucle.add(newBoucle);
         newBoucle.setBorne(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBoucle */
   public void removeBoucle(Boucle oldBoucle) {
      if (oldBoucle == null)
         return;
      if (this.boucle != null)
         if (this.boucle.contains(oldBoucle))
         {
            this.boucle.remove(oldBoucle);
            oldBoucle.setBorne((Borne)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBoucle() {
      if (boucle != null)
      {
         Boucle oldBoucle;
         for (java.util.Iterator iter = getIteratorBoucle(); iter.hasNext();)
         {
            oldBoucle = (Boucle)iter.next();
            iter.remove();
            oldBoucle.setBorne((Borne)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Bariere> getBariere() {
      if (bariere == null)
         bariere = new java.util.HashSet<Bariere>();
      return bariere;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorBariere() {
      if (bariere == null)
         bariere = new java.util.HashSet<Bariere>();
      return bariere.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newBariere */
   public void setBariere(java.util.Collection<Bariere> newBariere) {
      removeAllBariere();
      for (java.util.Iterator iter = newBariere.iterator(); iter.hasNext();)
         addBariere((Bariere)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newBariere */
   public void addBariere(Bariere newBariere) {
      if (newBariere == null)
         return;
      if (this.bariere == null)
         this.bariere = new java.util.HashSet<Bariere>();
      if (!this.bariere.contains(newBariere))
      {
         this.bariere.add(newBariere);
         newBariere.setBorne(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldBariere */
   public void removeBariere(Bariere oldBariere) {
      if (oldBariere == null)
         return;
      if (this.bariere != null)
         if (this.bariere.contains(oldBariere))
         {
            this.bariere.remove(oldBariere);
            oldBariere.setBorne((Borne)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllBariere() {
      if (bariere != null)
      {
         Bariere oldBariere;
         for (java.util.Iterator iter = getIteratorBariere(); iter.hasNext();)
         {
            oldBariere = (Bariere)iter.next();
            iter.remove();
            oldBariere.setBorne((Borne)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Rapport> getRapport() {
      if (rapport == null)
         rapport = new java.util.HashSet<Rapport>();
      return rapport;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRapport() {
      if (rapport == null)
         rapport = new java.util.HashSet<Rapport>();
      return rapport.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRapport */
   public void setRapport(java.util.Collection<Rapport> newRapport) {
      removeAllRapport();
      for (java.util.Iterator iter = newRapport.iterator(); iter.hasNext();)
         addRapport((Rapport)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRapport */
   public void addRapport(Rapport newRapport) {
      if (newRapport == null)
         return;
      if (this.rapport == null)
         this.rapport = new java.util.HashSet<Rapport>();
      if (!this.rapport.contains(newRapport))
      {
         this.rapport.add(newRapport);
         newRapport.setBorne(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldRapport */
   public void removeRapport(Rapport oldRapport) {
      if (oldRapport == null)
         return;
      if (this.rapport != null)
         if (this.rapport.contains(oldRapport))
         {
            this.rapport.remove(oldRapport);
            oldRapport.setBorne((Borne)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRapport() {
      if (rapport != null)
      {
         Rapport oldRapport;
         for (java.util.Iterator iter = getIteratorRapport(); iter.hasNext();)
         {
            oldRapport = (Rapport)iter.next();
            iter.remove();
            oldRapport.setBorne((Borne)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Alarme> getAlarme() {
      if (alarme == null)
         alarme = new java.util.HashSet<Alarme>();
      return alarme;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAlarme() {
      if (alarme == null)
         alarme = new java.util.HashSet<Alarme>();
      return alarme.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAlarme */
   public void setAlarme(java.util.Collection<Alarme> newAlarme) {
      removeAllAlarme();
      for (java.util.Iterator iter = newAlarme.iterator(); iter.hasNext();)
         addAlarme((Alarme)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAlarme */
   public void addAlarme(Alarme newAlarme) {
      if (newAlarme == null)
         return;
      if (this.alarme == null)
         this.alarme = new java.util.HashSet<Alarme>();
      if (!this.alarme.contains(newAlarme))
      {
         this.alarme.add(newAlarme);
         newAlarme.setBorne(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldAlarme */
   public void removeAlarme(Alarme oldAlarme) {
      if (oldAlarme == null)
         return;
      if (this.alarme != null)
         if (this.alarme.contains(oldAlarme))
         {
            this.alarme.remove(oldAlarme);
            oldAlarme.setBorne((Borne)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAlarme() {
      if (alarme != null)
      {
         Alarme oldAlarme;
         for (java.util.Iterator iter = getIteratorAlarme(); iter.hasNext();)
         {
            oldAlarme = (Alarme)iter.next();
            iter.remove();
            oldAlarme.setBorne((Borne)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public PosteSupervision getPosteSupervision() {
      return posteSupervision;
   }
   
   /** @pdGenerated default parent setter
     * @param newPosteSupervision */
   public void setPosteSupervision(PosteSupervision newPosteSupervision) {
      if (this.posteSupervision == null || !this.posteSupervision.equals(newPosteSupervision))
      {
         if (this.posteSupervision != null)
         {
            PosteSupervision oldPosteSupervision = this.posteSupervision;
            this.posteSupervision = null;
            oldPosteSupervision.removeBorne(this);
         }
         if (newPosteSupervision != null)
         {
            this.posteSupervision = newPosteSupervision;
            this.posteSupervision.addBorne(this);
         }
      }
   }

}