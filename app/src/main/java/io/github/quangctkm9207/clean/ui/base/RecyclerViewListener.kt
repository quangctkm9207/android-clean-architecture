package io.github.quangctkm9207.clean.ui.base

import android.view.View

interface RecyclerViewListener {

  @FunctionalInterface
  interface OnItemClickListener {
    fun onItemClick(view: View, position: Int)
  }

  @FunctionalInterface
  interface OnItemLongClickListener {
    fun onItemLongClick(view: View, position: Int)
  }
}