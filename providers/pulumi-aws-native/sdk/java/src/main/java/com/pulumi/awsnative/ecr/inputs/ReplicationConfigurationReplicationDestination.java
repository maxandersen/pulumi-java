// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecr.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An array of objects representing the details of a replication destination.
 * 
 */
public final class ReplicationConfigurationReplicationDestination extends com.pulumi.resources.InvokeArgs {

    public static final ReplicationConfigurationReplicationDestination Empty = new ReplicationConfigurationReplicationDestination();

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    @Import(name="registryId", required=true)
    private String registryId;

    public String registryId() {
        return this.registryId;
    }

    private ReplicationConfigurationReplicationDestination() {}

    private ReplicationConfigurationReplicationDestination(ReplicationConfigurationReplicationDestination $) {
        this.region = $.region;
        this.registryId = $.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicationConfigurationReplicationDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicationConfigurationReplicationDestination $;

        public Builder() {
            $ = new ReplicationConfigurationReplicationDestination();
        }

        public Builder(ReplicationConfigurationReplicationDestination defaults) {
            $ = new ReplicationConfigurationReplicationDestination(Objects.requireNonNull(defaults));
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public Builder registryId(String registryId) {
            $.registryId = registryId;
            return this;
        }

        public ReplicationConfigurationReplicationDestination build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            return $;
        }
    }

}
