// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutePropertiesResponse {
    /**
     * The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to true by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     * 
     */
    private final @Nullable String condition;
    /**
     * The list of endpoints to which messages that satisfy the condition are routed. Currently only one endpoint is allowed.
     * 
     */
    private final List<String> endpointNames;
    /**
     * Used to specify whether a route is enabled.
     * 
     */
    private final Boolean isEnabled;
    /**
     * The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     */
    private final String name;
    /**
     * The source that the routing rule is to be applied to, such as DeviceMessages.
     * 
     */
    private final String source;

    @CustomType.Constructor
    private RoutePropertiesResponse(
        @CustomType.Parameter("condition") @Nullable String condition,
        @CustomType.Parameter("endpointNames") List<String> endpointNames,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("source") String source) {
        this.condition = condition;
        this.endpointNames = endpointNames;
        this.isEnabled = isEnabled;
        this.name = name;
        this.source = source;
    }

    /**
     * The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to true by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     * 
    */
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * The list of endpoints to which messages that satisfy the condition are routed. Currently only one endpoint is allowed.
     * 
    */
    public List<String> endpointNames() {
        return this.endpointNames;
    }
    /**
     * Used to specify whether a route is enabled.
     * 
    */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The source that the routing rule is to be applied to, such as DeviceMessages.
     * 
    */
    public String source() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String condition;
        private List<String> endpointNames;
        private Boolean isEnabled;
        private String name;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.endpointNames = defaults.endpointNames;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.source = defaults.source;
        }

        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        public Builder endpointNames(List<String> endpointNames) {
            this.endpointNames = Objects.requireNonNull(endpointNames);
            return this;
        }
        public Builder endpointNames(String... endpointNames) {
            return endpointNames(List.of(endpointNames));
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }        public RoutePropertiesResponse build() {
            return new RoutePropertiesResponse(condition, endpointNames, isEnabled, name, source);
        }
    }
}
