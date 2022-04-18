// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission {
    /**
     * Set of EC2 launch permission user groups.
     * 
     */
    private final List<String> userGroups;
    /**
     * Set of AWS Account identifiers.
     * 
     */
    private final List<String> userIds;

    @CustomType.Constructor
    private GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission(
        @CustomType.Parameter("userGroups") List<String> userGroups,
        @CustomType.Parameter("userIds") List<String> userIds) {
        this.userGroups = userGroups;
        this.userIds = userIds;
    }

    /**
     * Set of EC2 launch permission user groups.
     * 
    */
    public List<String> userGroups() {
        return this.userGroups;
    }
    /**
     * Set of AWS Account identifiers.
     * 
    */
    public List<String> userIds() {
        return this.userIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> userGroups;
        private List<String> userIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userGroups = defaults.userGroups;
    	      this.userIds = defaults.userIds;
        }

        public Builder userGroups(List<String> userGroups) {
            this.userGroups = Objects.requireNonNull(userGroups);
            return this;
        }
        public Builder userGroups(String... userGroups) {
            return userGroups(List.of(userGroups));
        }
        public Builder userIds(List<String> userIds) {
            this.userIds = Objects.requireNonNull(userIds);
            return this;
        }
        public Builder userIds(String... userIds) {
            return userIds(List.of(userIds));
        }        public GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission build() {
            return new GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission(userGroups, userIds);
        }
    }
}
