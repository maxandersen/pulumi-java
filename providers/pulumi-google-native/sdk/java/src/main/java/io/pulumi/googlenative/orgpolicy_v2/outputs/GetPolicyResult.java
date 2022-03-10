// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.orgpolicy_v2.outputs.GoogleCloudOrgpolicyV2PolicySpecResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetPolicyResult {
    /**
     * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
     */
    private final String name;
    /**
     * Basic information about the Organization Policy.
     * 
     */
    private final GoogleCloudOrgpolicyV2PolicySpecResponse spec;

    @OutputCustomType.Constructor
    private GetPolicyResult(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("spec") GoogleCloudOrgpolicyV2PolicySpecResponse spec) {
        this.name = name;
        this.spec = spec;
    }

    /**
     * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Basic information about the Organization Policy.
     * 
    */
    public GoogleCloudOrgpolicyV2PolicySpecResponse getSpec() {
        return this.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private GoogleCloudOrgpolicyV2PolicySpecResponse spec;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.spec = defaults.spec;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSpec(GoogleCloudOrgpolicyV2PolicySpecResponse spec) {
            this.spec = Objects.requireNonNull(spec);
            return this;
        }
        public GetPolicyResult build() {
            return new GetPolicyResult(name, spec);
        }
    }
}
