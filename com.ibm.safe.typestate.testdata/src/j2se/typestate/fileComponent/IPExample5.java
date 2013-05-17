/*******************************************************************************
 * Copyright (c) 2004-2010 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package j2se.typestate.fileComponent;

/*********************************************************************
 * Description: A simple incorrect usage of a file component.
 * Expected Result: this case should report a true error.
 * @author Eran Yahav (eyahav)
 *********************************************************************/
public class IPExample5 {

  public IPExample5() {
  }

  public static void main(String[] args) {
    IPExample5 example = new IPExample5();

    FileComponent f1 = example.createFileComponent();
    FileComponent f2 = example.createFileComponent();
    example.wrappedClose2(f1);
    f2 = f1;
    example.wrappedRead2(f2);
  }

  public FileComponent createFileComponent() {
    FileComponent fc;
    fc = new FileComponent();
    return fc;
  }

  public void wrappedClose2(FileComponent c) {
    wrappedClose(c);
  }

  public void wrappedRead2(FileComponent c) {
    wrappedRead(c);
  }

  public void wrappedClose(FileComponent c) {
    c.close();
  }

  public void wrappedRead(FileComponent c) {
    c.read();
  }

}
