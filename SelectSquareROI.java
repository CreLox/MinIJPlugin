/*
* SelectSquareROI.java
* Author: Chu Chen
* Date: Feb 23, 2017
*/

import ij.*;
import ij.gui.*;
import ij.plugin.*;

public class SelectSquareROI implements PlugIn {
	public void run(String arg) {
		GenericDialog gd = new GenericDialog("Select square ROI");
		gd.addNumericField("Set slice:", 1, 0);
		gd.addNumericField("Center x:", 0, 0);
		gd.addNumericField("Center y:", 0, 0);
		gd.addNumericField("Edge:", 100, 0);
		gd.showDialog();
		if (gd.wasCanceled()) {
			return;
		}
		int jumptoSlice = (int) gd.getNextNumber();
		int xCoordinate = (int) gd.getNextNumber();
		int yCoordinate = (int) gd.getNextNumber();
		int edgeLength = (int) gd.getNextNumber();
		ImagePlus imp = IJ.getImage();
		imp.setSlice(jumptoSlice);
		imp.setRoi(xCoordinate - edgeLength / 2, yCoordinate - edgeLength / 2, edgeLength, edgeLength);
	}
}

