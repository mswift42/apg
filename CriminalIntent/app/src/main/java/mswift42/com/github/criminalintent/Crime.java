package mswift42.com.github.criminalintent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        return mDate;
    }
    public String formatDate() {
        SimpleDateFormat dateformat = new SimpleDateFormat("EEEE, MMM d, yyyy");
        return dateformat.format(mDate);
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Crime() {
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
        mTitle = title;
    }
}
