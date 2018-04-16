import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame{
	private final int FRAME_WIDTH = 400;
	private final int FRAME_HEIGHT = 350;
	private DataArray arr;
	private JList<String> personList;
	private JLabel statusLabel;
	private JPanel buttonsPanel;
	private JButton populateButton;
	private JButton sortButton;
	private JButton deleteAllButton;
	private JButton deleteButton;
	private JButton addButton;
	
	public MenuFrame(DataArray arr)
	{
		super("Person Menu");
		this.arr = arr;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		Dimension frameSize = new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
		this.setMinimumSize(frameSize);
		
		personList = new JList<String>(arr.getAllPersons());
		personList.setListData(arr.getAllPersons());
		personList.setFont(new Font("monospaced", Font.PLAIN, 12));
		
		populateButton = new JButton("Populate");
		populateButton.addActionListener(
				new ActionListener()
				{
					@Override
		            public void actionPerformed(ActionEvent event)
		            {
						updateList();
						personList.setListData(arr.getAllPersons());
		            } 
				}
			);
		
		sortButton = new JButton("Sort");
		sortButton.addActionListener(
				new ActionListener()
				{
					@Override
		            public void actionPerformed(ActionEvent event)
		            {
						sort();
						personList.setListData(arr.getAllPersons());
		            } 
				}
			);
		
		deleteAllButton = new JButton("Clear All");
		deleteAllButton.addActionListener(
				new ActionListener()
				{
					@Override
		            public void actionPerformed(ActionEvent event)
		            {
						deleteAll();
						personList.setListData(arr.getAllPersons());
		            } 
				}
			);
		
		deleteButton = new JButton("Delete Selected");
		deleteButton.addActionListener(
				new ActionListener()
				{
					@Override
		            public void actionPerformed(ActionEvent event)
		            {
						int i = personList.getSelectedIndex();
						deletePerson(i);
						personList.setListData(arr.getAllPersons());
		            } 
				}
			);
		
		addButton = new JButton("Add Person");
		addButton.addActionListener(
				new ActionListener()
				{
					@Override
		            public void actionPerformed(ActionEvent event)
		            {
						addPerson();
						personList.setListData(arr.getAllPersons());
		            } 
				}
			);
		
		statusLabel = new JLabel("Status", SwingConstants.CENTER);
		statusLabel.setBackground(Color.YELLOW);
		statusLabel.setOpaque(true);
		Dimension statusSize = new Dimension(FRAME_WIDTH, 30);
		statusLabel.setMaximumSize(statusSize);
		statusLabel.setPreferredSize(statusSize);
		
		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));
		
		Dimension bSize = new Dimension((FRAME_WIDTH/3),30);
		populateButton.setMaximumSize(bSize);
		addButton.setMaximumSize(bSize);
		sortButton.setMaximumSize(bSize);
		deleteAllButton.setMaximumSize(bSize);
		deleteButton.setMaximumSize(bSize);
		
		buttonsPanel.add(populateButton);
		buttonsPanel.add(addButton);
		buttonsPanel.add(sortButton);
		buttonsPanel.add(deleteAllButton);
		buttonsPanel.add(deleteButton);
		
		this.add(personList, BorderLayout.LINE_START);
		this.add(buttonsPanel, BorderLayout.LINE_END);
		this.add(statusLabel, BorderLayout.PAGE_END);
	}
	
	public void updateList()
	{
		arr.populateArray();
		statusLabel.setText("Populating array");

	}
	
	public void deleteAll()
	{
		arr.deleteAllPersons();
		statusLabel.setText("Clearing array");
	}
	
	public void deletePerson(int i)
	{
		if (i == -1)
		{
			statusLabel.setText("Index -1 not found for user, delete failed");
		}
		else
		{
			Person per = arr.findByIndex(i);
			String last = per.lastName;
			boolean b = arr.deleteByIndex(i);
			
			if(b) 
			{
				String str = String.format("%s has successfully been deleted", last);
				statusLabel.setText(str);
			}
			else 
			{
				statusLabel.setText("Error has occurred");
			}
		}
	}
	
	public void sort()
	{
		arr.BubbleSort();
		statusLabel.setText("Sorting the array");
	}
	
	public void addPerson()
	{
		String first = JOptionPane.showInputDialog("Enter first name:");
		String last = JOptionPane.showInputDialog("Enter last name:");
		String ageStr = JOptionPane.showInputDialog("Enter age:");
		int age = Integer.parseInt(ageStr);
		arr.insert(last, first, age);
		
		String str = String.format("User %s %s added successfully", first, last);
		statusLabel.setText(str);
	}
	
	
}
