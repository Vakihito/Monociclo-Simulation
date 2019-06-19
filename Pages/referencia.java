package Pages;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;


public class referencia extends Composite {

	Label fioReadData1;
	Label fioWriteRegister1;
	Label fioReadRegiser21;
	Label fioReadR11;
	Label fioWriteData1;
	Label fioReadData2;
	Label fioReadData3;
	Label fioReaddata4;
	Label fioIMRR12;
	Label fioInstruction;
	Label fioReadRegister22;
	Label fioPcReadAddress;
	Label fioWritedata2;
	Label fioWriteR;
	Label fioALUrAdd;
	Label fioRD2ULA;
	Label fioRD1ULA;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public referencia(Composite parent, int style) {
		super(parent, style);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		fioReadData1 = new Label(this, SWT.NONE);
		fioReadData1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadData1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadData1.setBounds(1243, 345, 53, 9);
		
		fioWriteRegister1 = new Label(this, SWT.NONE);
		fioWriteRegister1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioWriteRegister1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioWriteRegister1.setBounds(405, 311, 9, 61);
		
		fioReadRegiser21 = new Label(this, SWT.NONE);
		fioReadRegiser21.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadRegiser21.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadRegiser21.setBounds(405, 267, 9, 54);
		
		fioReadR11 = new Label(this, SWT.NONE);
		fioReadR11.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadR11.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadR11.setBounds(405, 215, 9, 54);
		
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
		
		Combo combo = new Combo(this, SWT.READ_ONLY);
		combo.setFont(SWTResourceManager.getFont("URW Palladio L", 15, SWT.NORMAL));
		combo.setItems(new String[] {"\t\tLW\t\t\t  ", "\t\tADD\t\t  ", " \t   \tBEQ\t\t  "});
		combo.setBounds(31, 631, 281, 36);
		
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
		
		Label ADD1 = new Label(this, SWT.BORDER);
		ADD1.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		ADD1.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		ADD1.setAlignment(SWT.CENTER);
		ADD1.setText("ADD");
		ADD1.setBounds(218, 72, 94, 76);
		
		Label Registers = new Label(this, SWT.BORDER);
		Registers.setBounds(441, 180, 248, 301);
		
		Label ADD2 = new Label(this, SWT.BORDER);
		ADD2.setAlignment(SWT.CENTER);
		ADD2.setForeground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		ADD2.setFont(SWTResourceManager.getFont("Ubuntu", 20, SWT.BOLD));
		ADD2.setText("ADD");
		ADD2.setBounds(792, 72, 101, 76);
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setBounds(373, 631, 97, 34);
		btnNewButton.setText("New Button");
		
		fioWriteData1 = new Label(this, SWT.NONE);
		fioWriteData1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioWriteData1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioWriteData1.setBounds(761, 345, 9, 184);
		
		Label label_1 = new Label(this, SWT.NONE);
		label_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_1.setBounds(1287, 345, 9, 265);
		
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
		
		fioIMRR12 = new Label(this, SWT.NONE);
		fioIMRR12.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioIMRR12.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioIMRR12.setBounds(412, 215, 35, 9);
		
		fioInstruction = new Label(this, SWT.NONE);
		fioInstruction.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioInstruction.setBounds(353, 267, 61, 9);
		
		fioReadRegister22 = new Label(this, SWT.NONE);
		fioReadRegister22.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioReadRegister22.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioReadRegister22.setBounds(412, 296, 35, 9);
		
		fioPcReadAddress = new Label(this, SWT.NONE);
		fioPcReadAddress.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioPcReadAddress.setBounds(133, 195, 68, 9);
		
		fioWritedata2 = new Label(this, SWT.NONE);
		fioWritedata2.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioWritedata2.setBounds(762, 520, 272, 9);
		
		fioWriteR = new Label(this, SWT.NONE);
		fioWriteR.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioWriteR.setBackground(SWTResourceManager.getColor(192, 192, 192));
		fioWriteR.setBounds(412, 363, 35, 9);
		
		fioALUrAdd = new Label(this, SWT.NONE);
		fioALUrAdd.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUrAdd.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioALUrAdd.setBounds(966, 345, 68, 9);
		
		fioRD2ULA = new Label(this, SWT.NONE);
		fioRD2ULA.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD2ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD2ULA.setBounds(687, 337, 107, 9);
		
		fioRD1ULA = new Label(this, SWT.NONE);
		fioRD1ULA.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD1ULA.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		fioRD1ULA.setBounds(687, 267, 107, 9);
		
		Label label = new Label(this, SWT.NONE);
		label.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label.setBounds(158, 88, 9, 116);
		
		Label label_5 = new Label(this, SWT.NONE);
		label_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_5.setBackground(SWTResourceManager.getColor(192, 192, 192));
		label_5.setBounds(158, 88, 68, 9);
		
		Label label_6 = new Label(this, SWT.NONE);
		label_6.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_6.setBackground(SWTResourceManager.getColor(192, 192, 192));
		label_6.setBounds(173, 127, 53, 9);
		
		Label lblSignExtended = new Label(this, SWT.BORDER);
		lblSignExtended.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblSignExtended.setAlignment(SWT.CENTER);
		lblSignExtended.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.ITALIC));
		lblSignExtended.setBounds(441, 492, 120, 26);
		lblSignExtended.setText("sign extended");
		
		Label lblShiftLeft2 = new Label(this, SWT.BORDER);
		lblShiftLeft2.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblShiftLeft2.setText("shift left 2");
		lblShiftLeft2.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.ITALIC));
		lblShiftLeft2.setAlignment(SWT.CENTER);
		lblShiftLeft2.setBounds(441, 552, 106, 26);
		
		Label label_7 = new Label(this, SWT.NONE);
		label_7.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_7.setBounds(541, 562, 198, 9);
		
		Label label_8 = new Label(this, SWT.NONE);
		label_8.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_8.setBounds(560, 502, 147, 9);
		
		Label label_9 = new Label(this, SWT.NONE);
		label_9.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_9.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_9.setBounds(697, 144, 9, 365);
		
		Label lblShiftLeft = new Label(this, SWT.BORDER);
		lblShiftLeft.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblShiftLeft.setAlignment(SWT.CENTER);
		lblShiftLeft.setFont(SWTResourceManager.getFont("Ubuntu", 12, SWT.ITALIC));
		lblShiftLeft.setBounds(662, 116, 70, 32);
		lblShiftLeft.setText("shif left 2");
		
		Label label_10 = new Label(this, SWT.NONE);
		label_10.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_10.setBackground(SWTResourceManager.getColor(192, 192, 192));
		label_10.setBounds(730, 127, 76, 9);
		
		Label label_11 = new Label(this, SWT.NONE);
		label_11.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_11.setBounds(305, 88, 489, 9);
		
		Label label_12 = new Label(this, SWT.NONE);
		label_12.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_12.setBackground(SWTResourceManager.getColor(192, 192, 192));
		label_12.setBounds(889, 88, 76, 9);
		
		Label label_13 = new Label(this, SWT.NONE);
		label_13.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_13.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_13.setBounds(955, 8, 9, 89);
		
		Label label_14 = new Label(this, SWT.NONE);
		label_14.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_14.setBounds(10, 8, 952, 9);
		
		Label label_15 = new Label(this, SWT.NONE);
		label_15.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_15.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_15.setBounds(10, 8, 9, 198);
		
		Label label_16 = new Label(this, SWT.NONE);
		label_16.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_16.setBounds(10, 200, 68, 9);
		
		Label label_17 = new Label(this, SWT.NONE);
		label_17.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_17.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_17.setBounds(338, 36, 9, 61);
		
		Label label_18 = new Label(this, SWT.NONE);
		label_18.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_18.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_18.setBounds(21, 36, 324, 9);
		
		Label label_19 = new Label(this, SWT.NONE);
		label_19.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_19.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_19.setBounds(20, 36, 9, 184);
		
		Label label_20 = new Label(this, SWT.NONE);
		label_20.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_20.setBackground(SWTResourceManager.getColor(192, 192, 192));
		label_20.setBounds(20, 215, 50, 9);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(1, false));

		referencia lg = new referencia(shell, SWT.None);

		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
