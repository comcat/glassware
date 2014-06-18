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

import android.os.IBinder;
import android.app.Service;
import android.content.Intent;

public class MainService extends Service {
	
	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	
	/*
	 * onStartCommand is used to start a service from your voice trigger you set up
	 * in res/xml/voice_trigger_start.xml
	*/
	public int onStartCommand(Intent intent, int flags, int startId) {
		
		Intent i = new Intent(this, MainActivity.class);
		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(i);
		return START_STICKY;
	}

}
