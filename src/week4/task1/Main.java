/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 *
 * @author Admin
 */
public class Main {
	public static void main(String[] args) {
		HoaQua hoaqua = new HoaQua("Qua 1", 5.6);
		System.out.println(hoaqua);
                QuaCam cam1 = new QuaCam("cam 1", 6, "red");
                System.out.println(cam1);
                CamCaoPhong cam2 = new CamCaoPhong("cam 2", 60, "green");
                System.out.println(cam2);
	}
}
