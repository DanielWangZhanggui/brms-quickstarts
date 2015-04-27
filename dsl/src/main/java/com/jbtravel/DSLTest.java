package com.jbtravel; 

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.jbtravel.model.Customer;
import com.jbtravel.model.Reservation;

/**
 * This is a sample class to launch a rule.
 */
public class DSLTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

        	// build facts
        	Customer customer = new Customer();
        	customer.setLoyaltyLevel("Gold");
        	Reservation reservation = new Reservation();
        	reservation.setUpgradeclass(true);
        	
        	// invoke engine
            kSession.insert(customer);
            kSession.insert(reservation);
            kSession.fireAllRules();
            System.out.println("Class fee = " + reservation.getClassFee());
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
