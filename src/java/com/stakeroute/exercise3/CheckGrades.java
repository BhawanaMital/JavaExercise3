package com.stakeroute.exercise3;

public class CheckGrades {
    private int numofstud;
    private int[] grades;

    public  CheckGrades(int numofstud,int [] grades){
        this.numofstud=numofstud;
        this.grades=grades;
    }

    public String checkGradesOfStd(){
        for (int grade:grades){
            if (grade<0 || grade>100){
                return "error";
            }

        }
        return "true";
    }
}
