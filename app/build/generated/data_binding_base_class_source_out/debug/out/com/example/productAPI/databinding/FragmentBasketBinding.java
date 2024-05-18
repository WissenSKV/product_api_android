// Generated by view binder compiler. Do not edit!
package com.example.productAPI.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.productAPI.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBasketBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView basketTotalCount;

  @NonNull
  public final ImageButton btnBack;

  @NonNull
  public final Button btnPay;

  @NonNull
  public final ImageView placeHolder;

  @NonNull
  public final RecyclerView rvBasket;

  @NonNull
  public final TextView textDashboard;

  private FragmentBasketBinding(@NonNull LinearLayout rootView, @NonNull TextView basketTotalCount,
      @NonNull ImageButton btnBack, @NonNull Button btnPay, @NonNull ImageView placeHolder,
      @NonNull RecyclerView rvBasket, @NonNull TextView textDashboard) {
    this.rootView = rootView;
    this.basketTotalCount = basketTotalCount;
    this.btnBack = btnBack;
    this.btnPay = btnPay;
    this.placeHolder = placeHolder;
    this.rvBasket = rvBasket;
    this.textDashboard = textDashboard;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBasketBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBasketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_basket, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBasketBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.basket_total_count;
      TextView basketTotalCount = ViewBindings.findChildViewById(rootView, id);
      if (basketTotalCount == null) {
        break missingId;
      }

      id = R.id.btn_back;
      ImageButton btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_pay;
      Button btnPay = ViewBindings.findChildViewById(rootView, id);
      if (btnPay == null) {
        break missingId;
      }

      id = R.id.place_holder;
      ImageView placeHolder = ViewBindings.findChildViewById(rootView, id);
      if (placeHolder == null) {
        break missingId;
      }

      id = R.id.rv_basket;
      RecyclerView rvBasket = ViewBindings.findChildViewById(rootView, id);
      if (rvBasket == null) {
        break missingId;
      }

      id = R.id.text_dashboard;
      TextView textDashboard = ViewBindings.findChildViewById(rootView, id);
      if (textDashboard == null) {
        break missingId;
      }

      return new FragmentBasketBinding((LinearLayout) rootView, basketTotalCount, btnBack, btnPay,
          placeHolder, rvBasket, textDashboard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
