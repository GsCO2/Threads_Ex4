package view;
import controller.ThreadSapo;

public class Main {
	public static void main(String[] args) {
		String[] sapos = new String[5];

        for (int i = 0; i < 5; i++) {
            sapos[i] = ("Sapo " + (i + 1)); 
        }
        
        for (String sapo : sapos) {
        	ThreadSapo thread = new ThreadSapo(sapo);
        	thread.start(); 
        }
    }
}

