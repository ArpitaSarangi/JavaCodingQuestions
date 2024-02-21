import java.util.ArrayList;

public class P1 {

	public static void main(String[] args) {
		//Names=[Arpita,Dena,Shek,Umar]	 
		// Names=[Arpitha,Dena,Shek,Mar]
		
		// Find the duplicates in 2 pages
		ArrayList<String> firstPage = new ArrayList<String>();
		firstPage.add("Arpita");
		firstPage.add("Dena");
		firstPage.add("Shek");
		firstPage.add("Umar");

		ArrayList<String> secondPage = new ArrayList<String>();
		secondPage.add("Arpitha");
		secondPage.add("Dena");
		secondPage.add("Shek");
		secondPage.add("Mar");
		

		int count = 0;

		for (int i = 0; i < firstPage.size(); i++) {
			for (int j = 0; j < secondPage.size(); j++) {

				if ((firstPage.get(i)).contains(secondPage.get(j))) {
					System.out.println("Duplicates words are: " + firstPage.get(i));
					count++;
				}

			}
		}

	}

}
