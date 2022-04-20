// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An Itsm receiver.
 * 
 */
public final class ItsmReceiverResponse extends com.pulumi.resources.InvokeArgs {

    public static final ItsmReceiverResponse Empty = new ItsmReceiverResponse();

    /**
     * Unique identification of ITSM connection among multiple defined in above workspace.
     * 
     */
    @Import(name="connectionId", required=true)
      private final String connectionId;

    public String connectionId() {
        return this.connectionId;
    }

    /**
     * The name of the Itsm receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Region in which workspace resides. Supported values:&#39;centralindia&#39;,&#39;japaneast&#39;,&#39;southeastasia&#39;,&#39;australiasoutheast&#39;,&#39;uksouth&#39;,&#39;westcentralus&#39;,&#39;canadacentral&#39;,&#39;eastus&#39;,&#39;westeurope&#39;
     * 
     */
    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    /**
     * JSON blob for the configurations of the ITSM action. CreateMultipleWorkItems option will be part of this blob as well.
     * 
     */
    @Import(name="ticketConfiguration", required=true)
      private final String ticketConfiguration;

    public String ticketConfiguration() {
        return this.ticketConfiguration;
    }

    /**
     * OMS LA instance identifier.
     * 
     */
    @Import(name="workspaceId", required=true)
      private final String workspaceId;

    public String workspaceId() {
        return this.workspaceId;
    }

    public ItsmReceiverResponse(
        String connectionId,
        String name,
        String region,
        String ticketConfiguration,
        String workspaceId) {
        this.connectionId = Objects.requireNonNull(connectionId, "expected parameter 'connectionId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.ticketConfiguration = Objects.requireNonNull(ticketConfiguration, "expected parameter 'ticketConfiguration' to be non-null");
        this.workspaceId = Objects.requireNonNull(workspaceId, "expected parameter 'workspaceId' to be non-null");
    }

    private ItsmReceiverResponse() {
        this.connectionId = null;
        this.name = null;
        this.region = null;
        this.ticketConfiguration = null;
        this.workspaceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ItsmReceiverResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionId;
        private String name;
        private String region;
        private String ticketConfiguration;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ItsmReceiverResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionId = defaults.connectionId;
    	      this.name = defaults.name;
    	      this.region = defaults.region;
    	      this.ticketConfiguration = defaults.ticketConfiguration;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder connectionId(String connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder ticketConfiguration(String ticketConfiguration) {
            this.ticketConfiguration = Objects.requireNonNull(ticketConfiguration);
            return this;
        }
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }        public ItsmReceiverResponse build() {
            return new ItsmReceiverResponse(connectionId, name, region, ticketConfiguration, workspaceId);
        }
    }
}
