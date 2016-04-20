package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.yash.lab3.MainActivity;
import com.example.yash.lab3.R;


/**
 * Created by Yash on 4/19/16.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);

    }

    public void test_first() {
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv2);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }
}