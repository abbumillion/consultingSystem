package DomainObjects;

public class ApplicantSkill {

    private final int id;
    private final Applicant applicant;
    private final Skill skill;

    public ApplicantSkill(ApplicantSkillBuilder applicantSkillBuilder) {
        this.applicant=applicantSkillBuilder.applicant;
        this.id=applicantSkillBuilder.id;
        this.skill=applicantSkillBuilder.skill;
    }

    public static class ApplicantSkillBuilder {

        private int id;
        private Applicant applicant;
        private Skill skill;

        public ApplicantSkill build() {
            return new ApplicantSkill(this);
        }

        public ApplicantSkillBuilder Id(int value) {
            this.id = value;
            return this;
        }

        public ApplicantSkillBuilder Skill(Skill value) {
            this.skill = value;
            return this;
        }

        public ApplicantSkillBuilder Applicant(Applicant value) {
            this.applicant = value;
            return this;
        }

    }

    public int getId() {
        return id;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public Skill getSkill() {
        return skill;
    }

}
