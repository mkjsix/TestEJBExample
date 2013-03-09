/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.mturatti.testejb;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maurizio Turatti <info@maurizioturatti.com>
 */
public class StandaloneBeanTest {

    EJBContainer ec;
    Context ctx;

    public StandaloneBeanTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ec = EJBContainer.createEJBContainer();
        ctx = ec.getContext();
    }

    @After
    public void tearDown() {
        if (ec != null) {
            ec.close();
        }
    }

    @Test
    public void testReturnMessage() throws Exception {
        System.out.println("Testing standalone.ejb.StandalonBean.returnMessage()");
        StandaloneBean instance = (StandaloneBean) ctx.lookup("java:global/classes/StandaloneBean");
        String expResult = "Greetings!";
        String result = instance.returnMessage();
        assertEquals(expResult, result);
    }
}