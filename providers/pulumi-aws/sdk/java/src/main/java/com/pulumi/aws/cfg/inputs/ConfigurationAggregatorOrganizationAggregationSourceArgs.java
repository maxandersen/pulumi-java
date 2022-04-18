// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationAggregatorOrganizationAggregationSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationAggregatorOrganizationAggregationSourceArgs Empty = new ConfigurationAggregatorOrganizationAggregationSourceArgs();

    /**
     * If true, aggregate existing AWS Config regions and future regions.
     * 
     */
    @Import(name="allRegions")
      private final @Nullable Output<Boolean> allRegions;

    public Output<Boolean> allRegions() {
        return this.allRegions == null ? Codegen.empty() : this.allRegions;
    }

    /**
     * List of source regions being aggregated.
     * 
     */
    @Import(name="regions")
      private final @Nullable Output<List<String>> regions;

    public Output<List<String>> regions() {
        return this.regions == null ? Codegen.empty() : this.regions;
    }

    /**
     * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    public ConfigurationAggregatorOrganizationAggregationSourceArgs(
        @Nullable Output<Boolean> allRegions,
        @Nullable Output<List<String>> regions,
        Output<String> roleArn) {
        this.allRegions = allRegions;
        this.regions = regions;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private ConfigurationAggregatorOrganizationAggregationSourceArgs() {
        this.allRegions = Codegen.empty();
        this.regions = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationAggregatorOrganizationAggregationSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allRegions;
        private @Nullable Output<List<String>> regions;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationAggregatorOrganizationAggregationSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allRegions = defaults.allRegions;
    	      this.regions = defaults.regions;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder allRegions(@Nullable Output<Boolean> allRegions) {
            this.allRegions = allRegions;
            return this;
        }
        public Builder allRegions(@Nullable Boolean allRegions) {
            this.allRegions = Codegen.ofNullable(allRegions);
            return this;
        }
        public Builder regions(@Nullable Output<List<String>> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(@Nullable List<String> regions) {
            this.regions = Codegen.ofNullable(regions);
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public ConfigurationAggregatorOrganizationAggregationSourceArgs build() {
            return new ConfigurationAggregatorOrganizationAggregationSourceArgs(allRegions, regions, roleArn);
        }
    }
}
