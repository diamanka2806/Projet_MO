/***********************************************************************
 * Module:  Personne.java
 * Author:  PC
 * Purpose: Defines the Class Personne
 ***********************************************************************/

import java.util.*;

/** @pdOid c5981185-c0b2-4542-af70-5966906ba34d */
public class Personne {
   /** @pdOid 92d4879a-a16e-4ea9-b2be-9aca7644b0f0 */
   private int idPersonne;
   /** @pdOid 7300e056-9738-4f3b-a190-e2c6ed248432 */
   private String password;
   
   /** @pdOid 9b5987db-0cbb-4a99-85d2-8436f0460766 */
   protected String nom;
   /** @pdOid a3df230e-ee16-41f4-897f-9921c1998121 */
   protected String prenom;
   /** @pdOid e47d85f0-695a-43c3-995f-4413a47af6cc */
   protected String login;
   
   /** @pdRoleInfo migr=no name=Role assc=association15 mult=1..1 */
   public Role role;

}