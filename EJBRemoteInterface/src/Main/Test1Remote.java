/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.ejb.Remote;

/**
 *
 * @author Lucas
 */
@Remote
public interface Test1Remote {

    String getNome(String nome);
    
}
