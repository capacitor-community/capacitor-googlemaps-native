package com.hemangkumar.capacitorgooglemaps;

import android.graphics.drawable.Icon;

import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.PatternItem;
import com.google.android.libraries.maps.model.PolygonOptions;

import java.util.List;

public class ShapePolygonOptions extends ShapeOptions {

    private final PolygonOptions options = new PolygonOptions();
    private IconDescriptor patternIconDescriptor;

    @Override
    public float getStrokeWidth() {
        return options.getStrokeWidth();
    }

    @Override
    public void strokeWidth(float width) {
        options.strokeWidth(width);
    }

    @Override
    public int getStrokeColor() {
        return options.getStrokeColor();
    }

    @Override
    public void strokeColor(int color) {
        options.strokeColor(color);
    }

    @Override
    public int getFillColor() {
        return options.getFillColor();
    }

    @Override
    public void fillColor(int color) {
        options.fillColor(color);
    }

    @Override
    public int getStrokeJointType() {
        return options.getStrokeJointType();
    }

    @Override
    public void strokeJointType(int jointType) {
        options.strokeJointType(jointType);
    }

    @Override
    public List<PatternItem> getStrokePattern() {
        return options.getStrokePattern();
    }

    @Override
    public void strokePattern(List<PatternItem> pattern) {
        options.strokePattern(pattern);
    }

    @Override
    public float getZIndex() {
        return options.getZIndex();
    }

    @Override
    public void zIndex(float zIndex) {
        options.zIndex(zIndex);
    }

    @Override
    public boolean isClickable() {
        return options.isClickable();
    }

    @Override
    public void clickable(boolean clickable) {
        options.clickable(clickable);
    }

    @Override
    public boolean isGeodesic() {
        return options.isGeodesic();
    }

    @Override
    public void geodesic(boolean geodesic) {
        options.geodesic(geodesic);
    }

    @Override
    public boolean isVisible() {
        return options.isVisible();
    }

    @Override
    public void visible(boolean visible) {
        options.visible(visible);
    }

    @Override
    public List<List<LatLng>> getHoles() {
        return options.getHoles();
    }

    @Override
    public void addHole(Iterable<LatLng> points) {
        options.addHole(points);
    }

    @Override
    public PolygonOptions getNativeOptions() {
        return options;
    }

    @Override
    public List<LatLng> getPoints() {
        return options.getPoints();
    }

    @Override
    public void add(LatLng latLng) {
        options.add(latLng);
    }

    @Override
    public IconDescriptor getPatternIconDescriptor() {
        return patternIconDescriptor;
    }

    @Override
    public void patternIconDescriptor(IconDescriptor patternIconDescriptor) {
        this.patternIconDescriptor = patternIconDescriptor;
    }
}
