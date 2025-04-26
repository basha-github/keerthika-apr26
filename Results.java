
public class Results {

	public void findPassResults(Student[] stuList) {
		
		Student eachStu = null;
		
		for(int i=0;i<stuList.length-1;i++) {
			
			eachStu = stuList[i];
			if( (eachStu != null)  && (eachStu.getMaks() > 35)) {
				System.out.println(eachStu);
			}
		}
		
		
	}

}
