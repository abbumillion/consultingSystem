package DomainObjects;
public class Interview {
    //interview data class bean in java
    private final int InterviewId;
    private final String interviewDateAndTime, interviewType;
    private final JobApplication jobApplication;
    private final Address address;
    //
    public Interview(InterviewBuilder interviewBuilder) {
        this.InterviewId = interviewBuilder.InterviewId;
        this.interviewDateAndTime = interviewBuilder.interviewDateAndTime;
        this.interviewType = interviewBuilder.interviewType;
        this.jobApplication = interviewBuilder.jobApplication;
        this.address = interviewBuilder.address;
    }

    public static class InterviewBuilder {

        private int InterviewId;
        private String interviewDateAndTime, interviewType;
        private JobApplication jobApplication;
        private Address address;
        public Interview build() {
            return new Interview(this);
        }
        public InterviewBuilder id(int value) {
            return this;
        }
        public InterviewBuilder DateAndTime(String value) {
            this.interviewDateAndTime = value;
            return this;
        }
        public InterviewBuilder Type(String value) {
            this.interviewType = value;
            return this;
        }
        public InterviewBuilder JobApplication(JobApplication value) {
            this.jobApplication = value;
            return this;
        }
        public InterviewBuilder Address(Address value) {
            this.address = value;
            return this;
        }
    }
    public int getInterviewId() {
        return InterviewId;
    }
    public String getInterviewDateAndTime() {
        return interviewDateAndTime;
    }
    public String getInterviewType() {
        return interviewType;
    }
    public JobApplication getJobApplication() {
        return jobApplication;
    }
    public Address getAddress() {
        return address;
    }
}
