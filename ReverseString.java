import java.lang.String;
public class ReverseString { 
    public static String reverse(String str){
        String st[]=str.split(" ");  
        String res="";
        for(int i=st.length-1;i>=0;i--) {
            res+=(st[i]+" ");
        }  
       return res;
      }
    public static void main(String[] args) {
        String str="vivek sahu welcome in Bhopal"; 
        System.out.println(reverse(str));
    }
}
