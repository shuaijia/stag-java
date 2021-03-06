package com.vimeo.sample_java_model;

import com.vimeo.stag.UseStag;

/**
 * This class is separate/redundant with respect to those in NestedJavaModel so that we can
 * observe the behavior of incremental compilation via manual manipulation.
 */
@UseStag
public class NativeJavaModelExtension extends NativeJavaModel {

    private String mAdditionalField;

    public String getAdditionalField() {
        return mAdditionalField;
    }

    public void setAdditionalField(String additionalField) {
        this.mAdditionalField = additionalField;
    }
}
