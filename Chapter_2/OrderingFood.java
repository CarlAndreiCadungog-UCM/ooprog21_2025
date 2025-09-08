import javax.swing.JOptionPane;

public class OrderingFood{

    public static void main(String[] args) {
         
        JOptionPane.showMessageDialog(null, "Welcome To Carl's Food Stall");//shows a message dialog of the the food stall

        int confirm = JOptionPane.NO_OPTION;

        do {
            String menu = "C1 - Chicken With Rice\n"
                        + "C2 - Tapsilog\n"
                        + "C3 - Beef With Fried Rice";
            String order;
            String orderName = "";
         while (true) {
         
            //shows a message dialog of the menu
            JOptionPane.showMessageDialog(null, "C1 - Chicken With Rice\n" + "C2 - Tapsilog\n" +"C3 - Beef With Fried Rice");
            order = JOptionPane.showInputDialog(null, "Enter Order Code"); //input your order
         
            if (order == null){
                JOptionPane.showMessageDialog(null, "Order cancelled.");
                return; //if you clicked the cancel button shows you a message dialog that you cancelled your order and ends the program
            }
            
            if (order.trim().isEmpty()){
               JOptionPane.showMessageDialog(null,"You did not order anything");
               continue; //if you did not input anything on the input dialog shows a message dialog that you did not order anything and directs you back to the menu
            } else if (order.equals("C1")) {
                    orderName = "Chicken With Rice";
                    break; //if you input C1 it shows the order Name assigned
                } else if (order.equals("C2")) {
                    orderName = "Tapsilog";
                    break; //if you input C2 it shows the order Name assigned
                } else if (order.equals("C3")) {
                    orderName = "Beef With Fried Rice";
                    break; //if you input C3 it shows the order Name assigned
                } else {
                    JOptionPane.showMessageDialog(null, "Order can't be found. Please try again."); //If you input anything else it shows a message dialog that your order is not found or is not on the menu
                }
         }
            JOptionPane.showMessageDialog(null, "You ordered: " + orderName); //shows a message dialog of what you ordered to make sure that what you ordered is correct

            confirm = JOptionPane.showConfirmDialog(null,"Confirm Order " + order ,  "Order Confirmation" , JOptionPane.YES_NO_OPTION); //shows a confirm dialog

        } while (confirm == JOptionPane.NO_OPTION);
        
            JOptionPane.showMessageDialog(null, "Thank you for your order!"); 
    }
}

