
public class P2 {
	/*static int a=10;
    public void m1(){
           a=11;
           //System.out.println(a);
       }
	
       */
	public static void main(String[] args) {
	     /* P2 w=new P2();
	      System.out.println(a);
	      w.m1();
	      System.out.println(a);
	      */
		
		String str="Welcome to InfoVision Family";
		
		//Output : Family InfoVision To Welcome";
		
		String[] newOne=str.split(" ");
		
		System.out.println("Count of the words in this string : "+newOne.length);
		
		String rev="";
		
		for(int i=0;i<newOne.length;i++) {
			rev=rev+" "+newOne[newOne.length-1-i];
		}
		System.out.println(rev);
	}

}
