// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.orgpolicy_v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.orgpolicy_v2.inputs.GoogleCloudOrgpolicyV2PolicySpecArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyArgs Empty = new OrganizationPolicyArgs();

    /**
     * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * Basic information about the Organization Policy.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec;

    public Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    public OrganizationPolicyArgs(
        @Nullable Output<String> name,
        Output<String> organizationId,
        @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec) {
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.spec = spec;
    }

    private OrganizationPolicyArgs() {
        this.name = Codegen.empty();
        this.organizationId = Codegen.empty();
        this.spec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private Output<String> organizationId;
        private @Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.spec = defaults.spec;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }
        public Builder spec(@Nullable Output<GoogleCloudOrgpolicyV2PolicySpecArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable GoogleCloudOrgpolicyV2PolicySpecArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }        public OrganizationPolicyArgs build() {
            return new OrganizationPolicyArgs(name, organizationId, spec);
        }
    }
}
