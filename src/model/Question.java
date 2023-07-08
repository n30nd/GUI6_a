package model;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private Integer categoryID;
    private String name;
    private String text;
    private float mark;
    private List<String> choice;
    private List<Float> answer;
    private int level;

    public Question() {
        categoryID = -1;
        name = "";
        text = "";
        level = 0;
        mark = 1;
        choice = new ArrayList<String>();
        answer = new ArrayList<Float>();
    }
    public Question(Integer _categoryID, String _name, String _text, float _mark) {
        categoryID = _categoryID;
        name = _name;
        text = _text;
        mark = _mark;
    }

    //Getter
    public Integer getCategory() {return categoryID;}
    public String getName() {return name;}
    public String getText() {return text;}
    public float getMark() {return mark;}
    public List<String> getChoice() {return choice;}
    public List<Float> getAnswer() {return answer;}
    public int getLevel() {return level;}

    //Setter
    public void setCategory(Integer _categoryID) {categoryID = _categoryID;}
    public void setName(String _name) {name = _name;}
    public void setText(String _text) {text = _text;}
    public void setMark(float _mark) {mark = _mark;}
    public void setChoice(List<String> _choice) {choice = _choice;}
    public void setAnswer(List<Float> _answer) {answer = _answer;}
    public void setLevel(int _level) {level = _level;}

    public void display() {
        System.out.println(categoryID + " " + name + " " + text + " " + mark + " " + choice.toString() + " " + answer.toString() + " " + level);
    }
    public void displayChoice() {
        for (int i = 0; i < choice.size(); i++) {
            System.out.println(choice.get(i));
        }
    }
}
