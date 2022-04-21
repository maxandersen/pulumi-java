// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecr.inputs;

import com.pulumi.awsnative.ecr.inputs.ReplicationConfigurationReplicationDestinationArgs;
import com.pulumi.awsnative.ecr.inputs.ReplicationConfigurationRepositoryFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An array of objects representing the details of a replication destination.
 * 
 */
public final class ReplicationConfigurationReplicationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReplicationConfigurationReplicationRuleArgs Empty = new ReplicationConfigurationReplicationRuleArgs();

    /**
     * An array of objects representing the details of a replication destination.
     * 
     */
    @Import(name="destinations", required=true)
    private Output<List<ReplicationConfigurationReplicationDestinationArgs>> destinations;

    public Output<List<ReplicationConfigurationReplicationDestinationArgs>> destinations() {
        return this.destinations;
    }

    /**
     * An array of objects representing the details of a repository filter.
     * 
     */
    @Import(name="repositoryFilters")
    private @Nullable Output<List<ReplicationConfigurationRepositoryFilterArgs>> repositoryFilters;

    public Optional<Output<List<ReplicationConfigurationRepositoryFilterArgs>>> repositoryFilters() {
        return Optional.ofNullable(this.repositoryFilters);
    }

    private ReplicationConfigurationReplicationRuleArgs() {}

    private ReplicationConfigurationReplicationRuleArgs(ReplicationConfigurationReplicationRuleArgs $) {
        this.destinations = $.destinations;
        this.repositoryFilters = $.repositoryFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationConfigurationReplicationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationConfigurationReplicationRuleArgs $;

        public Builder() {
            $ = new ReplicationConfigurationReplicationRuleArgs();
        }

        public Builder(ReplicationConfigurationReplicationRuleArgs defaults) {
            $ = new ReplicationConfigurationReplicationRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinations(Output<List<ReplicationConfigurationReplicationDestinationArgs>> destinations) {
            $.destinations = destinations;
            return this;
        }

        public Builder destinations(List<ReplicationConfigurationReplicationDestinationArgs> destinations) {
            return destinations(Output.of(destinations));
        }

        public Builder destinations(ReplicationConfigurationReplicationDestinationArgs... destinations) {
            return destinations(List.of(destinations));
        }

        public Builder repositoryFilters(@Nullable Output<List<ReplicationConfigurationRepositoryFilterArgs>> repositoryFilters) {
            $.repositoryFilters = repositoryFilters;
            return this;
        }

        public Builder repositoryFilters(List<ReplicationConfigurationRepositoryFilterArgs> repositoryFilters) {
            return repositoryFilters(Output.of(repositoryFilters));
        }

        public Builder repositoryFilters(ReplicationConfigurationRepositoryFilterArgs... repositoryFilters) {
            return repositoryFilters(List.of(repositoryFilters));
        }

        public ReplicationConfigurationReplicationRuleArgs build() {
            $.destinations = Objects.requireNonNull($.destinations, "expected parameter 'destinations' to be non-null");
            return $;
        }
    }

}
