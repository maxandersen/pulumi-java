// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeIamPolicyArgs Empty = new RuntimeIamPolicyArgs();

    /**
     * A reference to the zone where the machine resides. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
      private final Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="runtimeName", required=true)
      private final Output<String> runtimeName;

    public Output<String> runtimeName() {
        return this.runtimeName;
    }

    public RuntimeIamPolicyArgs(
        @Nullable Output<String> location,
        Output<String> policyData,
        @Nullable Output<String> project,
        Output<String> runtimeName) {
        this.location = location;
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.runtimeName = Objects.requireNonNull(runtimeName, "expected parameter 'runtimeName' to be non-null");
    }

    private RuntimeIamPolicyArgs() {
        this.location = Codegen.empty();
        this.policyData = Codegen.empty();
        this.project = Codegen.empty();
        this.runtimeName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private Output<String> policyData;
        private @Nullable Output<String> project;
        private Output<String> runtimeName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.runtimeName = defaults.runtimeName;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder policyData(Output<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }
        public Builder policyData(String policyData) {
            this.policyData = Output.of(Objects.requireNonNull(policyData));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder runtimeName(Output<String> runtimeName) {
            this.runtimeName = Objects.requireNonNull(runtimeName);
            return this;
        }
        public Builder runtimeName(String runtimeName) {
            this.runtimeName = Output.of(Objects.requireNonNull(runtimeName));
            return this;
        }        public RuntimeIamPolicyArgs build() {
            return new RuntimeIamPolicyArgs(location, policyData, project, runtimeName);
        }
    }
}
