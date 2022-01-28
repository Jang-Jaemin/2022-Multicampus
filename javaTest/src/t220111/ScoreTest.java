package t220111;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
	String name;
	int kor, eng, mat, sum, avg;
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = this.kor + this.eng + this.mat;
		avg = sum / 3;
	}

	@Override
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + mat + "\t" + sum + "\t" + avg;
	}
}

public class ScoreTest {

	public static void main(String[] args) throws IOException {
		/* 1. 키보드 + SCANNER 
		 *  이름 : 이학생
		 *  국어 : 100
		 *  영어 : 90
		 *  수학 : 80
		 * ==> 3명 학생 반복
		 * ==> Studnet 클래스 정의 ( name kor eng mat  sum avg 인스턴스변수 6개 - setter/getter , 생성자, ....)  저장
		 * ==> ArrayList<Student> 생성 3개 객체 저장
		 * ==> 3명 학생당 총점, 평균 계산하여 sum, avg 저장
		 * ===> 현재프로젝트 내의 scores.dat 파일 생성 각 학생이름앞 라인번호 , 학생정보들 저장
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> list = new ArrayList(3);
		FileWriter fw = new FileWriter("scores.dat", true);
		
		for(int i = 1; i <= 1; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int mat = sc.nextInt();			
			
			Student st = new Student(name, kor, eng, mat);
			list.add(st);
		}
		// 키보드에 3명의 학생 정보 입력
		
		// 1등 학생의 모든정보 출력하기 - 평균값 높으면 1등
		int firstAvg = 0;
		
		Student firstStu = null;
		for(Student st : list) {
			if(st.avg > firstAvg) {
				firstAvg = st.avg;
				firstStu = st;
			}
		}
		System.out.println(firstAvg);	// 1등 학생 평균
		
		// list 내에 저장된 학생 정보 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			// scores.dat 으로 파일 저장
			fw.write((i+1) + "\t" + list.get(i) + "\n");
		}
		fw.close();
		
	}
	
}

/*
test/scores.dat 파일
1 이학생 100 90 80 총점 평균
2 .......
3 ....... 
*/
