package junit;

import java.util.ArrayList;

public class Q5_list {
	 private ArrayList<Integer> items;

	    public Q5_list() {
	        this.items = new ArrayList<Integer>();
	    }

	    public boolean find(int key) {
	        return items.contains(key);
	    }

	    public void insert(int data) {
	        items.add(data);
	    }
}
