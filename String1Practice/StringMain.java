package String1Practice;
public class StringMain {

  static void search(String str, String pat){
   
	for(int i=0;i<str.length()-pat.length()+1;i++){
        if(str.substring(i,i+pat.length()).equals(pat)){
            System.out.print(i+" ");
    }
    }
  }
      static void patSearch(String txt, String pat) {
    	  int pos = txt.indexOf(pat);
    	  while(pos>=0) {
    		  System.out.println(pos + " ");
    		  pos = txt.indexOf(pat, pos +1);
    	  }
      }
      
      static String digitAfterDecimal(String no)
      {
          int pos = no.indexOf('.');
          
          if(pos<0)
          {
              return "";
          }
          else
          {
              return no.substring(pos+1);
          }
      }
      
      static boolean palindrome(String s) {
    	  int start =0;
    	   int end=s.length()-1;
    	   while(start<end){
    	       
    	       if(s.charAt(start)!=s.charAt(end)){
    	           return false;
    	           
    	       }
    	       start++;
    	       end--;
    	   }
    	   return true;
    	   
      }
      
  public static void main(String args[]){
//    String pat="AABAACAADAABAAABAA";
//    String txt="AABA";
//    search(pat,txt);
	  
//	  String txt = "geeks for geeks";
//	  String pat = "geeks";
//	  patSearch(txt, pat);
	  
//    String no = "12.385";
//    System.out.println(digitAfterDecimal(no));
    
    String s = "aabcdcbaa";
    System.out.println(palindrome(s));	  
  }
}