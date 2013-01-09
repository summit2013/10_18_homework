using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace FormsTest
{
    public partial class InputDialogBox : Form
    {
       
        public InputDialogBox()
        {
            InitializeComponent();
           
        }

        private void bt_Exit_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
        //重置按钮Click事件
        private void bt_Reset_Click(object sender, EventArgs e)
        {
            tb_A_Arrivatetime.Text ="0";
            tb_A_Execuatetime.Text = "0";

            tb_B_Arrivatetime.Text = "0";
            tb_B_Execuatetime.Text = "0";

            tb_C_Arrivatetime.Text = "0";
            tb_C_Execuatetime.Text = "0";

            tb_D_Arrivatetime.Text = "0";
            tb_D_Execuatetime.Text = "0";

        }
       
       
        //提交按钮的Click事件
        private void bt_HandOn_Click(object sender, EventArgs e)
        {
            //定义画笔变量
            Pen mypen_A = new Pen(Color.Red, 7);
            Pen mypen_B = new Pen(Color.Blue, 7);
            Pen mypen_C = new Pen(Color.Yellow, 7);
            Pen mypen_D = new Pen(Color.Green, 7);

            //执行时间的变量
            int At = Convert.ToInt32(tb_A_Execuatetime.Text);
            int Bt = Convert.ToInt32(tb_B_Execuatetime.Text);
            int Ct = Convert.ToInt32(tb_C_Execuatetime.Text);
            int Dt = Convert.ToInt32(tb_D_Execuatetime.Text);

            int a = 0, b = 0, c = 0, d = 0;
            if (tb_A_Arrivatetime.Text != "")
            {
                a = Convert.ToInt32(tb_A_Arrivatetime.Text);
            }
            if (tb_B_Arrivatetime.Text != "")
            {
                b = Convert.ToInt32(tb_B_Arrivatetime.Text);
            }
            if (tb_C_Arrivatetime.Text != "")
            {
                c = Convert.ToInt32(tb_C_Arrivatetime.Text);
            }
            if (tb_D_Arrivatetime.Text != "")
            {
                d = Convert.ToInt32(tb_D_Arrivatetime.Text);
            }
            if (cb_MethodSelect.Text == "先来先服务")
            {
                #region 进程A先执行的情况
                if (a < b & a < c & a < d)
                {
                    DrawingForm.graphics.DrawLine(mypen_A, 60, 200, (60 +At), 200);
                    if (b>a&b < c & b < d)
                    {
                        DrawingForm.graphics.DrawLine(mypen_B, 60 + At , 250, (60 + At + Bt), 250);
                        if (c > a & c > b & c < d)
                        {
                            DrawingForm.graphics.DrawLine(mypen_C, 60 + At + Bt ,300, (60+ At + Bt  + Ct), 300);
                            DrawingForm.graphics.DrawLine(mypen_D, 60 + At  + Bt  + Ct , 350, (60 + At + Bt  + Ct + Dt ), 350);
                        }
                        else if (d > a & d > b & d < c)
                        {
                            DrawingForm.graphics.DrawLine(mypen_D, 60 + At + Bt , 350, (60 + At + Bt + Dt), 350);
                            DrawingForm.graphics.DrawLine(mypen_C, 60 + At + Bt + Dt, 300, (At + Bt + Ct + Dt), 300);
                        }
                     }
                    else if (c > a & c < b & c < d)
                    {
                        DrawingForm.graphics.DrawLine(mypen_C, 60 + At, 300, (60 + At+ Ct), 300);
                        if (b > a & b > c & b < d)
                        {
                            DrawingForm.graphics.DrawLine(mypen_B, 60 + At + Ct, 250, (60 + At + Bt + Ct), 250);
                            DrawingForm.graphics.DrawLine(mypen_D, 60 + At + Bt + Ct, 350, (60 + At + Bt + Ct + Dt), 350);
                        }
                        else if (d > a & d > c & d < b)
                        {
                            DrawingForm.graphics.DrawLine(mypen_D, 60 + At+ Ct, 350, (60 + At+ Ct + Dt), 350);
                            DrawingForm.graphics.DrawLine(mypen_B, 60 + At + Ct + Dt, 250, (60 + At + Bt + Ct + Dt), 250);
                        }
                    }
                    else if (d > a & d < b & d < c)
                    {
                        DrawingForm.graphics.DrawLine(mypen_D, 60 + At, 350, (60 + At + Dt), 350);
                        if (b > a & b > d & d < c)
                        {
                            DrawingForm.graphics.DrawLine(mypen_B, 60 + At + Dt, 250, (60 + At + Bt + Dt), 250);
                            DrawingForm.graphics.DrawLine(mypen_C, 60 + At + Bt + Dt, 300, (60 + At + Bt + Dt + Ct), 300);
                        }
                        else if (c > a & c > d & c < b)
                        {
                            DrawingForm.graphics.DrawLine(mypen_C, 60 + At + Dt, 300, (60 + At + Dt + Ct), 300);
                            DrawingForm.graphics.DrawLine(mypen_B, 60 + At + Dt + Ct, 250, (60 + At + Dt + Ct+ Bt), 250);
                        }
                    }
                   
                 }
#endregion
                #region 进程B先执行的情况
                else if (b < a & b < c & b < d)
                {
                    DrawingForm.graphics.DrawLine(mypen_B, 60, 250, (60 + Bt ), 250);
                    if (a > b & a < c & a < d)
                    {
                        DrawingForm.graphics.DrawLine(mypen_A, (60 + Bt), 200, (60 + Bt + At), 200);
                        if (c > b & c > a & c < d)
                        {
                            DrawingForm.graphics.DrawLine(mypen_C, (60 + Bt + At), 300, (60 + Bt + At + Ct), 300);
                            DrawingForm.graphics.DrawLine(mypen_D, (60 + Bt + At + Ct), 350, (60 + At + Bt + Ct + Dt), 350);
                        }
                        else if (d > b & d > a & d < c)
                        {
                            DrawingForm.graphics.DrawLine(mypen_D, (60 + Bt + At), 350, (60 + At + Bt + Dt), 350);
                            DrawingForm.graphics.DrawLine(mypen_C, (60 + At + Bt + Dt), 300, (60 + At + Bt + Ct + Dt), 300);
                        }
                    }
                    else if (c > b & c < a & c < d)
                    {
                        DrawingForm.graphics.DrawLine(mypen_C,(60 + Bt),300,(60 + Bt + Ct), 300);
                        if (a > b & a > c & a < d)
                        {
                            DrawingForm.graphics.DrawLine(mypen_A, (60 + Bt + Ct), 200, (60 + Bt + Ct + At), 200);
                            DrawingForm.graphics.DrawLine(mypen_D, (60 + At + Bt + Ct), 350, (60 + At + Bt + Ct + Dt), 350);
                        }
                        else if (d > b & d > c & d < a)
                        {
                            DrawingForm.graphics.DrawLine(mypen_D, (60 + Bt + Ct), 350, (60  + Bt + Ct + Dt), 350);
                            DrawingForm.graphics.DrawLine(mypen_A, (60 + Bt+ Dt + Ct), 200, (60 + Bt+ At + Ct +Dt), 200);
                        }
                    }
                    else if (d > b & d < a & d < c)
                    {
                        DrawingForm.graphics.DrawLine(mypen_D, (60 + Bt), 350, (60 + Bt + Dt), 350);
                        if (a > b & a > d & a < c)
                        {
                            DrawingForm.graphics.DrawLine(mypen_A, (60 + Bt + Dt), 200, (60 + Bt +Dt + At), 200);
                            DrawingForm.graphics.DrawLine(mypen_C, (60 + Bt + Dt + At), 300, (60 + Bt + Dt + At + Ct), 300);
                        }
                        else if (c > b & c > d & c < a)
                        {
                            DrawingForm.graphics.DrawLine(mypen_C, (60 + Bt + Dt ), 300, (60 + Bt + Dt + Ct), 300);
                            DrawingForm.graphics.DrawLine(mypen_A, (60 + Bt + Dt + Ct), 200, (60 + Bt + Dt + At + Ct), 200);
                        }
                    }
                }
#endregion    
                #region 进程C执行的情况
                if (c < a & c < b & c < d)
                {
                    DrawingForm.graphics.DrawLine(mypen_C, 60, 300, (60 + Ct), 300);
                    if (a > c & a < b & a < d)
                    {
                        DrawingForm.graphics.DrawLine(mypen_A, (60 + Ct), 200, (60 + Ct + At), 200);
                        if (b > c & b > a & b < d)
                        {
                            DrawingForm.graphics.DrawLine(mypen_B, (60 + Ct + At), 250, (60 + Ct + At + Bt), 250);
                            DrawingForm.graphics.DrawLine(mypen_D, (60 + Ct + At + Bt), 350, (60 + Ct + At + Bt + Dt), 350);
                        }
                        else if (d>c&d>a&d<b)
                        {
                            DrawingForm.graphics.DrawLine(mypen_D, (60 + Ct + At ), 350, (60 + Ct + At + Dt), 350);
                            DrawingForm.graphics.DrawLine(mypen_B, (60 + Ct + At + Dt), 250, (60 + Ct + At + Bt + Dt), 250);
                        }
                    }
                    else if (b > c & b < a & b < d)
                    {
                        DrawingForm.graphics.DrawLine(mypen_B, (60 + Ct), 250, (60 + Ct +Bt ), 250);
                        if (a > c & a > b & a < d)
                        {
                            DrawingForm.graphics.DrawLine(mypen_A, (60 + Ct +Bt), 200, (60 + Ct +Bt + At), 200);
                            DrawingForm.graphics.DrawLine(mypen_D, (60 + Ct +Bt + At), 350, (60 + Ct+Bt + At + Dt), 350);
                        }
                        else if (d > c & d > b & d < a)
                        {
                            DrawingForm.graphics.DrawLine(mypen_D, (60 + Ct + Bt), 350, (60 + Ct + Bt + Dt), 350);
                            DrawingForm.graphics.DrawLine(mypen_A, (60 + Ct + Bt+ Dt ), 200, (60 + Ct + Dt + Bt + At), 200);
                        }
                    }
                    else if (d > c & d < a & d < b)
                    {
                        DrawingForm.graphics.DrawLine(mypen_D, (60 + Ct), 350, (60 + Ct +Dt), 350);
                        if (a > c & a > d & a < b)
                        {
                            DrawingForm.graphics.DrawLine(mypen_A, (60 + Ct + Dt ), 200, (60 + Ct + Dt + At), 200);
                            DrawingForm.graphics.DrawLine(mypen_B, (60 + Ct+ At +Dt), 250, (60 + Ct + Bt + At +Dt), 250);
                        }
                        else if (b > c & b > d & b < a)
                        {
                            DrawingForm.graphics.DrawLine(mypen_B, (60 + Ct + Dt), 250, (60 + Ct + Bt + Dt), 250);
                            DrawingForm.graphics.DrawLine(mypen_A, (60 + Ct + Dt+ Bt), 200, (60 + Ct + Dt +Bt + At), 200);
                            
                        }
                    }
                }
#endregion
                #region 进程D先执行的情况
                if(d<a&d<b&d<c)
                  {
                      DrawingForm.graphics.DrawLine(mypen_D, 60, 350, (60 + Dt), 350);
                      if (a > d & a < b & a < c)
                      {
                          DrawingForm.graphics.DrawLine(mypen_A, (60 + Dt), 200, (60 + Dt + At), 200);
                          if (b > d & b > a & b < c)
                          {
                              DrawingForm.graphics.DrawLine(mypen_B, (60 + At + Dt), 250, (60 + At + Bt + Dt), 250);
                              DrawingForm.graphics.DrawLine(mypen_C, (60+At +Bt +Dt ), 300, (60 + Ct+At +Bt +Dt ), 300);
                          }
                          else if (c > d & c > a & c < b)
                          {
                              DrawingForm.graphics.DrawLine(mypen_C, (60+At +Dt ), 300, (60 + Ct+At +Dt ), 300);
                              DrawingForm.graphics.DrawLine(mypen_B, (60 + At + Dt+ Ct ), 250, (60 + At + Bt+ Ct  + Dt), 250);  
                          }
                      }
                      else if (b > d & b < a & b < c)
                      {
                          DrawingForm.graphics.DrawLine(mypen_B, (60 + Dt), 250, (60 + Bt+ Dt), 250);
                          if (a > d & a > b & a < c)
                          {
                              DrawingForm.graphics.DrawLine(mypen_A, (60 +Bt + Dt), 200, (60 + Dt +Bt + At), 200);
                              DrawingForm.graphics.DrawLine(mypen_C, (60 + At + Dt + Bt ), 300, (60 + Ct +Bt + At + Dt), 300);
                          }
                          else if (c > d & c > b & c < a)
                          {
                               DrawingForm.graphics.DrawLine(mypen_C, (60 + Ct + Dt + Bt ), 300, (60 + Ct +Bt + Dt), 300);
                               DrawingForm.graphics.DrawLine(mypen_A, (60 + Bt+Ct + Dt), 200, (60 + Dt + Bt+Ct + At), 200);
                          }
                      }
                      else if(c>d&c<a&a<b)
                      {
                          DrawingForm.graphics.DrawLine(mypen_C, (60 + Dt), 300, (60 + Ct + Dt), 300);
                          if (b > d & b > c & b < a)
                          {
                              DrawingForm.graphics.DrawLine(mypen_B, (60 + Dt+Ct ), 250, (60 + Bt+Ct  + Dt), 250);
                              DrawingForm.graphics.DrawLine(mypen_A, (60+ Bt + Ct + Dt), 200, (60 + Dt + Bt + Ct + At), 200);
                          }
                          else if (a > d & a > c & a < b)
                          {
                              DrawingForm.graphics.DrawLine(mypen_A, (60 + Ct + Dt), 200, (60 + Dt + Ct + At), 200);
                              DrawingForm.graphics.DrawLine(mypen_B, (60 +At + Dt + Ct), 250, (60 +At  + Bt + Ct + Dt), 250);
                          }
                      }
                   }
                #endregion
            }
           
           DrawingForm .IPDB.Hide();
        }
    }
}
