import java.io.*;
import java.util.Scanner;
class Doctor{
    String name, id, specilist, time, dr_qual;
    int room_no;
    void read(){
        Scanner ip=new Scanner(System.in);
        System.out.print("Name: ");
        name=ip.nextLine();
        System.out.print("Id: ");
        id=ip.nextLine();
        System.out.print("Specilist in: ");
        specilist=ip.nextLine();
        System.out.print("Timing: ");
        time=ip.nextLine();
        System.out.print("Qualification: ");
        dr_qual=ip.nextLine();
        System.out.print("Room no.: ");
        room_no=ip.nextInt();
    }
    void display(){
        System.out.println(id+" \t "+name+" \t "+specilist+" \t "+time+" \t "+" \t "+dr_qual+" \t "+room_no);
    }
}
class Staff{
    String name,id,desg,sex;
    float salary;
    void read(){
        Scanner ip=new Scanner(System.in);
        System.out.print("Name: ");
        name=ip.nextLine();
        System.out.print("Id: ");
        id=ip.nextLine();
        System.out.print("Designation: ");
        desg=ip.nextLine();
        System.out.print("Sex: ");
        sex=ip.nextLine();
        System.out.print("Salary: ");
        salary=ip.nextFloat();
    }
    void display(){
        System.out.println(id+" \t "+name+" \t "+desg+" \t\t "+sex+" \t "+salary);
    }
}
class Patient{
    String name,id,sex,disease,dr_name,time;
    int age;
    void read(){
        Scanner ip=new Scanner(System.in);
        System.out.print("Name: ");
        name=ip.nextLine();
        System.out.print("Id: ");
        id=ip.nextLine();
        System.out.print("Disease: ");
        disease=ip.nextLine();
        System.out.print("Sex: ");
        sex=ip.nextLine();
        System.out.print("Doctor's name: ");
        dr_name=ip.nextLine();
        System.out.print("Time: ");
        time=ip.nextLine();
        System.out.print("Age: ");
        age=ip.nextInt();
    }
    void display(){
        System.out.println(id+" \t "+name+" \t "+disease+" \t "+sex+" \t "+age+" \t "+dr_name+"\t"+time);
    }
}
class Medicine{
    String name, comp, exp_date;
    float cost,count;
    void read(){
        Scanner ip=new Scanner(System.in);
        System.out.print("Name: ");
        name=ip.nextLine();
        System.out.print("Company: ");
        comp=ip.nextLine();
        System.out.print("Expiry date: ");
        exp_date=ip.nextLine();
        System.out.print("Cost: ");
        cost=ip.nextFloat();
        System.out.print("count: ");
        count=ip.nextInt();
    }
    void display(){
        System.out.println(name+" \t "+comp+" \t "+exp_date+" \t "+cost+" \t "+count);
    }
}
class Lab{
    String lname;
    float cost;
    void read(){
        Scanner ip=new Scanner(System.in);
        System.out.print("Lab Name: ");
        lname=ip.nextLine();
        System.out.print("Cost: ");
        cost=ip.nextFloat();
    }
    void display(){
        System.out.println(lname+" \t\t "+cost);
    }
}
class Facility{
    String name;
    void read(){
        Scanner ip=new Scanner(System.in);
        System.out.print("Facility Name: ");
        name=ip.nextLine();
    }
    void display(){
        System.out.println(name+" ");
    }
}
class HospitalManagement{
    public static void main(String [] args){
        int count1=4,count2=4,count3=4,count4=4,count5=4,count6=4, choice,c;
        Scanner ip=new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tWELCOME TO CITY HOSPITAL");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Doctor[] d= new Doctor[25];
        Staff[] s=new Staff[25];
        Patient[] p=new Patient[1000];
        Medicine[] m= new Medicine[1000];
        Lab[] l=new Lab[25];
        Facility[] f= new Facility[25];
        int i;
        for(i=0;i<25;i++)
            d[i]=new Doctor();
        for(i=0;i<25;i++)
            s[i]=new Staff();
        for(i=0;i<1000;i++)
            p[i]=new Patient();
        for(i=0;i<1000;i++)
            m[i]=new Medicine();
        for(i=0;i<25;i++)
            l[i]=new Lab();
        for(i=0;i<25;i++)
            f[i]=new Facility();
        d[0].id="d101";
        d[1].id="d102";
        d[2].id="d103";
        d[3].id="d104";
        d[0].name="Dr.Anil ";
        d[1].name="Dr.Aditi";
        d[2].name="Dr.Suraj";
        d[3].name="Dr.Amol ";
        d[0].specilist="Surgen";
        d[1].specilist="Surgen";
        d[2].specilist="Artho ";
        d[3].specilist="ENT   ";
        d[0].time="10:30-1:30";
        d[1].time="11:30-2:30";
        d[2].time="4:30-6:30";
        d[3].time="4:00-7:00";
        d[0].dr_qual="MBBS";
        d[1].dr_qual="BDM ";
        d[2].dr_qual="MBBS";
        d[3].dr_qual="MBBS";
        d[0].room_no=111;
        d[1].room_no=112;
        d[2].room_no=113;
        d[3].room_no=114;
        s[0].name="Priya";
        s[0].id="s101";
        s[0].desg="Nurse";
        s[0].sex="Female";
        s[0].salary=6000;
        s[1].name="Parag";
        s[1].id="s102";
        s[1].desg="Work";
        s[1].sex="Male  ";
        s[1].salary=5000;
        s[2].name="Neha";
        s[2].id="s103";
        s[2].desg="Nurse";
        s[2].sex="Female";
        s[2].salary=6000;
        s[3].name="Isha";
        s[3].id="s104";
        s[3].desg="Nurse";
        s[3].sex="Female";
        s[3].salary=6000;
        p[0].name="Reema";
        p[0].id="p101";
        p[0].disease="cold   ";
        p[0].sex="Female";
        p[0].dr_name="Dr.Amol";
        p[0].time="4:00";
        p[0].age=25;
        p[1].name="Rohan";
        p[1].id="p102";
        p[1].disease="Tonsils";
        p[1].sex="Male  ";
        p[1].dr_name="Dr.Anil";
        p[1].time="5:00";
        p[1].age=35;
        p[2].name="Soni";
        p[2].id="p103";
        p[2].disease="Heart Pain";
        p[2].sex="Female";
        p[2].dr_name="Dr.Aditi";
        p[2].time="2:00";
        p[2].age=20;
        p[3].name="Samy";
        p[3].id="p104";
        p[3].disease="Joint Pain";
        p[3].sex="Male  ";
        p[3].dr_name="Dr.Anil";
        p[3].time="11:00";
        p[3].age=45;
        m[0].name="Crocin";
        m[0].comp="Cino pvt";
        m[0].exp_date="12/11/23";
        m[0].cost=54;
        m[0].count=10;
        m[1].name="Nytra";
        m[1].comp="Reckit";
        m[1].exp_date="10/10/23";
        m[1].cost=40;
        m[1].count=10;
        m[2].name="Brufa";
        m[2].comp="Ace pvt";
        m[2].exp_date="11/12/22";
        m[2].cost=55;
        m[2].count=10;
        m[3].name="Pride";
        m[3].comp="DDF pvt";
        m[3].exp_date="14/5/21";
        m[3].cost=65;
        m[3].count=10;
        l[0].lname="X-ray";
        l[0].cost=1000;
        l[1].lname="CTScan";
        l[1].cost=1300;
        l[2].lname="ORScan";
        l[2].cost=600;
        l[3].lname="Blood ";
        l[3].cost=50;
        f[0].name="Ambulance";
        f[1].name="Admit Facility";
        f[2].name="Canteen";
        f[3].name="Emergency";
        int a=1,b=0;
        while(a==1)
        {
            System.out.println("1.Doctor\n2.Staff\n3.Patient\n4.Medicine\n5.Lab\n6.Facility\n0.Exit");
            System.out.print("Enter your choice: ");
            choice=ip.nextInt();
            switch(choice){
                case 1:
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\tDOCTOR'S SECTION");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    b=1;
                    while(b==1){
                        System.out.println("1.New entry \n2.Display existing list");
                        System.out.print("Enter your Choice: ");
                        c=ip.nextInt();
                        switch(c){
                            case 1:
                                d[count1].read();
                                count1++;
                                break;
                            case 2:
                                System.out.println("Id \t Name \t\t Specilist \t Time \t\t Qualification \t room_no");
                                for(i=0;i<count1;i++)
                                {d[i].display();}
                                break;
                            default:
                                System.out.println("Invalid");
                                break;}
                        System.out.print("Enter 1 to return BACK and Enter 0 for the MENU");
                        b=ip.nextInt();
                    }break;

                case 2:
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\tSTAFF'S SECTION");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    b=1;
                    while(b==1){
                        System.out.println("1.New entry of doctor\n2.Display existing list");
                        System.out.print("Enter your Choice: ");
                        c=ip.nextInt();
                        switch(c){
                            case 1:
                                s[count2].read();
                                count2++;
                                break;
                            case 2:
                                System.out.println("Id \t Name \t Designation \t Sex \t\t Salary");
                                for(i=0;i<count2;i++)
                                {s[i].display();}
                                break;
                            default:
                                System.out.println("Invalid");
                                break;}
                        System.out.print("Enter 1 to return BACK and Enter 0 for the MENU");
                        b=ip.nextInt();
                    }break;

                case 3:
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\tPATIENT'S SECTION");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    b=1;
                    while(b==1){
                        System.out.println("1.New entry\n2.Display existing list");
                        System.out.print("Enter your Choice: ");
                        c=ip.nextInt();
                        switch(c){
                            case 1:
                                p[count3].read();
                                count3++;
                                break;
                            case 2:
                                System.out.println("Id \t Name \t Disease \t Sex \t\t Age \t Doctor Name \t Time");
                                for(i=0;i<count3;i++)
                                {p[i].display();}
                                break;
                            default:
                                System.out.println("Invalid");
                                break;}
                        System.out.print("Enter 1 to return BACK and Enter 0 for the MENU");
                        b=ip.nextInt();
                    }break;

                case 4:
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\tMEDICINE'S SECTION");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    b=1;
                    while(b==1){
                        System.out.println("1.New entry \n2.Display existing list");
                        System.out.print("Enter your Choice: ");
                        c=ip.nextInt();
                        switch(c){
                            case 1:
                                m[count4].read();
                                count4++;
                                break;
                            case 2:
                                System.out.println("Name \t Company \t Expiry Date \t Cost \t Count");
                                for(i=0;i<count4;i++)
                                {m[i].display();}
                                break;
                            default:
                                System.out.println("Invalid");
                                break;}
                        System.out.print("Enter 1 to return BACK and Enter 0 for the MENU");
                        b=ip.nextInt();
                    }break;

                case 5:
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\tLAB'S SECTION");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    b=1;
                    while(b==1){
                        System.out.println("1.New entry\n2.Display existing list");
                        System.out.print("Enter your Choice: ");
                        c=ip.nextInt();
                        switch(c){
                            case 1:
                                l[count5].read();
                                count5++;
                                break;
                            case 2:
                                System.out.println("Lab Name \t Cost");
                                for(i=0;i<count5;i++)
                                {l[i].display();}
                                break;
                            default:
                                System.out.println("Invalid");
                                break;}
                        System.out.print("Enter 1 to return BACK and Enter 0 for the MENU");
                        b=ip.nextInt();
                    }break;

                case 6:
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\tFACILITY'S SECTION");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    b=1;
                    while(b==1){
                        System.out.println("1.New entry\n2.Display existing list");
                        System.out.print("Enter your Choice: ");
                        c=ip.nextInt();
                        switch(c){
                            case 1:
                                f[count6].read();
                                count6++;
                                break;
                            case 2:
                                System.out.println("Facility Name");
                                for(i=0;i<count6;i++)
                                {f[i].display();}
                                break;
                            default:
                                System.out.println("Invalid");
                                break;}
                        System.out.print("Enter 1 to return BACK and Enter 0 for the MENU");
                        b=ip.nextInt();
                    }break;

                case 0:
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\tTHANK YOU!!!!!!!!!!!");
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    a=0;
                    break;

                default:
                    System.out.print("Invalid Choice");
                    break;
            }}}}
