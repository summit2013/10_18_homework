package hg;

import java.util.Scanner;



class A{
	 class B{//内部类方便
	  private String processname ;//s进程名
	  private float arrivetime ;//到达时间
	  private float servetime ;//服务时间   
	  private float finishtime ;//完成时间
	  private float turnovertime ;//周转时间
	  private float weighturnovertime ;//带权周转时间
	  private int flag=0 ;//标记该进程是否已经完成
	  
	  public B(String processname,float arrivetime,float servetime){//构造方法只传入已知量
	   this.processname=processname ;
	   this.arrivetime=arrivetime ;
	   this.servetime=servetime ;
	  }
	  public void setFlag(){
	   this.flag=1 ;
	  }
	  public void setFinishtime(float finishtime){
	   this.finishtime=finishtime ;  
	  }
	  public void setTurnovertime(){//计算周转时间
	   this.turnovertime=this.finishtime-this.arrivetime ;
	  }
	  public void setWeighturnovertime(){//计算带权周转时间
	   this.weighturnovertime=this.turnovertime/this.servetime ;
	  }
	  public String toString(){//覆写toString函数
	   return this.processname + "\t" + this.arrivetime+ "\t\t" + this.servetime + "  \t"
	    + this.finishtime + "\t\t" + this.turnovertime + "\t\t" + this.weighturnovertime + "\n" ;
	  }
	 }
	  
	 private B processes[]=new B[10] ;//进程数组
	 private int n=0 ;//记录进程数
	 private int finishnum=0 ;//记录已经完成的进程数
	 private  float finish=0 ;
	 private float aveturnovertime ;//平均周转时间
	 private float aveweighturnovertime ;//平均带劝周转时间
	 public void setFinish(float servetime){
	  finish+=servetime ;
	 }
	 public void add(String processname,float arrivetime,float servetime){//添加进程并计算完成时间
	  B process=new B(processname,arrivetime,servetime) ;
	  this.processes[n]=process ;
	  n++ ;
	 }
	 public void fun(){//查找第一个到达时间最找的进程
	  float temp=processes[0].arrivetime ;//记录最小的到达时间
	  int k=0 ;//标志该执行的进程
	  for(int i=0;i<this.n;i++){//找到达到时间最早的进程
	   if(temp>processes[i].arrivetime){
	    temp=processes[i].arrivetime ;
	    k=i ;
	   }
	  }
	  this.finish=temp ;//设置finish的初始值为到达最早的进程的到达时间
	  this.set(k) ;
	  while(this.finishnum!=this.n){
	   float min=1000f ;int flag=0 ;
	   for(int i=0;i<n;i++){//根据到达时间最早原则，找到该执行的进程
	    if(this.processes[i].flag==0 && this.processes[i].arrivetime<=finish){
	     //进程还没执行，并且已经到达
	     if(min>this.processes[i].arrivetime){
	      min=this.processes[i].arrivetime ;
	      k=i ;
	      flag=1 ;
	     }
	    }
	   }
	   if(flag==0){
	    this.finish++ ;
	   }else{
	    this.set(k) ;
	    }
	  }
	  for (int i=0;i<this.n;i++ ){
	   this.aveturnovertime+=processes[i].turnovertime ;
	  }
	  this.aveturnovertime/=this.n ;
	  for (int i=0;i<this.n;i++ ){
	   this.aveweighturnovertime+=processes[i].weighturnovertime ;
	  }
	  this.aveweighturnovertime/=this.n ;
	 }
	 public void set(int i){//计算一个进程的完成时间，周转时间，带权周转时间
	  this.setFinish(this.processes[i].servetime) ;
	  this.processes[i].setFinishtime(finish) ;
	  this.processes[i].setTurnovertime() ;
	  this.processes[i].setWeighturnovertime() ;
	  this.processes[i].setFlag() ;//进程完成
	  this.finishnum++ ;
	 }
	 public void print(){//打印输出
	  for(int i=0;i<this.n;i++){
	   System.out.print(this.processes[i]) ;
	  }
	  System.out.println("平均周转时间：" +this.aveturnovertime) ;
	  System.out.println("平均带权周转时间：" + this.aveweighturnovertime) ;
	 }
	}
	public class FCFS{
	 public static void main(String args[]) {
	  A a=new A() ;
	  String b;
	  float c,d;
	  System.out.println("请输入进程的数量(int)：");
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      for (int i = 1; i <= num; i++) {        
          System.out.println("输入进程" + i + "的进程名(String)……到达时间(float)……运行时间(float)");
          b=scan.next();
          c=scan.nextInt();
         d=scan.nextInt();     
          a.add(b,c,d);}
	  a.fun() ;
	  System.out.println("进程名 到达时间 服务时间\t完成时间\t周转时间\t带权周转时间") ;
	  a.print() ;
	 }
	 }
	