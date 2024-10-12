public class dublicatestring {
    public static void removeDupliates(String str,int inx,StringBuilder newStr,boolean map[]) {
        if(inx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(inx);
        if(map[currChar-'a']==true){
            removeDupliates(str, inx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDupliates(str, inx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str="appnnacollege";
        removeDupliates(str, 0,new StringBuilder("") , new boolean[26]);
    }
}
