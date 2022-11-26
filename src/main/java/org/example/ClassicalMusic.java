package org.example;

public class ClassicalMusic implements Music{

    private ClassicalMusic(){}
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    public void doMyInit(){
        System.out.println("Doing Classical Initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing Classical destruction");
    }
    public String getSong() {
        return "Classical";
    }
}
