// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SignalRSharedPrivateLinkResourceArgs extends ResourceArgs {

    public static final SignalRSharedPrivateLinkResourceArgs Empty = new SignalRSharedPrivateLinkResourceArgs();

    /**
     * The group id from the provider of resource the shared private link resource is for
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return The group id from the provider of resource the shared private link resource is for
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * The resource id of the resource the shared private link resource is for
     * 
     */
    @Import(name="privateLinkResourceId", required=true)
    private Output<String> privateLinkResourceId;

    /**
     * @return The resource id of the resource the shared private link resource is for
     * 
     */
    public Output<String> privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * The request message for requesting approval of the shared private link resource
     * 
     */
    @Import(name="requestMessage")
    private @Nullable Output<String> requestMessage;

    /**
     * @return The request message for requesting approval of the shared private link resource
     * 
     */
    public Optional<Output<String>> requestMessage() {
        return Optional.ofNullable(this.requestMessage);
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * The name of the shared private link resource
     * 
     */
    @Import(name="sharedPrivateLinkResourceName")
    private @Nullable Output<String> sharedPrivateLinkResourceName;

    /**
     * @return The name of the shared private link resource
     * 
     */
    public Optional<Output<String>> sharedPrivateLinkResourceName() {
        return Optional.ofNullable(this.sharedPrivateLinkResourceName);
    }

    private SignalRSharedPrivateLinkResourceArgs() {}

    private SignalRSharedPrivateLinkResourceArgs(SignalRSharedPrivateLinkResourceArgs $) {
        this.groupId = $.groupId;
        this.privateLinkResourceId = $.privateLinkResourceId;
        this.requestMessage = $.requestMessage;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.sharedPrivateLinkResourceName = $.sharedPrivateLinkResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SignalRSharedPrivateLinkResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SignalRSharedPrivateLinkResourceArgs $;

        public Builder() {
            $ = new SignalRSharedPrivateLinkResourceArgs();
        }

        public Builder(SignalRSharedPrivateLinkResourceArgs defaults) {
            $ = new SignalRSharedPrivateLinkResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId The group id from the provider of resource the shared private link resource is for
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The group id from the provider of resource the shared private link resource is for
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param privateLinkResourceId The resource id of the resource the shared private link resource is for
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(Output<String> privateLinkResourceId) {
            $.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        /**
         * @param privateLinkResourceId The resource id of the resource the shared private link resource is for
         * 
         * @return builder
         * 
         */
        public Builder privateLinkResourceId(String privateLinkResourceId) {
            return privateLinkResourceId(Output.of(privateLinkResourceId));
        }

        /**
         * @param requestMessage The request message for requesting approval of the shared private link resource
         * 
         * @return builder
         * 
         */
        public Builder requestMessage(@Nullable Output<String> requestMessage) {
            $.requestMessage = requestMessage;
            return this;
        }

        /**
         * @param requestMessage The request message for requesting approval of the shared private link resource
         * 
         * @return builder
         * 
         */
        public Builder requestMessage(String requestMessage) {
            return requestMessage(Output.of(requestMessage));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param sharedPrivateLinkResourceName The name of the shared private link resource
         * 
         * @return builder
         * 
         */
        public Builder sharedPrivateLinkResourceName(@Nullable Output<String> sharedPrivateLinkResourceName) {
            $.sharedPrivateLinkResourceName = sharedPrivateLinkResourceName;
            return this;
        }

        /**
         * @param sharedPrivateLinkResourceName The name of the shared private link resource
         * 
         * @return builder
         * 
         */
        public Builder sharedPrivateLinkResourceName(String sharedPrivateLinkResourceName) {
            return sharedPrivateLinkResourceName(Output.of(sharedPrivateLinkResourceName));
        }

        public SignalRSharedPrivateLinkResourceArgs build() {
            $.groupId = Objects.requireNonNull($.groupId, "expected parameter 'groupId' to be non-null");
            $.privateLinkResourceId = Objects.requireNonNull($.privateLinkResourceId, "expected parameter 'privateLinkResourceId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
