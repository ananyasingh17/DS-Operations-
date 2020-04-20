package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	    Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>(); 
	    int curr_size; 
	  
	    public StackUsingQueue() 
	    { 
	        curr_size = 0; 
	    } 
	  
	    void remove() 
	    { 
	        if (q1.isEmpty()) 
	            return; 
	  
	        while (q1.size() != 1) { 
	            q2.add(q1.peek()); 
	            q1.remove(); 
	        } 
	  
	        q1.remove(); 
	        curr_size--; 
	  
	        Queue<Integer> q = q1; 
	        q1 = q2; 
	        q2 = q; 
	    } 
	  
	    void add(int x) 
	    { 
	        q1.add(x); 
	        curr_size++; 
	    } 
	  
	    int top() 
	    { 
	        if (q1.isEmpty()) 
	            return -1; 
	  
	        while (q1.size() != 1) { 
	            q2.add(q1.peek()); 
	            q1.remove(); 
	        } 
	  
	        int temp = q1.peek(); 
	  
	        q1.remove(); 
	        q2.add(temp); 
	  
	        Queue<Integer> q = q1; 
	        q1 = q2; 
	        q2 = q; 
	        return temp; 
	    } 
	  
	    int size() 
	    { 
	        return curr_size; 
	    } 
	  
	    
	    public static void main(String[] args) 
	    { 
	    	StackUsingQueue s = new StackUsingQueue(); 
	        s.add(14); 
	        s.add(72); 
	        s.add(34); 
	        s.add(42); 
	  
	        System.out.println("current size: " + s.size()); 
	        System.out.println(s.top()); 
	        s.remove(); 
	        System.out.println(s.top()); 
	        s.remove(); 
	        System.out.println(s.top()); 
	        System.out.println("current size: " + s.size()); 
	    } 
} 

