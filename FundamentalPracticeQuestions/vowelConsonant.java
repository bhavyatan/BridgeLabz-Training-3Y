public class vowelConsonant {
    public static void main(String[] args) {
        String str="Hello";
        int vCount=0,cCount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                vCount++;
            }
            else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                cCount++;
            }
        }
        System.out.println("Vowels: "+vCount);
        System.out.println("Consonants: "+cCount);
    }
}
