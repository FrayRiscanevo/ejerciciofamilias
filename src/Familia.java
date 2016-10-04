
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */

public class Familia {
    private String apellido;
    private ArrayList <Miembros>miembros;

    public Familia(String apellido) {
        this.apellido = apellido;
        this.miembros = new ArrayList <Miembros>();
    }

   
    public boolean ingresarMiembros(Miembros miembros){
        boolean ingresarmiembro =this.miembros.add(miembros);
        return ingresarmiembro;
    }

   
    
    public void listaMiembros(){
        for(Miembros m : this.miembros){
            System.out.println(m);
        }
        
        
        
        for(int i=0;i<this.miembros.size();i++){
            Miembros m=this.miembros.get(i);
            System.out.println(m);
        }            
    }


}
