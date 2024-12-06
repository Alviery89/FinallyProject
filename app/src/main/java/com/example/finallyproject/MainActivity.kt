import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.finallyproject.Movie
import com.example.finallyproject.MoviesAdapter
import com.example.finallyproject.R



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val movies = listOf(
            Movie(
                title = "Venom: The Last Dance",
                description = "Eddie and Venom are on the run. Hunted by both of their worlds...",
                posterUrl = "https://example.com/venom.jpg",
                trailerUrl = "https://youtube.com/watch?v=venom-trailer"
            ),
            Movie(
                title = "Terrifier 3",
                description = "Five years after surviving Art the Clown's Halloween massacre...",
                posterUrl = "https://example.com/terrifier.jpg",
                trailerUrl = "https://youtube.com/watch?v=terrifier-trailer"
            ),
            Movie(
                title = "The Wild Robot",
                description = "After a shipwreck, an intelligent robot called Roz is stranded...",
                posterUrl = "https://example.com/wildrobot.jpg",
                trailerUrl = "https://youtube.com/watch?v=wildrobot-trailer"
            )
        )

        val rvMovies: RecyclerView = findViewById(R.id.rvMovies)
        rvMovies.adapter = MoviesAdapter(this, movies)
    }
}
