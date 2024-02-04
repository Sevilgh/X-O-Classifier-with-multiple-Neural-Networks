package char_rec_hebb;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class test_hebb {
	private static Shell shlHebbCharacterRecognition;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		int[] x=new int[25];
		Display display = Display.getDefault();
		shlHebbCharacterRecognition = new Shell();
		shlHebbCharacterRecognition.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		shlHebbCharacterRecognition.setTouchEnabled(true);
		shlHebbCharacterRecognition.setSize(729, 613);
		shlHebbCharacterRecognition.setText("HEBB CHARACTER RECOGNITION");
		
		
		Label lblResult = new Label(shlHebbCharacterRecognition, SWT.NONE);
		lblResult.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblResult.setFont(SWTResourceManager.getFont("Segoe Print", 24, SWT.BOLD));
		lblResult.setBounds(566, 432, 165, 61);
		
		
		Button button_0 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_0.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_0.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_0.getEnabled()==true) {
					button_0.setEnabled(false);
				}
			}
		});
		button_0.setBounds(40, 48, 90, 90);
		
		Button button_1 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_1.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_1.getEnabled()==true) 
					button_1.setEnabled(false);
			}
		});
		button_1.setBounds(136, 48, 90, 90);
		
		Button button_2 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_2.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_2.getEnabled()==true) 
					button_2.setEnabled(false);
			}
		});
		button_2.setBounds(232, 48, 90, 90);
		
		Button button_3 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_3.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_3.getEnabled()==true) 
					button_3.setEnabled(false);
			}
		});
		button_3.setBounds(328, 48, 90, 90);
		
		Button button_4 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_4.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_4.getEnabled()==true) 
					button_4.setEnabled(false);
			}
		});
		button_4.setBounds(424, 48, 90, 90);
		
		Button button_5 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_5.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_5.getEnabled()==true) 
					button_5.setEnabled(false);
			}
		});
		button_5.setBounds(40, 144, 90, 90);
		
		Button button_6 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_6.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_6.getEnabled()==true) 
					button_6.setEnabled(false);
			}
		});
		button_6.setBounds(136, 144, 90, 90);
		
		Button button_7 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_7.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_7.getEnabled()==true) 
					button_7.setEnabled(false);
			}
		});
		button_7.setBounds(232, 144, 90, 90);
		
		Button button_8 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_8.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_8.getEnabled()==true) 
					button_8.setEnabled(false);
			}
		});
		button_8.setBounds(328, 144, 90, 90);
		
		Button button_9 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_9.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_9.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_9.getEnabled()==true) 
					button_9.setEnabled(false);
			}
		});
		button_9.setBounds(424, 144, 90, 90);
		
		Button button_10 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_10.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_10.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_10.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_10.getEnabled()==true) 
					button_10.setEnabled(false);
			}
		});
		button_10.setBounds(40, 240, 90, 90);
		
		Button button_11 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_11.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_11.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_11.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_11.getEnabled()==true) 
					button_11.setEnabled(false);
			}
		});
		button_11.setBounds(136, 240, 90, 90);
		
		Button button_12 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_12.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_12.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_12.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_12.getEnabled()==true) 
					button_12.setEnabled(false);
			}
		});
		button_12.setBounds(232, 240, 90, 90);
		
		Button button_13 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_13.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_13.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_13.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_13.getEnabled()==true) 
					button_13.setEnabled(false);
			}
		});
		button_13.setBounds(328, 240, 90, 90);
		
		Button button_14 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_14.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_14.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_14.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_14.getEnabled()==true) 
					button_14.setEnabled(false);
			}
		});
		button_14.setBounds(424, 240, 90, 90);
		
		Button button_15 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_15.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_15.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_15.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_15.getEnabled()==true) 
					button_15.setEnabled(false);
			}
			
		});
		button_15.setBounds(40, 336, 90, 90);
		
		Button button_16 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_16.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_16.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_16.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_16.getEnabled()==true) 
					button_16.setEnabled(false);
			}
		});
		button_16.setBounds(136, 336, 90, 90);
		
		Button button_17 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_17.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_17.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_17.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_17.getEnabled()==true) 
					button_17.setEnabled(false);
			}
		});
		button_17.setBounds(232, 336, 90, 90);
		
		Button button_18 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_18.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_18.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_18.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_18.getEnabled()==true) 
					button_18.setEnabled(false);
			}
		});
		button_18.setBounds(328, 336, 90, 90);
		
		Button button_19 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_19.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_19.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_19.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_19.getEnabled()==true) 
					button_19.setEnabled(false);
			}
		});
		button_19.setBounds(424, 336, 90, 90);
		
		Button button_20 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_20.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_20.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_20.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_20.getEnabled()==true) 
					button_20.setEnabled(false);
			}
		});
		button_20.setBounds(40, 432, 90, 90);
		
		Button button_21 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_21.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_21.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_21.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_21.getEnabled()==true) 
					button_21.setEnabled(false);
			}
		});
		button_21.setBounds(136, 432, 90, 90);
		
		Button button_22 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_22.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_22.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_22.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_22.getEnabled()==true) 
					button_22.setEnabled(false);
			}
		});
		button_22.setBounds(232, 432, 90, 90);
		
		Button button_23 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_23.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_23.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_23.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_23.getEnabled()==true) 
					button_23.setEnabled(false);
			}
		});
		button_23.setBounds(328, 432, 90, 90);
		
		Button button_24 = new Button(shlHebbCharacterRecognition, SWT.NONE);
		button_24.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		button_24.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				button_24.setBackground(SWTResourceManager.getColor(255, 222, 173));
				if(button_24.getEnabled()==true) 
					button_24.setEnabled(false);
			}
		});
		button_24.setBounds(424, 432, 90, 90);
		
		
		Button btnRec = new Button(shlHebbCharacterRecognition, SWT.NONE);
		btnRec.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnRec.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(button_0.getEnabled()==false)
					x[0]=1;
				else
					x[0]=-1;
				if(button_1.getEnabled()==false)
					x[1]=1;
				else
					x[1]=-1;
				
				if(button_2.getEnabled()==false)
					x[2]=1;
				else
					x[2]=-1;
				
				if(button_3.getEnabled()==false)
					x[3]=1;
				else
					x[3]=-1;

				if(button_4.getEnabled()==false)
					x[4]=1;
				else
					x[4]=-1;
				
				if(button_5.getEnabled()==false)
					x[5]=1;
				else
					x[5]=-1;
				
				if(button_6.getEnabled()==false)
					x[6]=1;
				else
					x[6]=-1;
				if(button_7.getEnabled()==false)
					x[7]=1;
				else
					x[7]=-1;
				
				if(button_8.getEnabled()==false)
					x[8]=1;
				else
					x[8]=-1;
				if(button_9.getEnabled()==false)
					x[9]=1;
				else
					x[9]=-1;
				
				if(button_10.getEnabled()==false)
					x[10]=1;
				else
					x[10]=-1;
				if(button_11.getEnabled()==false)
					x[11]=1;
				else
					x[11]=-1;
				if(button_12.getEnabled()==false)
					x[12]=1;
				else
					x[12]=-1;
				if(button_13.getEnabled()==false)
					x[13]=1;
				else
					x[13]=-1;
			
				if(button_14.getEnabled()==false)
					x[14]=1;
				else
					x[14]=-1;
				if(button_15.getEnabled()==false)
					x[15]=1;
				else
					x[15]=-1;
				if(button_16.getEnabled()==false)
					x[16]=1;
				else
					x[16]=-1;
				if(button_17.getEnabled()==false)
					x[17]=1;
				else
					x[17]=-1;
				
				if(button_18.getEnabled()==false)
					x[18]=1;
				else
					x[18]=-1;
				if(button_19.getEnabled()==false)
					x[19]=1;
				else
					x[19]=-1;
				
				if(button_20.getEnabled()==false)
					x[20]=1;
				else
					x[20]=-1;
				if(button_21.getEnabled()==false)
					x[21]=1;
				else
					x[21]=-1;
				
				if(button_22.getEnabled()==false)
					x[22]=1;
				else
					x[22]=-1;
				if(button_23.getEnabled()==false)
					x[23]=1;
				else
					x[23]=-1;
				if(button_24.getEnabled()==false)
					x[24]=1;
				else
					x[24]=-1;
				
				hebb25 hebb_rec=new hebb25();
				String recognized=hebb_rec.main(x);
				lblResult.setText(recognized);
			}
		});
		btnRec.setBounds(536, 336, 165, 90);
		btnRec.setText("recognize");
		
		Button btnClear = new Button(shlHebbCharacterRecognition, SWT.NONE);
		btnClear.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnClear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				lblResult.setText("");
				button_0.setEnabled(true);
				button_1.setEnabled(true);
				button_2.setEnabled(true);
				button_3.setEnabled(true);
				button_4.setEnabled(true);
				button_5.setEnabled(true);
				button_6.setEnabled(true);
				button_7.setEnabled(true);
				button_8.setEnabled(true);
				button_9.setEnabled(true);
				button_10.setEnabled(true);
				button_11.setEnabled(true);
				button_12.setEnabled(true);
				button_13.setEnabled(true);
				button_14.setEnabled(true);
				button_15.setEnabled(true);
				button_16.setEnabled(true);
				button_17.setEnabled(true);
				button_18.setEnabled(true);
				button_19.setEnabled(true);
				button_20.setEnabled(true);
				button_21.setEnabled(true);
				button_22.setEnabled(true);
				button_23.setEnabled(true);
				button_24.setEnabled(true);
				
				
				button_0.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_4.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_6.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_9.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_10.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_11.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_12.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_13.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_14.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_15.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_16.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_17.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_18.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_19.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_20.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_21.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_22.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_23.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				button_24.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
				
				
			}
		});
		btnClear.setText("Clear");
		btnClear.setBounds(536, 240, 165, 90);
		
	
		

		shlHebbCharacterRecognition.open();
		shlHebbCharacterRecognition.layout();
		while (!shlHebbCharacterRecognition.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
