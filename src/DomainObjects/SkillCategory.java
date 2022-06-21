package DomainObjects;

public class SkillCategory {

    private final int id;
    private final String SkillCategoryName, SkillCategoryInformation;

    public SkillCategory(SkillCategoryBuilder skillCategoryBuilder) {
        this.id = skillCategoryBuilder.id;
        this.SkillCategoryName = skillCategoryBuilder.SkillCategoryName;
        this.SkillCategoryInformation = skillCategoryBuilder.SkillCategoryInformation;
    }

    public static class SkillCategoryBuilder {

        private int id;
        private String SkillCategoryName, SkillCategoryInformation;

        public SkillCategory build() {
            return new SkillCategory(this);
        }

        public SkillCategoryBuilder Id(int value) {
            this.id = hashCode();
            return this;
        }

        public SkillCategoryBuilder SkillCategoryName(String value) {
            this.SkillCategoryName = value;
            return this;
        }

        public SkillCategoryBuilder SkillCategoryInformation(String value) {
            this.SkillCategoryInformation = value;
            return this;
        }

    }

    public int getId() {
        return id;
    }

    public String getSkillCategoryName() {
        return SkillCategoryName;
    }

    public String getSkillCategoryInformation() {
        return SkillCategoryInformation;
    }

}
