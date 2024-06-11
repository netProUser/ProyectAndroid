package com.practico.startproyect;

import android.os.Parcel;
import android.os.Parcelable;

public class CredencialesEntity implements Parcelable {
    private String usuario;
    private String clave;

    public CredencialesEntity(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    protected CredencialesEntity(Parcel in) {
        usuario = in.readString();
        clave = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(usuario);
        dest.writeString(clave);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CredencialesEntity> CREATOR = new Creator<CredencialesEntity>() {
        @Override
        public CredencialesEntity createFromParcel(Parcel in) {
            return new CredencialesEntity(in);
        }

        @Override
        public CredencialesEntity[] newArray(int size) {
            return new CredencialesEntity[size];
        }
    };

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }
}
