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
    public partial class DrawingForm : Form
    {
        public  static InputDialogBox IPDB = new InputDialogBox();
        private  bool showTool = true ;
        private bool showStatus = true ;
        public static Graphics graphics ;
        public DrawingForm()
        {
            InitializeComponent();
            graphics = this.CreateGraphics();
            Pen mypen = new Pen(Color.Black, 5);
            graphics.DrawLine(mypen, 49, 60, 49, 380);
            
        }

        private void toolStripStatusLabel1_Click(object sender, EventArgs e)
        {

        }

        private void 输入对话框ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            IPDB.Show();
        }

        private void 退出ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void 工具栏ToolStripMenuItem_Click(object sender, EventArgs e)
        {
           
            if (showTool == false)
            {
                TS_tool.Show();
                工具栏ToolStripMenuItem.Checked =true;
                showTool= true;
            }
            else
            {
                 TS_tool.Hide();
                工具栏ToolStripMenuItem.Checked = false;
                showTool = false;

            }
        }

        private void 状态栏ToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (showStatus == false)
            {
                Ss_Status.Show();
                状态栏ToolStripMenuItem.Checked = true;
                showStatus = true;
            }
            else
            {
                Ss_Status.Hide();
                状态栏ToolStripMenuItem.Checked = false;
                showStatus = false;
            }
        }

        private void toolStripButton1_Click(object sender, EventArgs e)
        {
            IPDB.Show();
        }

        protected  override void OnPaint (PaintEventArgs e)
        {
            Pen mypen = new Pen(Color.Black, 4);
            //画纵坐标
            e.Graphics.DrawLine(mypen, 50, 60, 50, 392);
            e.Graphics.DrawLine(mypen, 50, 350, 55, 350);
            e.Graphics.DrawLine(mypen, 50, 300, 55, 300);
            e.Graphics.DrawLine(mypen, 50, 250, 55, 250);
            e.Graphics.DrawLine(mypen, 50, 200, 55, 200);
            //画横坐标
            e.Graphics.DrawLine(mypen, 50, 392, 600, 392);
            e.Graphics.DrawLine(mypen, 150, 392, 150, 387);
            e.Graphics.DrawLine(mypen, 250, 392, 250, 387);
            e.Graphics.DrawLine(mypen, 350, 392, 350, 387);
            e.Graphics.DrawLine(mypen, 450, 392, 450, 387);
            e.Graphics.DrawLine(mypen, 550, 392, 550, 387);
        }
    }
}
