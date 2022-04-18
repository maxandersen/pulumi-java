// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceFailoverReplicaResponse {
    /**
     * The availability status of the failover replica. A false status indicates that the failover replica is out of sync. The primary instance can only failover to the failover replica when the status is true.
     * 
     */
    private final Boolean available;
    /**
     * The name of the failover replica. If specified at instance creation, a failover replica is created for the instance. The name doesn't include the project ID.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private InstanceFailoverReplicaResponse(
        @CustomType.Parameter("available") Boolean available,
        @CustomType.Parameter("name") String name) {
        this.available = available;
        this.name = name;
    }

    /**
     * The availability status of the failover replica. A false status indicates that the failover replica is out of sync. The primary instance can only failover to the failover replica when the status is true.
     * 
    */
    public Boolean available() {
        return this.available;
    }
    /**
     * The name of the failover replica. If specified at instance creation, a failover replica is created for the instance. The name doesn't include the project ID.
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFailoverReplicaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean available;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFailoverReplicaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.available = defaults.available;
    	      this.name = defaults.name;
        }

        public Builder available(Boolean available) {
            this.available = Objects.requireNonNull(available);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public InstanceFailoverReplicaResponse build() {
            return new InstanceFailoverReplicaResponse(available, name);
        }
    }
}
