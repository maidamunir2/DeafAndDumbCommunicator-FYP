package DataAccessLayer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class User {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "phone_number")
    public String phone_Number;

    @ColumnInfo(name = "date_of_birth")
    public  String date_Of_Birth;

    @ColumnInfo(name = "password")
    public String password;

    public User(String email, String phone_Number, String date_Of_Birth, String password) {
        this.email = email;
        this.phone_Number = phone_Number;
        this.date_Of_Birth = date_Of_Birth;
        this.password = password;
    }
}