package com.example.justina

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SlideshowActivity : AppCompatActivity() {

    // on below line we are creating variables
    // for our swipe to refresh layout,
    // recycler view, adapter and list.
    lateinit var courseRV: RecyclerView
    lateinit var courseRVAdapter: CourseRVAdapter
    lateinit var courseList: ArrayList<CourseRVModal>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slideshow)

        // on below line we are initializing
        // our views with their ids.
        courseRV = findViewById(R.id.idRVCourses)

        // on below line we are initializing our list
        courseList = ArrayList()

        // on below line we are creating a variable
        // for our grid layout manager and specifying
        // column count as 2
        val layoutManager = GridLayoutManager(this, 2)

        courseRV.layoutManager = layoutManager

        // on below line we are initializing our adapter
        courseRVAdapter = CourseRVAdapter(courseList, this)

        // on below line we are setting
        // adapter to our recycler view.
        courseRV.adapter = courseRVAdapter

        // on below line we are adding data to our list
        courseList.add(CourseRVModal("At Home", R.drawable.j1))
        courseList.add(CourseRVModal("Just Mom's Event", R.drawable.j2))
        courseList.add(CourseRVModal("Strolling Around", R.drawable.jf1))
        courseList.add(CourseRVModal("Reading and Learning", R.drawable.justinabg))
        courseList.add(CourseRVModal("Making things Shake", R.drawable.justina1))
        courseList.add(CourseRVModal("At Home", R.drawable.f1))
        courseList.add(CourseRVModal("Just Mom's Event", R.drawable.f2))
        courseList.add(CourseRVModal("Strolling Around", R.drawable.justinabg))
        courseList.add(CourseRVModal("Reading and Learning", R.drawable.justinabg))
        courseList.add(CourseRVModal("Making things Shake", R.drawable.justinabg))
        courseList.add(CourseRVModal("At Home", R.drawable.justinabg))
        courseList.add(CourseRVModal("Just Mom's Event", R.drawable.justinabg))
        courseList.add(CourseRVModal("Strolling Around", R.drawable.justinabg))
        courseList.add(CourseRVModal("Reading and Learning", R.drawable.justinabg))
        courseList.add(CourseRVModal("Making things Shake", R.drawable.justinabg))
        courseList.add(CourseRVModal("At Home", R.drawable.justinabg))
        courseList.add(CourseRVModal("Just Mom's Event", R.drawable.justinabg))
        courseList.add(CourseRVModal("Strolling Around", R.drawable.justinabg))
        courseList.add(CourseRVModal("Reading and Learning", R.drawable.justinabg))
        courseList.add(CourseRVModal("Making things Shake", R.drawable.j1))

        // on below line we are notifying adapter
        // that data has been updated.
        courseRVAdapter.notifyDataSetChanged()

    }
}