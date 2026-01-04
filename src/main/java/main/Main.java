/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package main;

import frame.Frame;

public class Main {
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(() -> new Frame("Test"));
    }
}
