/**
 * Package bài làm cho Câu 1
 * TODO: Khai báo các lớp (class) theo Câu 1 yêu cầu. 1 file chỉ khai báo 1 class
 * TODO: Mô tả các quan hệ giữa các class và thêm thuộc tính, phương thức cho chúng (mỗi class ít nhất 2 phương thức, 2 thuộc tính)
 * TODO: Viết comment đầy đủ cho class, phương thức. Xem hướng dẫn tại đây (http://dongdiemthuy.github.io/java/javadoc/2014/09/30/su-dung-javadoc-va-maven-de-tao-tai-lieu-du-an.html)
 * @author cuong
 * @version 0.1
 */
package week4.task1;
/**
 * Class hoa qua
 * @author Admin
 */
public class HoaQua {
	protected String type;
	protected double price;
	public HoaQua() {
		type = "type";
		price = 0;
	}
	public HoaQua(String type,double price) {
		this.type = type;
		this.price = price;
	}
	public void settype(String type) {
		this.type = type;
	}
	public String gettype() {
		return type;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return (" type : "+type+" price : "+price);
	}
}