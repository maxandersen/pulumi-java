// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse {
    /**
     * A description of the diff, showing the actual output vs expected output.
     * 
     */
    private final String description;
    /**
     * The type of diff.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("type") String type) {
        this.description = description;
        this.type = type;
    }

    /**
     * A description of the diff, showing the actual output vs expected output.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The type of diff.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.type = defaults.type;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse build() {
            return new GoogleCloudDialogflowCxV3beta1TestRunDifferenceResponse(description, type);
        }
    }
}
