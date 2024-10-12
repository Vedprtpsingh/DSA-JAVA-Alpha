import java.util.PriorityQueue;

public class impOfPQ {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank) { // constructor should not have a return type
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        } 
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 6));
        pq.add(new Student("D", 5));
        
        while (!pq.isEmpty()) {
            Student student = pq.poll(); // use poll() instead of peek() and remove()
            System.out.println(student.name + " -> " + student.rank + " ");
        }
    }
}