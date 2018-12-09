/** Copyright ESPE-DECC
*/

package cert02grades_management.model;

/**
 *
 * @author edisonlascano
 */
public class GradesStudentSubjectMatter {
    private String grade1;
    private String grade2;
    private String grade3;
    private Student student;
    private SubjectMatter subjectMatter;
    private String average;

    /**
     * @return the grade1
     */
    public String getGrade1() {
        return grade1;
    }

    /**
     * @param grade1 the grade1 to set
     */
    public void setGrade1(String grade1) {
        this.grade1 = grade1;
    }

    /**
     * @return the grade2
     */
    public String getGrade2() {
        return grade2;
    }

    /**
     * @param grade2 the grade2 to set
     */
    public void setGrade2(String grade2) {
        this.grade2 = grade2;
    }

    /**
     * @return the grade3
     */
    public String getGrade3() {
        return grade3;
    }

    /**
     * @param grade3 the grade3 to set
     */
    public void setGrade3(String grade3) {
        this.grade3 = grade3;
    }

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
     * @return the subjectMatter
     */
    public SubjectMatter getSubjectMatter() {
        return subjectMatter;
    }

    /**
     * @param subjectMatter the subjectMatter to set
     */
    public void setSubjectMatter(SubjectMatter subjectMatter) {
        this.subjectMatter = subjectMatter;
    }

    /**
     * @return the average
     */
    public String getAverage() {
        return average;
    }

    /**
     * @param average the average to set
     */
    public void setAverage(String average) {
        this.average = average;
    }


}
