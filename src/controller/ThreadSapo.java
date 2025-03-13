package controller;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSapo extends Thread {
    private final int pulomax = 7;
    private final int distmax = 56;
    private static AtomicInteger colocacao = new AtomicInteger(0);;
    private String nome;
    private Random random = new Random();
    
    private int distpercorrida = 0;
    public ThreadSapo( String nome ) {
    	this.nome = nome;
    }
    
    @Override
    public void run() {
    	while(distpercorrida < distmax) {
    		int pulo = random.nextInt(1, pulomax +1);
    		distpercorrida += pulo;
    		if(distpercorrida > distmax) {
    			distpercorrida = distmax;
    		}
    		System.out.println("O " + nome + " pulou " + pulo + " metros" + " e percorreu " + distpercorrida + " metros");
    	
    		try {
    			Thread.sleep(1500);
    		} catch (Exception e) {
    			System.err.println(e.getMessage());
    		}
    	}
    	int posfinal = colocacao.incrementAndGet();
    	System.out.println("\n" + nome + " chegou em " + posfinal + " lugar!\n");
    }
}
  
   