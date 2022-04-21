package vn.nhom5.lab04.ui.display;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import vn.nhom5.lab04.R;
import vn.nhom5.lab04.data.SQLiteConnector;
import vn.nhom5.lab04.data.model.LoggedInUser;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        SQLiteConnector sqLiteConnector = new SQLiteConnector(getApplicationContext());

        Bundle bundleReceive = getIntent().getExtras();
        if (!bundleReceive.isEmpty()) {
            LoggedInUser user = (LoggedInUser) bundleReceive.get("Object_loggedInUser");
            if (user != null){
                if (sqLiteConnector.checkUser(user.getName(), user.getPassword())) {
                    String message = String.format("Logged in successfully!!!\nUser %s is already in database",
                            user.getName());
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
                    Log.d("NHOM5", message);
                }
                else {
                    String message = String.format("Logged in Failed\nUser %s doesn't exist!!!",
                            user.getName());
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
                    Log.d("NHOM5", message);
                }
            }
        }
    }
}