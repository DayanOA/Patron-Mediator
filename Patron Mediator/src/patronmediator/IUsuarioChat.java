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
public interface IUsuarioChat {

    public void recibe(String de, String msg);

    public void envia(String a, String msg);
}
