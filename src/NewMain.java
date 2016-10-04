/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Miembros m1 =
            new Miembros("valeria","giraldo",28,1,"madre");
        Miembros m2 =
                new Miembros("carlos","giraldo",34,1,"padre");
        Familia f1 = new Familia("Giraldo");
        f1.ingresarMiembros(m1);
        f1.ingresarMiembros(m2);
        RegistroFamilia r = new RegistroFamilia ();
        for(int i=0;i<20;i++){
            r.ingresarFamilia(f1);
            r.listaFamilia();
        }
    }
    
}
