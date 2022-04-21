// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.dynamodb.inputs;

import com.pulumi.awsnative.dynamodb.inputs.GlobalTableContributorInsightsSpecificationArgs;
import com.pulumi.awsnative.dynamodb.inputs.GlobalTableReadProvisionedThroughputSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs Empty = new GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs();

    @Import(name="contributorInsightsSpecification")
    private @Nullable Output<GlobalTableContributorInsightsSpecificationArgs> contributorInsightsSpecification;

    public Optional<Output<GlobalTableContributorInsightsSpecificationArgs>> contributorInsightsSpecification() {
        return Optional.ofNullable(this.contributorInsightsSpecification);
    }

    @Import(name="indexName", required=true)
    private Output<String> indexName;

    public Output<String> indexName() {
        return this.indexName;
    }

    @Import(name="readProvisionedThroughputSettings")
    private @Nullable Output<GlobalTableReadProvisionedThroughputSettingsArgs> readProvisionedThroughputSettings;

    public Optional<Output<GlobalTableReadProvisionedThroughputSettingsArgs>> readProvisionedThroughputSettings() {
        return Optional.ofNullable(this.readProvisionedThroughputSettings);
    }

    private GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs() {}

    private GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs(GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs $) {
        this.contributorInsightsSpecification = $.contributorInsightsSpecification;
        this.indexName = $.indexName;
        this.readProvisionedThroughputSettings = $.readProvisionedThroughputSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs $;

        public Builder() {
            $ = new GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs();
        }

        public Builder(GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs defaults) {
            $ = new GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder contributorInsightsSpecification(@Nullable Output<GlobalTableContributorInsightsSpecificationArgs> contributorInsightsSpecification) {
            $.contributorInsightsSpecification = contributorInsightsSpecification;
            return this;
        }

        public Builder contributorInsightsSpecification(GlobalTableContributorInsightsSpecificationArgs contributorInsightsSpecification) {
            return contributorInsightsSpecification(Output.of(contributorInsightsSpecification));
        }

        public Builder indexName(Output<String> indexName) {
            $.indexName = indexName;
            return this;
        }

        public Builder indexName(String indexName) {
            return indexName(Output.of(indexName));
        }

        public Builder readProvisionedThroughputSettings(@Nullable Output<GlobalTableReadProvisionedThroughputSettingsArgs> readProvisionedThroughputSettings) {
            $.readProvisionedThroughputSettings = readProvisionedThroughputSettings;
            return this;
        }

        public Builder readProvisionedThroughputSettings(GlobalTableReadProvisionedThroughputSettingsArgs readProvisionedThroughputSettings) {
            return readProvisionedThroughputSettings(Output.of(readProvisionedThroughputSettings));
        }

        public GlobalTableReplicaGlobalSecondaryIndexSpecificationArgs build() {
            $.indexName = Objects.requireNonNull($.indexName, "expected parameter 'indexName' to be non-null");
            return $;
        }
    }

}
