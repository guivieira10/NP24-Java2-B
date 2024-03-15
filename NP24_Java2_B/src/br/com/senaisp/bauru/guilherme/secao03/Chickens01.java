package br.com.senaisp.bauru.guilherme.secao03;

public class Chickens01 {
    public static void main(String[] args) {
    	//int eggsPerChicken = 5, chickenCount = 3, totalEggs = 0;
    	int eggsPerChicken = 4, chickenCount = 8, totalEggs = 0;
    	//Na segunda Mr. Brown recolheu os ovos;
    	totalEggs += eggsPerChicken * chickenCount++;
    	//Na terça de manhã, Mr. Brown ganha uma galinha pela manhã
    	//chickenCount++;
    	totalEggs += eggsPerChicken * chickenCount;
    	//Na quarta de manhã, um animal come metade das galinhas
    	chickenCount/=2;
    	totalEggs += eggsPerChicken * chickenCount;
    	
        System.out.println(totalEggs);
    }   
}
