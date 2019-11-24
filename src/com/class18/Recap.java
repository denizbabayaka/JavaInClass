package com.class18;

public class Recap {
    int students, teachers,classrooms;// we create the variables of this class 
    String name, address, website;
    
    void study() {
    	System.out.println("I am message from study method");
        System.out.println("Students studying at "+name);
    }
    void teach() {
    	System.out.println("This is first execution of the method");
        System.out.println("Teachers teaching at "+name);
    }
    public static void main(String[] args) {
        Recap school=new Recap();
        school.name="Syntax";
        school.students=200;
        
        Recap school1=new Recap();
        school1.name="Pinnacle";
        school1.students=150;
        
        school1.teach();//we are calling the method teach
        school.study();
    }

}
