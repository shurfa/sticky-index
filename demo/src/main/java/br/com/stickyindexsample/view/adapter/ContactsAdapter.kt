package br.com.stickyindexsample.view.adapter

import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

import br.com.stickyindexsample.view.ContactsView
import br.com.stickyindexsample.view.FavoritesView

/**
 * Created by Edgar on 30/04/2015.
 */
class ContactsAdapter(fm: FragmentManager, private val mContext: Context) : FragmentPagerAdapter(fm) {

    companion object {
        private val CONTACTS_FRAGMENT = ContactsView()
        private val FAVORITES_FRAGMENT = FavoritesView()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return "FAVORITES"
            1 -> return "ALL CONTACTS"
            else -> return "Unknown"
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): android.support.v4.app.Fragment {
        return when (position) {
            0 -> FAVORITES_FRAGMENT
            1 -> CONTACTS_FRAGMENT
            else -> CONTACTS_FRAGMENT
        }
    }
}
