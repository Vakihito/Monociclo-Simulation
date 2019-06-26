package Pages;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import java.time.Clock;
import java.util.Vector;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.wb.swt.SWTResourceManager;

import Control.Bloco;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


public class LW extends Composite {
	
	int clock = 0;

	Label fioReadData1;
	Label fioInstruction2;
	Label fioULA2;
	Label fioReadData2;
	Label fioReadData3;
	Label fioReaddata4;
	Label fioIMRR1;
	Label fioInstruction;
	Label fioPcReadAddress;
	Label fioWriteR;
	Label fioALUrAdd;
	Label fioULA3;
	Label fioRD1ULA;
	Label fioRRD2;
	Label fioPC1;
	Label fioPC2;
	Label fioPcMais4;
	Label fioULA1;
	Label fioPc41;
	Label fioPc45;
	Label fioPc42;
	Label fioPc43;
	Label fioPc44;
	Label fioSE1;
	Label fioSE2;

	Button btnNewButton;
	
	Label lblNewLabel_9;
	
	int Line;
	
	public int getLine() {
		return Line;
	}
	public void setLine(int line) {
		Line = line;
	}

	int changeWindow = 1;

	public int getChangeWindow() {
		return changeWindow;
	}
	public void setChangeWindow(int changeWindow) {
		this.changeWindow = changeWindow;
	}
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public LW(Composite parent, int style, Vector <Bloco> Instructions) {
		super(parent, style);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		fioReadData1 = new Label(this, SWT.NONE);
		fioReadData1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadData1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadData1.setBounds(1243, 345, 53, 9);
		
		fioInstruction2 = new Label(this, SWT.NONE);
		fioInstruction2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction2.setBounds(405, 215, 9, 157);
		
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
		
		Label PC4 = new Label(this, SWT.BORDER);
		PC4.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		PC4.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		PC4.setAlignment(SWT.CENTER);
		PC4.setText("PC+4");
		PC4.setBounds(218, 72, 94, 76);
		
		Label Registers = new Label(this, SWT.BORDER);
		Registers.setBounds(441, 180, 248, 301);
		
		fioULA2 = new Label(this, SWT.NONE);
		fioULA2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA2.setBounds(710, 345, 9, 173);
		
		btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Ubuntu", 18, SWT.BOLD));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				switch (clock) {
					case 0:
						changeClock1();
						break;
					case 1:
						changeClock2();
						break;
					case 2:
						changeClock3();
					break;	
					case 3:
						changeClock4();
					break;
					case 4:
						changeClock5();
					break;
					default:
						reStart(Instructions);
						break;
				}
			}
		});
		btnNewButton.setBounds(553, 631, 120, 34);
		btnNewButton.setText("Next\n");
		
		fioRRD2 = new Label(this, SWT.NONE);
		fioRRD2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRRD2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRRD2.setBounds(1287, 345, 9, 265);
		
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
		
		fioReadData2 = new Label(this, SWT.NONE);
		fioReadData2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadData2.setBounds(405, 601, 891, 9);
		
		fioReadData3 = new Label(this, SWT.NONE);
		fioReadData3.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadData3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadData3.setBounds(405, 433, 9, 177);
		
		fioReaddata4 = new Label(this, SWT.NONE);
		fioReaddata4.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReaddata4.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioReaddata4.setBounds(412, 433, 35, 9);
		
		fioIMRR1 = new Label(this, SWT.NONE);
		fioIMRR1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioIMRR1.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioIMRR1.setBounds(412, 215, 35, 9);
		
		fioInstruction = new Label(this, SWT.NONE);
		fioInstruction.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction.setBounds(353, 267, 61, 9);
		
		fioPcReadAddress = new Label(this, SWT.NONE);
		fioPcReadAddress.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPcReadAddress.setBounds(133, 195, 68, 9);
		
		fioWriteR = new Label(this, SWT.NONE);
		fioWriteR.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioWriteR.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioWriteR.setBounds(405, 363, 42, 9);
		
		fioALUrAdd = new Label(this, SWT.NONE);
		fioALUrAdd.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUrAdd.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUrAdd.setBounds(966, 345, 68, 9);
		
		fioULA3 = new Label(this, SWT.NONE);
		fioULA3.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA3.setBounds(710, 337, 84, 9);
		
		fioRD1ULA = new Label(this, SWT.NONE);
		fioRD1ULA.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD1ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD1ULA.setBounds(687, 267, 107, 9);
		
		fioPC1 = new Label(this, SWT.NONE);
		fioPC1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPC1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPC1.setBounds(158, 88, 9, 116);
		
		fioPC2 = new Label(this, SWT.NONE);
		fioPC2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPC2.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioPC2.setBounds(158, 88, 68, 9);
		
		fioPcMais4 = new Label(this, SWT.NONE);
		fioPcMais4.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPcMais4.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioPcMais4.setBounds(173, 127, 53, 9);
		
		Label lblSignExtended = new Label(this, SWT.BORDER);
		lblSignExtended.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblSignExtended.setAlignment(SWT.CENTER);
		lblSignExtended.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.ITALIC));
		lblSignExtended.setBounds(441, 492, 120, 37);
		lblSignExtended.setText("sign extended");
		
		fioULA1 = new Label(this, SWT.NONE);
		fioULA1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA1.setBounds(560, 509, 159, 9);
		
		fioPc41 = new Label(this, SWT.NONE);
		fioPc41.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc41.setBounds(305, 88, 42, 9);
		
		fioPc45 = new Label(this, SWT.NONE);
		fioPc45.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc45.setBounds(21, 200, 57, 9);
		
		fioPc42 = new Label(this, SWT.NONE);
		fioPc42.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc42.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc42.setBounds(338, 36, 9, 61);
		
		fioPc43 = new Label(this, SWT.NONE);
		fioPc43.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc43.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc43.setBounds(21, 36, 324, 9);
		
		fioPc44 = new Label(this, SWT.NONE);
		fioPc44.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc44.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc44.setBounds(20, 36, 9, 173);
		
		fioSE1 = new Label(this, SWT.NONE);
		fioSE1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE1.setBounds(376, 267, 9, 251);
		
		fioSE2 = new Label(this, SWT.NONE);
		fioSE2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE2.setBounds(376, 509, 71, 9);
		
		lblNewLabel_9 = new Label(this, SWT.NONE);
		lblNewLabel_9.setAlignment(SWT.CENTER);
		lblNewLabel_9.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblNewLabel_9.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		lblNewLabel_9.setFont(SWTResourceManager.getFont("Ubuntu", 18, SWT.NORMAL));
		lblNewLabel_9.setBounds(94, 629, 380, 34);
	}
	public void setTextlbl(String s) {
		lblNewLabel_9.setText(s);
	}
	void changeClock1() {
		clock++;
		
		fioPcReadAddress.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioPC1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioPC2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioPcMais4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
	}

	void changeClock2() {
		clock++;
		
		fioPcReadAddress.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPC1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPC2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPcMais4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		
		fioInstruction.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioSE1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioSE2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioInstruction2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioWriteR.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioIMRR1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));		
		fioPc41.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioPc42.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioPc43.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioPc44.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioPc45.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));

	}


	void changeClock3(){
		clock++;
		
		fioInstruction.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioWriteR.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioIMRR1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc41.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc42.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc43.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc44.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc45.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));

		fioULA1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioULA2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioULA3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioRD1ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
	}
	void changeClock4(){
		clock++;
		
		fioULA1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD1ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		
		fioALUrAdd.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
	}
	
	void changeClock5() {
		clock++;
		btnNewButton.setText("clock 5");
		fioALUrAdd.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		
		fioReadData1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioReadData2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioReadData3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioRRD2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		fioReaddata4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));

	}
	public void reStart(Vector <Bloco> Instructions){

		clock = 0;
		btnNewButton.setText("reStart");

		fioReadData1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadData2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadData3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRRD2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReaddata4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		
		if (Instructions != null  && Line + 1  < Instructions.size()) {
			changeWindow =  Instructions.elementAt(Line + 1).getIt();
		}
		
	}
	
	public void resetFlag() {
		reStart(null);
		changeWindow = 1;
		
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
}
