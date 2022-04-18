// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRouterBgpAdvertisedIpRange extends com.pulumi.resources.InvokeArgs {

    public static final GetRouterBgpAdvertisedIpRange Empty = new GetRouterBgpAdvertisedIpRange();

    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    @Import(name="range", required=true)
      private final String range;

    public String range() {
        return this.range;
    }

    public GetRouterBgpAdvertisedIpRange(
        String description,
        String range) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.range = Objects.requireNonNull(range, "expected parameter 'range' to be non-null");
    }

    private GetRouterBgpAdvertisedIpRange() {
        this.description = null;
        this.range = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterBgpAdvertisedIpRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String range;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouterBgpAdvertisedIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.range = defaults.range;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder range(String range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }        public GetRouterBgpAdvertisedIpRange build() {
            return new GetRouterBgpAdvertisedIpRange(description, range);
        }
    }
}
