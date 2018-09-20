package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

// Class Coder thể hiện đối tượng coder
class Coder {
    private String name; //Tên
    private int age; //Tuổi
    private String job; //Công việc
    
    //Các hàm getter, setter
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    public String getJob() {
        return this.job;
    }
    
    //Hàm khởi tạo coder
    public Coder(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    
    //Phương thức code
    public void code() {
        
    }
    
    //Phương thức ngủ
    public void sleep() {
        
    }
    
    //Phương thức ăn
    public void eat() {
        
    }
}

//Class Bird thể hiện đối tượng chim
class Bird {
    private String name; //Tên
    private float weight; //Cân nặng
    private float price; //Giá
    
    //Các hàm getter, setter
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public float getWeight() {
        return this.weight;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
    public float getPrice() {
        return this.price;
    }
    
    //Phương thức bay
    public void fly() {}
    //Phương thức hót
    public void sing() {}
    //Phương thức ăn
    public void eat() {}
}

//Class Dog thể hiện đối tượng chó
class Dog {
    float weight; //cân nặng
    String color; //màu lông
    float price; //giá
    
    //Các hàm getter, setter
    public void setColor(String color) {
       this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public float getWeight() {
        return this.weight;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
    public float getPrice() {
        return this.price;
    }
    
    //Phương thức chạy
    public void run() {}
    //Phương thức sủa
    public void bark() {}
    //Phương thức chơi
    public void play() {}
}