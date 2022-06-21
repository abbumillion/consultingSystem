package DomainObjects;

public abstract class Authenticable {

    private int id;
    private String Role, UserName, password, cellPhone, email;
    private Address address;

    public void setId(int id) {
        this.id = id;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return Role;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return password;
    }

    public Address getAddress() {
        return address;
    }

}
