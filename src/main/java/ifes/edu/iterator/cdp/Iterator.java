/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.iterator.cdp;

/**
 *
 * @author 20122bsi0387
 */
public interface Iterator<E> {
    public boolean hasNext();
    public E next();
    public void remove();
    
}
