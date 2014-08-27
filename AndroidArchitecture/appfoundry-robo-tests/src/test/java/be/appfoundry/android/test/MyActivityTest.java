package be.appfoundry.android.test;

import android.annotation.TargetApi;
import android.os.Build;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import be.appfoundry.android.RobolectricGradleTestRunner;
import be.appfoundry.android.androidarchitecture.MyActivity;
import be.appfoundry.android.androidarchitecture.R;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * @author Filip Maelbrancke
 */
@Config(emulateSdk = 18)
@RunWith(RobolectricGradleTestRunner.class)
public class MyActivityTest {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Test
    public void shouldHaveLoadedFragmentWhenActivityCreated() throws Exception {
        MyActivity activity = new MyActivity();

        ActivityController.of(activity).attach().create();

        MyActivity.PlaceholderFragment fragment = (MyActivity.PlaceholderFragment) activity.getFragmentManager().findFragmentById(R.id.container);
        assertThat(fragment).isNotNull();
    }
}
