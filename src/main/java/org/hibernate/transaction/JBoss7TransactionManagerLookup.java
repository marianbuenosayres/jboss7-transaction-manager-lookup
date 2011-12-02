package org.hibernate.transaction;

public class JBoss7TransactionManagerLookup extends JNDITransactionManagerLookup {

   @Override
   public String getUserTransactionName() {
      return "java:module/UserTransaction";
   }

   @Override
   protected String getName() {
      return "java:jboss/TransactionManager";      
   }

}
