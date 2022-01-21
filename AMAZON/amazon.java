import java.util.*;
class mobile1{
    String mob1;
    int p1;
    int c1;
    mobile1(String mob1,int p1,int c1){
        this.mob1=mob1;
        this.p1=p1;
        this.c1=c1;
    }
}
class amazon {
    
    static Scanner sc=new Scanner(System.in);
    static ArrayList<String>user=new ArrayList<String>();
    static ArrayList<String>userpass=new ArrayList<String>();
    static ArrayList<String>exist=new ArrayList<String>();
    static ArrayList<String>existpass=new ArrayList<String>();
    static ArrayList<mobile1>mobile=new ArrayList<mobile1>();
    static ArrayList<mobile1>mobile2k=new ArrayList<mobile1>();
    static ArrayList<String>laptop=new ArrayList<String>();
    static ArrayList<String>watch=new ArrayList<String>();
    static ArrayList<String>buyer1=new ArrayList<String>();
    static ArrayList<String>buyer2=new ArrayList<String>();
    static ArrayList<String>pass1=new ArrayList<String>();
    static ArrayList<String>pass2=new ArrayList<String>();
    public static void admin(){
        sc.nextLine();
        System.out.println("enter the admin");
        String user=sc.nextLine();
        System.out.println("enter pin");
        int pin=sc.nextInt();
        if(user.equals("admin")&&pin==1234){
         System.out.println("logged in");
       w: while(true){
        System.out.println("1:approve vendor");
        System.out.println("2:remove vendor");
        System.out.println("3:exit");
        int a1=sc.nextInt();
        sc.nextLine();
        switch(a1){
            case 1:
               approve();

               break;
            case 2:
                System.out.println("remove ");
                break;
            case 3:
                
                break w;    
                  
        }
    }
}
    else{
        System.out.println("invalid admin");
        }
    }


    static void approve(){
        for(int i=0;i<user.size();i++){
        System.out.println(user.get(i)+" "+userpass.get(i));
            System.out.println("1:approved");
            System.out.println("2:not approved");
            int ap=sc.nextInt();
            sc.nextLine();
            switch(ap){
                case 1:
                    System.out.println("approved");
                    exist.add(user.get(i));
                    existpass.add(user.get(i));
                    break;
                case 2:
                    System.out.println("not approved");  
                    break;  
            }
        }
        
        for(int i=0;i<exist.size();i++){
            System.out.println(exist.get(i));
        for(int j=0;j<exist.size();j++){
            System.out.println(existpass.get(j));
        }    
            
        }   
    }
    static void add(){
        System.out.println("1:mobiles");
        System.out.println("2:laptop");
        System.out.println("3:exit");
        int add=sc.nextInt();
        sc.nextLine();
        switch(add){
            case 1:
            System.out.println("enter mobile name:");
                String mobile14=sc.nextLine();
                System.out.println("enter mobile price:");
                int p11=sc.nextInt();
                sc.nextLine();
                System.out.println("enter mobile quantity:");
                int p12=sc.nextInt();
                sc.nextLine();
                mobile.add(new mobile1(mobile14, p11, p12));
                
                break;
            case 2:
                 String laptop1=sc.nextLine();
                laptop.add(laptop1);
                break;
            case 3:
                break;    

        }

       

    }
    static void exist(){
        System.out.println("1:add product");
        System.out.println("2:remove product");
        System.out.println("exit");
        int ex=sc.nextInt();
        switch(ex){
            case 1:
              System.out.println("add product");
              add();
              break;
            case 2:
                System.out.println("remove product");
                break; 
            case 3:
                break;
        }
    }
    static void ganga(){
        System.out.println("Enter Username:");
        String user1=sc.next();
        int count=0;
        for(int i=0;i<exist.size();i++){
           if((user1).equals(exist.get(i))){
               System.out.println("approved");

               count=count+1;
               exist();
           }
           
        }
        if(count==0){
                System.out.println("pending for approval");
        }
    }
    public static void  vendor(){
       t: while(true){
            System.out.println("1:new user");
            System.out.println("2:existing user");
            System.out.println("3:exit");
            int a1=sc.nextInt();
            switch(a1){
                case 1:
                   System.out.println("new user");
                   
                   newuser();
                   break;
                case 2:
                    System.out.println("existing user");
                    ganga();
                    break;
                case 3:
                   
                    break t; 
                      
                      
            }
            }
    }
    static void newuser(){
        
        System.out.println("user name");
        sc.nextLine();
        String us=sc.nextLine();
       
        System.out.println("password");
        String ps=sc.nextLine();
        user.add(us);
        userpass.add(ps);
    }
    public static void buyer(){
    a: while(true){
        System.out.println("1:new buyer");
        System.out.println("2:existing buyer");
        System.out.println("3:exit");

        int bu=sc.nextInt();
        sc.nextLine();
        switch(bu){
            case 1:
                System.out.println("enter name");
                String new1=sc.nextLine();
                System.out.println("password");
                String pas1=sc.nextLine();
                buyer1.add(new1);
                pass1.add(pas1);
                for(int i=0;i<buyer1.size();i++){
                    System.out.println(buyer1.get(i)+" "+pass1.get(i));
                }
                break;
                case 2:
                System.out.println("Enter Username:");
                String user2=sc.nextLine();
                System.out.println("password");
                String pass2=sc.nextLine();
                int count=0;
                for(int i=0;i<buyer1.size();i++){
                   if(((user2).equals(buyer1.get(i)))&&((pass2).equals(pass1.get(i)))){
                    count=count+1;
                    System.out.println((buyer1.get(i)));
                    System.out.println("1.mobile");
                    System.out.println("2.laptop");
                    System.out.println("3.Buyed products");
                    System.out.println("select the category");
                    int user_choice=sc.nextInt();
                    sc.nextLine();
                    if (user_choice==1){
                        if(mobile.size()>=1){
                        for(int ki=0;ki<mobile.size();ki++){
                            System.out.println(mobile.get(ki).mob1+" "+mobile.get(ki).p1+" "+mobile.get(ki).c1);
                        }
                        System.out.println("Enter the mobile name to buy:");
                        String Buyed_Phone=sc.nextLine();
                        for(int ki=0;ki<mobile.size();ki++){
                            if(mobile.get(ki).mob1.equals(Buyed_Phone)){
                                mobile2k.add(mobile.get(ki));
                            }
                        }
                    }
                    else{
                        System.out.println("no stock available");
                    }
                    }
                    else if(user_choice==3){
                        for(int ki=0;ki<mobile2k.size();ki++){
                            System.out.println(mobile2k.get(ki).mob1+" "+mobile2k.get(ki).p1+" "+mobile2k.get(ki).c1);
                            }
                        }

                    }
                   }
                
                if(count==0){
                    System.out.println("pending for approval");

                }
                break;
            }
                 
        }
    }

    public static void main(String[]ar){
        exist.add("ezhil");
        existpass.add("2525");
        
        int a=0;
        do{
            System.out.println("AMAZON");
            System.out.println("1:Admin");
            System.out.println("2:vendor");
            System.out.println("3:buyer");
            System.out.println("4:exit");
            a=sc.nextInt();
            switch(a){
                case 1:
                    
                    admin();
                    break;
                case 2:
                    System.out.println("vendor");
                    vendor();
                    break;
                case 3:
                    System.out.println("buyer");
                    buyer();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid input");
                    System.exit(0);
                    
                                   

            }

        }while(a!=4);
        
    }
    
}