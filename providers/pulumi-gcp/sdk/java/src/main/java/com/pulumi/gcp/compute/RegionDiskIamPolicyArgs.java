// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionDiskIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionDiskIamPolicyArgs Empty = new RegionDiskIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
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

    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    public RegionDiskIamPolicyArgs(
        @Nullable Output<String> name,
        Output<String> policyData,
        @Nullable Output<String> project,
        @Nullable Output<String> region) {
        this.name = name;
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.region = region;
    }

    private RegionDiskIamPolicyArgs() {
        this.name = Codegen.empty();
        this.policyData = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionDiskIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private Output<String> policyData;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionDiskIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }        public RegionDiskIamPolicyArgs build() {
            return new RegionDiskIamPolicyArgs(name, policyData, project, region);
        }
    }
}
