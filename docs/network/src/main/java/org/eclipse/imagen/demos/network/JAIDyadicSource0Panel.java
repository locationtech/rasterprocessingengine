/*
 * Copyright (c) 2019, Oracle and/or its affiliates. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.eclipse.imagen.demos.network;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.renderable.ParameterBlock;
import java.util.Hashtable;
import java.util.Vector;
import org.eclipse.imagen.*;
import org.eclipse.imagen.remote.RemoteJAI;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.image.DataBuffer;
import java.awt.image.SampleModel;

public class JAIDyadicSource0Panel extends JAIDyadicPanel {
  
    public JAIDyadicSource0Panel(JAINetworkDemo demo, 
				 Vector sourceVec, 
				 RemoteJAI pClient) {
        super(demo, sourceVec, pClient);
    }  
    
    public String getDemoName() {
        return "Source0";
    }
    
    public PlanarImage process() {
        return getSource(0);
    }
}
