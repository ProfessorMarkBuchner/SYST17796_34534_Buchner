package OnlineAdmissionSystem;

/**
 *
 * @author markb Jan 27 2021
 * Aleksandar Lim was here @ Sheridan College 2021
 */
public class PartTimeStudent extends Patient{
    private int numCourses;
    // This is 

    public PartTimeStudent(int numCourses, String name) {
        super(name);
        this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
}//End Class
