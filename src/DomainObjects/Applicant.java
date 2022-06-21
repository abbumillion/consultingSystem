package DomainObjects;

import java.io.File;

public class Applicant extends User {

    private final String educationLevel;
    private final File resume;
    private final SkillCategory skillCategory;

    public Applicant(ApplicantBuilder applicantBuilder) {

        this.resume = applicantBuilder.resume;
        this.educationLevel = applicantBuilder.educationLevel;
        this.skillCategory = applicantBuilder.skillcategory;
        this.setAddress(applicantBuilder.getAddress());
        this.setFirstName(applicantBuilder.getFirstName());
        this.setLastName(applicantBuilder.getLastName());
        this.setGender(applicantBuilder.getGender());
        this.setEmail(applicantBuilder.getEmail());
        this.setId(applicantBuilder.getId());
        this.setUserName(applicantBuilder.getUserName());
        this.setPassword(applicantBuilder.getPassword());
        this.setRole(applicantBuilder.getRole());
        this.setDateOfBirth(applicantBuilder.getDateOfBirth());
        this.setCellPhone(applicantBuilder.getCellPhone());

    }

    public static class ApplicantBuilder extends User {

        private String educationLevel;
        private File resume;
        private SkillCategory skillcategory;

        public Applicant build() {
            return new Applicant(this);
        }

        public ApplicantBuilder id(int value) {
            this.setId(value);
            return this;
        }

        public ApplicantBuilder FirstName(String value) {
            this.setFirstName(value);
            return this;
        }

        public ApplicantBuilder LastName(String value) {
            this.setLastName(value);
            return this;
        }

        public ApplicantBuilder Gender(String value) {
            this.setGender(value);
            return this;
        }

        public ApplicantBuilder Email(String value) {
            this.setEmail(value);
            return this;
        }

        public ApplicantBuilder PhoneNumber(String value) {
            this.setCellPhone(value);
            return this;
        }

        public ApplicantBuilder DateOfBirth(String value) {
            this.setDateOfBirth(value);
            return this;
        }


        public ApplicantBuilder UserRole(String value) {
            this.setRole(value);
            return this;
        }

        public ApplicantBuilder UserName(String value) {
            this.setUserName(value);
            return this;
        }

        public ApplicantBuilder Password(String value) {
            this.setPassword(value);
            return this;
        }

        public ApplicantBuilder Address(Address value) {
            this.setAddress(value);
            return this;
        }

        public ApplicantBuilder Resume(File value) {
            this.resume = value;
            return this;
        }

        public ApplicantBuilder EduactionLevel(String value) {
            this.educationLevel = value;
            return this;
        }

        public ApplicantBuilder SkillCategory(SkillCategory value) {
            this.skillcategory = value;
            return this;
        }

    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public File getResume() {
        return resume;
    }

    public SkillCategory getSkillCategory() {
        return skillCategory;
    }

}
