// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActiveSlotState extends com.pulumi.resources.ResourceArgs {

    public static final ActiveSlotState Empty = new ActiveSlotState();

    /**
     * The name of the App Service within which the Slot exists.  Changing this forces a new resource to be created.
     * 
     */
    @Import(name="appServiceName")
    private @Nullable Output<String> appServiceName;

    /**
     * @return The name of the App Service within which the Slot exists.  Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> appServiceName() {
        return Optional.ofNullable(this.appServiceName);
    }

    /**
     * The name of the App Service Slot which should be promoted to the Production Slot within the App Service.
     * 
     */
    @Import(name="appServiceSlotName")
    private @Nullable Output<String> appServiceSlotName;

    /**
     * @return The name of the App Service Slot which should be promoted to the Production Slot within the App Service.
     * 
     */
    public Optional<Output<String>> appServiceSlotName() {
        return Optional.ofNullable(this.appServiceSlotName);
    }

    /**
     * The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private ActiveSlotState() {}

    private ActiveSlotState(ActiveSlotState $) {
        this.appServiceName = $.appServiceName;
        this.appServiceSlotName = $.appServiceSlotName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActiveSlotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActiveSlotState $;

        public Builder() {
            $ = new ActiveSlotState();
        }

        public Builder(ActiveSlotState defaults) {
            $ = new ActiveSlotState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appServiceName The name of the App Service within which the Slot exists.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceName(@Nullable Output<String> appServiceName) {
            $.appServiceName = appServiceName;
            return this;
        }

        /**
         * @param appServiceName The name of the App Service within which the Slot exists.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder appServiceName(String appServiceName) {
            return appServiceName(Output.of(appServiceName));
        }

        /**
         * @param appServiceSlotName The name of the App Service Slot which should be promoted to the Production Slot within the App Service.
         * 
         * @return builder
         * 
         */
        public Builder appServiceSlotName(@Nullable Output<String> appServiceSlotName) {
            $.appServiceSlotName = appServiceSlotName;
            return this;
        }

        /**
         * @param appServiceSlotName The name of the App Service Slot which should be promoted to the Production Slot within the App Service.
         * 
         * @return builder
         * 
         */
        public Builder appServiceSlotName(String appServiceSlotName) {
            return appServiceSlotName(Output.of(appServiceSlotName));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the App Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ActiveSlotState build() {
            return $;
        }
    }

}
