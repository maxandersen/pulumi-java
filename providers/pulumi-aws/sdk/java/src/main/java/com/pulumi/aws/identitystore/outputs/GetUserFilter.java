// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserFilter {
    /**
     * The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
     * 
     */
    private final String attributePath;
    /**
     * The value for an attribute.
     * 
     */
    private final String attributeValue;

    @CustomType.Constructor
    private GetUserFilter(
        @CustomType.Parameter("attributePath") String attributePath,
        @CustomType.Parameter("attributeValue") String attributeValue) {
        this.attributePath = attributePath;
        this.attributeValue = attributeValue;
    }

    /**
     * The attribute path that is used to specify which attribute name to search. Currently, `UserName` is the only valid attribute path.
     * 
    */
    public String attributePath() {
        return this.attributePath;
    }
    /**
     * The value for an attribute.
     * 
    */
    public String attributeValue() {
        return this.attributeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributePath;
        private String attributeValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributePath = defaults.attributePath;
    	      this.attributeValue = defaults.attributeValue;
        }

        public Builder attributePath(String attributePath) {
            this.attributePath = Objects.requireNonNull(attributePath);
            return this;
        }
        public Builder attributeValue(String attributeValue) {
            this.attributeValue = Objects.requireNonNull(attributeValue);
            return this;
        }        public GetUserFilter build() {
            return new GetUserFilter(attributePath, attributeValue);
        }
    }
}
