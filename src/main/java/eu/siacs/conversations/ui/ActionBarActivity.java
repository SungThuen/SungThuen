package eu.siacs.conversations.ui;

import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import eu.siacs.conversations.R;


public abstract class ActionBarActivity extends AppCompatActivity {
    public static void configureActionBar(ActionBar actionBar) {
        configureActionBar(actionBar, true);
    }

    public static void configureActionBar(ActionBar actionBar, boolean upNavigation) {
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(upNavigation);
            actionBar.setDisplayHomeAsUpEnabled(upNavigation);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_back_button);
        }
    }

    public void setSupportActionBar(View toolbar) {
        super.setSupportActionBar((Toolbar) toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}