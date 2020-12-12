package gui;

public class MainGUI
{
    public static void main(String[] args)
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Frame(controller, view);
            }
        });
    }
}
