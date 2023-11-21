package atividade2;

import java.util.ArrayList;
import java.util.Collections;

public class ListaNumeros {
    private static ArrayList<Float> numeros = new ArrayList<>();
    
    public static void novoNumero(float newNum) {
    	numeros.add(newNum);
    }
    
    public static void listaTodosOsNumeros() {
    	for(int i = 0; i < numeros.size(); i++) {
    		System.out.print(numeros.get(i) + " ");
    	}
    	System.out.println();
    }
    
    public static float media() {
    	float media = 0;
    	float sum = 0;
    	for(int i = 0; i < numeros.size(); i++) {
    		sum = sum + numeros.get(i);
    	}
    	media = sum / numeros.size();
    	return media;
    }
    
    public static void ordena() {
    	Collections.sort(numeros);
    	System.out.println("Números ordenados.");
    }
    
    public static float mediana() {
    	if(numeros.size() == 1) {
    		return numeros.get(0);
    	} else if(numeros.size() == 2) {
    		return (numeros.get(0) + numeros.get(1)) / 2;
    	}
    	
		if(numeros.size() > 2 && numeros.size() % 2 == 0) {
			return (numeros.get(numeros.size() / 2 - 1) + numeros.get(numeros.size() / 2)) / 2 ;
		} else {
			return numeros.get(numeros.size() / 2);
		}    		
    }
    
    public static float colocadoEm(float number) {
    	float teste = 0;
    	for(int i = 0; i < numeros.size(); i++) {
    		if(number <= numeros.size() && number == i) {
    			teste = numeros.get(i);
    		}
    	}
    	return teste;
    }
}