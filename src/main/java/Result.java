import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        if (grades.get(0)>60 || grades.get(0)<=0){
            return new ArrayList<>();
        }

        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i)>= 0 && grades.get(i)<= 100)
            if (grades.get(i) >= 38) {
                if ((grades.get(i) + 1) % 5 == 0) {
                    result.add(grades.get(i) + 1);
                } else if ((grades.get(i) + 2) % 5 == 0) {
                    result.add(grades.get(i) + 2);
                } else {
                    result.add(grades.get(i));
                }
            } else {
                result.add(grades.get(i));
            }
            else {
                result.add(null);
        }
        }
        return result;
    }
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            int student = scan.nextInt();
            List<Integer> grades = new ArrayList<>(student) {
            };
            for (int i = 0; i < student; i++) {
                int stud = scan.nextInt();
                grades.add(stud);
            }
            gradingStudents(grades);
            for (int a = 0; a < grades.size(); a++) {
                System.out.println(grades.get(a));
            }
        }
    }