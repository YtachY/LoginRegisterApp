package vn.nhom5.lab04.ui.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import vn.nhom5.lab04.R;
import vn.nhom5.lab04.databinding.ActivityLoginBinding;
import vn.nhom5.lab04.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}