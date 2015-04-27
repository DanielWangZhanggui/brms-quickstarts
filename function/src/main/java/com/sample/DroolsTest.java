package com.sample;

import org.kie.api.KieServices;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {

            // load up the knowledge base
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rules");
            KieRuntimeLogger logger = ks.getLoggers().newFileLogger( kSession, "./helloworld" );

            // go !
            for( int counter = 0; counter < 10; ++counter) {
                kSession.insert(new Message("Dave", "Hello, HAL. Do you read me, HAL?"));
                kSession.fireAllRules();
//                if (kSession.getFactCount() != 0) {
//                    System.err.println("error");
//                }
            }
            
            logger.close();
            kSession.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
