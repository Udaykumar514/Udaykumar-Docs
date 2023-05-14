package com.uday.conditonalstmtsExamples;

public class SelectionStatementsExample {

	public static void main(String[] args) {
	
		// Selection statements or conditional statements like (if. else, switch)
		
		//if-condition
		int a = 10;		
		if (a == 5) {  
			System.out.println("A value is Equal to 5 :" + a);
		}
		
		if (a == 5) {												//if-condition
			System.out.println("A value is Equal to 5 :" + a);
		}else {														//else-condition
			System.out.println("A value is Not Equal to 5 the value is:" + a);
		}
		
		System.out.println("===================if-else=====================");
		System.out.println("");
		
		//if-else-if		
		if (a == 5) {												//if-condition
			System.out.println("A value is Equal to 5 :" + a);
		}
		else if(a==7){												//else -if-condition
			System.out.println("A value is Equal to 7 :" + a);
		}
		else if(a==9){												//else-if-condition
			System.out.println("A value is Equal to 9 :" + a);
		}
		else														//else-condition
		{
			System.out.println("A value is Not matching in all conditions");
		}
		System.out.println("==================if-else-if==================");
		System.out.println("");
		
		//Switch case Expressions
		int b=10;
		switch(b) {			//switch expression
		
		case  0 : System.out.println("b is Equal to 0");
				break;
				
		case  5 : System.out.println("b is Equal to  5");
				break;
				
		case  10 : System.out.println("b is Equal to 10");
				break;
		
		default:
			System.out.println("The Not Matching All above conditions it is defalut case");
		}
		System.out.println("==================switch==================");
		
	}

}
