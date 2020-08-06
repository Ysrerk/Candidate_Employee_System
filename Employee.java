import java.util.ArrayList;

public class Employee extends Candidate {


    private String departmant;

    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    static void addemployee(String ename,String esurname,String eadress,String etalent,String edepartmant){

        ArrayList<String>employeelist=new ArrayList<String>();
        employeelist.add(ename);
        employeelist.add(esurname);
        employeelist.add(eadress);
        employeelist.add(etalent);
        employeelist.add(edepartmant);
        main.listoflistemp.add(employeelist);
        System.out.println(main.listoflistemp);



    }
}
