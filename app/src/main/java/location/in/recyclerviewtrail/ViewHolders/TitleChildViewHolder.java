package location.in.recyclerviewtrail.ViewHolders;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

import location.in.recyclerviewtrail.R;

/**
 * Created by Dell on 7/17/2017.
 */

public class TitleChildViewHolder extends ChildViewHolder {
    public TextView option1,option2;
    public TitleChildViewHolder(View itemView) {
        super(itemView);
        option1 = (TextView)itemView.findViewById(R.id.option1);
        option2 = (TextView)itemView.findViewById(R.id.option2);
    }
}