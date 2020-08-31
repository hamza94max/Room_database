package com.hamza.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;


    @Dao
    interface PostsDao {

      @Insert
      void insertPost (Post post);


      @Query("Select * from posts_table")
      List<Post>getPosts();







    }
