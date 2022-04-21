// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.securityinsights.enums.DataConnectorKind;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataConnectorArgs Empty = new DataConnectorArgs();

    /**
     * Connector ID
     * 
     */
    @Import(name="dataConnectorId")
    private @Nullable Output<String> dataConnectorId;

    public Optional<Output<String>> dataConnectorId() {
        return Optional.ofNullable(this.dataConnectorId);
    }

    /**
     * The data connector kind
     * 
     */
    @Import(name="kind", required=true)
    private Output<Either<String,DataConnectorKind>> kind;

    public Output<Either<String,DataConnectorKind>> kind() {
        return this.kind;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private DataConnectorArgs() {}

    private DataConnectorArgs(DataConnectorArgs $) {
        this.dataConnectorId = $.dataConnectorId;
        this.kind = $.kind;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataConnectorArgs $;

        public Builder() {
            $ = new DataConnectorArgs();
        }

        public Builder(DataConnectorArgs defaults) {
            $ = new DataConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataConnectorId(@Nullable Output<String> dataConnectorId) {
            $.dataConnectorId = dataConnectorId;
            return this;
        }

        public Builder dataConnectorId(String dataConnectorId) {
            return dataConnectorId(Output.of(dataConnectorId));
        }

        public Builder kind(Output<Either<String,DataConnectorKind>> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(Either<String,DataConnectorKind> kind) {
            return kind(Output.of(kind));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public DataConnectorArgs build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
