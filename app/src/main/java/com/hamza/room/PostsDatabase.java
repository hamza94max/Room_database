package com.hamza.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;



@Database(entities = Post.class,version =1 )
public abstract class PostsDatabase extends RoomDatabase {



    private static PostsDatabase instance;
    public abstract PostsDao postsDao();


    public static synchronized PostsDatabase getInstance(Context context){

        if (instance==null){
            instance= Room.databaseBuilder(context.getApplicationContext()
                    ,PostsDatabase.class,"Posts_database")
                    .fallbackToDestructiveMigration()
                    .build();

        }
        return instance;





    }


}
