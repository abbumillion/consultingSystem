package DomainObjects;

import DomainObjects.Job;
import DomainObjects.Skill;

public class JobSkill {

    //bean class for job skill
    private final int jobskillid;
    private final Job job;
    private final Skill skill;

    public JobSkill(JobSkillBuilder jobSkillBuilder) {
        this.job = jobSkillBuilder.job;
        this.jobskillid = jobSkillBuilder.jobskillid;
        this.skill = jobSkillBuilder.skill;
    }

    public static class JobSkillBuilder {

        private int jobskillid;
        private Job job;
        private Skill skill;

        public JobSkill build() {
            return new JobSkill(this);
        }

        public JobSkillBuilder id(int value) {
            this.jobskillid = value;
            return this;
        }

        public JobSkillBuilder Job(Job value) {
            this.job = value;
            return this;
        }

        public JobSkillBuilder Skill(Skill value) {
            this.skill = value;
            return this;
        }

    }

    public int getJobskillid() {
        return jobskillid;
    }

    public Job getJob() {
        return job;
    }

    public Skill getSkill() {
        return skill;
    }
}
