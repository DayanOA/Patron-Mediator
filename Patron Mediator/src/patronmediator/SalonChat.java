/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronmediator;

import java.util.HashMap;

/**
 *
 * @author Tonny
 *
 */
public class SalonChat implements ISalonChat {

    private HashMap<String, Usuario> participantes = new HashMap<String, Usuario>();

    @Override
    public void registra(Usuario user) {
        participantes.put(user.getNombre(), user);
    }

    @Override
    public void envia(String de, String a, String msg) {
        if (participantes.containsKey(de) && participantes.containsKey(a)) {
            Usuario u = participantes.get(a);
            u.recibe(de, msg);
        } else {
            System.out.println("Usuario Inexistente \n");
        }
    }

    public HashMap<String, Usuario> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(HashMap<String, Usuario> participantes) {
        this.participantes = participantes;
    }

}
