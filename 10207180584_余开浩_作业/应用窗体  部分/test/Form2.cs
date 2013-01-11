using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace test
{
    public partial class frmchild1 : Form
    {
        public frmchild1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void button1_Click(object sender, EventArgs e)
        {
             frmchild2 frm = new frmchild2();      //创建 frmchild1
            frm.MdiParent = this.MdiParent;                //设置当前窗体
            frm.Show();                          //打开窗体
        }
    }
}
