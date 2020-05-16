/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronmediator;

import java.util.HashMap;
import sun.net.www.protocol.http.HttpURLConnection;

/**
 *
 * @author Tonny
 *
 */
public class ChatPrivado implements ISalonChat {

    private HashMap<String, Usuario> bloqueados = new HashMap<String, Usuario>();
    private SalonChat salonChat = new SalonChat();
    HashMap<String, Usuario> participantes = this.salonChat.getParticipantes();

    @Override
    public void registra(Usuario user) {
        salonChat.registra(user);
    }

    @Override
    public void envia(String de, String a, String msg) {
      
        if (bloqueados.containsKey(de)) {
            System.out.println(participantes.get(de).getNombre()+" Esta bloqueado \n");
        } else if (bloqueados.containsKey(a)) {
            System.out.println("El usuario al que envió el mensaje, esta bloqueado \n");
        } else {
            salonChat.envia(de, a, msg);
        }
    }

    public void bloquearUsuario(Usuario user) {
        if (participantes.containsKey(user.getNombre())) {
            bloqueados.put(user.getNombre(), user);
        } else {
            System.out.println("El usuario que intenta bloquear no esta en el chat \n");
        }
    }

    public void desbloquearUsuario(Usuario user) {
        if (participantes.containsKey(user.getNombre()) && bloqueados.containsKey(user.getNombre())) {
            bloqueados.remove(user.getNombre(), user);
            System.out.println("El usuario: " + user.getNombre() + " ha sido desbloqueado \n");
        } else {
            System.out.println("El usuario que intenta desbloquear no esta en el chat o no esta bloqueado \n");
        }
    }

    public void invitarUsuario(Usuario user) {
        participantes.put(user.getNombre(), user);
        System.out.println("Se agrego : " + user.getNombre() + " al chat \n");
    }

    public void BuscarUsuario(Usuario user) {
        if (participantes.containsKey(user.getNombre())) {
            System.out.println("El usuario: " + participantes.get(user.getNombre()) + " esta en el chat \n");
        }
    }
}
