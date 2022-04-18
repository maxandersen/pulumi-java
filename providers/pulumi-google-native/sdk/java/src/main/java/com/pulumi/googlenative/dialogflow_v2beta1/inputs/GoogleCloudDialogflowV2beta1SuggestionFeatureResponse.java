// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The type of Human Agent Assistant API suggestion to perform, and the maximum number of results to return for that type. Multiple `Feature` objects can be specified in the `features` list.
 * 
 */
public final class GoogleCloudDialogflowV2beta1SuggestionFeatureResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1SuggestionFeatureResponse Empty = new GoogleCloudDialogflowV2beta1SuggestionFeatureResponse();

    /**
     * Type of Human Agent Assistant API feature to request.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public GoogleCloudDialogflowV2beta1SuggestionFeatureResponse(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1SuggestionFeatureResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1SuggestionFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1SuggestionFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudDialogflowV2beta1SuggestionFeatureResponse build() {
            return new GoogleCloudDialogflowV2beta1SuggestionFeatureResponse(type);
        }
    }
}
