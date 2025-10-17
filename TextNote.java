package com.example.lab4;

public class TextNote {
    public String createdDate;
    public String title;
    //Attribute
    String textContent;
    String getTitle;
    //getter method
    public String getTextContent() {
        return textContent;
    }
    //setter method
    public void setTextContent(String newContent) {
        this.textContent = newContent;
    }

    //Method
    public int getSummary() {
        //System.out.println(title+":"+textContent+"("+createdDate+")");
        return 0;
    }

    public void setTitle(String strOfTitle) {
    }
}
