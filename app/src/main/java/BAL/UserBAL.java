package BAL;


import DataAccessLayer.*;
import androidx.appcompat.app.AppCompatActivity;

import com.example.deafanddumbcommunicator.*;

public class UserBAL extends AppCompatActivity {

    DDCDatabsse databsse;
    User user;

    public UserBAL()
    {
        databsse = databsse.getInstance(getApplicationContext());
    }
    public boolean Signup(User user)
    {
        databsse.userDao().insert(user);
        return true;
    }
    public boolean ValidateUser(String username, String password)
    {
        if(databsse.userDao().getUser(username,password)!=null)
            return true;
        else
            return false;
    }
}
