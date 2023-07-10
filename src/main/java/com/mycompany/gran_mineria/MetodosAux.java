package com.mycompany.gran_mineria;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
class MetodosAux {
    
    public MetodosAux(){
    }
    
    public void reporte(HashMap<String,Region> mapaRegion) throws IOException{
        FileWriter fichero = new FileWriter("C:/Users/donov/OneDrive/Escritorio/Proyectos Informaticos/Gran_Mineria/reporte.txt");   
        
        fichero.close();
    }
}
