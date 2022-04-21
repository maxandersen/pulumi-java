// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.runtimeconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigIamPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final ConfigIamPolicyState Empty = new ConfigIamPolicyState();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="config")
    private @Nullable Output<String> config;

    public Optional<Output<String>> config() {
        return Optional.ofNullable(this.config);
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
    private @Nullable Output<String> policyData;

    public Optional<Output<String>> policyData() {
        return Optional.ofNullable(this.policyData);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ConfigIamPolicyState() {}

    private ConfigIamPolicyState(ConfigIamPolicyState $) {
        this.config = $.config;
        this.etag = $.etag;
        this.policyData = $.policyData;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigIamPolicyState $;

        public Builder() {
            $ = new ConfigIamPolicyState();
        }

        public Builder(ConfigIamPolicyState defaults) {
            $ = new ConfigIamPolicyState(Objects.requireNonNull(defaults));
        }

        public Builder config(@Nullable Output<String> config) {
            $.config = config;
            return this;
        }

        public Builder config(String config) {
            return config(Output.of(config));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder policyData(@Nullable Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ConfigIamPolicyState build() {
            return $;
        }
    }

}
