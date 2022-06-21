package DomainObjects;

public class Company extends Authenticable {

    private final String CompanyName, CompanyType, Website;

    public Company(CompanyBuilder companyBuilder) {
        this.CompanyName = companyBuilder.CompanyName;
        this.CompanyType = companyBuilder.CompanyType;
        this.setEmail(companyBuilder.Email);
        this.setCellPhone(companyBuilder.phoneNumber);
        this.Website = companyBuilder.Website;
        this.setId(companyBuilder.getId());
        this.setUserName(companyBuilder.getUserName());
        this.setPassword(companyBuilder.getPassword());
        this.setRole(companyBuilder.getRole());
        this.setAddress(companyBuilder.getAddress());
    }

    public static class CompanyBuilder extends Authenticable {

        private String CompanyName, CompanyType, Website, phoneNumber, Email;

        public Company build() {
            return new Company(this);
        }

        public CompanyBuilder id(int value) {
            this.setId(value);
            return this;
        }

        public CompanyBuilder UserName(String value) {
            this.setUserName(value);
            return this;
        }

        public CompanyBuilder Userrole(String value) {
            this.setRole(value);
            return this;
        }

        public CompanyBuilder Password(String value) {
            this.setPassword(value);
            return this;
        }

        public CompanyBuilder Address(Address value) {
            this.setAddress(value);
            return this;
        }

        public CompanyBuilder CompanyName(String value) {
            this.CompanyName = value;
            return this;
        }

        public CompanyBuilder CompanyType(String value) {
            this.CompanyType = value;
            return this;
        }

        public CompanyBuilder Website(String value) {
            this.Website = value;
            return this;
        }

        public CompanyBuilder PhoneNumber(String value) {
            this.phoneNumber = value;
            return this;
        }

        public CompanyBuilder Email(String value) {
            this.Email = value;
            return this;
        }

    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getCompanyType() {
        return CompanyType;
    }

    public String getWebsite() {
        return Website;
    }

}
