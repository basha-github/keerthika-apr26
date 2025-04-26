
public class TestResults {
	
	
	static int getRandomNumber(int min,int max){
		
		 int res =min + (int)(Math.random() *
				 ((max - min) + 1));
		 
		 return res;
	}

	public static void main(String[] args) {
		
		
	String[] names = {"Ramu","Abdul" ,"Rajesh","John","Somu","Devi","Anu"};
		
		Student[] stuList = new Student[50];
		
		
		for(int i=0;i<=10;i++) {
			
			stuList[i]= new Student(i,
					names[getRandomNumber(0,names.length-1)],
					getRandomNumber(25000,45000),
					getRandomNumber(0,98));
			
			System.out.println(stuList[i]);
			
		}
		
		
		System.out.println("Only Passed Students");
		System.out.println("--------------------------------------------");
		Results results = new Results();
		
		results.findPassResults(stuList);
		
		
		
	}

}
