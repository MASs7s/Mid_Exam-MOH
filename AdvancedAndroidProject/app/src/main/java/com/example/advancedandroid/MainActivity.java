package com.example.advancedandroid;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout emailLayout, passwordLayout;
    private EditText emailInput, passwordInput;
    private Button loginButton;
    private long lastBackPressed = 0L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailLayout = findViewById(R.id.emailLayout);
        passwordLayout = findViewById(R.id.passwordLayout);
        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        loginButton = findViewById(R.id.loginButton);

        TextWatcher watcher = new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override public void onTextChanged(CharSequence s, int start, int before, int count) {
                validateForm(false);
            }
            @Override public void afterTextChanged(Editable s) { }
        };
        emailInput.addTextChangedListener(watcher);
        passwordInput.addTextChangedListener(watcher);

        loginButton.setOnClickListener(v -> {
            if (validateForm(true)) {
                Intent intent = new Intent(MainActivity.this, ModelActivity.class);
                intent.putExtra("student_name", "Mohammed Awni Salem");
                intent.putExtra("student_id", "1301204452");
                startActivity(intent);
            }
        });

        validateForm(false);
    }

    private boolean validateForm(boolean showErrors) {
        String email = emailInput.getText().toString().trim();
        String password = passwordInput.getText().toString();

        boolean validEmail = Patterns.EMAIL_ADDRESS.matcher(email).matches();
        boolean validPassword = password.length() >= 6;

        emailLayout.setError(showErrors && !validEmail ? "Enter a valid email address" : null);
        passwordLayout.setError(showErrors && !validPassword ? "Password must be at least 6 characters" : null);

        loginButton.setEnabled(validEmail && validPassword);
        return validEmail && validPassword;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastBackPressed < 2000) {
            finishAffinity();
        } else {
            lastBackPressed = currentTime;
            Snackbar.make(findViewById(android.R.id.content),
                    "Press back again to exit", Snackbar.LENGTH_LONG).show();
        }
    }
}
