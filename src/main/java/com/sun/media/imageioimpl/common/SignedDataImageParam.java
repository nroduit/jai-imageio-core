package com.sun.media.imageioimpl.common;

/**
 * The Class SignedDataImageParam allows to set the data sign in the image parameters.
 *
 * @author Nicolas Roduit
 */


public interface SignedDataImageParam {

    boolean isSignedData();

    void setSignedData(boolean signedData);

}