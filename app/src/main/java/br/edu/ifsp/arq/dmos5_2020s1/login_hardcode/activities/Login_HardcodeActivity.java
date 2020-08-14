package br.edu.ifsp.arq.dmos5_2020s1.login_hardcode.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.edu.ifsp.arq.dmos5_2020s1.login_hardcode.R;
import br.edu.ifsp.arq.dmos5_2020s1.login_hardcode.model.Login_Hardcode;

public class Login_HardcodeActivity extends AppCompatActivity implements View.OnClickListener{


    private EditText editText_user;
    private EditText editText_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__hardcode);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.Login_Hardcode));

        Button button_login;

        Login_Hardcode.getInstance();
        editText_user = findViewById(R.id.user_input);
        editText_pass = findViewById(R.id.pass_input);
        button_login = findViewById(R.id.login_button);
        button_login.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        Bundle bundleDadosUser = new Bundle();

        bundleDadosUser.putString(getString(R.string.user), editText_user.getText().toString());
        bundleDadosUser.putString(getString(R.string.pass), editText_pass.getText().toString());
        Intent intent = new Intent(Login_HardcodeActivity.this, Login_Hardcode_ValidateActivity.class);
        intent.putExtras(bundleDadosUser);

        startActivity(intent);
    }
}