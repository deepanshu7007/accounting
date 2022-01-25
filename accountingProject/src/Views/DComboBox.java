package Views;
import javax.swing.JComboBox;

public class DComboBox extends JComboBox implements DComponent{
	public String get()
	{
		return this.getSelectedItem().toString();
	}
	public void set(String s)
	{
		this.setSelectedItem(s);
	}
}
