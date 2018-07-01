package c.jopel.attendacelogin;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class LoginActivty extends AppCompatActivity {
    EditText uname,pswd,usertype;
    Button login;
    DbHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=(EditText)findViewById(R.id.uname);
        pswd=(EditText)findViewById(R.id.password);
        usertype=(EditText)findViewById(R.id.usertype);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=uname.getText().toString();
                String type=usertype.getText().toString();
                String password=pswd.getText().toString();
                int id= checkUser(new User(name,password,type));
                if(id==-1)
                {
                    Toast.makeText(LoginActivty.this,"User Does Not Exist",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(LoginActivty.this,"User Exist "+name,Toast.LENGTH_SHORT).show();
                }
            }
        });
        db=new DbHandler(LoginActivty.this);
//inserting dummy users
        db.addUser(new User("Poonam", "Joshi","Advance"));
        db.addUser(new User("Raj", "Acharya","Basic"));
        db.addUser(new User("Bunny", "jaiswal","Basic"));
    }
    public int checkUser(User user)
    {
        return db.checkUser(user);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
//noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

