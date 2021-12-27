package grafic_1;


import javax.swing.JFrame;

public class Grafic_1 extends JFrame {
    	
	private static final long serialVersionUID = 1L;
	public Grafic_1() {
        MeinJPanel meinJPanel=new MeinJPanel();
		this.setSize(400, 300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(meinJPanel);
    }
    public static void main(String[] args) {
        new Grafic_1();
    }
}