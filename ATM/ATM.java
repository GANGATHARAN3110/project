import java.util.*;
class bruce{
    static Scanner sc;
    static Date date=java.util.Calendar.getInstance().getTime();
    static ArrayList<String>list=new ArrayList<String>();
    static int[] arr=new int[4];
    static int[] tray={new int[4];
    static int cu=0;
    static int  withdraw=0;
    static int  balance=0;

    static void ganga(int with){
        if(with/2000!=0){
            arr[0]=with/2000;
            with=with%2000;
            tray[0]=tray[0]-arr[0];
        }
        if(with/500!=0){
            arr[1]=with/500;
            with=with%500;
            tray[1]=tray[1]-arr[1];
        }
        if(with/200!=0){
            arr[2]=with/200;
            with=with%200;
            tray[2]=tray[2]-arr[2];
        }
        if(with/100!=0){
            arr[3]=with/100;
            with=with%100;
            tray[3]=tray[3]-arr[3];
        }
    }
    static void with2(){
        if(arr[0]>tray[0]){
            int m=arr[0]-tray[0];
            int n=m*2000;
            if(n%10==0){
                arr[1]=arr[1]+(n/500);
                arr[0]=tray[0];
            }
        }
        if(arr[1]>tray[1]){
            int m=arr[1]-tray[1];
            int n=m*500;
            int k=n/200;
            n=n%200;
            int kl=n/100;
            arr[1]=tray[1];
            arr[2]=arr[2]+k;
            arr[3]=arr[3]+kl;

        }
        if(arr[2]>tray[2]){
            int m=arr[2]-tray[2];
            int n=m*2;
            arr[2]=tray[2];
            arr[3]=arr[3]+n;

        }
        
    }
    public static void admin(){
        System.out.println("enter the admin");
        String user=sc.nextLine();
        System.out.println("enter pin");
                int pin=sc.nextInt();
                if(user.equals("admin")&&pin==1234){
                    System.out.println("logged in");
                    t:while(true)
                    {
                   // System.out.print("\033[H\033[2J");
                   // System.out.flush();
                    
                    System.out.println("1.load money");
                    System.out.println("2.show money");
                    System.out.println("3:show tray");
                    System.out.println("4.exit");
                    int ds=sc.nextInt();
                    switch(ds){
                        case 1:
                            addMoney();
                        break;
                        case 2:
                            showMoney();
                        break;
                        case 3:
                            with2();
                            if(arr[4]>tray[4]){
                                System.out.println("Amount unavaile");

                            }
                            if(arr[4]<=tray[4]){
                                tray[0]=tray[0]-arr[0];
                                tray[1]=tray[1]-arr[1];
                                tray[2]=tray[2]-arr[2];
                                tray[3]=tray[3]-arr[3];
                            }
                            for(int i=0;i<tray.length;i++){
                                System.out.println(tray[i]);
                            }
                            break;
                        case 4:    
                            break t;        

                    }   
                }
            }
                else{
                    System.out.println("invalid user");   
                }
            
    }
    public static void  addMoney(){
        System.out.println("enter no of 2000");
        int a1=sc.nextInt();
        System.out.println("enter no of 500");
        int b1=sc.nextInt();
        System.out.println("enter no of 200");
        int c1=sc.nextInt();
        System.out.println("enter no of 100");
        int d1=sc.nextInt();

        tray[0]+=a1;
        tray[1]+=b1;
        tray[2]+=c1;
        tray[3]+=d1;
    }
    static void showMoney(){
        for(int i=0;i<4;i++){
            if(i==0){
                System.out.println("no of 2000 rupees note is:"+tray[0]);
            }
            else if(i==1){
                System.out.println("no of 500 rupees note is:"+tray[1]);
            }
            else if(i==2){
                System.out.println("no of 200 rupees note is:"+tray[2]);
            }
            else if(i==3){
                System.out.println("no of 100 rupees note is:"+tray[3]);
            }
            else{
                System.out.println("not available");
            }
            
        }
        cu=(tray[0]*2000+tray[1]*500+tray[2]*200+tray[3]*100);
        System.out.println(cu);
    }
    
    static int count=1;
    public static void user(){
        System.out.println("enter user name");
        String User1=sc.nextLine();
        System.out.println("enter password");
        int password=sc.nextInt();
        if(User1.equals("ganga")&&password==12345){

        int balance=20000;
        int withdraw=0;
        int deposite=0;
        int num=0;
        
        while(true){
            System.out.println("Welcome user");
            System.out.println("1.withdraw");
            System.out.println("2.deposit");
            System.out.println("3.check balance");
            System.out.println("4.mini statement");
            System.out.println("5.exit");
            num=sc.nextInt();
            switch(num){
                case 1:
                    System.out.println("enter amount to with draw");
                    withdraw=sc.nextInt();
                    if(balance>=withdraw && cu>=withdraw){
                        count++;
                        ganga(withdraw);
                        balance-=withdraw;
                        System.out.println("your current balance"+balance);
                        System.out.println("collect money");
                        list.add(date+" "+"Amount debited:"+withdraw);
                        for(int i=0;i<4;i++){
                            System.out.println(arr[i]);
                            
                        }
                    }
                    else{
                        System.out.println("you don't have enough money ");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("enter amout to deposit");
                    deposite=sc.nextInt();
                    balance=balance+deposite;
                    System.out.println("balance amount is"+balance);
                    System.out.println("amount deposited sucessfully");
                    list.add(date+" "+"Amount deposited:"+deposite);
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("balance of your account"+balance);
                    System.out.println(" ");
                    break;
                case 4:
                    for(int i=0;i<list.size();i++){
                        System.out.println(list.get(i));
                    }
                    break;    
                case 5:
                    return;
                    // break;

                }
            }
        }
    }

    public static void main(String []ar){
        sc=new Scanner(System.in);
        int a=0;
        do{
           System.out.println("1:Admin");
           System.out.println("2:User");
           System.out.println("3:Exit");
            a=sc.nextInt();
            sc.nextLine();
            
            switch(a){
                case 1:
                    admin();
                
                break;
                case 2:
                    user();
                break;
                case 3:
                System.exit(0);
                break;
                default:
                System.out.println("invalid input");
                System.exit(0);

            }

    }while(a!=3);

    
    }
}