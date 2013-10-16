/*
 * Copyright 2013 Prateek Srivastava (@f2prateek)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.f2prateek.dfg;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import com.f2prateek.dfg.model.DeviceProvider;
import com.f2prateek.dfg.ui.MainActivity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import static org.fest.assertions.api.ANDROID.assertThat;

@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityUnitTest {
  @Test public void testViewPagerCount() {
    Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();
    ViewPager viewPager = (ViewPager) activity.findViewById(R.id.pager);
    assertThat(viewPager.getAdapter()).hasCount(DeviceProvider.getDevices().size());
  }
}