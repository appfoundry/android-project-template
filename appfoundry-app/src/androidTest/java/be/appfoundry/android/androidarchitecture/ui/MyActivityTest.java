package be.appfoundry.android.androidarchitecture.ui;

import android.test.ActivityInstrumentationTestCase2;

import be.appfoundry.android.androidarchitecture.R;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static org.assertj.android.api.Assertions.assertThat;

/**
 * @author Filip Maelbrancke
 */
public class MyActivityTest extends ActivityInstrumentationTestCase2<MyActivity> {

    public MyActivityTest() {
        super(MyActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void test_preconditions() {
        assertThat(getActivity()).isNotNull();
        assertThat(getActivity()).isNotFinishing();
        assertThat(getActivity()).hasWindowFocus();
        assertThat(getActivity()).hasTitle(R.string.app_name);
    }

    public void test_activity_shows_hello_world() {
        onView(withId(R.id.label_hello_world)).check(matches(isDisplayed()));
    }

}
