package com.java.examples;

//2)To call super class constructors Example
class one{
	int p,q,r;
	
	one(){
		
	}
	
	one(int p, int q, int r){
		this.p = p;
		this.q = q;
		this.r = r;
	}
	
	void add() {
		System.out.println("Class One Add Method:" +(p+q+r));
	}
}

class Two extends one{
	
	//p,q,r ---> extends from class one
	int s,t;
	
	Two(){
		
	}
	Two(int p, int q, int r, int s, int t){
		this.p = p;
		this.q = q;
		this.r = r;
		this.s = s;
		this.t = t;		
	}
	
	void add() {
		super.add();  //// To call super class constructors using super keyword
		System.out.println(("class one super keyword p value is::" + super.p));
		System.out.println(("class one super keyword q value is::" + super.q));
		System.out.println(("class one super keyword r value is::" + super.r));
		System.out.println("Class Two Add Method:" +(p+q+r+s+t));
	}	
}

public class SuperKeywordEx2 {

	public static void main(String[] args) {
		// To call super class constructors

		Two ob = new Two(11,22,33,44,55);
		ob.add();
		
	}

}
