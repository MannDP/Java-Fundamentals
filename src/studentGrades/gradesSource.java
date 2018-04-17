package studentGrades;

public class gradesSource {

    private String name;
    private String address;

    private String[] coursesArray;
    private int[] gradesArray;

    private int numCourses;
    public static final int MAX_COURSES = 30;

    public gradesSource(String name, String address) {
        this.name = name;
        this.address = address;

        this.coursesArray = new String[MAX_COURSES];
        this.gradesArray = new int[MAX_COURSES];
        this.numCourses = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAdress(String newAddress) {
        this.address = newAddress;
    }

    public String toString() {
        String returnString = this.getName() + "(" + this.getAddress() + ")";
        return returnString;
    }

    public void addCourseGrade(String courseName, int courseGrade) {
        if (courseGrade >= 0 && courseGrade <= 100) {
            this.coursesArray[numCourses] = courseName;
            this.gradesArray[numCourses] = courseGrade;
            ++this.numCourses;
        }

        else {
            throw new IllegalArgumentException("invalid grade entered!");
        }
    }

    public void printGrades() {
        for (int i = 0; i < this.numCourses; i++) {
            System.out.println(this.coursesArray[i] + ":" + this.gradesArray[i]);
        }
    }

    public double getAverageGrade() {
        double sumGrades = 0;

        for (int i = 0; i < this.numCourses; i++) {
            sumGrades += this.gradesArray[i];
        }

        sumGrades = sumGrades/(this.numCourses);
        return sumGrades;
    }
}
