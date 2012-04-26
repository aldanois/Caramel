package com.sideeffectideas.android.caramel.test;

import android.test.ActivityInstrumentationTestCase2;
import com.sideeffectideas.android.caramel.*;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

    public void testActivity() {
        HelloAndroidActivity activity = getActivity();
        assertNotNull(activity);
    }
}

