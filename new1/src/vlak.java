import javax.swing.*;


public class vlak {
    public static void main(String[] args){
        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw d = new draw();
        f.add(d) ;
        f.setSize(400,250);
        f.setVisible(true);
    }
}
