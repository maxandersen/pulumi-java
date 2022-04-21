// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.dynamodb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GlobalTableContributorInsightsSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalTableContributorInsightsSpecificationArgs Empty = new GlobalTableContributorInsightsSpecificationArgs();

    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private GlobalTableContributorInsightsSpecificationArgs() {}

    private GlobalTableContributorInsightsSpecificationArgs(GlobalTableContributorInsightsSpecificationArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalTableContributorInsightsSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalTableContributorInsightsSpecificationArgs $;

        public Builder() {
            $ = new GlobalTableContributorInsightsSpecificationArgs();
        }

        public Builder(GlobalTableContributorInsightsSpecificationArgs defaults) {
            $ = new GlobalTableContributorInsightsSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public GlobalTableContributorInsightsSpecificationArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
