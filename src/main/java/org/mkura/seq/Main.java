package org.mkura.seq;

import org.eclipse.swt.*;
import org.eclipse.swt.widgets.*;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("SWT Demo");

        Button btn = new Button(shell, SWT.PUSH);
        btn.setText("Click me!");
        btn.setBounds(50, 50, 80, 30);
        btn.addListener(SWT.Selection, e -> System.out.println("Clicked!"));

        shell.setSize(200, 150);
        shell.open();

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();

        //System.in.read();


    }
}