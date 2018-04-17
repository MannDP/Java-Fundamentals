package studentGrades;

//instead of hardcode, use final MAX_COURSES
public class gradesSource {

    private String name;
    private String address;

    private String[] courses;
    private int[] gradesArray;

    private int numCourses;
    public static final int MAX_COURSES = 30;

    public gradesSource(String name, String address) {
        this.name = name;
        this.address = address;

        this.courses = new String[MAX_COURSES];
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


}
