package DomainObjects;

public class Job {

    private final int JobId;
    private final int NumberOfVacancies, ExperianceReq;
    private final String JobDescription, EducationalLevel, JobTitle, StartDate, EndDate, Gender, Salary;
    private final Company EmployerCompany;
    private final Skill requiredSkills;

    public Job(JobBuilder jobBuilder) {
        this.EmployerCompany = jobBuilder.EmployerCompany;
        this.EndDate = jobBuilder.EndDate;
        this.ExperianceReq = jobBuilder.ExperianceReq;
        this.Gender = jobBuilder.Gender;
        this.JobDescription = jobBuilder.JobDescription;
        this.JobId = jobBuilder.JobId;
        this.JobTitle = jobBuilder.JobTitle;
        this.NumberOfVacancies = jobBuilder.NumberOfVacancies;
        this.EducationalLevel = jobBuilder.EducationalLevel;
        this.requiredSkills = jobBuilder.requiredSkills;
        this.StartDate = jobBuilder.StartDate;
        this.Salary = jobBuilder.Salary;
    }

    public static class JobBuilder {

        private int JobId, ExperianceReq, NumberOfVacancies;
        private String StartDate, EndDate, Gender, JobTitle, JobDescription, EducationalLevel, Salary;
        private Company EmployerCompany;
        private Skill requiredSkills;

        public Job build() {
            return new Job(this);
        }

        public JobBuilder JobId(int id) {
            this.JobId = id;
            return this;
        }

        public JobBuilder JobDescription(String desc) {
            this.JobDescription = desc;
            return this;
        }

        public JobBuilder EmployerCompany(Company value) {
            this.EmployerCompany = value;
            return this;
        }

        public JobBuilder EducationalLevel(String value) {
            this.EducationalLevel = value;
            return this;
        }

        public JobBuilder requiredSkills(Skill value) {
            this.requiredSkills = value;
            return this;
        }

        public JobBuilder ExperianceReq(int value) {
            this.ExperianceReq = value;
            return this;
        }

        public JobBuilder StartDate(String value) {
            this.StartDate = value;
            return this;
        }

        public JobBuilder EndDate(String value) {
            this.EndDate = value;
            return this;
        }

        public JobBuilder Gender(String value) {
            this.Gender = value;
            return this;
        }

        public JobBuilder JobTitle(String value) {
            this.JobTitle = value;
            return this;
        }
        public JobBuilder Salary(String value) {
            this.Salary = value;
            return this;
        }

    }

    public int getJobId() {
        return JobId;
    }

    public String getJobDescription() {
        return JobDescription;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public Company getEmployerCompany() {
        return EmployerCompany;
    }

    public String getEducationalLevel() {
        return EducationalLevel;
    }

    public Skill getRequiredSkills() {
        return requiredSkills;
    }

    public int getExperianceReq() {
        return ExperianceReq;
    }

    public String getStartDate() {
        return StartDate;
    }

    public String getEndDate() {
        return EndDate;
    }
    public Integer getNumberOfVacancies() {
        return NumberOfVacancies;
    }

    public String getGender() {
        return Gender;
    }

    public String getSalary() {
        return Salary;
    }

}
