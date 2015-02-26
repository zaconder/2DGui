package gui.view;

import javax.swing.JFrame;

import gui.controller.GuiAppController;

public class GuiFrame extends JFrame
{
	private GuiPanel appPanel;
	
	public GuiFrame(GuiAppController baseController)
	{
		appPanel = new GuiPanel(baseController);
		setupFrame();
	}

	private void setupFrame()
	{
		this.setSize(600,600);
		this.setContentPane(appPanel);
		this.setVisible(true);
		
	}
}
