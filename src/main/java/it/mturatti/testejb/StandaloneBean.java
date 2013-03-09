/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.mturatti.testejb;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Maurizio Turatti <info@maurizioturatti.com>
 */
@Stateless
@LocalBean
public class StandaloneBean {

    private static final String message = "Greetings!";

    public String returnMessage() {
        return message;
    }
}
