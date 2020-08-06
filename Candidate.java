import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Candidate extends Person {

    private String talent;

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }
    static  void addcandidate(String name,String surname,String adress,String talent){
        //List<List<Object>>listoflist=new ArrayList<>();
        List<Object>candidatelist=new ArrayList<Object>();
        candidatelist.add(name);
        candidatelist.add(surname);
        candidatelist.add(adress);
        candidatelist.add(talent);
        main.listoflist.add(candidatelist);


        System.out.println(main.listoflist);

    }





}
