package flubby.com.instagramclone.Share;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import flubby.com.instagramclone.R;
import flubby.com.instagramclone.Utils.BottomNavigationViewHelper;

/**
 * Created by Flubby on 12/30/2017.
 */

public class ShareActivity extends AppCompatActivity
{
    private static final String TAG = "ShareActivity";
    private Context mContext = ShareActivity.this;

    private final int ACTIVITY_NUM = 2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: Started.");
        setupBottomNavigationView();
    }

    private void setupBottomNavigationView()
    {
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationViewEx");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}
