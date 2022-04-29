// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListMediaServiceEdgePoliciesArgs extends InvokeArgs {

    public static final ListMediaServiceEdgePoliciesArgs Empty = new ListMediaServiceEdgePoliciesArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The Media Services account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Unique identifier of the edge device.
     * 
     */
    @Import(name="deviceId")
    private @Nullable String deviceId;

    /**
     * @return Unique identifier of the edge device.
     * 
     */
    public Optional<String> deviceId() {
        return Optional.ofNullable(this.deviceId);
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListMediaServiceEdgePoliciesArgs() {}

    private ListMediaServiceEdgePoliciesArgs(ListMediaServiceEdgePoliciesArgs $) {
        this.accountName = $.accountName;
        this.deviceId = $.deviceId;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListMediaServiceEdgePoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListMediaServiceEdgePoliciesArgs $;

        public Builder() {
            $ = new ListMediaServiceEdgePoliciesArgs();
        }

        public Builder(ListMediaServiceEdgePoliciesArgs defaults) {
            $ = new ListMediaServiceEdgePoliciesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param deviceId Unique identifier of the edge device.
         * 
         * @return builder
         * 
         */
        public Builder deviceId(@Nullable String deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListMediaServiceEdgePoliciesArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
