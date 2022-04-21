package vn.nhom5.lab04.ui.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.text.MessageFormat;

import vn.nhom5.lab04.R;
import vn.nhom5.lab04.data.SQLiteConnector;
import vn.nhom5.lab04.data.model.LoggedInUser;
import vn.nhom5.lab04.databinding.ActivityLoginBinding;
import vn.nhom5.lab04.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        final EditText usernameEditText = binding.editUsername;
        final EditText passwordEditText = binding.editPassword;
        final EditText emailEditText = binding.editEmail;
        final Button registerButton = binding.btnRegister;

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    SQLiteConnector sqLiteConnector = new SQLiteConnector(getApplicationContext());
                    LoggedInUser user = new LoggedInUser("19520025",
                            usernameEditText.getText().toString(),
                            emailEditText.getText().toString(),
                            passwordEditText.getText().toString());

                    sqLiteConnector.addUscer(user);
                    String message = MessageFormat.format("User {0} added successfully",
                            usernameEditText.getText().toString());
                    Log.d("TEAM5", message);
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
    }



}