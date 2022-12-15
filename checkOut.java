import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.swing.*;

public class checkOut extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JList leftlist;
    private JList rightlist;
    private JButton addbutton;
    private JButton totalbutton;
    private JButton totalbuttonVAT;
    private JLabel totalLabel;


@SuppressWarnings("unchecked")
public checkOut() {

    super("Shop");
    setLayout(new FlowLayout());

   
    List<prodArray> itemList = new ArrayList<prodArray>();
    itemList.add(new prodArray("Wine","Luxury",02/03/2025,50));
    itemList.add(new prodArray("Hamper","Gift",02/03/2030,35));
    itemList.add(new prodArray("Food","Essential",02/03/2030,35));
  

    leftlist = new JList(itemList.toArray());
    leftlist.setVisibleRowCount(3);
    leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    add(new JScrollPane(leftlist));

    addbutton = new JButton("ADD TO BASKET");
    addbutton.addActionListener(new ActionListener() {
        @SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent event) {
            
            int size = rightlist.getModel().getSize();
            Set objects = new LinkedHashSet();
            for (int i = 0; i < size; i++) {
                objects.add(rightlist.getModel().getElementAt(i));
            }
            objects.addAll(Arrays.asList(leftlist.getSelectedValues()));

            rightlist.setListData(objects.toArray());
        }
    });
    add(addbutton);

    rightlist = new JList();
    rightlist.setVisibleRowCount(5);
    rightlist.setFixedCellWidth(55);
    rightlist.setFixedCellHeight(20);
    add(new JScrollPane(rightlist));

    totalbutton = new JButton("Total");
    totalbutton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            // search arraylist objects and calculate the total
            int size = rightlist.getModel().getSize();
            Integer totalAmount = 0;
            for (int i = 0; i < size; i++) {
                Object obj = leftlist.getModel().getElementAt(i);
                prodArray item = (prodArray) obj;
                totalAmount += item.getItemPrice() ;
            }
            //update the total Amount label
            totalLabel.setText("Total Amount : " + totalAmount );
        }
    });
    add(totalbutton);

    totalLabel = new JLabel("Total Amount: ");

    add(totalLabel);

}

public static void main(String[] args) {
    checkOut page = new checkOut();
    page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    page.setSize(700, 400);
    page.setVisible(true);
	
}
}









