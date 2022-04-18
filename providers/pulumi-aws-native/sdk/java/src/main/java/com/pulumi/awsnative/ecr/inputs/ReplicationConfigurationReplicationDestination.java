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
      private final String region;

    public String region() {
        return this.region;
    }

    @Import(name="registryId", required=true)
      private final String registryId;

    public String registryId() {
        return this.registryId;
    }

    public ReplicationConfigurationReplicationDestination(
        String region,
        String registryId) {
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.registryId = Objects.requireNonNull(registryId, "expected parameter 'registryId' to be non-null");
    }

    private ReplicationConfigurationReplicationDestination() {
        this.region = null;
        this.registryId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationConfigurationReplicationDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String region;
        private String registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationConfigurationReplicationDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.registryId = defaults.registryId;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder registryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }        public ReplicationConfigurationReplicationDestination build() {
            return new ReplicationConfigurationReplicationDestination(region, registryId);
        }
    }
}
