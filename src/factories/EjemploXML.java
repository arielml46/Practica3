/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import Modelo.Estudiante;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.xpath.XPathExpressionException;

/**
 *
 * @author Ariel
 */
public class EjemploXML {
    
    public void main(String args[])
    {
        EjemploXML exml= new EjemploXML();
        
        Estudiante estudiante= new Estudiante("B93223","Juanito Perez","jperez@ucr.ac.cr");
        Estudiante estudiante2= new Estudiante("C19223","Alberto Coco","acoco@ucr.ac.cr");
        ArrayList<Estudiante> estudiantes= new ArrayList<>();
        estudiantes.add(estudiante);
        estudiantes.add(estudiante2);
        
        CreadorArchivos creador= CreadorArchivo("ejemploEstudiante.xml");
        creador.agregarEstudiante(estudiantes);
        creador.guardar();
        
        try{
            
            for(Estudiante est: creador.get_estudiantes()){
                System.err.println(estu);
                
                }
            }
            catch(XPathExpressionException ex){
                    
                Logger.getLogger(EjemploXML.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }

