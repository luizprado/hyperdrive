/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.ejb.Stateless;

/**
 *
 * @author Lucas
 */
@Stateless
public class Test1 implements Test1Remote {

    @Override
    public String getNome(String nome) {
        return "Olá " + nome;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
