/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.overlord.sramp.ui.client.services;

/**
 * Interface used to get called back when the {@link Services} infrastructure has been
 * fully initialized (created and started).
 *
 * @author eric.wittmann@redhat.com
 */
public interface IServicesListener {
	
	/**
	 * Called back when all of the {@link IService}s have been started.
	 */
	public void onAllServicesStarted();
	
	/**
	 * Called if there is some problem with any {@link IService}.
	 * @param error
	 */
	public void onError(Throwable error);
	
}