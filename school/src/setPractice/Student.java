package setPractice;

import list.Member;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	
	 @Override
	 public int hashCode() {
		 return studentNum;
		 //student 해쉬코드를 반환한다 : 객체를 저장하고 검색할때 사용
	}
	 @Override
	 public boolean equals(Object obj) {
		 //두 객체가 같은지 비교하는것
		 if(!(obj instanceof Student)) 
			 return false;
		 //주어진 객체 obj가 Student 의 인스턴스가 아니라면 false를 반환
		 //타입 검사를 통해 잘못 검사를 방지

		 Student student = (Student) obj;
		 //obj를 student 타입으로 캐스팅 한다
		 	if(studentNum != student.studentNum) 
		 		return false;
		 	//두 객체의 학번이 다르면 false 반환
		 		return true;
		 	//두 객체의 학번이 같다면 true를 반환	
			}
			
		}
