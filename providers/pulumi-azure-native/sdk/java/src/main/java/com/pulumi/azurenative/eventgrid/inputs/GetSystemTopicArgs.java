// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSystemTopicArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSystemTopicArgs Empty = new GetSystemTopicArgs();

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

    /**
     * Name of the system topic.
     * 
     */
    @Import(name="systemTopicName", required=true)
    private String systemTopicName;

    /**
     * @return Name of the system topic.
     * 
     */
    public String systemTopicName() {
        return this.systemTopicName;
    }

    private GetSystemTopicArgs() {}

    private GetSystemTopicArgs(GetSystemTopicArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.systemTopicName = $.systemTopicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSystemTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSystemTopicArgs $;

        public Builder() {
            $ = new GetSystemTopicArgs();
        }

        public Builder(GetSystemTopicArgs defaults) {
            $ = new GetSystemTopicArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param systemTopicName Name of the system topic.
         * 
         * @return builder
         * 
         */
        public Builder systemTopicName(String systemTopicName) {
            $.systemTopicName = systemTopicName;
            return this;
        }

        public GetSystemTopicArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.systemTopicName = Objects.requireNonNull($.systemTopicName, "expected parameter 'systemTopicName' to be non-null");
            return $;
        }
    }

}
