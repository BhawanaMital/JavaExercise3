package com.stakeroute.exercise3;

public class CheckGrades {
    private int numofstud;
    private int[] grades;

    public  CheckGrades(int numofstud,int [] grades){
        //Instancxe variable of the class
        this.numofstud=numofstud;
        this.grades=grades;
    }

    //Checking whether the grade lies within the range or not
    public String checkGradesOfStd(){
        for (int grade:grades){
            if (grade<0 || grade>100){
                return "error";
            }

        }
        return "true";
    }
}
