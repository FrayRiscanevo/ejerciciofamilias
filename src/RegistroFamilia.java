
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
public class RegistroFamilia {
    private ArrayList <Familia>familia;

    public RegistroFamilia() {
        this.familia = new ArrayList <Familia>();
    }
    
   
    public boolean ingresarFamilia(Familia familia){
        boolean insercion =this.familia.add(familia);
        return insercion;

    }   
    public void listaFamilia(){
        for(Familia familia : this.familia){
            System.out.println("-----------");
            familia.listaMiembros();
            System.out.println("-----------");
        }
        
    }
    
}
