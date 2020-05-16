/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronmediator;

/**
 *
 * @author Tonny
 *
 */
public class Usuario implements IUsuarioChat {

    private String nombre;
    private ChatPrivado salon;

    public Usuario(ChatPrivado salonchat) {
        salon = salonchat;
    }

    @Override
    public void recibe(String de, String msg) {
        String s = "El usuario " + de + " ,te dice: " + msg;
        System.out.println(nombre + ": " + s);
    }

    @Override
    public void envia(String a, String msg) {
        salon.envia(nombre, a, msg);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
