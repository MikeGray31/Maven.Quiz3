package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

import static rocks.zipcode.io.quiz3.collections.LabStatus.PENDING;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs;

    public Student() {
        this(new ArrayList<Lab>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for(Lab l : this.labs){
            if(l.getName().equals(labName)) return l;
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        try{
            getLab(labName).setStatus(labStatus);
        }
        catch(NullPointerException e){
            throw new UnsupportedOperationException();
        }
    }

    public void forkLab(Lab lab) {
        lab.setStatus(PENDING);
        this.labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString(){
        String result = "";
        for(int i = this.labs.size() - 1; i > 0 ; i--){
            String s = this.labs.get(i).getName() + " > " + this.labs.get(i).getStatus() + "\n";
            result += s;
        }
        return result + this.labs.get(0).getName() + " > " + this.labs.get(0).getStatus();
    }
}
