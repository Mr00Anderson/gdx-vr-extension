/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.vr.tests;

import com.badlogic.gdx.backends.iosmoe.IOSApplication;
import com.badlogic.gdx.backends.iosmoe.IOSApplicationConfiguration;

import org.moe.natj.general.Pointer;

import apple.uikit.c.UIKit;

public class IOSMoeLauncher extends IOSApplication.Delegate {

	protected IOSMoeLauncher (Pointer peer) {
		super(peer);
	}

	@Override
	protected IOSApplication createApplication () {
		IOSApplicationConfiguration config = new IOSApplicationConfiguration();
		config.useAccelerometer = false;
		return new IOSApplication(new GdxVrTest(), config);
	}

	public static void main (String[] argv) {
		UIKit.UIApplicationMain(0, null, null, IOSMoeLauncher.class.getName());
	}
}
