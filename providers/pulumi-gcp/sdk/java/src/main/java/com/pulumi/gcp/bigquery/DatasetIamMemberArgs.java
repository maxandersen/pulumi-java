// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetIamMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetIamMemberArgs Empty = new DatasetIamMemberArgs();

    @Import(name="condition")
    private @Nullable Output<DatasetIamMemberConditionArgs> condition;

    public Optional<Output<DatasetIamMemberConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The dataset ID.
     * 
     */
    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    @Import(name="member", required=true)
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.bigquery.DatasetIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    private DatasetIamMemberArgs() {}

    private DatasetIamMemberArgs(DatasetIamMemberArgs $) {
        this.condition = $.condition;
        this.datasetId = $.datasetId;
        this.member = $.member;
        this.project = $.project;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetIamMemberArgs $;

        public Builder() {
            $ = new DatasetIamMemberArgs();
        }

        public Builder(DatasetIamMemberArgs defaults) {
            $ = new DatasetIamMemberArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<DatasetIamMemberConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(DatasetIamMemberConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder member(Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public DatasetIamMemberArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.member = Objects.requireNonNull($.member, "expected parameter 'member' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
