// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FallbackRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final FallbackRouteArgs Empty = new FallbackRouteArgs();

    /**
     * The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to `true` by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    /**
     * @return The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to `true` by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language.
     * 
     */
    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * Used to specify whether the fallback route is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Used to specify whether the fallback route is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The endpoints to which messages that satisfy the condition are routed. Currently only 1 endpoint is allowed.
     * 
     */
    @Import(name="endpointNames", required=true)
    private Output<String> endpointNames;

    /**
     * @return The endpoints to which messages that satisfy the condition are routed. Currently only 1 endpoint is allowed.
     * 
     */
    public Output<String> endpointNames() {
        return this.endpointNames;
    }

    /**
     * The name of the IoTHub to which this Fallback Route belongs. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="iothubName", required=true)
    private Output<String> iothubName;

    /**
     * @return The name of the IoTHub to which this Fallback Route belongs. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> iothubName() {
        return this.iothubName;
    }

    /**
     * The name of the resource group under which the IotHub Storage Container Endpoint resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group under which the IotHub Storage Container Endpoint resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The source that the routing rule is to be applied to. Possible values include: `DeviceConnectionStateEvents`, `DeviceJobLifecycleEvents`, `DeviceLifecycleEvents`, `DeviceMessages`, `Invalid`, `TwinChangeEvents`.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return The source that the routing rule is to be applied to. Possible values include: `DeviceConnectionStateEvents`, `DeviceJobLifecycleEvents`, `DeviceLifecycleEvents`, `DeviceMessages`, `Invalid`, `TwinChangeEvents`.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    private FallbackRouteArgs() {}

    private FallbackRouteArgs(FallbackRouteArgs $) {
        this.condition = $.condition;
        this.enabled = $.enabled;
        this.endpointNames = $.endpointNames;
        this.iothubName = $.iothubName;
        this.resourceGroupName = $.resourceGroupName;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FallbackRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FallbackRouteArgs $;

        public Builder() {
            $ = new FallbackRouteArgs();
        }

        public Builder(FallbackRouteArgs defaults) {
            $ = new FallbackRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to `true` by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to `true` by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language.
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param enabled Used to specify whether the fallback route is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Used to specify whether the fallback route is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param endpointNames The endpoints to which messages that satisfy the condition are routed. Currently only 1 endpoint is allowed.
         * 
         * @return builder
         * 
         */
        public Builder endpointNames(Output<String> endpointNames) {
            $.endpointNames = endpointNames;
            return this;
        }

        /**
         * @param endpointNames The endpoints to which messages that satisfy the condition are routed. Currently only 1 endpoint is allowed.
         * 
         * @return builder
         * 
         */
        public Builder endpointNames(String endpointNames) {
            return endpointNames(Output.of(endpointNames));
        }

        /**
         * @param iothubName The name of the IoTHub to which this Fallback Route belongs. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder iothubName(Output<String> iothubName) {
            $.iothubName = iothubName;
            return this;
        }

        /**
         * @param iothubName The name of the IoTHub to which this Fallback Route belongs. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder iothubName(String iothubName) {
            return iothubName(Output.of(iothubName));
        }

        /**
         * @param resourceGroupName The name of the resource group under which the IotHub Storage Container Endpoint resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group under which the IotHub Storage Container Endpoint resource has to be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param source The source that the routing rule is to be applied to. Possible values include: `DeviceConnectionStateEvents`, `DeviceJobLifecycleEvents`, `DeviceLifecycleEvents`, `DeviceMessages`, `Invalid`, `TwinChangeEvents`.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The source that the routing rule is to be applied to. Possible values include: `DeviceConnectionStateEvents`, `DeviceJobLifecycleEvents`, `DeviceLifecycleEvents`, `DeviceMessages`, `Invalid`, `TwinChangeEvents`.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        public FallbackRouteArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.endpointNames = Objects.requireNonNull($.endpointNames, "expected parameter 'endpointNames' to be non-null");
            $.iothubName = Objects.requireNonNull($.iothubName, "expected parameter 'iothubName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
