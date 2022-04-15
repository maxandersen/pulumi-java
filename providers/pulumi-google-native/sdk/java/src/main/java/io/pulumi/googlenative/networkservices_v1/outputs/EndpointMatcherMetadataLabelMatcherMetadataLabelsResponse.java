// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse {
    /**
     * Label name presented as key in xDS Node Metadata.
     * 
     */
    private final String labelName;
    /**
     * Label value presented as value corresponding to the above key, in xDS Node Metadata.
     * 
     */
    private final String labelValue;

    @CustomType.Constructor
    private EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse(
        @CustomType.Parameter("labelName") String labelName,
        @CustomType.Parameter("labelValue") String labelValue) {
        this.labelName = labelName;
        this.labelValue = labelValue;
    }

    /**
     * Label name presented as key in xDS Node Metadata.
     * 
    */
    public String labelName() {
        return this.labelName;
    }
    /**
     * Label value presented as value corresponding to the above key, in xDS Node Metadata.
     * 
    */
    public String labelValue() {
        return this.labelValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String labelName;
        private String labelValue;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelName = defaults.labelName;
    	      this.labelValue = defaults.labelValue;
        }

        public Builder labelName(String labelName) {
            this.labelName = Objects.requireNonNull(labelName);
            return this;
        }
        public Builder labelValue(String labelValue) {
            this.labelValue = Objects.requireNonNull(labelValue);
            return this;
        }        public EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse build() {
            return new EndpointMatcherMetadataLabelMatcherMetadataLabelsResponse(labelName, labelValue);
        }
    }
}
