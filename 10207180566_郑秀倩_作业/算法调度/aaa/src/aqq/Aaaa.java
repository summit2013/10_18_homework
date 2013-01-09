package aqq;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Aaaa {
	 JPanel pane=new  JPanel();
	 private B processes[]=new B[10] ;//进程数组
	 private int n=0 ;//记录进程数
	 private int finishnum=0 ;//记录已经完成的进程数
	 private  float finish=0 ;
	 private float zui=0;
	 private float aveturnovertime ;//平均周转时间
	 private float aveweighturnovertime ;//平均带劝周转时间
	 class B{//内部类方便
		  private String processname ;//s进程名
		  private float arrivetime ;//到达时间
		  private float servetime ;//服务时间   
		  private float finishtime ;//完成时间
		  private float turnovertime ;//周转时间
		  private float weighturnovertime ;//带权周转时间
		  private int flag=0 ;//标记该进程是否已经完成
		  private int flo=0 ;
		  public B(String processname,float arrivetime,float servetime){//构造方法只传入已知量
		   this.processname=processname ;
		   this.arrivetime=arrivetime ;
		   this.servetime=servetime ;
		  }
		  public void setFlag(){
		   this.flag=1 ;
		  }
		  public void setFlo(){
			   this.flo=1 ;
			  }
		  public void setFinishtime(float finishtime){
		   this.finishtime=finishtime ;  
		  }
		  public void setTurnovertime(){//计算周转时间
		   this.turnovertime=this.finishtime-this.arrivetime ;
		  }
		  public void setWeightturnovertime(){//计算带权周转时间
		   this.weighturnovertime=this.turnovertime/this.servetime ;
		  }
		  public String toString(){//覆写toString函数
		   return this.processname + "\t" + this.arrivetime+ "\t\t" + this.servetime + "  \t"
		    + this.finishtime + "\t\t" + this.turnovertime + "\t\t" + this.weighturnovertime + "\n" ;
		  }
		 }
		
		 public void setFinish(float servetime){
		  finish+=servetime ;
		 }
		 public void add(String processname,float arrivetime,float servetime){//添加进程并计算完成时间
		  B process=new B(processname,arrivetime,servetime) ;
		  this.processes[n]=process ;
		  n++ ;
		 }
		 public  float ft(){
			 float tem=processes[0].arrivetime ;//记录最小的到达时间
			  int k=0,ds=0,aas=0;//标志该执行的进程
			  for(int i=0;i<this.n;i++){//找到达到时间最早的进程
			   if(tem>processes[i].arrivetime){
			    tem=processes[i].arrivetime ;
			    k=i ;
			    aas=i;
			   }
			  }
			  zui=tem+processes[k].servetime;
			  this.processes[k].flo=1;
			  ds++;
			  while(ds!=this.n){
				   k=setas(aas) ;
				   while(k==aas){
				    zui++ ;
				    k=setas(aas) ;}
				   ds++;
				   zui+=this.processes[k].servetime;
				   this.processes[k].flo=1;
				   
			  }
			  return zui;
		 }
		public Graphics fun(Graphics g){//查找第一个到达时间最找的进程
		  float temp=processes[0].arrivetime ;//记录最小的到达时间
		  int k=0,qw=0;//标志该执行的进程
		  int al=(int) ft()/10+1;
		  int qd=(int) 490/al;
		  for(int w=1;w<=al;w++)
		  {g.drawLine(80+w*qd, 367, 80+w*qd, 370);
		  g.drawString(String.valueOf(w), 76+w*qd, 382)	;	  }
		  for(int i=0;i<this.n;i++){//找到达到时间最早的进程
		   if(temp>processes[i].arrivetime){
		    temp=processes[i].arrivetime ;
		    k=i ;
		    qw=i;
		   }
		   if(temp==processes[i].arrivetime&&processes[i].servetime<processes[k].servetime){
			    k=i ;
			    qw=i;
			   
		   }
		  }
		  this.finish=temp ;//设置finish的初始值为到达最早的进程的到达时间
		  g.setColor(fon(k));
		  g.drawLine(((int)processes[k].arrivetime)*qd/10+80, 310-Integer.parseInt(processes[k].processname)*40,((int)processes[k].arrivetime+(int)processes[k].servetime)*qd/10+80, 310-Integer.parseInt(processes[k].processname)*40);
		  g.drawLine(((int)processes[k].arrivetime)*qd/10+80,330,((int)processes[k].arrivetime+(int)processes[k].servetime)*qd/10+80, 330);
			 System.out.println("cuowucuowu");
		  this.set(k) ;
		  g.setColor(Color.black); 
		  String ca=processes[k].processname;
		  g.drawString("进程名", 80, 413);
			g.drawString(ca, 85, 430+k*20);
			ca=String.valueOf((int)processes[k].arrivetime);
			g.drawString(ca, 145, 430+k*20);
			g.drawString("进入时间", 140, 413);
			ca=String.valueOf((int)processes[k].servetime);
			g.drawString(ca, 205, 430+k*20);
			g.drawString("运行时间", 200, 413);
			ca=String.valueOf((int)processes[k].finishtime);
			g.drawString(ca,275, 430+k*20);
			g.drawString("t完成时间", 270,413);
			ca=String.valueOf(processes[k].turnovertime);
			g.drawString(ca, 345, 430+k*20);
			g.drawString("t周转时间间", 340, 413);
			ca=String.valueOf(processes[k].weighturnovertime);
			g.drawString(ca,415, 430+k*20);
			g.drawString("带权周转时间", 410, 413);
		  while(this.finishnum!=this.n){
		   k=setRp(qw) ;
		   while(k==qw){
		    this.finish++ ;
		    k=setRp(qw) ;
		    System.out.println("daws"+k);
		   }
		   g.setColor(fon(k));
			 g.drawLine(((int)processes[k].arrivetime)*qd/10+80, 310-Integer.parseInt(processes[k].processname)*40,((int)processes[k].arrivetime+(int)processes[k].servetime)*qd/10+80, 310-Integer.parseInt(processes[k].processname)*40);
			 g.drawLine(((int) (this.finish)*qd/10+80),330,((int)this.finish+(int)processes[k].servetime)*qd/10+80, 330);	 
			 System.out.println("shishisuwuwu");
		   this.set(k) ; 
		   g.setColor(Color.black); 
		   String ca1=processes[k].processname;
			g.drawString(ca1, 85, 430+k*20);
			ca1=String.valueOf((int)processes[k].arrivetime);
			g.drawString(ca1, 145, 430+k*20);
			ca1=String.valueOf((int)processes[k].servetime);
			g.drawString(ca1, 205, 4030+k*20);
			ca1=String.valueOf((int)processes[k].finishtime);
			g.drawString(ca1,275, 430+k*20);
			ca1=String.valueOf(processes[k].turnovertime);
			g.drawString(ca1, 345, 430+k*20);
			ca1=String.valueOf(processes[k].weighturnovertime);
			g.drawString(ca1,415, 430+k*20);
			
		  }
		 for (int i=0;i<this.n;i++ ){
		   this.aveturnovertime+=processes[i].turnovertime ;
		  }
		  this.aveturnovertime/=this.n ;
		  for (int i=0;i<this.n;i++ ){
		   this.aveweighturnovertime+=processes[i].weighturnovertime ;
		  }
		  this.aveweighturnovertime/=this.n ; 
		  return g;
		 }
	
		 public Color fon(int ad){
			 if(ad==0)return Color.blue;
			 else if(ad==1)return Color.gray;
			 else if(ad==2)return Color.red;
				 else if(ad==3)return Color.green;
					 else if(ad==4)return Color.yellow;
						 else return Color.pink;											 
		 }
		 public int setRp(int as){//计算优先权，并返回优先权大的进程下表标
		  int i=0 ;
		  int m=this.n;//记录优先权最大的进程的下标
		  float temp=0.0f ;//记录最大的优先权
		  while(i<this.n){//进程还没执行并且已经到达
		   if(this.processes[i].flag==0 && this.processes[i].arrivetime<=this.finish){
		    float Rp=(this.finish-this.processes[i].arrivetime)/ this.processes[i].servetime ;
		    if(temp<=Rp){
		     temp=Rp ;
		     m=i ;  
		    }
		   }
		   i++ ;
		  }
		  
		 if(m==this.n){
			 for(int j=0;j<this.n;j++)
				 if(this.processes[j].flag==0 && this.processes[j].arrivetime>this.finish)
					 m=as;
		 }
		  return m ;
		 }
		 public int setas(int dq){//计算优先权，并返回优先权大的进程下表标
			  int i=0 ;
			  int m=this.n;//记录优先权最大的进程的下标
			  float tem=0.0f ;//记录最大的优先权
			  while(i<this.n){//进程还没执行并且已经到达
			   if(this.processes[i].flo==0 && this.processes[i].arrivetime<=zui){
			    float Rp=(zui-this.processes[i].arrivetime)/ this.processes[i].servetime ;
			    if(tem<=Rp){
			     tem=Rp ;
			     m=i ;  
			    }
			   }
			   i++ ;
			  }
			  
			 if(m==this.n){
				 for(int j=0;j<this.n;j++)
					 if(this.processes[j].flo==0 && this.processes[j].arrivetime>zui)
						 m=dq;
			 }
			  return m ;
			 }
		 public void set(int i){//计算一个进程的完成时间，周转时间，带权周转时间
		  this.setFinish(this.processes[i].servetime) ;
		  this.processes[i].setFinishtime(finish) ;
		  this.processes[i].setTurnovertime() ;
		  this.processes[i].setWeightturnovertime() ;
		  this.processes[i].setFlag() ;//进程完成
		  this.finishnum++ ;
		 }
		 public void print(){//打印输出
		  for(int i=0;i<this.n;i++){
		   System.out.print(this.processes[i]) ; ;
		  }
		  System.out.println("平均周转时间：" +this.aveturnovertime) ;
		  System.out.println("平均带权周转时间：" + this.aveweighturnovertime) ;
		 }
		 public void paintChequer() {
				// 重写JPanel的paintComponent(Graphics g)方法，在该方法内画线
				 pane = new JPanel() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 0L;

					public void paintComponent(Graphics g) {
						g.drawString("进程1", 40, 275);
						g.drawString("进程2", 40, 235);
						g.drawString("进程3", 40, 195);
						g.drawString("进程4", 40, 155);
						g.drawString("进程5", 40, 115);
						g.drawString("进程6", 40, 75);
						g.drawString("过程", 45, 335);
						g.drawString("时间 1:10", 600, 60);
						
						g.drawLine(80,40,80,370);
						g.drawLine(80,370,600,370);
						g.drawLine(76, 70, 80, 70);
						g.drawLine(76, 110, 80, 110);
						g.drawLine(76, 150, 80, 150);
						g.drawLine(76, 190, 80, 190);
						g.drawLine(76, 230, 80, 230);
						g.drawLine(76, 270, 80, 270);
						g.drawLine(76, 330, 80, 330);
						
						fun(g);
					
					
						}};}
		}
