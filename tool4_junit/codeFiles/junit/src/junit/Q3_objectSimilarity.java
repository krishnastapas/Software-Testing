package junit;

public class Q3_objectSimilarity {
 
}

//Class 1
class department {
	private String name;

	
	 public department(String name) {
	     this.name = name;
	 }

	 
	 public String getName() {
	     return name;
	 }
}

//Class 2
class subject {
	private String name;

	 
	 public subject(String name) {
	     this.name = name;
	 }

	
	 public String getName() {
	     return name;
	 }
}

//Class 3

class book {
	private String name;
	private double price;

	public book(String name, double price) {
	   this.name = name;
	   this.price = price;
	}

	public String getName() {
	   return name;
	}

	public double getPrice() {
	   return price;
	}
}

//Class 4
class student {
	private String name;


	public student(String name) {
	   this.name = name;
	}

		public String getTitle() {
	   return name;
	}
}

//class 5
class  result {
	private double cgpa;


	public result(double cgpa) {
	   this.cgpa = cgpa;

	}


	public double getresult() {
	   return cgpa;
	}


}








