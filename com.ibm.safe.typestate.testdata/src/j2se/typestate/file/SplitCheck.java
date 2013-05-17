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
package j2se.typestate.file;

/*
 * Created on Aug 11, 2003
 */

/**
 * @author eyahav
 */
public class SplitCheck {

  public static void main(String[] args) {

    FileComponent x = new FileComponent();
    FileComponent x2 = new FileComponent();
    FileComponent x3 = new FileComponent();
    FileComponent x4 = new FileComponent();
    FileComponent x5 = new FileComponent();
    FileComponent x6 = new FileComponent();

    FileComponent z;

    z = x;

    z.close();
    x.read(); // error - reading from closed file

  }
}
