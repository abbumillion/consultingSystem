package DomainObjects;

public class Admin extends User {

    int level;

    public Admin(AdminBuilder adminBuilder) {

        this.level = adminBuilder.level;
        this.setAddress(adminBuilder.getAddress());
        this.setFirstName(adminBuilder.getFirstName());
        this.setLastName(adminBuilder.getLastName());
        this.setGender(adminBuilder.getGender());
        this.setEmail(adminBuilder.getEmail());
        this.setId(adminBuilder.getId());
        this.setUserName(adminBuilder.getUserName());
        this.setPassword(adminBuilder.getPassword());
        this.setRole(adminBuilder.getRole());
        this.setDateOfBirth(adminBuilder.getDateOfBirth());
        this.setCellPhone(adminBuilder.getCellPhone());

    }

    public static class AdminBuilder extends User {

        int level;

        public Admin build() {
            return new Admin(this);
        }

        public AdminBuilder id(int value) {
            this.setId(value);
            return this;
        }

        public AdminBuilder FirstName(String value) {
            this.setFirstName(value);
            return this;
        }

        public AdminBuilder LastName(String value) {
            this.setLastName(value);
            return this;
        }

        public AdminBuilder Gender(String value) {
            this.setGender(value);
            return this;
        }

        public AdminBuilder Email(String value) {
            this.setEmail(value);
            return this;
        }

        public AdminBuilder PhoneNumber(String value) {
            this.setCellPhone(value);
            return this;
        }

        public AdminBuilder DateOfBirth(String value) {
            this.setDateOfBirth(value);
            return this;
        }


        public AdminBuilder Level(int value) {
            this.level = value;
            return this;
        }

        public AdminBuilder UserRole(String value) {
            this.setRole(value);
            return this;
        }

        public AdminBuilder UserName(String value) {
            this.setUserName(value);
            return this;
        }

        public AdminBuilder Password(String value) {
            this.setPassword(value);
            return this;
        }

        public AdminBuilder Address(Address value) {
            this.setAddress(value);
            return this;
        }

    }

    public int getLevel() {
        return level;
    }

}
