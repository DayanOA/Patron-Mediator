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
public class Cliente {

    public static void main(String[] args) {
        ChatPrivado s = new ChatPrivado();

        Usuario u = new Usuario(s);
        u.setNombre("Tonny");
        s.registra(u);

        Usuario u1 = new Usuario(s);
        u1.setNombre("Pacho");
        s.registra(u1);

        Usuario u2 = new Usuario(s);
        u2.setNombre("Milla");
        s.registra(u2);

        s.bloquearUsuario(u2);
        u1.envia("Tonny", "Holaa \n");
        u1.envia("Milla", "Holaa, como estas? \n");
        u1.envia("Tonny", "Bloqueaste a Milla? \n");
        u2.envia("Simon", "Estas en chat? \n");

        s.desbloquearUsuario(u2);
        u.envia("Pacho", "Holaa...ya lo desbloquee? \n");
        u1.envia("Milla", "Holaa, como estas? \n");
    }

}
