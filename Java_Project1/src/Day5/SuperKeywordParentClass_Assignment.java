package Day5;

public class SuperKeywordParentClass_Assignment {
	
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
	
	public SuperKeywordParentClass_Assignment(){
		this(1,2,3,4);
		
		System.out.println("Default Constructor Parent Class");
			
		}
		public SuperKeywordParentClass_Assignment(int a){
			this(1,2,3);
			
		System.out.println("1 Parametrized Constructor  Parent Class");
				
			}
		public SuperKeywordParentClass_Assignment(int a, int b){
			this(1);
			
			System.out.println("2 Parametrized Constructor  Parent Class");
					
				}
		public SuperKeywordParentClass_Assignment(int a, int b,int c){
			this();
			
			System.out.println("3 Parametrized Constructor  Parent Class");
					
				}
		public SuperKeywordParentClass_Assignment(int a, int b,int c,int d){
			System.out.println("4 Parametrized Constructor  Parent Class");
					
				}

	

}
