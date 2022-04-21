// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final IamPolicyArgs Empty = new IamPolicyArgs();

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
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

    @Import(name="tableId", required=true)
    private Output<String> tableId;

    public Output<String> tableId() {
        return this.tableId;
    }

    private IamPolicyArgs() {}

    private IamPolicyArgs(IamPolicyArgs $) {
        this.datasetId = $.datasetId;
        this.policyData = $.policyData;
        this.project = $.project;
        this.tableId = $.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamPolicyArgs $;

        public Builder() {
            $ = new IamPolicyArgs();
        }

        public Builder(IamPolicyArgs defaults) {
            $ = new IamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
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

        public Builder tableId(Output<String> tableId) {
            $.tableId = tableId;
            return this;
        }

        public Builder tableId(String tableId) {
            return tableId(Output.of(tableId));
        }

        public IamPolicyArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
