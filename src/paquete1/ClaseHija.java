package paquete1;

import paquete1.Clase1;

public class ClaseHija extends Clase1{
    
    public ClaseHija(){
        super("Publico");
        //this.atributoPrivado = "Modificacion atributo privado";//No se puede acceder porque es privado
        //this.metodoPrivado();
    }
    
}
