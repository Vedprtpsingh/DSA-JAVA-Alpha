package DSA11Strings;

public class sortestpathjava {
    public static void shortest(String path) {
        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                x+=1;
            }
            else if (path.charAt(i)=='S'){
                x-=1;
            }
            else if (path.charAt(i)=='W'){
                y+=1;
            }
            else if (path.charAt(i)=='E'){
                y-=1;
            }
        }
        int sqr=x*x+y*y;
        double sortestPath=Math.sqrt(sqr);
        System.out.println(sortestPath);
    }
    public static void main(String[] args) {
        String path="NS";
        shortest(path);
    }
}
