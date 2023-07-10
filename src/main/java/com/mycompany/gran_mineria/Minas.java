
package com.mycompany.gran_mineria;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Minas extends Pais {
    private String nombre;
    private String region;
    private String mineral;
    private String pais;
    private int produccion;
    private int personal;

    public Minas(){
        
    }
     
    public Minas(String nombre, String region, String mineral, String pais, int produccion, int personal) {
        this.nombre = nombre;
        this.region = region;
        this.mineral = mineral;
        this.pais = pais;
        this.produccion = produccion;
        this.personal = personal;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String getMineral() {
        return mineral;
    }

    public void setMineral(String mineral) {
        this.mineral = mineral;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getProduccion() {
        return produccion;
    }

    public void setProduccion(int produccion) {
        this.produccion = produccion;
    }
    public int getPersonal(){
        return personal;
    }
    public void setPersonal(int personal){
        this.personal = personal;
    }

    //METODOS

    /**
     * @param mapaMinas
     * @param mapaRegiones
     * @param mapaPaises
     * @param list
     * @throws IOException
     */
    
    /*leerMinas Lee un archivo separado por comas para crear cada objeto de Clase Mina a la vez que los ingresa en cada uno de sus
    mapas, se piden los mapas de cada clase como argumento ya que estos seran ingresados como argumentos para metodos de la clase
    region y de la clase pais (aqui se llama a un metodo de region y dentro de region a un metodo de pais, necesario para ingresar
    cada objeto mina en su respectivo mapa*/
    
    public void leerMinas(HashMap<String,Minas> mapaMinas, HashMap<String,Region> mapaRegiones, HashMap<String,Pais> mapaPaises, ArrayList <Minas> list) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("minas.csv"));
        String line;
        while ((line = br.readLine()) != null) {  
        // split on comma(',')  
        String[] minasCsv = line.split(",");  

        Minas minasObj = new Minas();  

        minasObj.setNombre(minasCsv[0]);  
        minasObj.setRegion(minasCsv[1]);  
        minasObj.setMineral(minasCsv[2]);  
        minasObj.setPais(minasCsv[3]); 
        minasObj.setProduccion(Integer.parseInt(minasCsv[4]));
        minasObj.setPersonal(Integer.parseInt(minasCsv[5]));
        //
        Region regAux= new Region();
        regAux.agregarMina(minasObj.getRegion(), minasObj, mapaRegiones, mapaPaises);
        mapaMinas.put(minasObj.getNombre() , minasObj);
        list.add(minasObj);
        } 
    }
    
    /*Metodo que permite agregar un nuevo objeto de clase mina al usuario, el cual tambien sera ingresado inmediatamente en el
    mapa de minas, en el mapa de regiones y en el mapa de paises
    */
    public boolean agregarMina(HashMap<String,Minas> mapaMinas, HashMap<String,Region> mapaRegiones, HashMap<String,Pais> mapaPaises, Minas mina) throws IOException{
        if(mapaMinas.get(mina.getNombre())!=null){
            return false;
        }
        Region regAux= new Region();
        regAux.agregarMina(mina.getRegion(), mina, mapaRegiones, mapaPaises);
        mapaMinas.put(mina.getNombre() , mina);
        return true;
    }     
    
    /*Metodo que permite mostrar la informacion de una mina previo el ingreso de su nombre(clave) por parte del usuario*/
    public Minas mostrarMina(HashMap<String,Minas> mapaMinas, String key) throws IOException{
        Minas mina = mapaMinas.get(key);
        if(mina== null){
            return null;
        }
        return mina;
    }
    
    public void reporte (ArrayList lista) throws IOException{
        FileWriter fichero = new FileWriter("Reporte.txt");
        for (int i=0; i<lista.size(); i++){
            Minas mina =  (Minas)lista.get(i);
            fichero.write("Pais:"+mina.getPais()
            +" /Region:"+mina.getRegion()
            +" /Nombre:"+mina.getNombre()
            +" /Mineral:"+mina.getMineral()
            +" /Personal:"+mina.getPersonal()
            +" /Produccion:"+mina.getProduccion()+"\n");
            }
            fichero.close();
    }

    @Override
    public void agregarMina(String nombre, Region region, HashMap<String, Pais> mapaPais) throws IOException {
        if(mapaPais.get(nombre)!=null){
            mapaPais.get(nombre).agregarMina(region);
        }
    }
       
}