// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPolicyArgs Empty = new GetPolicyArgs();

    /**
     * Specify the $expand query. Example: &#39;properties($select=description)&#39;
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> expand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
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
     * The name of the policy.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The name of the policy set.
     * 
     */
    @Import(name="policySetName", required=true)
      private final String policySetName;

    public String policySetName() {
        return this.policySetName;
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

    public GetPolicyArgs(
        @Nullable String expand,
        String labName,
        String name,
        String policySetName,
        String resourceGroupName) {
        this.expand = expand;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policySetName = Objects.requireNonNull(policySetName, "expected parameter 'policySetName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPolicyArgs() {
        this.expand = null;
        this.labName = null;
        this.name = null;
        this.policySetName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String labName;
        private String name;
        private String policySetName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.labName = defaults.labName;
    	      this.name = defaults.name;
    	      this.policySetName = defaults.policySetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder labName(String labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policySetName(String policySetName) {
            this.policySetName = Objects.requireNonNull(policySetName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetPolicyArgs build() {
            return new GetPolicyArgs(expand, labName, name, policySetName, resourceGroupName);
        }
    }
}
