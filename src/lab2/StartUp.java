
package lab2;

public class StartUp {
       public static void main(String[] args) {
        
        lab1.IntroToProgrammingCourse ITP1 = new lab1.IntroToProgrammingCourse();
        ITP1.setCredits(2);
        
        lab1.IntroJavaCourse IJC1 = new lab1.IntroJavaCourse("Intro to Java","100111");
        IJC1.setPrerequisites("Intro to Programming");
        IJC1.setCredits(4);
        
        lab1.AdvancedJavaCourse AJC1 = new lab1.AdvancedJavaCourse("AdvancedJava", 
                "100112");
        AJC1.setPrerequisites("Intro to Java");
        AJC1.setCredits(4);
    }
}
