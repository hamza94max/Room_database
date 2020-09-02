# Room_database


Dependencies

    //Room
    def room_version = "2.2.5"

    implementation "androidx.room:room-runtime:$room_version"
    annotationProcessor "androidx.room:room-compiler:$room_version"
    // optional - RxJava support for Room
    implementation "androidx.room:room-rxjava2:$room_version"

    // RX java
    def rxJavaVersion = '2.1.1'
    implementation "io.reactivex.rxjava2:rxandroid:$rxJavaVersion"
    implementation "io.reactivex.rxjava2:rxjava:$rxJavaVersion"
