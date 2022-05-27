// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.AppServiceSiteConfigScmIpRestrictionHeaders;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppServiceSiteConfigScmIpRestriction {
    /**
     * @return Allow or Deny access for this IP range. Defaults to Allow.
     * 
     */
    private final @Nullable String action;
    /**
     * @return The headers for this specific `scm_ip_restriction` as defined below.
     * 
     */
    private final @Nullable AppServiceSiteConfigScmIpRestrictionHeaders headers;
    /**
     * @return The IP Address used for this IP Restriction in CIDR notation.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * @return The name for this IP Restriction.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The priority for this IP Restriction. Restrictions are enforced in priority order. By default, priority is set to 65000 if not specified.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * @return The Service Tag used for this IP Restriction.
     * 
     */
    private final @Nullable String serviceTag;
    /**
     * @return The Virtual Network Subnet ID used for this IP Restriction.
     * 
     */
    private final @Nullable String virtualNetworkSubnetId;

    @CustomType.Constructor
    private AppServiceSiteConfigScmIpRestriction(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("headers") @Nullable AppServiceSiteConfigScmIpRestrictionHeaders headers,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("serviceTag") @Nullable String serviceTag,
        @CustomType.Parameter("virtualNetworkSubnetId") @Nullable String virtualNetworkSubnetId) {
        this.action = action;
        this.headers = headers;
        this.ipAddress = ipAddress;
        this.name = name;
        this.priority = priority;
        this.serviceTag = serviceTag;
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
    }

    /**
     * @return Allow or Deny access for this IP range. Defaults to Allow.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return The headers for this specific `scm_ip_restriction` as defined below.
     * 
     */
    public Optional<AppServiceSiteConfigScmIpRestrictionHeaders> headers() {
        return Optional.ofNullable(this.headers);
    }
    /**
     * @return The IP Address used for this IP Restriction in CIDR notation.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @return The name for this IP Restriction.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The priority for this IP Restriction. Restrictions are enforced in priority order. By default, priority is set to 65000 if not specified.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return The Service Tag used for this IP Restriction.
     * 
     */
    public Optional<String> serviceTag() {
        return Optional.ofNullable(this.serviceTag);
    }
    /**
     * @return The Virtual Network Subnet ID used for this IP Restriction.
     * 
     */
    public Optional<String> virtualNetworkSubnetId() {
        return Optional.ofNullable(this.virtualNetworkSubnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppServiceSiteConfigScmIpRestriction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable AppServiceSiteConfigScmIpRestrictionHeaders headers;
        private @Nullable String ipAddress;
        private @Nullable String name;
        private @Nullable Integer priority;
        private @Nullable String serviceTag;
        private @Nullable String virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(AppServiceSiteConfigScmIpRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.headers = defaults.headers;
    	      this.ipAddress = defaults.ipAddress;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.serviceTag = defaults.serviceTag;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder headers(@Nullable AppServiceSiteConfigScmIpRestrictionHeaders headers) {
            this.headers = headers;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder serviceTag(@Nullable String serviceTag) {
            this.serviceTag = serviceTag;
            return this;
        }
        public Builder virtualNetworkSubnetId(@Nullable String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }        public AppServiceSiteConfigScmIpRestriction build() {
            return new AppServiceSiteConfigScmIpRestriction(action, headers, ipAddress, name, priority, serviceTag, virtualNetworkSubnetId);
        }
    }
}
