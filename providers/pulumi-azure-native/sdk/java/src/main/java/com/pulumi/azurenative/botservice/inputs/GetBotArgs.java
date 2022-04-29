// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetBotArgs extends InvokeArgs {

    public static final GetBotArgs Empty = new GetBotArgs();

    /**
     * The name of the Bot resource group in the user subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Bot resource group in the user subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Bot resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the Bot resource.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetBotArgs() {}

    private GetBotArgs(GetBotArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotArgs $;

        public Builder() {
            $ = new GetBotArgs();
        }

        public Builder(GetBotArgs defaults) {
            $ = new GetBotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the Bot resource group in the user subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the Bot resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetBotArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
