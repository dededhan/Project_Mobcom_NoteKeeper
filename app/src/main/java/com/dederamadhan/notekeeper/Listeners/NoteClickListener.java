package com.dederamadhan.notekeeper.Listeners;

import androidx.cardview.widget.CardView;

import com.dederamadhan.notekeeper.Models.Notes;

public interface NoteClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
