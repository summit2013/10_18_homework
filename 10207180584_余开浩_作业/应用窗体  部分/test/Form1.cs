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
    public partial class frmparent : Form
    {
        public frmparent()
        {
            InitializeComponent();
        }

        private void 退出ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void 输入ToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }

        private void 关于ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            MessageBox.Show("作者：余开浩 →＿←"); 
        }

        private void 输入框ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            frmchild1 frm = new frmchild1();     //创建 frmchild1 对象
            frm.MdiParent = this;                //设置当前窗体
            frm.Show();                          //打开窗体


        }

        private void frmparent_Load(object sender, EventArgs e)
        {

        }

       
    }
}
