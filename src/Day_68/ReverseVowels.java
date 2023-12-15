package Day_68;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char []c=s.toCharArray();
        int n=c.length;
        char[]x=new char[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                x[j]=c[i];
                j++;

            }
        }
        int m=j;
        j=m-1;
        for(int i=0;i<n;i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                c[i]=x[j];
                j--;
            }
        }
        String sb=String.valueOf(c);
        return sb;
    }
}
