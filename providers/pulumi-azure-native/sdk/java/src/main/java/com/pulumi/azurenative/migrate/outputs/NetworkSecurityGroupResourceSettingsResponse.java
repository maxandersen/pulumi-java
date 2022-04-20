// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.azurenative.migrate.outputs.NsgSecurityRuleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NetworkSecurityGroupResourceSettingsResponse {
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Network/networkSecurityGroups&#39;.
     * 
     */
    private final String resourceType;
    /**
     * Gets or sets Security rules of network security group.
     * 
     */
    private final @Nullable List<NsgSecurityRuleResponse> securityRules;
    /**
     * Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;

    @CustomType.Constructor
    private NetworkSecurityGroupResourceSettingsResponse(
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("securityRules") @Nullable List<NsgSecurityRuleResponse> securityRules,
        @CustomType.Parameter("targetResourceName") String targetResourceName) {
        this.resourceType = resourceType;
        this.securityRules = securityRules;
        this.targetResourceName = targetResourceName;
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Network/networkSecurityGroups&#39;.
     * 
    */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * Gets or sets Security rules of network security group.
     * 
    */
    public List<NsgSecurityRuleResponse> securityRules() {
        return this.securityRules == null ? List.of() : this.securityRules;
    }
    /**
     * Gets or sets the target Resource name.
     * 
    */
    public String targetResourceName() {
        return this.targetResourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityGroupResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private @Nullable List<NsgSecurityRuleResponse> securityRules;
        private String targetResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityGroupResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.securityRules = defaults.securityRules;
    	      this.targetResourceName = defaults.targetResourceName;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder securityRules(@Nullable List<NsgSecurityRuleResponse> securityRules) {
            this.securityRules = securityRules;
            return this;
        }
        public Builder securityRules(NsgSecurityRuleResponse... securityRules) {
            return securityRules(List.of(securityRules));
        }
        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }        public NetworkSecurityGroupResourceSettingsResponse build() {
            return new NetworkSecurityGroupResourceSettingsResponse(resourceType, securityRules, targetResourceName);
        }
    }
}
