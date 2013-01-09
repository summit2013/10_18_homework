using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace 嘉伟
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "" | textBox2.Text == "" | textBox3.Text == "" | textBox4.Text == "")
                MessageBox.Show("请输入进程名或运行时间");
            else
            {
                Graphics objgraphics = this.CreateGraphics();
                Pen objmypen = new Pen(Color.DarkGoldenrod, 2);
                objgraphics.DrawLine(objmypen, 40, 180, 40, 500);
                objgraphics.DrawLine(objmypen, 40, 500, 500, 500);
                objgraphics.DrawString("进程" + textBox1.Text, this.Font, System.Drawing.Brushes.Red, 0, 300);
                objgraphics.DrawString("进程" + textBox2.Text, this.Font, System.Drawing.Brushes.Red, 0, 350);
                int a = Convert.ToInt16(textBox3.Text);
                int b = Convert.ToInt16(textBox4.Text);
                objgraphics.DrawString("总运行时间" + (a + b), this.Font, System.Drawing.Brushes.Red, 400, 200);
                int n = 0;
                for (int i = 0; i < a; i++)
                {
                    objgraphics.DrawLine(objmypen, 40 + n, 300, 60 + n, 300);
                    n = n + 20;
                }
                for (int i = 0; i < b; i++)
                {
                    objgraphics.DrawLine(objmypen, 40 + n, 350, 60 + n, 350);
                    n = n + 20;
                }
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            textBox4.Text = "";  
            Graphics objgraphics = this.CreateGraphics();
            objgraphics.Clear(this.BackColor);
        }
    }
}
