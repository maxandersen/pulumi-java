// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProjectIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectIamPolicyArgs Empty = new GetProjectIamPolicyArgs();

    @Import(name="resource", required=true)
      private final String resource;

    public String resource() {
        return this.resource;
    }

    public GetProjectIamPolicyArgs(String resource) {
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
    }

    private GetProjectIamPolicyArgs() {
        this.resource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resource = defaults.resource;
        }

        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }        public GetProjectIamPolicyArgs build() {
            return new GetProjectIamPolicyArgs(resource);
        }
    }
}
