// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The name and status of the failover replica.
 * 
 */
public final class InstanceFailoverReplicaResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstanceFailoverReplicaResponse Empty = new InstanceFailoverReplicaResponse();

    /**
     * The availability status of the failover replica. A false status indicates that the failover replica is out of sync. The primary instance can only failover to the failover replica when the status is true.
     * 
     */
    @Import(name="available", required=true)
    private Boolean available;

    public Boolean available() {
        return this.available;
    }

    /**
     * The name of the failover replica. If specified at instance creation, a failover replica is created for the instance. The name doesn&#39;t include the project ID.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private InstanceFailoverReplicaResponse() {}

    private InstanceFailoverReplicaResponse(InstanceFailoverReplicaResponse $) {
        this.available = $.available;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFailoverReplicaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFailoverReplicaResponse $;

        public Builder() {
            $ = new InstanceFailoverReplicaResponse();
        }

        public Builder(InstanceFailoverReplicaResponse defaults) {
            $ = new InstanceFailoverReplicaResponse(Objects.requireNonNull(defaults));
        }

        public Builder available(Boolean available) {
            $.available = available;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public InstanceFailoverReplicaResponse build() {
            $.available = Objects.requireNonNull($.available, "expected parameter 'available' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
