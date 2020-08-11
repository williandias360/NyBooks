package br.com.willian.nybooks.presentation.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.willian.nybooks.R
import br.com.willian.nybooks.data.model.Book
import kotlinx.android.synthetic.main.activity_books.*

class BooksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        toolbarMain.title = getString(R.string.app_title)
        setSupportActionBar(toolbarMain)

        with(recyclerBooks) {
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = BooksAdapter(getBooks())
        }

        val viewModel: BooksViewModel = ViewModelProviders.of(this).get(BooksViewModel::class.java)
    }

    fun getBooks() = listOf(
        Book("Title", "Author1"),
        Book("Title 2", "Author 2"),
        Book("Title 3", "Author 3")
    )
}