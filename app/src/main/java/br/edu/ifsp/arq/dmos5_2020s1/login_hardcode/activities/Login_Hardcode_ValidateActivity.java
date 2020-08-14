package br.edu.ifsp.arq.dmos5_2020s1.login_hardcode.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import br.edu.ifsp.arq.dmos5_2020s1.login_hardcode.R;
import br.edu.ifsp.arq.dmos5_2020s1.login_hardcode.model.Login_Hardcode;

public class Login_Hardcode_ValidateActivity extends AppCompatActivity {

    private TextView textView_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__hardcode__validate);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getString(R.string.Login_Hardcode));

        String user;
        String pass;

        Bundle bundleDadosUser = getIntent().getExtras();

        textView_message = findViewById(R.id.message_output);

        user = bundleDadosUser.getString(getString(R.string.user));
        pass = bundleDadosUser.getString(getString(R.string.pass));
        validar(user, pass);
    }

    private void validar(String user, String pass) {
        if(Login_Hardcode.getInstance().check(user, pass)){
            textView_message.setText(String.format("%s %s", getString(R.string.bem_vindo), user));
        } else {
            textView_message.setText(R.string.error_Login);
        }
    }
}