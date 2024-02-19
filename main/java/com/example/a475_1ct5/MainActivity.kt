import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.a475_1ct5.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val imageUrls = listOf(
        "https://example.com/image1.jpg",
        "https://example.com/image2.jpg"
        // Add more image URLs
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = ImageAdapter(imageUrls)
    }
}