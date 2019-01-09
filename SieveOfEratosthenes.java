package sieveoferatosthenes;

import java.util.*;

public class SieveOfEratosthenes {

	private int n;

	public SieveOfEratosthenes(int n) {
    	this.n = n;
	}

	public int getN(int n) {
    	return n;
	}

	public Queue<Integer> fill(int n) {
    	Queue q = new LinkedList();
    	for (int i = 2; i <= n; i++) {
        	q.add(i);
    	}
    	return q;
	}

	public Queue<Integer> EratosthenesSieve(int n, Queue<Integer> q1) {
    	int nRoot = (int) Math.sqrt(n);
    	boolean[] isComposite = new boolean[n + 1];
    	for (int i = 2; i <= nRoot; i++) {
        	if (!isComposite[i]) {
            	for (int k = i * i; k <= n; k += i) {
                	isComposite[k] = true;
            	}
        	}
    	}
    	Queue<Integer> q2 = new LinkedList();
    	while (!q1.isEmpty()) {
        	int current = q1.remove();
            	if (isComposite[current] == false) {
                	System.out.println(current);
        	}
    	}
    	return q2;
	}

	public void print(Queue<Integer> q) {
    	while (!q.isEmpty()) {
        	System.out.print(q.remove());
    	}
	}
}


