// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableIamPolicyArgs Empty = new TableIamPolicyArgs();

    /**
     * The name or relative resource id of the instance that owns the table.
     * 
     */
    @Import(name="instance", required=true)
    private Output<String> instance;

    public Output<String> instance() {
        return this.instance;
    }

    /**
     * The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }

    /**
     * The project in which the table belongs. If it
     * is not provided, this provider will use the provider default.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The name or relative resource id of the table to manage IAM policies for.
     * 
     */
    @Import(name="table", required=true)
    private Output<String> table;

    public Output<String> table() {
        return this.table;
    }

    private TableIamPolicyArgs() {}

    private TableIamPolicyArgs(TableIamPolicyArgs $) {
        this.instance = $.instance;
        this.policyData = $.policyData;
        this.project = $.project;
        this.table = $.table;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableIamPolicyArgs $;

        public Builder() {
            $ = new TableIamPolicyArgs();
        }

        public Builder(TableIamPolicyArgs defaults) {
            $ = new TableIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder instance(Output<String> instance) {
            $.instance = instance;
            return this;
        }

        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        public Builder policyData(Output<String> policyData) {
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

        public Builder table(Output<String> table) {
            $.table = table;
            return this;
        }

        public Builder table(String table) {
            return table(Output.of(table));
        }

        public TableIamPolicyArgs build() {
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            $.table = Objects.requireNonNull($.table, "expected parameter 'table' to be non-null");
            return $;
        }
    }

}
