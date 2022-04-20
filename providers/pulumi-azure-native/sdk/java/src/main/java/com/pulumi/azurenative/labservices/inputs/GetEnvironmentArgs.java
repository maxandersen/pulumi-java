// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentArgs Empty = new GetEnvironmentArgs();

    /**
     * The name of the environment.
     * 
     */
    @Import(name="environmentName", required=true)
      private final String environmentName;

    public String environmentName() {
        return this.environmentName;
    }

    /**
     * The name of the environment Setting.
     * 
     */
    @Import(name="environmentSettingName", required=true)
      private final String environmentSettingName;

    public String environmentSettingName() {
        return this.environmentSettingName;
    }

    /**
     * Specify the $expand query. Example: &#39;properties($expand=networkInterface)&#39;
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> expand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the lab Account.
     * 
     */
    @Import(name="labAccountName", required=true)
      private final String labAccountName;

    public String labAccountName() {
        return this.labAccountName;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
      private final String labName;

    public String labName() {
        return this.labName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetEnvironmentArgs(
        String environmentName,
        String environmentSettingName,
        @Nullable String expand,
        String labAccountName,
        String labName,
        String resourceGroupName) {
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.environmentSettingName = Objects.requireNonNull(environmentSettingName, "expected parameter 'environmentSettingName' to be non-null");
        this.expand = expand;
        this.labAccountName = Objects.requireNonNull(labAccountName, "expected parameter 'labAccountName' to be non-null");
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetEnvironmentArgs() {
        this.environmentName = null;
        this.environmentSettingName = null;
        this.expand = null;
        this.labAccountName = null;
        this.labName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environmentName;
        private String environmentSettingName;
        private @Nullable String expand;
        private String labAccountName;
        private String labName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentName = defaults.environmentName;
    	      this.environmentSettingName = defaults.environmentSettingName;
    	      this.expand = defaults.expand;
    	      this.labAccountName = defaults.labAccountName;
    	      this.labName = defaults.labName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder environmentName(String environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }
        public Builder environmentSettingName(String environmentSettingName) {
            this.environmentSettingName = Objects.requireNonNull(environmentSettingName);
            return this;
        }
        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder labAccountName(String labAccountName) {
            this.labAccountName = Objects.requireNonNull(labAccountName);
            return this;
        }
        public Builder labName(String labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetEnvironmentArgs build() {
            return new GetEnvironmentArgs(environmentName, environmentSettingName, expand, labAccountName, labName, resourceGroupName);
        }
    }
}
