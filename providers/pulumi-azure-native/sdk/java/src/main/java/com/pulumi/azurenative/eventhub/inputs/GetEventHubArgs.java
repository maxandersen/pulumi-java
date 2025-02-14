// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEventHubArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEventHubArgs Empty = new GetEventHubArgs();

    /**
     * The Event Hub name
     * 
     */
    @Import(name="eventHubName", required=true)
    private String eventHubName;

    /**
     * @return The Event Hub name
     * 
     */
    public String eventHubName() {
        return this.eventHubName;
    }

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
    private String namespaceName;

    /**
     * @return The Namespace name
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group within the azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetEventHubArgs() {}

    private GetEventHubArgs(GetEventHubArgs $) {
        this.eventHubName = $.eventHubName;
        this.namespaceName = $.namespaceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEventHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEventHubArgs $;

        public Builder() {
            $ = new GetEventHubArgs();
        }

        public Builder(GetEventHubArgs defaults) {
            $ = new GetEventHubArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventHubName The Event Hub name
         * 
         * @return builder
         * 
         */
        public Builder eventHubName(String eventHubName) {
            $.eventHubName = eventHubName;
            return this;
        }

        /**
         * @param namespaceName The Namespace name
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group within the azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetEventHubArgs build() {
            $.eventHubName = Objects.requireNonNull($.eventHubName, "expected parameter 'eventHubName' to be non-null");
            $.namespaceName = Objects.requireNonNull($.namespaceName, "expected parameter 'namespaceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
