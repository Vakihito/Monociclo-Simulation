package Pages;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

import java.time.Clock;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.wb.swt.SWTResourceManager;



import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;



public class ADD extends Composite {
	
	int clock = 0;
	Label fioALUr5;
	Label fioReadRegister12;
	Label fioInstruction;
	Label fioReadRegister22;
	Label fioRADD;
	Label fioWriteR;
	Label fioALUr1;
	Label fioRD2ULA;
	Label fioRD1ULA;
	Label fioPC41;
	Label fioPc42;
	Label fioMais4;
	Label fioALUr2;
	Label fioALUr3;
	Label fioALUr4;
	Label fioinstrucion2;
	Label fioPc2;
	Label fioPc3;
	Label fioPc4;
	Label fioPc5;
	Label fioPc1;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public ADD(Composite parent, int style) {
		super(parent, SWT.NO_BACKGROUND);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		Label lblReadData = new Label(this, SWT.NONE);
		lblReadData.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblReadData.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		lblReadData.setBounds(1141, 339, 94, 32);
		lblReadData.setText("Read data");
		
		Label lblDataMem = new Label(this, SWT.WRAP);
		lblDataMem.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblDataMem.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		lblDataMem.setBounds(1128, 465, 107, 76);
		lblDataMem.setText("Data Memory");
		
		Label lblWriteData = new Label(this, SWT.WRAP);
		lblWriteData.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		lblWriteData.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblWriteData.setBounds(1037, 492, 61, 49);
		lblWriteData.setText("Write data");
		
		Label lblAddress = new Label(this, SWT.NONE);
		lblAddress.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblAddress.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		lblAddress.setBounds(1037, 339, 82, 39);
		lblAddress.setText("Address");
		
		Label DataMem = new Label(this, SWT.BORDER);
		DataMem.setBounds(1028, 325, 218, 238);
		
		Label lblNewLabel_4 = new Label(this, SWT.WRAP);
		lblNewLabel_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblNewLabel_4.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		lblNewLabel_4.setBounds(904, 327, 61, 49);
		lblNewLabel_4.setText("ALU result");
		
		Label lblNewLabel_2 = new Label(this, SWT.NONE);
		lblNewLabel_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.NORMAL));
		lblNewLabel_2.setBounds(912, 252, 53, 32);
		lblNewLabel_2.setText("Zero");
		
		Label lblNewLabel_1 = new Label(this, SWT.NONE);
		lblNewLabel_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		lblNewLabel_1.setBounds(804, 296, 61, 34);
		lblNewLabel_1.setText("ULA");
		
		Label ULA = new Label(this, SWT.BORDER);
		ULA.setBounds(791, 231, 188, 155);
		
		Label lblRegisters = new Label(this, SWT.NONE);
		lblRegisters.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblRegisters.setFont(SWTResourceManager.getFont("Ubuntu", 19, SWT.BOLD));
		lblRegisters.setBounds(553, 398, 120, 34);
		lblRegisters.setText("Registers");
		
		Label lblRData2 = new Label(this, SWT.HORIZONTAL);
		lblRData2.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblRData2.setText("Read Data 2");
		lblRData2.setFont(SWTResourceManager.getFont("Ubuntu", 14, SWT.NORMAL));
		lblRData2.setBounds(574, 325, 107, 21);
		
		Label lblRData1 = new Label(this, SWT.HORIZONTAL);
		lblRData1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblRData1.setFont(SWTResourceManager.getFont("Ubuntu", 14, SWT.NORMAL));
		lblRData1.setBounds(574, 255, 107, 21);
		lblRData1.setText("Read Data 1");
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblNewLabel.setFont(SWTResourceManager.getFont("Ubuntu", 14, SWT.NORMAL));
		lblNewLabel.setBounds(453, 424, 94, 42);
		lblNewLabel.setText("Write Data");
		
		Label lblWriteRegister = new Label(this, SWT.WRAP);
		lblWriteRegister.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblWriteRegister.setText("Write Register ");
		lblWriteRegister.setFont(SWTResourceManager.getFont("Ubuntu", 14, SWT.NORMAL));
		lblWriteRegister.setBounds(453, 345, 94, 49);
		
		Label lblRRegister2 = new Label(this, SWT.WRAP);
		lblRRegister2.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblRRegister2.setFont(SWTResourceManager.getFont("Ubuntu", 14, SWT.NORMAL));
		lblRRegister2.setText("Read Register 2 ");
		lblRRegister2.setBounds(453, 280, 94, 49);
		
		Label lblRRegister1 = new Label(this, SWT.WRAP);
		lblRRegister1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblRRegister1.setFont(SWTResourceManager.getFont("Ubuntu", 14, SWT.NORMAL));
		lblRRegister1.setBounds(453, 200, 94, 49);
		lblRRegister1.setText("Read Register 1 ");
		
		Combo choice = new Combo(this, SWT.READ_ONLY);
		choice.setFont(SWTResourceManager.getFont("URW Palladio L", 15, SWT.NORMAL));
		choice.setItems(new String[] {"\t\tLW\t\t\t  ", "\t\tADD\t\t  ", " \t   \tBEQ\t\t  "});
		choice.setBounds(31, 631, 281, 36);
		choice.select(1);
		
		
		Label lblInstructionM = new Label(this, SWT.WRAP | SWT.CENTER);
		lblInstructionM.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblInstructionM.setFont(SWTResourceManager.getFont("Ubuntu", 18, SWT.BOLD));
		lblInstructionM.setBounds(207, 325, 140, 69);
		lblInstructionM.setText("Instruction Memory");
		
		Label lblInstructioin = new Label(this, SWT.WRAP | SWT.HORIZONTAL);
		lblInstructioin.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblInstructioin.setText("Instruction");
		lblInstructioin.setFont(SWTResourceManager.getFont("Ubuntu", 14, SWT.NORMAL));
		lblInstructioin.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblInstructioin.setBounds(253, 255, 94, 32);
		
		Label lblNewLabel_3 = new Label(this, SWT.WRAP | SWT.HORIZONTAL);
		lblNewLabel_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblNewLabel_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblNewLabel_3.setFont(SWTResourceManager.getFont("Ubuntu", 14, SWT.NORMAL));
		lblNewLabel_3.setBounds(207, 200, 67, 49);
		lblNewLabel_3.setText("Read Address");
		
		Label InstructionMemory = new Label(this, SWT.BORDER);
		InstructionMemory.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		InstructionMemory.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		InstructionMemory.setBounds(195, 180, 165, 221);
		
		Label lblPC = new Label(this, SWT.BORDER | SWT.SHADOW_NONE | SWT.CENTER);
		lblPC.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblPC.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblPC.setFont(SWTResourceManager.getFont("Ubuntu", 18, SWT.BOLD));
		lblPC.setBounds(71, 180, 67, 221);
		lblPC.setText("PC");
		
		Label lblPC4 = new Label(this, SWT.BORDER);
		lblPC4.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblPC4.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		lblPC4.setAlignment(SWT.CENTER);
		lblPC4.setText("PC+4");
		lblPC4.setBounds(218, 72, 94, 76);
		
		Label Registers = new Label(this, SWT.BORDER);
		Registers.setBounds(441, 180, 248, 301);
		
		
		
		
		Label lblNewLabel_6 = new Label(this, SWT.NONE);
		lblNewLabel_6.setForeground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblNewLabel_6.setEnabled(false);
		lblNewLabel_6.setBounds(1403, 0, 70, 17);
		
		Label label_2 = new Label(this, SWT.NONE);
		label_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		label_2.setEnabled(false);
		label_2.setBounds(1417, 658, 70, 17);
		
		Label label_3 = new Label(this, SWT.NONE);
		label_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		label_3.setEnabled(false);
		label_3.setBounds(0, 658, 70, 17);
		
		Label label_4 = new Label(this, SWT.NONE);
		label_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		label_4.setEnabled(false);
		label_4.setBounds(0, 0, 70, 17);
		
		fioALUr5 = new Label(this, SWT.NONE);
		fioALUr5.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr5.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioALUr5.setBounds(373, 433, 74, 9);
		
		fioReadRegister12 = new Label(this, SWT.NONE);
		fioReadRegister12.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadRegister12.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioReadRegister12.setBounds(412, 215, 35, 9);
		
		fioInstruction = new Label(this, SWT.NONE);
		fioInstruction.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction.setBounds(353, 267, 61, 9);
		
		fioReadRegister22 = new Label(this, SWT.NONE);
		fioReadRegister22.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadRegister22.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioReadRegister22.setBounds(412, 296, 35, 9);
		
		fioRADD = new Label(this, SWT.NONE);
		fioRADD.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRADD.setBounds(133, 195, 68, 9);
		
		fioWriteR = new Label(this, SWT.NONE);
		fioWriteR.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioWriteR.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioWriteR.setBounds(405, 356, 42, 9);
		
		fioALUr1 = new Label(this, SWT.NONE);
		fioALUr1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr1.setBounds(976, 345, 25, 9);
		
		fioRD2ULA = new Label(this, SWT.NONE);
		fioRD2ULA.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD2ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD2ULA.setBounds(687, 337, 107, 9);
		
		fioRD1ULA = new Label(this, SWT.NONE);
		fioRD1ULA.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD1ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD1ULA.setBounds(687, 267, 107, 9);
		
		fioPC41 = new Label(this, SWT.NONE);
		fioPC41.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPC41.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPC41.setBounds(158, 88, 9, 116);
		
		fioPc42 = new Label(this, SWT.NONE);
		fioPc42.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc42.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioPc42.setBounds(158, 88, 68, 9);
		
		fioMais4 = new Label(this, SWT.NONE);
		fioMais4.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioMais4.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioMais4.setBounds(173, 127, 53, 9);
		
		fioPc2 = new Label(this, SWT.NONE);
		fioPc2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc2.setBounds(338, 36, 9, 61);
		
		fioPc3 = new Label(this, SWT.NONE);
		fioPc3.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc3.setBounds(21, 36, 324, 9);
		
		fioPc4 = new Label(this, SWT.NONE);
		fioPc4.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc4.setBounds(20, 36, 9, 184);
		
		fioPc5 = new Label(this, SWT.NONE);
		fioPc5.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc5.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioPc5.setBounds(20, 215, 50, 9);
		
		fioPc1 = new Label(this, SWT.NONE);
		fioPc1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc1.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioPc1.setBounds(312, 88, 35, 9);
		
		fioALUr2 = new Label(this, SWT.NONE);
		fioALUr2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr2.setBounds(998, 345, 9, 218);
		
		fioALUr3 = new Label(this, SWT.NONE);
		fioALUr3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr3.setBounds(378, 554, 629, 9);
		
		fioALUr4 = new Label(this, SWT.NONE);
		fioALUr4.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr4.setBounds(373, 438, 9, 125);
		
		Button bntControl = new Button(this, SWT.NONE);
		bntControl.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.BOLD));
		bntControl.setBounds(373, 631, 112, 34);
		bntControl.setText("start");
		
		fioinstrucion2 = new Label(this, SWT.NONE);
		fioinstrucion2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioinstrucion2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioinstrucion2.setBounds(405, 215, 9, 148);
		bntControl.addListener(SWT.Selection, new Listener() {
		      public void handleEvent(Event e) {
		    	  switch (clock) {
					case 0:
						changeClock1();
						bntControl.setText("clock : 0");
						break;
					case 1:
						changeClock2();
						bntControl.setText("clock : 1");
						
						break;
					case 2:
						changeClock3();
						bntControl.setText("clock : 2");
						
						break;
					case 3:
						changeClock4();
						bntControl.setText("clock : 3");
						
						break;
					default:
						bntControl.setText("start");
						reStart();
						break;
				
				}
				
		      }
		});
		

	}
	
	

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	void changeClock1() {
		clock++;
		fioPC41.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioPc42.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioMais4.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioRADD.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		
	}
	void changeClock2() {
		clock++;
		fioPC41.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc42.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioMais4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRADD.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		
		fioInstruction.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioinstrucion2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioReadRegister12.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioReadRegister22.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioWriteR.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioPc1.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioPc2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioPc3.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioPc4.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioPc5.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
	}
	
	void changeClock3(){
		clock++;
		fioInstruction.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioinstrucion2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadRegister12.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadRegister22.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioWriteR.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc5.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		

		fioRD1ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioRD2ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
	}

	void changeClock4(){
		clock++;
		fioRD1ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD2ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));

		fioALUr1.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioALUr2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioALUr3.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioALUr4.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		fioALUr5.setBackground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));

	}


	
	void reStart(){
		clock = 0;
		fioALUr1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUr5.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
	}
	
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(1, false));

		ADD lg = new ADD(shell, SWT.None);

		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
