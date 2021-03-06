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
package j2se.typestate.accesspath.context_sensitivity;

import java.util.Iterator;

/**
 * This example should produce a violation ... and unfortunately miss one.
 * 
 * @author egeay
 */
public final class ImprovedContextSensitivity4 {

  public static void main(final String[] args) {
    final ProjectRep projectRep = new ProjectRep();
    // ...
    Iterator mainClassMethodsIter = projectRep.getMethodsOfMainClass();
    while (mainClassMethodsIter.hasNext()) {
      firstCall((String) mainClassMethodsIter.next());
    }
    secondCall((String) mainClassMethodsIter.next());
    // ...
    firstCall((String) mainClassMethodsIter.next()); // Hit !
  }

  private static void firstCall(final String element) {
    // Do something
  }

  private static void secondCall(final String element) {
    // Do something
  }

}
