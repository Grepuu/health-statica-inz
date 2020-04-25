package eu.codetown.healthstatica.lawArticles.mvp

import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import eu.codetown.healthstatica.R
import org.jetbrains.anko.*
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.themedTabLayout
import org.jetbrains.anko.support.v4.viewPager

class LawArticlesLayout: LinearLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    lateinit var viewPager: ViewPager
    lateinit var tabLayout: TabLayout

    init {
        this.layoutParams = ViewGroup.LayoutParams(matchParent, matchParent)
        orientation = VERTICAL

        relativeLayout {
            LayoutParams(matchParent, matchParent)

            viewPager = viewPager{
                id = View.generateViewId()
            }.lparams(matchParent, matchParent)

            appBarLayout {
                tabLayout = themedTabLayout(R.style.ThemeOverlay_AppCompat_Dark) {
                    lparams(matchParent, wrapContent)
                    {
                        tabGravity = TabLayout.GRAVITY_FILL
                        tabMode = TabLayout.MODE_FIXED
                        setSelectedTabIndicatorColor(resources.getColor(R.color.colorAccent, null))
                        setTabTextColors(resources.getColor(R.color.primaryDarkColor, null), resources.getColor(R.color.colorAccent, null))
                        setBackgroundColor(Color.parseColor("#efefef"))
                    }
                }
            }.lparams(matchParent, wrapContent) {
                alignParentBottom()
            }

        }
    }
}