package c.jopel.attendacelogin;

public class User {
    //variables
    int id;
    String name;
    String usertype;
    String password;
    // Constructor with two parameters name and password
    public User(String name,String password,String type)
    {
        this.name=name;
        this.usertype=type;
        this.password=password;
    }
    //Parameter constructor containing all three parameters
    public User(int id,String name,String psd,String usertype)
    {
        this.id=id;
        this.usertype=usertype;
        this.name=name;
        this.password=psd;
    }
    //getting id
    public int getId() {
        return id;
    }
    //setting id
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return usertype;
    }
    //setting id
    public void setType(String usertype) {
        this.usertype = usertype;
    }
    //getting name
    public String getName() {
        return name;
    }
    //setting name
    public void setName(String name) {
        this.name = name;
    }
    //getting password
    public String getPassword() {
        return password;
    }
    //setting password
    public void setPassword(String password) {
        this.password = password;
    }
}