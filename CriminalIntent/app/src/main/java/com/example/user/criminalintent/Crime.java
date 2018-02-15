package com.example.user.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by user on 2017-09-15.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    @Override
    public String toString() {
        return mTitle;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Date getDate() { return mDate; }

    public void setDate(Date date) { this.mDate = date; }

    public boolean isSolved() { return mSolved; }

    public void setSolved(boolean solved) { this.mSolved = solved; }
}
