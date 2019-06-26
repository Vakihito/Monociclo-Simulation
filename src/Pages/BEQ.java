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


public class BEQ extends Composite {
	
	int clock = 0;
	Label fioInstruction2;
	Label fioULA2;
	Label fioIMRR1;
	Label fioInstruction;
	Label fioPcReadAddress;
	Label fioULA3;
	Label fioRD1ULA;
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
	Label fioAlur1;
	Label fioAlur2;
	Label fioAlur3;
	Label fioZero1;
	Label fioAlur4;
	Label fioAlur5;
	Label fioPcf;
	Label fioFlagAnd;
	Label fioZero2;
	Label fioBranch;
	Label fioReadR2;
	Label fioADD1;
	Label fioADD2;
	Label fioPc4toAdd;

	Button btnNewButton;
	
	Label lblNewLabel_9;
	
	int changeWindow = 2;

	public int getChangeWindow() {
		return changeWindow;
	}
	public void setChangeWindow(int changeWindow) {
		this.changeWindow = changeWindow;
	}
	
	int Line;
	
	public int getLine() {
		return Line;
	}
	public void setLine(int line) {
		Line = line;
	}

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public BEQ(Composite parent, int style, Vector <Bloco> Instructions) {
		super(parent, style);
		setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		Label lblNewLabel_7 = new Label(this, SWT.WRAP);
		lblNewLabel_7.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		lblNewLabel_7.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.BOLD));
		lblNewLabel_7.setAlignment(SWT.CENTER);
		lblNewLabel_7.setBounds(31, 180, 19, 76);
		lblNewLabel_7.setText("MUX");
		
		Label shift_left_2 = new Label(this, SWT.BORDER | SWT.WRAP);
		shift_left_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		shift_left_2.setAlignment(SWT.CENTER);
		shift_left_2.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.BOLD));
		shift_left_2.setBounds(694, 371, 70, 61);
		shift_left_2.setText("shift left 2");
		
		fioInstruction2 = new Label(this, SWT.NONE);
		fioInstruction2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction2.setBounds(405, 215, 9, 103);
		
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
		fioULA2.setBounds(724, 432, 9, 86);
		
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
					default:
						reStart(Instructions);
						break;
				}
			}
		});
		btnNewButton.setBounds(553, 631, 120, 34);
		btnNewButton.setText("Start\n");
		
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
		
		fioULA3 = new Label(this, SWT.NONE);
		fioULA3.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA3.setBounds(687, 337, 107, 9);
		
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
		lblSignExtended.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblSignExtended.setAlignment(SWT.CENTER);
		lblSignExtended.setFont(SWTResourceManager.getFont("Ubuntu", 13, SWT.BOLD | SWT.ITALIC));
		lblSignExtended.setBounds(441, 492, 120, 37);
		lblSignExtended.setText("sign extended");
		
		fioULA1 = new Label(this, SWT.NONE);
		fioULA1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA1.setBounds(560, 509, 173, 9);
		
		fioPc41 = new Label(this, SWT.NONE);
		fioPc41.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc41.setBounds(305, 88, 42, 9);
		
		fioPc45 = new Label(this, SWT.NONE);
		fioPc45.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc45.setBounds(10, 200, 19, 9);
		
		fioPc42 = new Label(this, SWT.NONE);
		fioPc42.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc42.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc42.setBounds(338, 36, 9, 61);
		
		fioPc43 = new Label(this, SWT.NONE);
		fioPc43.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc43.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc43.setBounds(10, 36, 335, 9);
		
		fioPc44 = new Label(this, SWT.NONE);
		fioPc44.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc44.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc44.setBounds(6, 36, 9, 173);
		
		fioSE1 = new Label(this, SWT.NONE);
		fioSE1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE1.setBounds(376, 267, 9, 251);
		
		fioSE2 = new Label(this, SWT.NONE);
		fioSE2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE2.setBounds(376, 509, 71, 9);
		
		fioReadR2 = new Label(this, SWT.NONE);
		fioReadR2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadR2.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioReadR2.setBounds(412, 309, 35, 9);
		
		fioADD1 = new Label(this, SWT.NONE);
		fioADD1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioADD1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioADD1.setBounds(724, 127, 9, 244);
		
		fioADD2 = new Label(this, SWT.NONE);
		fioADD2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioADD2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioADD2.setBounds(724, 127, 82, 9);
		
		fioPc4toAdd = new Label(this, SWT.NONE);
		fioPc4toAdd.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc4toAdd.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc4toAdd.setBounds(340, 88, 466, 9);
		
		Label lblNewLabel_5 = new Label(this, SWT.WRAP);
		lblNewLabel_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblNewLabel_5.setBounds(858, 110, 53, 32);
		lblNewLabel_5.setText("Alu Result");
		
		Label lblAdd = new Label(this, SWT.BORDER);
		lblAdd.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblAdd.setAlignment(SWT.CENTER);
		lblAdd.setFont(SWTResourceManager.getFont("Ubuntu", 15, SWT.BOLD));
		lblAdd.setBounds(804, 72, 107, 76);
		lblAdd.setText("ADD");
		
		fioAlur1 = new Label(this, SWT.NONE);
		fioAlur1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur1.setBounds(904, 127, 173, 9);
		
		fioAlur2 = new Label(this, SWT.NONE);
		fioAlur2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur2.setBounds(1069, 18, 9, 118);
		
		fioAlur3 = new Label(this, SWT.NONE);
		fioAlur3.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur3.setBounds(20, 18, 1057, 9);
		
		fioZero1 = new Label(this, SWT.NONE);
		fioZero1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioZero1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioZero1.setBounds(971, 260, 68, 9);
		
		fioAlur4 = new Label(this, SWT.NONE);
		fioAlur4.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur4.setBounds(20, 18, 9, 202);
		
		fioAlur5 = new Label(this, SWT.NONE);
		fioAlur5.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur5.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioAlur5.setBounds(20, 215, 19, 9);
		
		fioPcf = new Label(this, SWT.NONE);
		fioPcf.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPcf.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioPcf.setBounds(46, 215, 29, 9);
		
		Label lblNewLabel_8 = new Label(this, SWT.BORDER);
		lblNewLabel_8.setFont(SWTResourceManager.getFont("Ubuntu", 13, SWT.NORMAL));
		lblNewLabel_8.setAlignment(SWT.CENTER);
		lblNewLabel_8.setBounds(10, 449, 61, 32);
		lblNewLabel_8.setText("and");
		
		fioFlagAnd = new Label(this, SWT.NONE);
		fioFlagAnd.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioFlagAnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioFlagAnd.setBounds(35, 252, 9, 202);
		
		fioZero2 = new Label(this, SWT.WRAP);
		fioZero2.setFont(SWTResourceManager.getFont("Ubuntu", 10, SWT.NORMAL));
		fioZero2.setText("zero");
		fioZero2.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		fioZero2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioZero2.setBounds(20, 480, 9, 108);
		
		fioBranch = new Label(this, SWT.WRAP);
		fioBranch.setText("branch");
		fioBranch.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		fioBranch.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioBranch.setBounds(55, 480, 9, 108);
		
		lblNewLabel_9 = new Label(this, SWT.NONE);
		lblNewLabel_9.setAlignment(SWT.CENTER);
		lblNewLabel_9.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		lblNewLabel_9.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		lblNewLabel_9.setFont(SWTResourceManager.getFont("Ubuntu", 18, SWT.NORMAL));
		lblNewLabel_9.setBounds(94, 629, 380, 34);
		lblNewLabel_9.setText(Instructions.elementAt(Line).getComand());

	}
	
	public void setTextlbl(String s) {
		lblNewLabel_9.setText(s);
	}
	
	void changeClock1() {
		clock++;
		btnNewButton.setText("clock 1");
		fioPcReadAddress.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioPC1.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioPC2.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioPcMais4.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
	}

	void changeClock2() {
		clock++;
		btnNewButton.setText("clock 2");
		fioPcReadAddress.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPC1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPC2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPcMais4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		
		fioInstruction.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioSE1.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioSE2.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioInstruction2.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioReadR2.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioIMRR1.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));		
		fioPc41.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioPc42.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioPc43.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioPc44.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioPc45.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioPc4toAdd.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
	}


	void changeClock3(){
		clock++;
		btnNewButton.setText("clock 3");
		fioInstruction.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioSE2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadR2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioIMRR1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		
		fioADD1.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioADD2.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioULA1.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioULA2.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioULA3.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioRD1ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
	}
	void changeClock4(){
		clock++;
		btnNewButton.setText("clock 4");
		fioADD1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioADD2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioULA3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD1ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		
		fioZero1.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioZero2.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioBranch.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioAlur1.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioAlur2.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioAlur3.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioAlur4.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioAlur5.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioFlagAnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		fioPcf.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
	}
	
	
	void reStart(Vector <Bloco> Instructions){

		clock = 0;
		btnNewButton.setText("reStart");
		fioZero1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioZero2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioBranch.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur3.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur4.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioAlur5.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioFlagAnd.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPcf.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc41.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc42.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc43.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc44.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc45.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPc4toAdd.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		if (Instructions != null && Line + 1  < Instructions.size()) {
			changeWindow =  Instructions.elementAt(Line + 1).getIt();
			if (Instructions.elementAt(Line + 1).getIt() == -1) {
				
			}
		}
		
	}
	public void resetFlag() {
		reStart(null);
		changeWindow = 2;
		
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
