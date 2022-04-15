// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFirewallRuleResult {
    /**
     * highest IP address included in the range
     * 
     */
    private final String endIP;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * lowest IP address included in the range
     * 
     */
    private final String startIP;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetFirewallRuleResult(
        @CustomType.Parameter("endIP") String endIP,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("startIP") String startIP,
        @CustomType.Parameter("type") String type) {
        this.endIP = endIP;
        this.id = id;
        this.name = name;
        this.startIP = startIP;
        this.type = type;
    }

    /**
     * highest IP address included in the range
     * 
    */
    public String endIP() {
        return this.endIP;
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * lowest IP address included in the range
     * 
    */
    public String startIP() {
        return this.startIP;
    }
    /**
     * Resource type.
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
        private String endIP;
        private String id;
        private String name;
        private String startIP;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIP = defaults.endIP;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.startIP = defaults.startIP;
    	      this.type = defaults.type;
        }

        public Builder endIP(String endIP) {
            this.endIP = Objects.requireNonNull(endIP);
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
        public Builder startIP(String startIP) {
            this.startIP = Objects.requireNonNull(startIP);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetFirewallRuleResult build() {
            return new GetFirewallRuleResult(endIP, id, name, startIP, type);
        }
    }
}
