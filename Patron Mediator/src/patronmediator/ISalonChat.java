/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronmediator;

/**
 *
 * @author Tonny
 */
public interface ISalonChat {

    public abstract void registra(Usuario participante);

    public abstract void envia(String de, String a, String msg);
}
