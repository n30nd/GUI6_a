/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Vu Quang Nam
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Category;

public class CategoryReader {
    public static void main(String[] args) {
        String filePath = "src\\Data\\categorySource.txt"; // Đường dẫn tới file categorysource.txt

        List<Category> categories = readCategoriesFromFile(filePath);

        // In danh sách các đối tượng Category đã đọc
        for (Category category : categories) {
            System.out.println(category.getParent());
            System.out.println(category.getName());
            System.out.println(category.getInfo());
            System.out.println(category.getId());            
            System.out.println(category.getNumOfQuestions());
            System.out.println("------");
        }
    }

    public static List<Category> readCategoriesFromFile(String filePath) {
        List<Category> categories = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            Category category = null;

            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    // Nếu dòng trống, tiếp tục đọc dòng tiếp theo
                    continue;
                }

                if (category == null) {
                    // Nếu chưa có đối tượng Category hiện tại, tạo mới
                    category = new Category();
                    category.setParent(line);
                } else if (category.getName().isEmpty()) {
                    // Nếu chưa có giá trị cho trường name, gán giá trị đọc được từ file
                    category.setName(line);
                } else if (category.getInfo().isEmpty()) {
                    // Nếu chưa có giá trị cho trường info, gán giá trị đọc được từ file
                    category.setInfo(line);
                } else {
                    // Nếu đã đọc đủ thông tin cho đối tượng Category hiện tại,
                    // gán giá trị cho trường numOfQuestions và thêm vào danh sách
                    category.setId(Integer.parseInt(line));
                    categories.add(category);

                    // Đặt category về null để chuẩn bị cho đối tượng Category tiếp theo
                    category = null;
                }
            }
        } catch (IOException e) {
        }

        return categories;
    }
}
