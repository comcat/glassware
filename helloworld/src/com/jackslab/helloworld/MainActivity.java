/*
 * Copyright (c) 2014 Jack Tan(BH1RBH) at Jack's Lab
 * 
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Library General Public License version 2
 * published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Library General Public License for more details.
 * 
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 * 
 */

package com.jackslab.helloworld;

import com.google.android.glass.app.Card;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/* create a static card */
		Card c1 = new Card(this);
		c1.setText("Hello, World!");		// Main text area
		c1.setFootnote("This's glass");		// Footer
		View c1_view = c1.toView();
		
		/* Display the card we just created */
		setContentView(c1_view);
	}

}
