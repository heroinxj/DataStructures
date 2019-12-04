package ga;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

@SuppressWarnings("serial")
public class MyPanel extends JPanel {

	int cityNum = 48;

	@Override
	public void paintComponent(Graphics g) { // ���������ܸģ������˸����paintComponent�������ػ�ʱ���Զ����ø÷���
		super.paintComponent(g);
		
		try {
			GA ga = new GA(50, 48, 3000, 0.8f, 0.9f);
			ga.init("d://data2.txt");
			ga.solve();
			int[] bestTour = ga.getBestTour();
			int bestLength=ga.getBestLength();
			g.drawString("��ѳ���:"+bestLength, 30, 540);

			StringBuilder sb=new StringBuilder();
			for (int i = 0; i < cityNum; i++) {
				sb.append(bestTour[i]+"-");
	        }
			sb.delete(sb.length()-1, sb.length());
			g.drawString("���·��:"+sb.toString(), 30, 570);
			
			g.setColor(Color.RED); // ������ɫ
			// ��ȡ����
			int[] x;
			int[] y;

			String strbuff;
			BufferedReader data = new BufferedReader(new InputStreamReader(
					new FileInputStream("d://data2.txt")));

			x = new int[cityNum];
			y = new int[cityNum];
			for (int i = 0; i < cityNum; i++) {
				// ��ȡһ�����ݣ����ݸ�ʽ1 6734 1453
				strbuff = data.readLine();
				// �ַ��ָ�
				String[] strcol = strbuff.split(" ");
				x[i] = Integer.valueOf(strcol[1]);// x����
				y[i] = Integer.valueOf(strcol[2]);// y����
				g.fillOval(x[i] / 10, y[i] / 10, 5, 5);
				g.drawString(String.valueOf(i), x[i] / 10, y[i] / 10);
			}
			data.close();
			
			g.setColor(Color.BLUE); // ������ɫ
			for(int j=0;j<cityNum-1;j++)
			{
				g.drawLine(x[bestTour[j]]/ 10, y[bestTour[j]]/ 10, x[bestTour[j+1]]/ 10, y[bestTour[j+1]]/ 10);
			}
			
			g.setColor(Color.GREEN); // ������ɫ
			g.fillOval(x[bestTour[0]]/ 10, y[bestTour[0]]/ 10, 6, 6);
			g.fillOval(x[bestTour[cityNum-1]]/ 10, y[bestTour[cityNum-1]]/ 10, 6, 6);
			
			// g.drawLine(100, 100, 300, 300); // ����
			// g.drawArc(330, 330, 10, 10, 0, 0);
			// g.fillOval(350, 350, 10, 10);
			// g.fillRect(380, 380, 10, 10);
		} catch (Exception e) {
			e.printStackTrace(); // �쳣����
		}
	}

	public static void main(String[] args) throws Exception {
		JFrame f = new JFrame();
		f.setTitle("�Ŵ��㷨���TSP");
		f.getContentPane().add(new MyPanel());
		f.setSize(1000, 640);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
