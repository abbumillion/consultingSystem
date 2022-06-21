package DomainObjects;

public class JobApplication {
    private final int id;
    private final Applicant applicant;
    private final Job job;
    private final Boolean accepted;

    public JobApplication(JobApplicationBuilder jobApplicationBuilder) {
        this.accepted = jobApplicationBuilder.accepted;
        this.applicant = jobApplicationBuilder.applicant;
        this.id = jobApplicationBuilder.id;
        this.job = jobApplicationBuilder.job;
    }

    public static class JobApplicationBuilder {

        private int id;
        private Applicant applicant;
        private Job job;
        private Boolean accepted;

        public JobApplicationBuilder() {

        }

        public JobApplication build() {
            return new JobApplication(this);
        }

        public JobApplicationBuilder ID(int id) {
            this.id = id;
            return this;
        }

        public JobApplicationBuilder Job(Job job) {
            this.job = job;
            return this;
        }

        public JobApplicationBuilder Applicant(Applicant applicant) {
            this.applicant = applicant;
            return this;
        }

        public JobApplicationBuilder Accepted(Boolean accepted) {
            this.accepted = accepted;
            return this;
        }

    }

    public int getId() {
        return id;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public Job getJob() {
        return job;
    }

    public Boolean getAccepted() {
        return accepted;
    }

}
