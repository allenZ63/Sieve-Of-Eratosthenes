package sieveoferatosthenes;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
    	int n = 100;
    	SieveOfEratosthenes s = new SieveOfEratosthenes(n);
    	Queue<Integer> q1 = s.fill(n);
    	Queue<Integer> q2 = s.EratosthenesSieve(n, q1);
    	s.print(q2);
	}
}


