package com.example.mealscatalogue;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {
    private String name;
    private String origin;
    private String image;
    private String desc;

    public Food() {

    }

    public String getDesc() { return desc; }

    public void setDesc(String desc) { this.desc = desc; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.origin);
        dest.writeString(this.desc);
        dest.writeString(this.image);
    }

    protected Food(Parcel in) {
        this.name       = in.readString();
        this.origin     = in.readString();
        this.desc       = in.readString();
        this.image      = in.readString();
    }
    public static final Parcelable.Creator<Food> CREATOR = new Parcelable.Creator<Food>() {

        @Override
        public Food createFromParcel(Parcel source) {
            return new Food(source);
        }

        @Override
        public Food[] newArray(int size) {
            return new Food[size];
        }
    };
}
