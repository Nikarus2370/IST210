import javax.swing.JFrame;

public class PersonMain {
	public static void main(String[] args) {		
		final int maxSize = 100;
		DataArray arr;
		arr = new DataArray(maxSize);
		arr.populateArray();
		
		MenuFrame menu = new MenuFrame(arr);
		menu.setVisible(true);
	}
}
