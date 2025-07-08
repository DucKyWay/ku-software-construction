package src.com.suphawinee.ku.KuSoftwareConstruction;

import java.util.Scanner;

public class KuSoftwareConstructionMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome");
		
		int i = 0;
		double d = i + 0 + 1L;
		System.out.print(d);
		
		System.out.println();
	}

}

/*
จงเขียนโปรแกรมสำหรับกำรตัดเกรด โดยรับ input จำก user เป็นคะแนนรวม % (ทศนิยม 0-100)และตัดเกรดอิงเกณฑ์และมีเงื่อนไขเพิ่มเติมดังปรำกฏในตำรำงด้ำนล่ำง
*ทั้งนี้กำรออกเกรดจะมีข้อพิจำรณำเพิ่มเติมดังนี้
1. ขำดเรียนไม่เกิน 3 ครั้ง หำกขำดเกินได้เกรด F
2. ต้องมีคะแนนสอบรวมกลำงภำคและปลำยภำคอย่ำงต่ำ 40 %หำกคะแนนสอบรวมไม่ถึง 40 %จะได้เกรด Fแม้ว่ำคะแนนรวมทั้งหมดจะ >=50%ก็ตำม
3. สถำนะของกำรทำโปรเจคต้องเสร็จสมบูรณ์หำกโปรเจคไม่สมบูรณ์ จะได้เกรด I

คะแนนรวม:
- คะแนนรวม (100)
- คะแนนสอบกลาง + ปลายภาค (35)
- จานวนครั้งขาดเรียน
- สถานการณ์ทาโปรเจค(true/false)

 */