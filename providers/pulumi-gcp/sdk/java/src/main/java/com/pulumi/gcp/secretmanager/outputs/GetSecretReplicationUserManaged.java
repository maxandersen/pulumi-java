// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.secretmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.secretmanager.outputs.GetSecretReplicationUserManagedReplica;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecretReplicationUserManaged {
    private final List<GetSecretReplicationUserManagedReplica> replicas;

    @CustomType.Constructor
    private GetSecretReplicationUserManaged(@CustomType.Parameter("replicas") List<GetSecretReplicationUserManagedReplica> replicas) {
        this.replicas = replicas;
    }

    public List<GetSecretReplicationUserManagedReplica> replicas() {
        return this.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretReplicationUserManaged defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSecretReplicationUserManagedReplica> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretReplicationUserManaged defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        public Builder replicas(List<GetSecretReplicationUserManagedReplica> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }
        public Builder replicas(GetSecretReplicationUserManagedReplica... replicas) {
            return replicas(List.of(replicas));
        }        public GetSecretReplicationUserManaged build() {
            return new GetSecretReplicationUserManaged(replicas);
        }
    }
}
