/** Copyright ESPE-DECC
*/

package cert02grades_management.model;

/**
 *
 * @author edisonlascano
 */
public class Registration {
    private Student student;
    private Classroom classroom;
    private String registrationNumber;

    /**
     * @return the student
     */
    public Student getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * @return the classroom
     */
    public Classroom getClassroom() {
        return classroom;
    }

    /**
     * @param classroom the classroom to set
     */
    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    /**
     * @return the registrationNumber
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * @param registrationNumber the registrationNumber to set
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
