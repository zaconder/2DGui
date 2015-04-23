package gui.view;

import gui.controller.GuiAppController;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

public class GuiPanel extends JPanel
{
	private GuiAppController baseController;
	private SpringLayout baseLayout;
	private JTable dimensionTable;
	private JLabel appLabel;
	private JScrollPane tablePane;
	private TableCellWrapRenderer myCellRenderer;
	
	
	public GuiPanel(GuiAppController baseController)
	{
		this.baseController = baseController;
		appLabel = new JLabel("Look 2D data :D");
		baseLayout = new SpringLayout();
		myCellRenderer = new TableCellWrapRenderer();
		
		setupTable();
		setupPanel();
		setupPane();
		setupLayout();
		setupListeners();
	}

	private void setupTable()
	{
		String [] colHeader = {"Column 1", "Column 2"};
		dimensionTable = new JTable(new DefaultTableModel(baseController.getGui(), colHeader));
		for(int col = 0; col < dimensionTable.getColumnCount(); col++)
		{
			dimensionTable.getColumnModel().getColumn(col).setCellRenderer(myCellRenderer);
		}
		
		tablePane = new JScrollPane(dimensionTable);
	
	
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, tablePane, 30, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, tablePane, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, tablePane, -30, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, tablePane, -50, SpringLayout.EAST, this);
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		this.add(appLabel);
		this.add(tablePane);

		
	}

	private void setupPane()
	{
		dimensionTable.setBackground(Color.GRAY);
	}
	
	private void setupListeners()
	{
		
	}
}
