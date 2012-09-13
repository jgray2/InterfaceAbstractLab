
package lab1;


public class StartUp {
    public static void main(String[] args) {
        
        IntroToProgrammingCourse ITP1 = new IntroToProgrammingCourse();
        ITP1.setCredits(2);
        
        IntroJavaCourse IJC1 = new IntroJavaCourse("Intro to Java","100111");
        IJC1.setPrerequisites("Intro to Programming");
        IJC1.setCredits(4);
        
        AdvancedJavaCourse AJC1 = new AdvancedJavaCourse("AdvancedJava", 
                "100112");
        AJC1.setPrerequisites("Intro to Java");
        AJC1.setCredits(4);
    }
}
