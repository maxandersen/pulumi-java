// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetTriggerEventSubscriptionStatusArgs extends InvokeArgs {

    public static final GetTriggerEventSubscriptionStatusArgs Empty = new GetTriggerEventSubscriptionStatusArgs();

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private String factoryName;

    /**
     * @return The factory name.
     * 
     */
    public String factoryName() {
        return this.factoryName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The trigger name.
     * 
     */
    @Import(name="triggerName", required=true)
    private String triggerName;

    /**
     * @return The trigger name.
     * 
     */
    public String triggerName() {
        return this.triggerName;
    }

    private GetTriggerEventSubscriptionStatusArgs() {}

    private GetTriggerEventSubscriptionStatusArgs(GetTriggerEventSubscriptionStatusArgs $) {
        this.factoryName = $.factoryName;
        this.resourceGroupName = $.resourceGroupName;
        this.triggerName = $.triggerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTriggerEventSubscriptionStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTriggerEventSubscriptionStatusArgs $;

        public Builder() {
            $ = new GetTriggerEventSubscriptionStatusArgs();
        }

        public Builder(GetTriggerEventSubscriptionStatusArgs defaults) {
            $ = new GetTriggerEventSubscriptionStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param triggerName The trigger name.
         * 
         * @return builder
         * 
         */
        public Builder triggerName(String triggerName) {
            $.triggerName = triggerName;
            return this;
        }

        public GetTriggerEventSubscriptionStatusArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.triggerName = Objects.requireNonNull($.triggerName, "expected parameter 'triggerName' to be non-null");
            return $;
        }
    }

}
