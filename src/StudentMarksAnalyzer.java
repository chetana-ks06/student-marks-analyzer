import java.util.Scanner;

public class StudentMarksAnalyzer {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks= new int[5];


        int sum=0;
        double average;
        int highest = marks[0];
        int lowest =  Integer.MAX_VALUE;
        int passed =0;
        int failed=0;
        for(int i=0;i<marks.length;i++){
            System.out.println("enter the marks :");
            marks[i]= sc.nextInt();
            sum=sum+marks[i];

            if(marks[i]>highest){
                highest=marks[i];
            }

            if(marks[i]<lowest){
                lowest=marks[i];
            }
            if(marks[i]>=35){
                passed++;
            }
            if(marks[i]<35){
                failed++;
            }

        }
        System.out.println("Total Marks:" + sum);
        average =(double)sum/marks.length;
        System.out.println("Average: : " + average);
        System.out.println("Highest Mark: :" + highest);
        System.out.println("Lowest Mark : " + lowest );
        System.out.println("Passed Students :" + passed);
        System.out.println("Failed Students:" + failed);
    }

}
