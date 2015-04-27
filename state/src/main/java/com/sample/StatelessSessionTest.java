package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

/**
 * This is a sample class to launch a rule.
 */
public class StatelessSessionTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
    	    StatelessKieSession kSession =  kContainer.newStatelessKieSession("statelessSession");

            // go !
            Message message = new Message();
            message.setMessage("Hello World");
            message.setStatus(Message.HELLO);
            kSession.execute(message);
            
            Message message1 = new Message();
            message1.setMessage("Hey World");
            message1.setStatus(Message.HELLO);
            kSession.execute(message1);
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    

}

