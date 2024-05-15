package otus.homework.flowcats

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class CatsView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), ICatsView {

    private val catsText: TextView by lazy { findViewById(R.id.fact_textView) }
    override fun populate(fact: Fact) {
        catsText.text = fact.text
    }

    override fun showLoading() {
        catsText.text = context.getString(R.string.loadingString)
    }

    override fun showError(errorMsg: String) {
        Snackbar.make(this, errorMsg, Snackbar.LENGTH_LONG).show()
    }
}

interface ICatsView {

    fun populate(fact: Fact)
    fun showError(errorMsg: String)
    fun showLoading()
}