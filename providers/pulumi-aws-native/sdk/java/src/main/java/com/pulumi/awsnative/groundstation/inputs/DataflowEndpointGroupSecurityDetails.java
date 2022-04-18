// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.groundstation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataflowEndpointGroupSecurityDetails extends com.pulumi.resources.InvokeArgs {

    public static final DataflowEndpointGroupSecurityDetails Empty = new DataflowEndpointGroupSecurityDetails();

    @Import(name="roleArn")
      private final @Nullable String roleArn;

    public Optional<String> roleArn() {
        return this.roleArn == null ? Optional.empty() : Optional.ofNullable(this.roleArn);
    }

    @Import(name="securityGroupIds")
      private final @Nullable List<String> securityGroupIds;

    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }

    @Import(name="subnetIds")
      private final @Nullable List<String> subnetIds;

    public List<String> subnetIds() {
        return this.subnetIds == null ? List.of() : this.subnetIds;
    }

    public DataflowEndpointGroupSecurityDetails(
        @Nullable String roleArn,
        @Nullable List<String> securityGroupIds,
        @Nullable List<String> subnetIds) {
        this.roleArn = roleArn;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
    }

    private DataflowEndpointGroupSecurityDetails() {
        this.roleArn = null;
        this.securityGroupIds = List.of();
        this.subnetIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataflowEndpointGroupSecurityDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String roleArn;
        private @Nullable List<String> securityGroupIds;
        private @Nullable List<String> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DataflowEndpointGroupSecurityDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roleArn = defaults.roleArn;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }        public DataflowEndpointGroupSecurityDetails build() {
            return new DataflowEndpointGroupSecurityDetails(roleArn, securityGroupIds, subnetIds);
        }
    }
}
