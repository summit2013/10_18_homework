using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace testgdi2
{
    public partial class form2 : Form1
    {
        public Form1 frm1;
        public form2(Form1 frm1)
        {
            InitializeComponent();
            this.frm1 = frm1;
        }

        private void button2_Click(object sender, EventArgs e)   //确定
        {

            frm1.m_pcb[0].name = textBox1.Text;
            frm1.m_pcb[0].TimeComing = Convert.ToInt32(textBox3.Text);
            frm1.m_pcb[0].TimeServer = Convert.ToInt32(textBox2.Text);
            frm1.m_pcb[1].name = textBox4.Text;
            frm1.m_pcb[1].TimeComing = Convert.ToInt32(textBox6.Text);
            frm1.m_pcb[1].TimeServer = Convert.ToInt32(textBox5.Text);
            frm1.m_pcb[2].name = textBox7.Text;
            frm1.m_pcb[2].TimeComing = Convert.ToInt32(textBox9.Text);
            frm1.m_pcb[2].TimeServer = Convert.ToInt32(textBox8.Text);
            frm1.m_pcb[3].name = textBox10.Text;
            frm1.m_pcb[3].TimeComing = Convert.ToInt32(textBox12.Text);
            frm1.m_pcb[3].TimeServer = Convert.ToInt32(textBox11.Text);
            frm1.m_pcb[4].name = textBox13.Text;
            frm1.m_pcb[4].TimeComing = Convert.ToInt32(textBox15.Text);
            frm1.m_pcb[4].TimeServer = Convert.ToInt32(textBox14.Text);
            this.Close();
        }

        private void button3_Click(object sender, EventArgs e)    //取消
        {
            this.Close();
        }

        private void button1_Click(object sender, EventArgs e)    //重置
        {
            textBox1.Text = null;
            textBox2.Text = null;
            textBox3.Text = null;
            textBox4.Text = null;
            textBox5.Text = null;
            textBox6.Text = null;
            textBox7.Text = null;
            textBox8.Text = null;
            textBox9.Text = null;
            textBox10.Text = null;
            textBox11.Text = null;
            textBox12.Text = null;
            textBox13.Text = null;
            textBox14.Text = null;
            textBox15.Text = null;
        }



    }
}
