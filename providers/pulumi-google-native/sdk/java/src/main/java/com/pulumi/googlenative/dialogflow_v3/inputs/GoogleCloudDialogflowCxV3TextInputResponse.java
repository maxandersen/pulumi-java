// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the natural language text to be processed.
 * 
 */
public final class GoogleCloudDialogflowCxV3TextInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3TextInputResponse Empty = new GoogleCloudDialogflowCxV3TextInputResponse();

    /**
     * The UTF-8 encoded natural language text to be processed. Text length must not exceed 256 characters.
     * 
     */
    @Import(name="text", required=true)
    private String text;

    public String text() {
        return this.text;
    }

    private GoogleCloudDialogflowCxV3TextInputResponse() {}

    private GoogleCloudDialogflowCxV3TextInputResponse(GoogleCloudDialogflowCxV3TextInputResponse $) {
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3TextInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3TextInputResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3TextInputResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3TextInputResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3TextInputResponse(Objects.requireNonNull(defaults));
        }

        public Builder text(String text) {
            $.text = text;
            return this;
        }

        public GoogleCloudDialogflowCxV3TextInputResponse build() {
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            return $;
        }
    }

}
