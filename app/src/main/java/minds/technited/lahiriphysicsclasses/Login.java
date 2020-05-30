package minds.technited.lahiriphysicsclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btnRegister(View view) {
        startActivity(new Intent(getApplicationContext(), Register.class));
    }
//
//    public void btnLogin(View view) {
//        startActivity(new Intent(getApplicationContext(), Register.class));
//    }
}
