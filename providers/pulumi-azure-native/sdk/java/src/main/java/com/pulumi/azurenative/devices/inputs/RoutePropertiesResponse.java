// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a routing rule that your IoT hub uses to route messages to endpoints.
 * 
 */
public final class RoutePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final RoutePropertiesResponse Empty = new RoutePropertiesResponse();

    /**
     * The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to true by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     * 
     */
    @Import(name="condition")
    private @Nullable String condition;

    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The list of endpoints to which messages that satisfy the condition are routed. Currently only one endpoint is allowed.
     * 
     */
    @Import(name="endpointNames", required=true)
    private List<String> endpointNames;

    public List<String> endpointNames() {
        return this.endpointNames;
    }

    /**
     * Used to specify whether a route is enabled.
     * 
     */
    @Import(name="isEnabled", required=true)
    private Boolean isEnabled;

    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The source that the routing rule is to be applied to, such as DeviceMessages.
     * 
     */
    @Import(name="source", required=true)
    private String source;

    public String source() {
        return this.source;
    }

    private RoutePropertiesResponse() {}

    private RoutePropertiesResponse(RoutePropertiesResponse $) {
        this.condition = $.condition;
        this.endpointNames = $.endpointNames;
        this.isEnabled = $.isEnabled;
        this.name = $.name;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutePropertiesResponse $;

        public Builder() {
            $ = new RoutePropertiesResponse();
        }

        public Builder(RoutePropertiesResponse defaults) {
            $ = new RoutePropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable String condition) {
            $.condition = condition;
            return this;
        }

        public Builder endpointNames(List<String> endpointNames) {
            $.endpointNames = endpointNames;
            return this;
        }

        public Builder endpointNames(String... endpointNames) {
            return endpointNames(List.of(endpointNames));
        }

        public Builder isEnabled(Boolean isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder source(String source) {
            $.source = source;
            return this;
        }

        public RoutePropertiesResponse build() {
            $.endpointNames = Objects.requireNonNull($.endpointNames, "expected parameter 'endpointNames' to be non-null");
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
