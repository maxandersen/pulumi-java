// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Data Lake Store firewall rule information.
 * 
 */
public final class FirewallRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallRuleResponse Empty = new FirewallRuleResponse();

    /**
     * The end IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @Import(name="endIpAddress", required=true)
    private String endIpAddress;

    public String endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * The resource identifier.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * The resource name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The start IP address for the firewall rule. This can be either ipv4 or ipv6. Start and End should be in the same protocol.
     * 
     */
    @Import(name="startIpAddress", required=true)
    private String startIpAddress;

    public String startIpAddress() {
        return this.startIpAddress;
    }

    /**
     * The resource type.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private FirewallRuleResponse() {}

    private FirewallRuleResponse(FirewallRuleResponse $) {
        this.endIpAddress = $.endIpAddress;
        this.id = $.id;
        this.name = $.name;
        this.startIpAddress = $.startIpAddress;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRuleResponse $;

        public Builder() {
            $ = new FirewallRuleResponse();
        }

        public Builder(FirewallRuleResponse defaults) {
            $ = new FirewallRuleResponse(Objects.requireNonNull(defaults));
        }

        public Builder endIpAddress(String endIpAddress) {
            $.endIpAddress = endIpAddress;
            return this;
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder startIpAddress(String startIpAddress) {
            $.startIpAddress = startIpAddress;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public FirewallRuleResponse build() {
            $.endIpAddress = Objects.requireNonNull($.endIpAddress, "expected parameter 'endIpAddress' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.startIpAddress = Objects.requireNonNull($.startIpAddress, "expected parameter 'startIpAddress' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
