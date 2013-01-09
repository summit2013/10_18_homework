import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
*
修改日志
1.把输出封装为函数
2.去掉printRoundTime（）方法中多余的realSize;
3.ThreadArray加入按到达时间由小到大排序
**/

public class Fcfs {
	public static void main(String[] args) {
         ThreadArray tArray = new ThreadArray();
         int threadNumber = 0;
         
         BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("请输入进程数目：");
         try {
			threadNumber = Integer.parseInt(stdin.readLine());
			
			for(int i=0; i<threadNumber; i++){
				System.out.println("请输入进程["+i+"]到达时间：");
				float comeTime = Float.parseFloat(stdin.readLine());
				System.out.println("请输入进程["+i+"]需要cpu的服务时间");
				float serverTime = Float.parseFloat(stdin.readLine());
				MyThread  thread = new MyThread(comeTime,serverTime);
		        tArray.addQueue(thread);
		        
		        
			}
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tArray.bubbleSort();
		 System.out.println("-------------------------------FCFS-------------------------------");
		tArray.printRoundTime();
         
         
	}

}
class ThreadArray {
	int Maxsize = 10;
	MyThread [] AQueue = new MyThread[Maxsize];//声明队列数组
	int realSize = -1;  
	 
	public void addQueue(MyThread thread){
		if(realSize >= Maxsize){
			System.out.println("the queue is full");
		}else{
			realSize++;                  
			AQueue[realSize] = thread;
		}
	}
	 //根据到达时间由小到大排序
		public void bubbleSort(){
//System.out.println("bubble");
		int i, j, k=0;         //循环计数变量
		boolean change;      //数据是否有变化
		MyThread temp;             //数据暂存变量
		
		for(j=realSize; j>=1; j--){    
//System.out.println("go");注意i,j 条件  等号？
			change = false;
			for(i=0; i<=j-1; i++){
//System.out.println("go2");
				if(AQueue[i+1].comeTime < AQueue[i].comeTime){   
					temp = AQueue[i];
					AQueue[i] = AQueue[i+1] ;
					AQueue[i+1] = temp;
					change = true;
					
				}
			}
			if(change){
				k++;
				System.out.println("--------------已经根据到达时间由小到大重新排序--"+k+"--");
			}
		}
	}
	/**
	 * 从进程提交到进程完成的时间间隔为周转时间.
	 * 也就是等待进入内存的时间,在就绪队列中等待的时间,在 CPU中执行的时间和I/O操作的时间的总和.
	 * 
	 * 本题实际情况：周转时间=就绪队列中等待的时间 + 在 CPU中执行的时间;
	 * @param realSize
	 */
	public void printRoundTime(){
		AQueue[0].finishTime = AQueue[0].comeTime + AQueue[0].serverTime;
		AQueue[0].roundTime = AQueue[0].finishTime ;
		print(0);
		for(int i=1; i<=realSize; i++){
			if(AQueue[i].comeTime > AQueue[i-1].finishTime){
				AQueue[i].finishTime = AQueue[i].comeTime + AQueue[i].serverTime;
				AQueue[i].roundTime = AQueue[i].serverTime;
				print(i);
			}else{
				AQueue[i].finishTime = AQueue[i-1].finishTime + AQueue[i].serverTime;
				AQueue[i].roundTime = AQueue[i].finishTime - AQueue[i].comeTime;
				print(i);
			}
		}
	}
	public void print(int i){
		System.out.println("进程["+i+"]开始时间"+AQueue[i].comeTime +"完成时间:"+AQueue[i].finishTime +"周转时间:"
			      +AQueue[i].roundTime +"带权周转时间:"+(float)(AQueue[i].roundTime/AQueue[i].serverTime));
	}
}
class MyThread{
	float comeTime;
	float serverTime;
	float finishTime;
	float roundTime;
	
	MyThread(float comeTime,float serverTime){
		this.comeTime = comeTime;
		this.serverTime = serverTime;
	}
}











