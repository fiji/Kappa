/*
 * #%L
 * A Fiji plugin for Curvature Analysis.
 * %%
 * Copyright (C) 2016 - 2020 Fiji developers.
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */
package sc.fiji.kappa.gui;

import java.awt.event.ActionEvent;

public class ZoomOutListener extends ZoomListener {

	public ZoomOutListener(ControlPanel controlPanel) {
		super(controlPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double scale = controlPanel.getScaleSlider().getValue() / 100.0;

		// If we are at the min scaling increment or lower, we can't zoom out
		if (scale <= ControlPanel.SCALE_INCREMENTS[0]) {
			return;
		}

		// Finds the next smallest scaling increment and sets the scale to that.
		int i = 1;
		while (i < ControlPanel.SCALE_INCREMENTS.length && ControlPanel.SCALE_INCREMENTS[i] < scale) {
			i++;
		}
		controlPanel.getScaleSlider().setValue((int) Math.floor(100.0 * ControlPanel.SCALE_INCREMENTS[--i]));
	}
}
