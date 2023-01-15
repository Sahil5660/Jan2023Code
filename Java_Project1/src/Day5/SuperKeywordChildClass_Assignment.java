package Day5;

public class SuperKeywordChildClass_Assignment extends SuperKeywordParentClass_Assignment {
	//4 Parametrized Constructor  Parent Class
		//Default Constructor Parent Class
		//3 Parametrized Constructor  Parent Class
		//1 Parametrized Constructor  Parent Class
		//2 Parametrized Constructor  Parent Class
		//Default Constructor Child Class
		//1 Parametrized Constructor Child Class
		//3 Parametrized Constructor Child Class
		//2 Parametrized Constructor Child Class
		//4 Parametrized Constructor Child Class
	
	public SuperKeywordChildClass_Assignment(){
		super(1,2);
		
		System.out.println("Default Constructor Child Class");
			
		}
		public SuperKeywordChildClass_Assignment(int a){
			this();
			
		System.out.println("1 Parametrized Constructor Child Class");
				
			}
		public SuperKeywordChildClass_Assignment(int a, int b){
			this(1,2,3);
			
			System.out.println("2 Parametrized Constructor Child Class");
					
				}
		public SuperKeywordChildClass_Assignment(int a, int b,int c){
			this(1);
			
			System.out.println("3 Parametrized Constructor Child Class");
					
				}
		public SuperKeywordChildClass_Assignment(int a,int b,int c,int d){
			this(1,2);
			System.out.println("4 Parametrized Constructor Child Class");
					
				}

	public static void main(String[] args) {
		SuperKeywordChildClass_Assignment obj=new SuperKeywordChildClass_Assignment(1,2,3,4);

	}

}
