// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionGeoRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionGeoRestrictionArgs Empty = new DistributionGeoRestrictionArgs();

    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    @Import(name="restrictionType", required=true)
    private Output<String> restrictionType;

    public Output<String> restrictionType() {
        return this.restrictionType;
    }

    private DistributionGeoRestrictionArgs() {}

    private DistributionGeoRestrictionArgs(DistributionGeoRestrictionArgs $) {
        this.locations = $.locations;
        this.restrictionType = $.restrictionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionGeoRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionGeoRestrictionArgs $;

        public Builder() {
            $ = new DistributionGeoRestrictionArgs();
        }

        public Builder(DistributionGeoRestrictionArgs defaults) {
            $ = new DistributionGeoRestrictionArgs(Objects.requireNonNull(defaults));
        }

        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        public Builder restrictionType(Output<String> restrictionType) {
            $.restrictionType = restrictionType;
            return this;
        }

        public Builder restrictionType(String restrictionType) {
            return restrictionType(Output.of(restrictionType));
        }

        public DistributionGeoRestrictionArgs build() {
            $.restrictionType = Objects.requireNonNull($.restrictionType, "expected parameter 'restrictionType' to be non-null");
            return $;
        }
    }

}
