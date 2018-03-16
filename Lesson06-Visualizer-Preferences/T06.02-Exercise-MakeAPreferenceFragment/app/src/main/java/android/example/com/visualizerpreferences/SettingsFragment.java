package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by stephanieyoustra on 3/16/18.
 */

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {        //SOLUTION HAS Bundle bundle, String S
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
