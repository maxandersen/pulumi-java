// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaConditionQueryTermResponse {
    /**
     * Whether this is supposed to be a full or partial match.
     * 
     */
    private final Boolean fullMatch;
    /**
     * The value of the term to match on. Value cannot be empty. Value can have at most 3 terms if specified as a partial match. Each space separated string is considered as one term. Example) "a b c" is 3 terms and allowed, " a b c d" is 4 terms and not allowed for partial match.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaConditionQueryTermResponse(
        @CustomType.Parameter("fullMatch") Boolean fullMatch,
        @CustomType.Parameter("value") String value) {
        this.fullMatch = fullMatch;
        this.value = value;
    }

    /**
     * Whether this is supposed to be a full or partial match.
     * 
    */
    public Boolean fullMatch() {
        return this.fullMatch;
    }
    /**
     * The value of the term to match on. Value cannot be empty. Value can have at most 3 terms if specified as a partial match. Each space separated string is considered as one term. Example) "a b c" is 3 terms and allowed, " a b c d" is 4 terms and not allowed for partial match.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaConditionQueryTermResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean fullMatch;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaConditionQueryTermResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullMatch = defaults.fullMatch;
    	      this.value = defaults.value;
        }

        public Builder fullMatch(Boolean fullMatch) {
            this.fullMatch = Objects.requireNonNull(fullMatch);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GoogleCloudRetailV2betaConditionQueryTermResponse build() {
            return new GoogleCloudRetailV2betaConditionQueryTermResponse(fullMatch, value);
        }
    }
}
