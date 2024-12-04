package _998serverclient;

import java.util.Objects;

public class Task {
    private String zadacha;
    private String opisanie;


    public Task(String zadacha, String opisanie) {
        this.zadacha = zadacha;
        this.opisanie = opisanie;
    }

    public String getOpisanie(){
        return opisanie;
    }

    public void setOpisanie(String opisanie){this.opisanie = opisanie;}
    public String getZadacha(){return zadacha;}
    public  void setZadacha(String zadacha){this.zadacha = zadacha; }

    @Override
    public boolean equals(Object otherObject){
        if (otherObject.getClass()!= Task.class){
            return false;
        }
        Task otherTask = (Task) otherObject;
        if(zadacha.equals(otherTask.zadacha) && opisanie.equals(otherTask.opisanie)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(zadacha, opisanie);
    }
}
