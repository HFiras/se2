package com.app.myapplication;

/**
 * Created by Homsi Firas on 12/14/2016.
 * <p/>
 * temp class until we have coordinates
 */
public class Points {

    float AX;
    float AY;
    float BX;
    float BY;
    float CX;
    float CY;
    float DX;
    float DY;
    float EX;
    float EY;
    float FX;
    float FY;

    float startX;
    float startY;
    float finishX;
    float finishY;

    public Points() {
    }
    public Points(float AX, float AY, float BX, float BY, float CX, float CY,
                  float DX, float DY, float EX, float EY, float FX, float FY
    ) {
        this.AX = AX;
        this.AY = AY;
        this.BX = BX;
        this.BY = BY;
        this.CX = CX;
        this.CY = CY;
        this.DX = DX;
        this.DY = DY;
        this.EX = EX;
        this.EY = EY;
        this.FX = FX;
        this.FY = FY;
    }
    public Points(float AX, float AY, float BX, float BY, float CX, float CY,
                  float DX, float DY, float EX, float EY, float FX, float FY,float startx,float startY, float finishX,float finishY
                  ) {
        this.AX = AX;
        this.AY = AY;
        this.BX = BX;
        this.BY = BY;
        this.CX = CX;
        this.CY = CY;
        this.DX = DX;
        this.DY = DY;
        this.EX = EX;
        this.EY = EY;
        this.FX = FX;
        this.FY = FY;
        this.startX=startx;
        this.startY=startY;
        this.finishX=finishX;
        this.finishY=finishY;
    }

    public float getAX() {
        return AX;
    }

    public void setAX(float AX) {
        this.AX = AX;
    }

    public float getAY() {
        return AY;
    }

    public void setAY(float AY) {
        this.AY = AY;
    }

    public float getBX() {
        return BX;
    }

    public void setBX(float BX) {
        this.BX = BX;
    }

    public float getBY() {
        return BY;
    }

    public void setBY(float BY) {
        this.BY = BY;
    }

    public float getCX() {
        return CX;
    }

    public void setCX(float CX) {
        this.CX = CX;
    }

    public float getCY() {
        return CY;
    }

    public void setCY(float CY) {
        this.CY = CY;
    }

    public float getDX() {
        return DX;
    }

    public void setDX(float DX) {
        this.DX = DX;
    }

    public float getDY() {
        return DY;
    }

    public void setDY(float DY) {
        this.DY = DY;
    }

    public float getEX() {
        return EX;
    }

    public void setEX(float EX) {
        this.EX = EX;
    }

    public float getEY() {
        return EY;
    }

    public void setEY(float EY) {
        this.EY = EY;
    }

    public float getFX() {
        return FX;
    }

    public void setFX(float FX) {
        this.FX = FX;
    }

    public float getFY() {
        return FY;
    }

    public void setFY(float FY) {
        this.FY = FY;
    }

    public float getStartX() {
        return startX;
    }

    public void setStartX(float startX) {
        this.startX = startX;
    }

    public float getStartY() {
        return startY;
    }

    public void setStartY(float startY) {
        this.startY = startY;
    }

    public float getFinishX() {
        return finishX;
    }

    public void setFinishX(float finishX) {
        this.finishX = finishX;
    }

    public float getFinishY() {
        return finishY;
    }

    public void setFinishY(float finishY) {
        this.finishY = finishY;
    }
}
