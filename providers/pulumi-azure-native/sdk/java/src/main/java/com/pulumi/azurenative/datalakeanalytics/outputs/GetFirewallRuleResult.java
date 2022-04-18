// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakeanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirewallRuleResult {
    /**
     * The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    private final String endIpAddress;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    private final String startIpAddress;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetFirewallRuleResult(
        @CustomType.Parameter("endIpAddress") String endIpAddress,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("startIpAddress") String startIpAddress,
        @CustomType.Parameter("type") String type) {
        this.endIpAddress = endIpAddress;
        this.id = id;
        this.name = name;
        this.startIpAddress = startIpAddress;
        this.type = type;
    }

    /**
     * The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
    */
    public String endIpAddress() {
        return this.endIpAddress;
    }
    /**
     * The resource identifier.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
    */
    public String startIpAddress() {
        return this.startIpAddress;
    }
    /**
     * The resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endIpAddress;
        private String id;
        private String name;
        private String startIpAddress;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.startIpAddress = defaults.startIpAddress;
    	      this.type = defaults.type;
        }

        public Builder endIpAddress(String endIpAddress) {
            this.endIpAddress = Objects.requireNonNull(endIpAddress);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder startIpAddress(String startIpAddress) {
            this.startIpAddress = Objects.requireNonNull(startIpAddress);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetFirewallRuleResult build() {
            return new GetFirewallRuleResult(endIpAddress, id, name, startIpAddress, type);
        }
    }
}
