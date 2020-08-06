import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static List<List<Object>> listoflist = new ArrayList<>();
    public static List<ArrayList<String>> listoflistemp=new ArrayList<ArrayList<String>>();
    public static void main(String[] args){

        Person p1=new Person();
        p1.setName("john");
        p1.setSurname("mercy");
        p1.setAdress("england");

        p1.view();
        Candidate.addcandidate("Tom","john","usa","bt");


    while (true){
        Scanner oku=new Scanner(System.in);
        System.out.println("what kind of process do you want ? 1-Add Candidate 2-Add Employee " +
                "3- add employee from candidate 4-search candidate for talent 5-print wiew");
        int processtype=oku.nextInt();

        if (processtype==1){
            System.out.println("please enter candidate name");
            String cname=oku.next();
            System.out.println("please enter candidate sname");
            String csname=oku.next();
            System.out.println("please enter candidate adress");
            String cadress=oku.next();
            System.out.println("please enter candidate talent");
            String ctalent=oku.next();
            Candidate.addcandidate(cname,csname,cadress,ctalent);
            System.out.println("do you want to continue");
            String answer=oku.next();
            if (answer.equals("n")){
                break;
            }

        }
        else if(processtype==2){
            System.out.println("please enter employee name");
            String ename=oku.next();
            System.out.println("please enter employee sname");
            String esname=oku.next();
            System.out.println("please enter employee adress");
            String eadress=oku.next();
            System.out.println("please enter employee talent");
            String etalent=oku.next();
            System.out.println("please enter employee departman");
            String edepartman=oku.next();
            Employee.addemployee(ename,esname,eadress,etalent,edepartman);
            System.out.println("do you want to continue");
            String answere=oku.next();
            if (answere.equals("n")){
                break;
            }

        }
        else if (processtype==3){

            System.out.println("please give information  about which candidate do you" +
                    " want to change his/her status from candidate to employee");
            System.out.println("please enter her/his name");
            String rname=oku.next();
            System.out.println("please enter her/his sname");
            String rsname=oku.next();
            System.out.println("please enter her/his adress");
            String radress=oku.next();
            System.out.println("please enter her/his talent");
            String rtalent=oku.next();
            System.out.println("please enter her/his department");
            String rdepartment=oku.next();
            //searching candidate and removing from candidate list
            for (int i=0;i<listoflist.size();i++){

                if (listoflist.get(i).contains(rname) &&listoflist.get(i).contains(rsname)&& listoflist.get(i).contains(radress)
                        &&listoflist.get(i).contains(rtalent)){
                    listoflist.remove(i);
                    System.out.println(listoflist);
                }
            }
            //adding employee list
            Employee.addemployee(rname,rsname,radress,rtalent,rdepartment);


        }
        else if(processtype==4){
            System.out.println("please write which talent do you want to search");
            String stalent=oku.next();

            for (int i=0;i<listoflist.size();i++){

                if (listoflist.get(i).contains(stalent)){
                    System.out.println(listoflist.get(i));
                }
            }


        }

        else if (processtype==5){
            System.out.println("if you want to list candidate  please write 1 ," +
                    " if you want to list employee please write 2 ");
            int choose=oku.nextInt();
            if (choose==1){
                System.out.println("You can see below all canditates");
                System.out.println(listoflist);
            }
            else if(choose==2){
                System.out.println("you can see below all employee");
                System.out.println(listoflistemp);
            }

        }
    }


    }
}


