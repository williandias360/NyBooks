package br.com.willian.nybooks.presentation.books

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.willian.nybooks.data.model.Book
import kotlinx.android.synthetic.main.item_book.view.*

class BooksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val title: TextView = itemView.txtTitle
    private val author: TextView = itemView.txtAuthor

    fun bindView(book: Book) {
        title.text = book.title
        author.text = book.author
    }
}