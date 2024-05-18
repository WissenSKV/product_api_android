package com.example.productAPI.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ModelM implements Parcelable, Serializable {
    @SerializedName("id")
    @Expose
    int modelId;
    @SerializedName("title")
    @Expose
    String modelTitle;
    @SerializedName("category")
    String category;
    @SerializedName("price")
    Double price_d;
    @SerializedName("description")
    @Expose
    String modelDescription;
    @SerializedName("image")
    @Expose
    String modelImage;


    protected ModelM(Parcel in) {
        modelId = in.readInt();
        modelTitle = in.readString();
        if (in.readByte() == 0) {
            price_d = null;
        } else {
            price_d = in.readDouble();
        }
        modelDescription = in.readString();
        modelImage = in.readString();
    }

    public static final Creator<ModelM> CREATOR = new Creator<ModelM>() {
        @Override
        public ModelM createFromParcel(Parcel in) {
            return new ModelM(in);
        }

        @Override
        public ModelM[] newArray(int size) {
            return new ModelM[size];
        }
    };

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getModelTitle() {
        return modelTitle;
    }

    public void setModelTitle(String modelTitle) {
        this.modelTitle = modelTitle;
    }

    public Double getModelPrice() {
        return price_d;
    }

    public void setModelPrice(Double modelPrice) {
        this.price_d = modelPrice;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public String getModelImage() {
        return modelImage;
    }

    public void setModelImage(String modelImage) {
        this.modelImage = modelImage;
    }

    @Override
    public String toString() {
        return "ModelM{" +
                "modelId=" + modelId +
                ", modelTitle='" + modelTitle + '\'' +
                ", modelPrice=" + price_d +
                ", modelDescription='" + modelDescription + '\'' +
                ", modelImage='" + modelImage + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(modelId);
        parcel.writeString(modelTitle);
        if (price_d == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(price_d);
        }
        parcel.writeString(modelDescription);
        parcel.writeString(modelImage);
    }
}
