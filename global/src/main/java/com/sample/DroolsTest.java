package com.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.kie.api.KieServices;
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
            KieSession kSession = kContainer.newKieSession();
            
            kSession.setGlobal("count", new ArrayList<A>());

            A a1 = new A("1", getDate("01/01/2014"));
            A a2 = new A("1", getDate("01/01/2014"));
            A a3 = new A("1", getDate("01/03/2014"));
            A a4 = new A("2", getDate("01/01/2014"));

            kSession.insert(a1);
            kSession.insert(a2);
            kSession.insert(a3);
            kSession.insert(a4);

            kSession.fireAllRules();
            
            System.out.println("count = " + ((List)kSession.getGlobal("count")).size());
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private static Date getDate(String string) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sdf.parse(string);
        //System.out.println(date);
        return date;
    }

}
