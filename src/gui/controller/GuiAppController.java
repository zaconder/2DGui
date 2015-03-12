package gui.controller;

import gui.model.Gui;
import gui.view.GuiFrame;

import javax.swing.JOptionPane;

public class GuiAppController
{
	private Gui [][] myTemp;
	private GuiFrame appFrame;
	
	public GuiAppController()
	{
		myTemp = new Gui [3][2];
		fillmyTempArray();
		appFrame = new GuiFrame(this);
	}

	public Gui [][] getGui()
	{
		return myTemp;
		
	}
	
	public GuiFrame getAppFrame()
	{
		return appFrame;
	}

	public void start()
	{
		JOptionPane.showMessageDialog(appFrame,  "welcomeeeee!");
	}
	
	private void fillmyTempArray()
	{
		
		Gui theGui = new Gui("Awesome GUI", 312.523, true);	
		myTemp[0][0] = theGui;
		
		for(int row = 0; row < myTemp.length; row++)
		{
			for(int col = 0; col < myTemp[0].length; col++)
			{
				if(myTemp[row][col] == null)
				{
					double temp = Math.random() * 12;
					boolean isCool;
					if(temp < 32)
					{
						isCool = true;
					}
					else
					{
						isCool = false;
					}
					
					myTemp[row][col] = new Gui("Random coolness # " + (temp/3), temp, isCool);
				}

			}
		
		}	
	
	}
}
