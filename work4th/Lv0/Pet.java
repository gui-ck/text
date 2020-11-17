package com.gui.work4th.Lv0;

public class Pet {
    String name;
    int age;

    public void bark(String str) {
        if(str=="cat"){
            System.out.println("喵喵喵……");
        }
        else if(str=="dog"){
            System.out.println("汪汪汪……");
        }
        else
            System.out.println("未收录"+str+"的叫声");
    }
}

