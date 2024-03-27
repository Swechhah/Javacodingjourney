import java.util.ArrayList;

public class SubjectMarksDetails {

    public int getFullMarks(ArrayList<Integer> list){
        int fullMarksAddition = 0;
        for (int a : list){
            fullMarksAddition = fullMarksAddition + a;
        }
        return fullMarksAddition;
    }
    public int getObtainedMarks(ArrayList<Integer> newlist){
        int obtainedMarksAddition = 0;
        for (int b : newlist){
            obtainedMarksAddition = obtainedMarksAddition + b;
        }
        return obtainedMarksAddition;
    }
     public int calculatePercentage(int fullmarks, int obtainedmarks){
        int percentage = (obtainedmarks/fullmarks)*100;
        return percentage;
     }
     public boolean checkPassorFail(int percent){
        boolean passOrFail = false;
         passOrFail = percent >= 40;
        return passOrFail;
     }
}
