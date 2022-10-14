package Java.Searching.Linear_Search;

public class SearchInString {
    public static void main(String[] args) {
        String str="aayush";
        char tar='u';
        System.out.println("Character is present in string? " + search2(str,tar));
    }


    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char a:str.toCharArray()){
            if(a==target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
