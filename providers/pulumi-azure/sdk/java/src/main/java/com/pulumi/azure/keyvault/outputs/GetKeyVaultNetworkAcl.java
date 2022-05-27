// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKeyVaultNetworkAcl {
    private final String bypass;
    private final String defaultAction;
    private final List<String> ipRules;
    private final List<String> virtualNetworkSubnetIds;

    @CustomType.Constructor
    private GetKeyVaultNetworkAcl(
        @CustomType.Parameter("bypass") String bypass,
        @CustomType.Parameter("defaultAction") String defaultAction,
        @CustomType.Parameter("ipRules") List<String> ipRules,
        @CustomType.Parameter("virtualNetworkSubnetIds") List<String> virtualNetworkSubnetIds) {
        this.bypass = bypass;
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.virtualNetworkSubnetIds = virtualNetworkSubnetIds;
    }

    public String bypass() {
        return this.bypass;
    }
    public String defaultAction() {
        return this.defaultAction;
    }
    public List<String> ipRules() {
        return this.ipRules;
    }
    public List<String> virtualNetworkSubnetIds() {
        return this.virtualNetworkSubnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyVaultNetworkAcl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bypass;
        private String defaultAction;
        private List<String> ipRules;
        private List<String> virtualNetworkSubnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyVaultNetworkAcl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypass = defaults.bypass;
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkSubnetIds = defaults.virtualNetworkSubnetIds;
        }

        public Builder bypass(String bypass) {
            this.bypass = Objects.requireNonNull(bypass);
            return this;
        }
        public Builder defaultAction(String defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }
        public Builder ipRules(List<String> ipRules) {
            this.ipRules = Objects.requireNonNull(ipRules);
            return this;
        }
        public Builder ipRules(String... ipRules) {
            return ipRules(List.of(ipRules));
        }
        public Builder virtualNetworkSubnetIds(List<String> virtualNetworkSubnetIds) {
            this.virtualNetworkSubnetIds = Objects.requireNonNull(virtualNetworkSubnetIds);
            return this;
        }
        public Builder virtualNetworkSubnetIds(String... virtualNetworkSubnetIds) {
            return virtualNetworkSubnetIds(List.of(virtualNetworkSubnetIds));
        }        public GetKeyVaultNetworkAcl build() {
            return new GetKeyVaultNetworkAcl(bypass, defaultAction, ipRules, virtualNetworkSubnetIds);
        }
    }
}
