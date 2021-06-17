package DataAccessLayer;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1)
public abstract class DDCDatabsse extends RoomDatabase{
    private static final String db_Name = "DeafAndDumbCommunicator";
    private static DDCDatabsse instance;

    public static synchronized DDCDatabsse getInstance(Context context)
    {
        if(instance == null)
            instance = buildDatabaseInstance(context);
        return instance;
    }
    private static DDCDatabsse buildDatabaseInstance(Context context) {
        return Room.databaseBuilder(context,
                DDCDatabsse.class,
                db_Name).allowMainThreadQueries().build();
    }
    public abstract UserDoa userDao();


}
