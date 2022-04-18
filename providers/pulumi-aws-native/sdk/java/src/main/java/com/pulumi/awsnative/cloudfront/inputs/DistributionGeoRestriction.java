// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionGeoRestriction extends com.pulumi.resources.InvokeArgs {

    public static final DistributionGeoRestriction Empty = new DistributionGeoRestriction();

    @Import(name="locations")
      private final @Nullable List<String> locations;

    public List<String> locations() {
        return this.locations == null ? List.of() : this.locations;
    }

    @Import(name="restrictionType", required=true)
      private final String restrictionType;

    public String restrictionType() {
        return this.restrictionType;
    }

    public DistributionGeoRestriction(
        @Nullable List<String> locations,
        String restrictionType) {
        this.locations = locations;
        this.restrictionType = Objects.requireNonNull(restrictionType, "expected parameter 'restrictionType' to be non-null");
    }

    private DistributionGeoRestriction() {
        this.locations = List.of();
        this.restrictionType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionGeoRestriction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> locations;
        private String restrictionType;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionGeoRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locations = defaults.locations;
    	      this.restrictionType = defaults.restrictionType;
        }

        public Builder locations(@Nullable List<String> locations) {
            this.locations = locations;
            return this;
        }
        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }
        public Builder restrictionType(String restrictionType) {
            this.restrictionType = Objects.requireNonNull(restrictionType);
            return this;
        }        public DistributionGeoRestriction build() {
            return new DistributionGeoRestriction(locations, restrictionType);
        }
    }
}
