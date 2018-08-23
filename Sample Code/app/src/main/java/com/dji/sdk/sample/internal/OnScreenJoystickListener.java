package com.dji.sdk.sample.internal;

/*
 * Copyright (c) 2014 Ville Saarinen

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

import com.dji.sdk.sample.internal.utils.OnScreenJoystick;

public interface OnScreenJoystickListener {

	/** Called when the joystick is touched.
	 * @param joystick The joystick which has been touched.
	 * @param pX The x coordinate of the knob. Values are between -1 (left) and 1 (right).  
	 * @param pY The y coordinate of the knob. Values are between -1 (down) and 1 (up).
	 */
	public void onTouch(final OnScreenJoystick joystick, final float pX, final float pY);
}
