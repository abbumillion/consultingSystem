package DomainObjects;

public class Skill {

    private final int SkillId;
    private final String SkillName;
    private final String SkillInformation;
    private final SkillCategory SkillCategory;

    public Skill(SkillBuilder skillBuilder) {
        this.SkillId = skillBuilder.SkillId;
        this.SkillName = skillBuilder.SkillName;
        this.SkillInformation = skillBuilder.SkillInformation;
        this.SkillCategory = skillBuilder.SkillCategory;
    }

    public static class SkillBuilder {

        private int SkillId;
        private String SkillName, SkillInformation;
        private SkillCategory SkillCategory;

        public Skill build() {
            return new Skill(this);
        }

        public SkillBuilder SkillId(int value) {
            this.SkillId = value;
            return this;
        }

        public SkillBuilder SkillName(String value) {
            this.SkillName = value;
            return this;

        }

        public SkillBuilder skillCategory(SkillCategory value) {
            this.SkillCategory = value;
            return this;
        }

        public SkillBuilder SkillInformation(String value) {
            this.SkillInformation = value;
            return this;

        }

    }

    public int getSkillId() {
        return SkillId;
    }

    public String getSkillName() {
        return SkillName;
    }

    public String getSkillInformation() {
        return SkillInformation;
    }

    public SkillCategory getSkillCategory() {
        return SkillCategory;
    }

}
