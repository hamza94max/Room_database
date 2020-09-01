package com.hamza.room;

import android.database.Observable;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Single;


@Dao
    interface PostsDao {

      @Insert
      Completable insertPost (Post post);


      @Query("Select * from posts_table")
      Single< List<Post> > getPosts();







    }
