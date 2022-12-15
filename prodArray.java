import javax.swing.JTextField;

public class prodArray {
	

		 String itemName,itemType;
		 Integer itemPrice,itemExp;
		 
		
		public String getItemType() {
			return itemType;
		}
		public void setItemType(String itemType) {
			this.itemType = itemType;
		}
		public Integer getItemExp() {
			return itemExp;
		}
		public void setItemExp(Integer itemExp) {
			this.itemExp = itemExp;
		}
		public prodArray(){}
		public prodArray(String itemName, String itemType, int itemExp, int itemPrice){
		    this.itemName = itemName;
		    this.itemPrice = itemPrice;
		    this.itemExp = itemExp;
		    this.itemType = itemType;
		}
		public String getItemName() {
		    return itemName;
		}
		public void setItemName(String itemName) {
		    this.itemName = itemName;
		}
		public Integer getItemPrice() {
		    return itemPrice;
		}
		public void setItemPrice(Integer itemPrice) {
		    this.itemPrice = itemPrice;
		}
		@Override

		public String toString(){
		    return this.itemName;
		}
		}

