package ac.id.healthapp

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class NewsAdapter(private val context: Context, private val newsList: List<News>) : BaseAdapter() {

    override fun getCount(): Int = newsList.size

    override fun getItem(position: Int): Any = newsList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    @SuppressLint("CutPasteId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

        val titleText = view.findViewById<TextView>(R.id.tvTitle)
        val descText = view.findViewById<TextView>(R.id.tvDetailContent)

        val news = newsList[position]
        titleText.text = news.title
        descText.text = news.title

        return view
    }
}
