// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionResult {
    private final String region;

    @CustomType.Constructor
    private GetRegionResult(@CustomType.Parameter("region") String region) {
        this.region = region;
    }

    public String region() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetRegionResult build() {
            return new GetRegionResult(region);
        }
    }
}
