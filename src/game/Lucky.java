package game;


import java.util.Random;
import java.util.Scanner;
 
//幸运抽奖
public class Lucky {
    static int huiyuanhao;//存储登陆时会员号
    static int i=  0;
    static String[] name=new String[ 10];
    static String[] password=new String[ 10];
    static int[] radom=new int[  5];
    static int[] xinyunRadom=new int[ 10];//会员号
    static int[] c=new int[  5];
    static int[] d=new int[  5];
    static int[] e=new int[  5];
    static int[] f=new int[  5];
    boolean flag = true;
    Scanner input=new Scanner(System.in);
     
    //主菜单页面
    public int menu(){
        System.out.println("------欢迎来到幸运抽奖系统------\n"
                           +"1.注册\n"
                           +"2.登陆\n"
                           +"3.抽奖\n"
                           +"0.退出\n"
        );  
        Scanner input=new Scanner(System.in);
        System.out.println("请输入选项");
        int choice=input.nextInt();
        return choice;
         
    }
     
     
    //注册界面
    public void zhuce(){
        i=f[  0];
        int a=  0;    
        Lucky lucky=new Lucky();
        System.out.println("欢迎来到注册界面");
        boolean k=true;
        while(k){
            if(i>  9){
            System.out.println("您已注册超过十次，不可再注册");
            k=false;
        }
            else{
        System.out.println("请输入您的账户姓名：");   
        name[i]=input.next();   
        for(int j=  0;j<i;j++){
            if(name[i].equals(name[j])!=true){
                a=a+  1;
            }   
        }
         
        if(((a==i)&&(i!=  0))||i==  0){         
        System.out.println("请输入您的账户密码：");
        password[i]=input.next();
        System.out.println("请再次输入您的账户密码：");
        String password2=input.next();
        if(password[i].equals(password2)){
        Random rad = new Random();
        xinyunRadom[i] = rad.nextInt( 10);
        System.out.println("已注册成功\n"
                           +"您的账户名为："+name[i]+"\n"
                           +"您的密码为"+password[i]+"\n"
                           +"系统已为您生成会员号\n"
                           +"您的会员号为："+xinyunRadom[i]
                );
        a=a+  1;
        f[  0]=a;
        System.out.println(f[  0]);
        d[  0]=  1;
        k=false;
        }
        else{                       
            System.out.println("密码输入错误，请重新输入"); 
        }
        }
        else{
            System.out.println("该账号已注册，请重新输入");
        }
        }
        }
         
    }
     
     
    //登录界面
    public void denglu(){   
         
        int a=  0;
        int b=d[  0];
        Lucky lucky=new Lucky();
        if(b>  0){
        for(int j=  1;j<=  3;j++){
            System.out.println("欢迎来到登陆界面");
            System.out.println("请输入您的用户名：");
            String userName=input.next();
            System.out.println("请输入您的密码：");
            String userPassword=input.next();
            for(int k=  0;k<lucky.name.length;k++){
                 if(userName.equals(name[k])&&userPassword.equals(password[k])){    
                     a=a+  1;
                     c[  0]=  1;
                     huiyuanhao=xinyunRadom[k];
                 }
                  
            }
            if(a>  0){ 
                 System.out.println("您已登陆成功！");
                 break;
             }
             else{
                System.out.println("用户名或密码输入错误，请重新输入! 您还有"+(  3-j)+"次输入机会");
             }  
        }
        }
        else{
            System.out.println("您还没有注册，请先注册");
        }
 
    }
     
     
    //抽奖
    public void choujiang(){
         
        int a=  0;
        Lucky lucky=new Lucky();        
        int b=c[  0];
        //System.out.println(a);
        if(b>  0){
        System.out.println("欢迎来到抽奖界面");
        //随机生成5个会员号
        Random rad = new Random();  
        for(int i=  0;i<radom.length;i++){
            radom[i]= rad.nextInt( 10);
            for(int j=  0;j<i;j++){
                if(radom[i]!=radom[j]){
                     if(radom[i]==huiyuanhao){
                         a=a+  1;
                     }  
                }
                else{
                    radom[i]= rad.nextInt( 10);
                }
            }
        }
        System.out.print("系统生成的随机数为：");
        for(int i=  0;i<  5;i++){
            if(i!=  4){
              System.out.print(radom[i]+" ");
             }  
            else{
                System.out.println(radom[i]);
            }
        }
        System.out.println("您的会员号为："+huiyuanhao);
        if(a>  0){
            System.out.println("恭喜您成为幸运会员！！！");
        }
        else{
            System.out.println("很遗憾，没有抽奖成功");
        }
        e[  0]=  1;
        e[  0]=e[  0]+  1;
        }
        else{
            System.out.println("您还没有登录，请先登陆");
        }
    }  
     
    //yes or no 退出
    public void exit(){
        boolean flag2 = true;
        Scanner input=new Scanner(System.in);
        while(flag2){
        System.out.println("是否要退出，yes or no");
        String select=input.next();
        switch(select){ 
        case "yes": 
            System.out.println("您已安全退出");
            flag=false;
            flag2=false;
            break;
        case "no":      
            flag2=false;
            break;
        default:
            System.out.println("输入超出范围，请重新输入");
            break;
        }
        }
    }
     
     
     
    public static void main(String[] args) {    
        Scanner input=new Scanner(System.in);
        Lucky lucky=new Lucky();
        e[  0]=  1;
        while(lucky.flag){
        int choice=lucky.menu();
        switch(choice){
        case   1:
            lucky.zhuce();
            i=i+  1;
            lucky.exit();
            break;
        case   2:
            lucky.denglu();
            lucky.exit();
            break;
        case   3:
            if(e[  0]==  1){
                lucky.choujiang();          
            }
            else{
                System.out.println("您已抽过奖，不能再抽");
            }
            lucky.exit();
            break;
        case   0:
             lucky.flag = false;     
             System.out.println("您已退出");
            break;
        default:
            System.out.println("不存在该选项，请重新输入");
            break;
         
         
        }
    }}
 
}
 

