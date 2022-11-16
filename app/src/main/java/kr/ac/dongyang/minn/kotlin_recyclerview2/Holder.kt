package kr.ac.dongyang.minn.kotlin_recyclerview2

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Holder(itemView: View): RecyclerView.ViewHolder(itemView) {
    var idTextView = itemView.findViewById<TextView>(R.id.id_number)
    var textTitleTextView = itemView.findViewById<TextView>(R.id.text_title)
    fun setText(listData: ListData){
        idTextView.text = "${listData.number}"
        textTitleTextView.text = listData.title
    }
}