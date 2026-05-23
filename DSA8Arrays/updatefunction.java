package DSA8Arrays;

public class  updatefunction {
    public static void update(int marks[]) {
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int markess[]={994,43,65};
        update(markess);
        System.out.println("hello");
        System.out.println(markess[0]);
        for(int i=0;i<markess.length;i++){
            System.out.print(markess[i]+" ");
        }
    }
}
