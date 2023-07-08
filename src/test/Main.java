/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import javaapplication17.MyPanel;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng JFrame hoặc JPanel
        MyPanel panel = new MyPanel();
//        panel.setContentPane(new JScrollPane(panel));
        // Cài đặt các thuộc tính của cửa sổ
        JFrame frame = new JFrame("My App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel); // Thêm panel vào cửa sổ

        // Hiển thị cửa sổ
        frame.pack();
        frame.setVisible(true);
    }
}
