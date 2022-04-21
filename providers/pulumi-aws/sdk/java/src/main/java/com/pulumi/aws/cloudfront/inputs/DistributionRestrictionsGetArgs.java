// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.DistributionRestrictionsGeoRestrictionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class DistributionRestrictionsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionRestrictionsGetArgs Empty = new DistributionRestrictionsGetArgs();

    @Import(name="geoRestriction", required=true)
    private Output<DistributionRestrictionsGeoRestrictionGetArgs> geoRestriction;

    public Output<DistributionRestrictionsGeoRestrictionGetArgs> geoRestriction() {
        return this.geoRestriction;
    }

    private DistributionRestrictionsGetArgs() {}

    private DistributionRestrictionsGetArgs(DistributionRestrictionsGetArgs $) {
        this.geoRestriction = $.geoRestriction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionRestrictionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionRestrictionsGetArgs $;

        public Builder() {
            $ = new DistributionRestrictionsGetArgs();
        }

        public Builder(DistributionRestrictionsGetArgs defaults) {
            $ = new DistributionRestrictionsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder geoRestriction(Output<DistributionRestrictionsGeoRestrictionGetArgs> geoRestriction) {
            $.geoRestriction = geoRestriction;
            return this;
        }

        public Builder geoRestriction(DistributionRestrictionsGeoRestrictionGetArgs geoRestriction) {
            return geoRestriction(Output.of(geoRestriction));
        }

        public DistributionRestrictionsGetArgs build() {
            $.geoRestriction = Objects.requireNonNull($.geoRestriction, "expected parameter 'geoRestriction' to be non-null");
            return $;
        }
    }

}
