/***********************************************************************
 * Module:  SystemePaiement.java
 * Author:  PC
 * Purpose: Defines the Class SystemePaiement
 ***********************************************************************/

import java.util.*;

/** @pdOid b9764e9b-412b-4d15-9fd2-caed349df1a7 */
public class SystemePaiement {
   /** @pdOid db9f9690-0ee8-4d11-81fb-b85ab3834e4d */
   private int idPaiement;
   /** @pdOid d9ec9124-28dd-4976-8f55-aefd9d255a22 */
   private Long numeroCarte;
   
   /** @pdOid 23d0cb79-909b-45b8-8509-6273ad791493 */
   protected Float montant;
   /** @pdOid 1bb97d47-60ae-4198-8ac2-f768455eb5c2 */
   protected String modePaiement;
   /** @pdOid 5856e82b-da1f-4aba-9343-0a9f8ef1f1a4 */
   protected java.util.Date datePaiement;
   
   /** @pdRoleInfo migr=no name=Borne assc=association2 mult=1..1 side=A */
   public Borne borne;
   
   /** @pdOid 3506b2b8-a3d2-4870-b1a5-1ddbdf168958 */
   public String toString() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 730b8bd4-f749-439a-8591-e57cf4e8e0b4 */
   public void encaisser() {
      // TODO: implement
   }

}