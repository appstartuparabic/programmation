/* Illustration de la lecture d'un objet complexe par d�-s�rialisation
 * Lit un vecteur de plants du VecteurPlants.dat et en affiche le contenu */

import java.io.*;
import java.util.*;
public class LireVecteurPlants{

    public static void main (String args[]) throws Exception {
        
        ObjectInputStream fichierFluxPlants =
        new ObjectInputStream (
            new FileInputStream("C:/Users/Robert/Documents/NetBeansProjects/JavaLivre/build/classes/VecteurPlants.dat"));
        Vector vecteurDePlants = (Vector) fichierFluxPlants.readObject();
        fichierFluxPlants.close();
        
        Enumeration enumerationPlants = vecteurDePlants.elements();
        while (enumerationPlants.hasMoreElements()){
            Plant unPlant = (Plant)enumerationPlants.nextElement();
            System.out.println(
                unPlant.getNoPlant() + " " +
                unPlant.getDescription() + " " + 
                unPlant.getPrixUnitaire());
        }
    }
}