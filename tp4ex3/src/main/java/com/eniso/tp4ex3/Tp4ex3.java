/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp4ex3;

/**
 *
 * @author aziz
 */
public class Tp4ex3 {

    public static void main(String[] args) {
Calculator calculator = new Calculator();
// Appelez chaque méthode add surchargée avec différents ensembles de paramètres
int sommeEntiers = calculator.add(5, 10);
int sommeTroisEntiers = calculator.add(5, 10, 15);
double sommeDoubles = calculator.add(3.5, 2.5);
String chaineConcatenee = calculator.add("Bonjour", "Monde");
// Affichez les résultats de chaque appel de méthode
System.out.println("Somme de 5 et 10 : " + sommeEntiers);
System.out.println("Somme de 5, 10 et 15 : " + sommeTroisEntiers);
System.out.println("Somme de 3.5 et 2.5 : " + sommeDoubles);
System.out.println("Chaîne concaténée : " + chaineConcatenee);
}
}
