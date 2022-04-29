// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetEventChannelArgs extends InvokeArgs {

    public static final GetEventChannelArgs Empty = new GetEventChannelArgs();

    /**
     * Name of the event channel.
     * 
     */
    @Import(name="eventChannelName", required=true)
    private String eventChannelName;

    /**
     * @return Name of the event channel.
     * 
     */
    public String eventChannelName() {
        return this.eventChannelName;
    }

    /**
     * Name of the partner namespace.
     * 
     */
    @Import(name="partnerNamespaceName", required=true)
    private String partnerNamespaceName;

    /**
     * @return Name of the partner namespace.
     * 
     */
    public String partnerNamespaceName() {
        return this.partnerNamespaceName;
    }

    /**
     * The name of the resource group within the user&#39;s subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetEventChannelArgs() {}

    private GetEventChannelArgs(GetEventChannelArgs $) {
        this.eventChannelName = $.eventChannelName;
        this.partnerNamespaceName = $.partnerNamespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventChannelArgs $;

        public Builder() {
            $ = new GetEventChannelArgs();
        }

        public Builder(GetEventChannelArgs defaults) {
            $ = new GetEventChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventChannelName Name of the event channel.
         * 
         * @return builder
         * 
         */
        public Builder eventChannelName(String eventChannelName) {
            $.eventChannelName = eventChannelName;
            return this;
        }

        /**
         * @param partnerNamespaceName Name of the partner namespace.
         * 
         * @return builder
         * 
         */
        public Builder partnerNamespaceName(String partnerNamespaceName) {
            $.partnerNamespaceName = partnerNamespaceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetEventChannelArgs build() {
            $.eventChannelName = Objects.requireNonNull($.eventChannelName, "expected parameter 'eventChannelName' to be non-null");
            $.partnerNamespaceName = Objects.requireNonNull($.partnerNamespaceName, "expected parameter 'partnerNamespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
