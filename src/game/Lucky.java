package game;


import java.util.Random;
import java.util.Scanner;
 
//���˳齱
public class Lucky {
    static int huiyuanhao;//�洢��½ʱ��Ա��
    static int i=  0;
    static String[] name=new String[ 10];
    static String[] password=new String[ 10];
    static int[] radom=new int[  5];
    static int[] xinyunRadom=new int[ 10];//��Ա��
    static int[] c=new int[  5];
    static int[] d=new int[  5];
    static int[] e=new int[  5];
    static int[] f=new int[  5];
    boolean flag = true;
    Scanner input=new Scanner(System.in);
     
    //���˵�ҳ��
    public int menu(){
        System.out.println("------��ӭ�������˳齱ϵͳ------\n"
                           +"1.ע��\n"
                           +"2.��½\n"
                           +"3.�齱\n"
                           +"0.�˳�\n"
        );  
        Scanner input=new Scanner(System.in);
        System.out.println("������ѡ��");
        int choice=input.nextInt();
        return choice;
         
    }
     
     
    //ע�����
    public void zhuce(){
        i=f[  0];
        int a=  0;    
        Lucky lucky=new Lucky();
        System.out.println("��ӭ����ע�����");
        boolean k=true;
        while(k){
            if(i>  9){
            System.out.println("����ע�ᳬ��ʮ�Σ�������ע��");
            k=false;
        }
            else{
        System.out.println("�����������˻�������");   
        name[i]=input.next();   
        for(int j=  0;j<i;j++){
            if(name[i].equals(name[j])!=true){
                a=a+  1;
            }   
        }
         
        if(((a==i)&&(i!=  0))||i==  0){         
        System.out.println("�����������˻����룺");
        password[i]=input.next();
        System.out.println("���ٴ����������˻����룺");
        String password2=input.next();
        if(password[i].equals(password2)){
        Random rad = new Random();
        xinyunRadom[i] = rad.nextInt( 10);
        System.out.println("��ע��ɹ�\n"
                           +"�����˻���Ϊ��"+name[i]+"\n"
                           +"��������Ϊ"+password[i]+"\n"
                           +"ϵͳ��Ϊ�����ɻ�Ա��\n"
                           +"���Ļ�Ա��Ϊ��"+xinyunRadom[i]
                );
        a=a+  1;
        f[  0]=a;
        System.out.println(f[  0]);
        d[  0]=  1;
        k=false;
        }
        else{                       
            System.out.println("���������������������"); 
        }
        }
        else{
            System.out.println("���˺���ע�ᣬ����������");
        }
        }
        }
         
    }
     
     
    //��¼����
    public void denglu(){   
         
        int a=  0;
        int b=d[  0];
        Lucky lucky=new Lucky();
        if(b>  0){
        for(int j=  1;j<=  3;j++){
            System.out.println("��ӭ������½����");
            System.out.println("�����������û�����");
            String userName=input.next();
            System.out.println("�������������룺");
            String userPassword=input.next();
            for(int k=  0;k<lucky.name.length;k++){
                 if(userName.equals(name[k])&&userPassword.equals(password[k])){    
                     a=a+  1;
                     c[  0]=  1;
                     huiyuanhao=xinyunRadom[k];
                 }
                  
            }
            if(a>  0){ 
                 System.out.println("���ѵ�½�ɹ���");
                 break;
             }
             else{
                System.out.println("�û��������������������������! ������"+(  3-j)+"���������");
             }  
        }
        }
        else{
            System.out.println("����û��ע�ᣬ����ע��");
        }
 
    }
     
     
    //�齱
    public void choujiang(){
         
        int a=  0;
        Lucky lucky=new Lucky();        
        int b=c[  0];
        //System.out.println(a);
        if(b>  0){
        System.out.println("��ӭ�����齱����");
        //�������5����Ա��
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
        System.out.print("ϵͳ���ɵ������Ϊ��");
        for(int i=  0;i<  5;i++){
            if(i!=  4){
              System.out.print(radom[i]+" ");
             }  
            else{
                System.out.println(radom[i]);
            }
        }
        System.out.println("���Ļ�Ա��Ϊ��"+huiyuanhao);
        if(a>  0){
            System.out.println("��ϲ����Ϊ���˻�Ա������");
        }
        else{
            System.out.println("���ź���û�г齱�ɹ�");
        }
        e[  0]=  1;
        e[  0]=e[  0]+  1;
        }
        else{
            System.out.println("����û�е�¼�����ȵ�½");
        }
    }  
     
    //yes or no �˳�
    public void exit(){
        boolean flag2 = true;
        Scanner input=new Scanner(System.in);
        while(flag2){
        System.out.println("�Ƿ�Ҫ�˳���yes or no");
        String select=input.next();
        switch(select){ 
        case "yes": 
            System.out.println("���Ѱ�ȫ�˳�");
            flag=false;
            flag2=false;
            break;
        case "no":      
            flag2=false;
            break;
        default:
            System.out.println("���볬����Χ������������");
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
                System.out.println("���ѳ�����������ٳ�");
            }
            lucky.exit();
            break;
        case   0:
             lucky.flag = false;     
             System.out.println("�����˳�");
            break;
        default:
            System.out.println("�����ڸ�ѡ�����������");
            break;
         
         
        }
    }}
 
}
 

