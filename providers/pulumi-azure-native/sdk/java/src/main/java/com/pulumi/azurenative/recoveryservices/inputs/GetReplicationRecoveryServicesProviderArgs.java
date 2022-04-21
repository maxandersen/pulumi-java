// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationRecoveryServicesProviderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicationRecoveryServicesProviderArgs Empty = new GetReplicationRecoveryServicesProviderArgs();

    /**
     * Fabric name.
     * 
     */
    @Import(name="fabricName", required=true)
    private String fabricName;

    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Recovery services provider name
     * 
     */
    @Import(name="providerName", required=true)
    private String providerName;

    public String providerName() {
        return this.providerName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    public String resourceName() {
        return this.resourceName;
    }

    private GetReplicationRecoveryServicesProviderArgs() {}

    private GetReplicationRecoveryServicesProviderArgs(GetReplicationRecoveryServicesProviderArgs $) {
        this.fabricName = $.fabricName;
        this.providerName = $.providerName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationRecoveryServicesProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationRecoveryServicesProviderArgs $;

        public Builder() {
            $ = new GetReplicationRecoveryServicesProviderArgs();
        }

        public Builder(GetReplicationRecoveryServicesProviderArgs defaults) {
            $ = new GetReplicationRecoveryServicesProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder fabricName(String fabricName) {
            $.fabricName = fabricName;
            return this;
        }

        public Builder providerName(String providerName) {
            $.providerName = providerName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetReplicationRecoveryServicesProviderArgs build() {
            $.fabricName = Objects.requireNonNull($.fabricName, "expected parameter 'fabricName' to be non-null");
            $.providerName = Objects.requireNonNull($.providerName, "expected parameter 'providerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
