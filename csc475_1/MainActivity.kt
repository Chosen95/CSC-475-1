import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.csc475_1.R
import com.example.csc475_1.ToDoDBHelper

class MainActivity : AppCompatActivity() {
    private lateinit var dbHelper: ToDoDBHelper

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHelper = ToDoDBHelper(this)

        val taskInput = findViewById<EditText>(R.id.taskInput)
        val addButton = findViewById<Button>(R.id.addButton)
        val tasksContainer = findViewById<LinearLayout>(R.id.tasksContainer)

        addButton.setOnClickListener {
            val task = taskInput.text.toString()
            if (task.isNotEmpty()) {
                dbHelper.insertTask(task)
                taskInput.text.clear()
                loadTasks()
            }
        }

        loadTasks()
    }

    private fun loadTasks() {
        // Simplified: Fetch tasks from the database and display them.
        // For a complete implementation, use a RecyclerView or similar view.
    }
}