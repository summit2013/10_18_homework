using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Threading;

namespace testgdi2
{
    public partial class Form1 : Form
    {

        public Form1()
        {
            InitializeComponent();
        }

        public struct pcb    //进程控制块结构
        {
            public string name;
            public int TimeComing;//到达时间
            public int TimeServer;//服务时间
            public int TimeBegin;//开始时间
            public int TimeEnd;//结束时间
            public double rate;
            public bool finish;
        }

        public pcb[] m_pcb = new pcb[5];
        
        //设置进程参数，打开“设置”窗口
        private void button1_Click(object sender, EventArgs e)
        {
            form2 frm2 = new form2(this);
            frm2.ShowDialog();            
        }

        protected void GrawLine()   //把需要的表格背景绘画出来
        {
            Graphics gps = this.CreateGraphics();
            Pen pen_showtable = new Pen(Color.Blue, 2f);
            gps.DrawLine(pen_showtable, 30, 30, 30, 320);
            gps.DrawLine(pen_showtable, 30, 320, 635, 320);
            gps.DrawString(m_pcb[0].name, this.Font, Brushes.Blue, 8, 80);
            gps.DrawString(m_pcb[1].name, this.Font, Brushes.Blue, 8, 130);
            gps.DrawString(m_pcb[2].name, this.Font, Brushes.Blue, 8, 180);
            gps.DrawString(m_pcb[3].name, this.Font, Brushes.Blue, 8, 230);
            gps.DrawString(m_pcb[4].name, this.Font, Brushes.Blue, 8, 280);

        }
               
        private void button2_Click(object sender, EventArgs e)   //开始
        {
            GrawLine();
            FCFS(ref m_pcb);
        }

        private void button3_Click(object sender, EventArgs e)   //停止
        {
            this.Close();
        }

        public void FCFS(ref pcb[] m_pcb)    // 先来先服务 
        {
            int n = 0;    //保存先来的服务的索引
            int x = 0, locate_x = 30, locate_y;

            for (int j = 0; j < m_pcb.Length; j++)
            {
                n = FirstIn(ref m_pcb);    //调用求要进入此次的服务进程n的函数
                int k = m_pcb[n].TimeServer;    //服务时间
                Graphics gps = this.CreateGraphics();
                Pen pen_showtable = new Pen(Color.Black , 3f);
                locate_y = 50 * (n + 1) + 33;
                x = 10;
                for (int i = 0; i < k; i++)
                {
                    gps.DrawLine(pen_showtable, locate_x, locate_y, locate_x + x, locate_y);
                    locate_x = locate_x + x;
                    Thread.Sleep(1000);
                    m_pcb[n].TimeServer--;  //还需要的服务时间，循环一次，自减。
                   
                }
                m_pcb[n].finish = true; //标明此个进程已经结束
            }
        }

        private int FirstIn(ref pcb[] m_pcb)   //求最早到达时间的作业，返回此作业在进程控制块数组中的索引号。
        {
            int n = 0;
            int m = 10000;  //设置最大服务时间10000个单位
            for (int j = 0; j < m_pcb.Length; j++)
            {
                if (m >= m_pcb[j].TimeComing && !m_pcb[j].finish) //求到达时间最小、并且是没完成的作业。
                {
                    m = m_pcb[j].TimeComing; //到达时间最小的作业的到达时间赋给m
                    n = j;//保存最小到达时间的索引号
                }
            }
            return n;
        }

   }
}

