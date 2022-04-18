// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the natural language text to be processed.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1TextInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1TextInputResponse Empty = new GoogleCloudDialogflowCxV3beta1TextInputResponse();

    /**
     * The UTF-8 encoded natural language text to be processed. Text length must not exceed 256 characters.
     * 
     */
    @Import(name="text", required=true)
      private final String text;

    public String text() {
        return this.text;
    }

    public GoogleCloudDialogflowCxV3beta1TextInputResponse(String text) {
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1TextInputResponse() {
        this.text = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1TextInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1TextInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1TextInputResponse build() {
            return new GoogleCloudDialogflowCxV3beta1TextInputResponse(text);
        }
    }
}
