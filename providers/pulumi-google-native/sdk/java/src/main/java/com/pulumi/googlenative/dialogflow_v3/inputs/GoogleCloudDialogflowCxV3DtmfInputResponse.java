// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the input for dtmf event.
 * 
 */
public final class GoogleCloudDialogflowCxV3DtmfInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3DtmfInputResponse Empty = new GoogleCloudDialogflowCxV3DtmfInputResponse();

    /**
     * The dtmf digits.
     * 
     */
    @Import(name="digits", required=true)
    private String digits;

    public String digits() {
        return this.digits;
    }

    /**
     * The finish digit (if any).
     * 
     */
    @Import(name="finishDigit", required=true)
    private String finishDigit;

    public String finishDigit() {
        return this.finishDigit;
    }

    private GoogleCloudDialogflowCxV3DtmfInputResponse() {}

    private GoogleCloudDialogflowCxV3DtmfInputResponse(GoogleCloudDialogflowCxV3DtmfInputResponse $) {
        this.digits = $.digits;
        this.finishDigit = $.finishDigit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3DtmfInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3DtmfInputResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3DtmfInputResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3DtmfInputResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3DtmfInputResponse(Objects.requireNonNull(defaults));
        }

        public Builder digits(String digits) {
            $.digits = digits;
            return this;
        }

        public Builder finishDigit(String finishDigit) {
            $.finishDigit = finishDigit;
            return this;
        }

        public GoogleCloudDialogflowCxV3DtmfInputResponse build() {
            $.digits = Objects.requireNonNull($.digits, "expected parameter 'digits' to be non-null");
            $.finishDigit = Objects.requireNonNull($.finishDigit, "expected parameter 'finishDigit' to be non-null");
            return $;
        }
    }

}
