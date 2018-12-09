/** Copyright ESPE-DECC
*/

package cert02grades_management.model;

/**
 *
 * @author edisonlascano
 */
public class FacultySubjectmatter {
    private SubjectMatter subjectmatter;
    private Faculty faculty;

    /**
     * @return the subjectmatter
     */
    public SubjectMatter getSubjectmatter() {
        return subjectmatter;
    }

    /**
     * @param subjectmatter the subjectmatter to set
     */
    public void setSubjectmatter(SubjectMatter subjectmatter) {
        this.subjectmatter = subjectmatter;
    }

    /**
     * @return the faculty
     */
    public Faculty getFaculty() {
        return faculty;
    }

    /**
     * @param faculty the faculty to set
     */
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

}
