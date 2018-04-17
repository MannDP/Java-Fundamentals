package studentGrades;

public class studentGradeImplement {
    public static void main(String[] args) {
        gradesSource mannCourse = new gradesSource("Mann", "248C Grosbeak Way");
        mannCourse.addCourseGrade("ECE150", 95);
        mannCourse.addCourseGrade("CHE102", 93);
        mannCourse.addCourseGrade("ECE105", 85);
        mannCourse.addCourseGrade("MATH117", 93);
        mannCourse.addCourseGrade("MATH115", 91);
        //mannCourse.addCourseGrade("ECE101", 400);

        System.out.println(mannCourse.toString());
        //mannCourse.setAdress("Waterloo, Ontario");
        //System.out.println(mannCourse.toString());
        mannCourse.printGrades();
        System.out.println(mannCourse.getAverageGrade());
    }
}