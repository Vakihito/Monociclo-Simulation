package Control;

import java.util.Vector;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import Pages.ADD;
import Pages.BEQ;
import Pages.Jump;
import Pages.LW;
import Control.ReadFile;




public class Control extends Composite {

	static Display display;
	static Shell shell;
	static Shell shell1;
	
	static ADD add; //  0
	static LW lw; // 1;
	static BEQ beq; // 2;
	static Jump jump; // 3
	static int line = 0;
	
	static int Window;
	static Vector <Bloco> Instructions;

	static void setDisplay(int nova) {
		int aux = checkOpen();
		if (aux < 0 || aux == nova) {
			return;
		}
			
		
		
		closeWindow(aux);
		shellReopen();
		switch (nova) {
			case 0:
				print(""  + line);
				print("entrei add");
				add.setTextlbl("instrução : " + Instructions.elementAt(line).getComand());
				add.setParent(shell);
				
				break;
			case 1:
				print("entrei lw");
				lw.setTextlbl("instrução : " + Instructions.elementAt(line).getComand());
				lw.setParent(shell);
				break;
			case 2:
				print("entrei beq");
				beq.setTextlbl("instrução : " + Instructions.elementAt(line).getComand());
				beq.setParent(shell);
				
				break;
			case 3:
				print("entrei j");
				jump.setTextlbl("instrução : " + Instructions.elementAt(line).getComand());
				jump.setParent(shell);
				break;
			default:
				print("instrução não implementada");
				line++;
				setWindow(line);
				break;
				
		}
		print("" + line);
		setLine(line);
		resetFlags();
	}
	static void closeWindow(int close) {
		if (close < 0)
			return;
		
		
		switch (close) {
			case 0:
				add.setParent(shell1);
				line++;
				break;
			case 1:
				lw.setParent(shell1);
				line++;
				break;
			case 2:
				beq.setParent(shell1);
				line++;
				break;
			case 3:
				jump.setParent(shell1);
				line++;
				break;
			
		}
	}
	
	static int checkOpen() {
		if (add.getParent().equals(shell)) {
			return 0;
		}else if (lw.getParent().equals(shell)) {
			return 1;
		}else if (beq.getParent().equals(shell)) {
			return 2;
		}else if (jump.getParent().equals(shell)) {
			return 3;
		}
		
		
		return -1;
	}

	static int checkChange() {
			
		switch (checkOpen()) {
			case 0:
				setDisplay(add.getChangeWindow());
				add.setTextlbl("instrução : " + Instructions.elementAt(line).getComand());
				return 0;
			case 1:
				setDisplay(lw.getChangeWindow());
				lw.setTextlbl("instrução : " + Instructions.elementAt(line).getComand());
				return 1;
			case 2:
				setDisplay(beq.getChangeWindow());
				beq.setTextlbl("instrução : " + Instructions.elementAt(line).getComand());
				return 2;
			case 3:
				setDisplay(jump.getChangeWindow());
				jump.setTextlbl("instrução : " + Instructions.elementAt(line).getComand());
				return 3;
		}
		return -1;
	}
	
	static void shellReopen() {
		shell.pack();
		shell.open();
	}
	
	static void resetFlags() {
		jump.resetFlag();
		add.resetFlag();
		lw.resetFlag();
		beq.resetFlag();
		shellReopen();
	}
	
	static void setLine(int line) {
		add.setLine(line);
		jump.setLine(line);
		lw.setLine(line);
		beq.setLine(line);
	}
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Control(Composite parent, int style) {
		super(parent, style);
		line = 0;

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	static public void print(String s) {
		System.out.println(s);
	}
	
	static public void setWindow(int idx) {
		switch ( Instructions.elementAt(idx).getIt()) {
		case 0:
			add.setParent(shell);
			break;
		case 1:
			lw.setParent(shell);
			break;
		case 2:
			beq.setParent(shell);
			break;
		case 3:
			jump.setParent(shell);
			break;
		default:
			break;
	}

	}
	public static void main(String[] args) {
		display = new Display();
		shell = new Shell(display);
		shell1 = new Shell(display);
		
		shell.setLayout(new GridLayout(1, false));
		Instructions = ReadFile.readAll();
		
		
		add = new ADD(shell1, SWT.None, Instructions);
		lw = new LW(shell1, SWT.None, Instructions);
		beq = new BEQ(shell1, SWT.None, Instructions);
		jump = new Jump(shell1, SWT.None, Instructions);		

		setWindow(0);
		
		
		shell.pack();
		shell.open();
		
		while (!shell.isDisposed()) {
			
			
			if (Instructions.size() > line) 
				checkChange();
			
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
	
}
