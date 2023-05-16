import javax.swing.JOptionPane;
class LessonFour{
    public static void main(String[] args) {

        
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Welcome "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        Double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter side x"));

        Double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter side y"));

        Double z = x*x + y*y;

        JOptionPane.showMessageDialog(null, "x*x + y*y = "+z);
        

        double a = 3.14;
        double b = 4;
        double c = -5;

        System.out.println(Math.min(3, 4));
        
        System.out.println(Math.max(3, 4));

        System.out.println(Math.abs(c));

        System.out.println(Math.sqrt(3));

        System.out.println(Math.pow(a, b));

        System.out.println(Math.ceil(a));

        System.out.println(Math.floor(a));

        System.out.println(Math.round(a));

        System.out.println(Math.random());




        

    }
}