package chap01_class_and_data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* 문제: 학생 정보 출력 프로그램 만들기 당신은 두 명의 학생 정보를 출력하는 프로그램을 작성해야 한다. 각 학생은 이름, 나이, 성적을 가지고 있다.

요구 사항:
1. 첫 번째 학생의 이름은 "학생1", 나이는 15, 성적은 90입니다.
2. 두 번째 학생의 이름은 "학생2", 나이는 16, 성적은 80입니다.
3. 각 학생의 정보를 다음과 같은 형식으로 출력해야 합니다: "이름: [이름] 나이: [나이] 성적: [성적]"
4. 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해야 합니다.
*
* */
public class ClassStart1 {
    public static void main(String[] args) {
        String name1= "학생1";
        int age1 = 15;
        int subject1 = 90;

        String name2= "학생2";
        int age2 = 16;
        int subject2 = 80;

        System.out.println("==========================변수==============================");

        System.out.println("이름: " + name1 + " 나이: " + age1 + " 성적: " + subject1);
        System.out.println("이름: " + name2 + " 나이: " + age2 + " 성적: " + subject2);
        System.out.println("========================================================");

        //배열에 담아서 사용하기
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        System.out.println("===========================배열=============================");
        for(int i = 0; i < studentNames.length; i++){
            System.out.println("이름:" + studentNames[i] + " 나이:" +
                    studentAges[i] + " 성적:" + studentGrades[i]);
        }
        System.out.println("========================================================");

        System.out.println("================클래스 활용=================");
        Person person = new Person();
        person.information("학생1",15,90);
        person.information("학생2",16,80);
        System.out.println("========================================================");
    }
}
class Person {
    String name;
    int age;
    int subject;

    public String information(String name, int age, int subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;

        String result = "이름: " + name + " 나이: " + age + " 성적: " + subject;
        System.out.println(result);
        return result;
    }
}
