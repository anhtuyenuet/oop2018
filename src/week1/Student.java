package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getGroup() {
        return this.group;
    }
    
    public void setGroup(String group) {
        this.group = group;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n - ten sinh vien
     * @param sid - id sinh vien
     * @param em - email sinh vien
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s - mot sinh vien khac
     */
    Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
    }

    void getInfo() {
        // TODO:
        System.out.println(getName());
        System.out.println(getId());
        System.out.println(getGroup());
        System.out.println(getEmail());
    }
}
