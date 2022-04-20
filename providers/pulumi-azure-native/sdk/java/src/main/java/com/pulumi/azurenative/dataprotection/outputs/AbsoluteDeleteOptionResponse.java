// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AbsoluteDeleteOptionResponse {
    /**
     * Duration of deletion after given timespan
     * 
     */
    private final String duration;
    /**
     * Type of the specific object - used for deserializing
     * Expected value is &#39;AbsoluteDeleteOption&#39;.
     * 
     */
    private final String objectType;

    @CustomType.Constructor
    private AbsoluteDeleteOptionResponse(
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("objectType") String objectType) {
        this.duration = duration;
        this.objectType = objectType;
    }

    /**
     * Duration of deletion after given timespan
     * 
    */
    public String duration() {
        return this.duration;
    }
    /**
     * Type of the specific object - used for deserializing
     * Expected value is &#39;AbsoluteDeleteOption&#39;.
     * 
    */
    public String objectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AbsoluteDeleteOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String duration;
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(AbsoluteDeleteOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.objectType = defaults.objectType;
        }

        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }        public AbsoluteDeleteOptionResponse build() {
            return new AbsoluteDeleteOptionResponse(duration, objectType);
        }
    }
}
