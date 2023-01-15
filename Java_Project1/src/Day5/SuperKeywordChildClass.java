package Day5;

public class SuperKeywordChildClass extends SuperKeywordParentClass {
	
	public SuperKeywordChildClass(){
		System.out.println("Default Constructor Child Class");
			
		}
		public SuperKeywordChildClass(int a){
		System.out.println("1 Parametrized Constructor Child Class");
				
			}
		public SuperKeywordChildClass(int a, int b){
			super(1);
			System.out.println("2 Parametrized Constructor Child Class");
					
				}
		public SuperKeywordChildClass(int a, int b,int c){
			System.out.println("3 Parametrized Constructor Child Class");
					
				}

	public static void main(String[] args) {
		SuperKeywordChildClass obj=new SuperKeywordChildClass(1,2);	

	}

}
