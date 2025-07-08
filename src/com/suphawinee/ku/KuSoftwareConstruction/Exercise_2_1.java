package src.com.suphawinee.ku.KuSoftwareConstruction;

import java.util.Scanner;

public class Exercise_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Total Score: ");
        double scoreTotal = in.nextDouble();
        System.out.print("Exam Score(mid+final): ");
        double scoreExam = in.nextDouble();
        System.out.print("Project Status (true:finish / false:unfinish): ");
        boolean projectStatus = in.nextBoolean();
        System.out.print("Absent: ");
        int numAbsent = in.nextInt();
        System.out.println("Your grade: " + getGrade(scoreTotal, scoreExam,
                projectStatus, numAbsent));
    }

    public static String getGrade(double scoreTotal, double scoreExam,
                                  boolean projectStatus, int numAbsent) {
        if(numAbsent > 3) {
            return "F";
        } else if(scoreExam < 35 * 0.4) {
            return "F";
        } else if(!projectStatus) {
            return "I";
        } else {
            if     (scoreTotal >= 80)   return "A";
            else if(scoreTotal >= 75)   return "B+";
            else if(scoreTotal >= 70)   return "B";
            else if(scoreTotal >= 65)   return "C+";
            else if(scoreTotal >= 60)   return "C";
            else if(scoreTotal >= 55)   return "D+";
            else if(scoreTotal >= 50)   return "D";
            else                        return "F";
        }
    }
}

/*
1. ขำดเรียนไม่เกิน 3 ครั้ง หำกขำดเกินได้เกรด F
2. ต้องมีคะแนนสอบรวมกลำงภำคและปลำยภำคอย่ำงต่ำ 40 %หำกคะแนนสอบรวมไม่ถึง 40 %จะได้เกรด Fแม้ว่ำคะแนนรวมทั้งหมดจะ >=50%ก็ตำม
3. สถำนะของกำรทำโปรเจคต้องเสร็จสมบูรณ์หำกโปรเจคไม่สมบูรณ์ จะได้เกรด I
 */