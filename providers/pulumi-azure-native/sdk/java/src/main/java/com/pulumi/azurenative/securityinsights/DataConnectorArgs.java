// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.securityinsights.enums.DataConnectorKind;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataConnectorArgs Empty = new DataConnectorArgs();

    /**
     * Connector ID
     * 
     */
    @Import(name="dataConnectorId")
      private final @Nullable Output<String> dataConnectorId;

    public Output<String> dataConnectorId() {
        return this.dataConnectorId == null ? Codegen.empty() : this.dataConnectorId;
    }

    /**
     * The data connector kind
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,DataConnectorKind>> kind;

    public Output<Either<String,DataConnectorKind>> kind() {
        return this.kind;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public DataConnectorArgs(
        @Nullable Output<String> dataConnectorId,
        Output<Either<String,DataConnectorKind>> kind,
        Output<String> resourceGroupName,
        Output<String> workspaceName) {
        this.dataConnectorId = dataConnectorId;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private DataConnectorArgs() {
        this.dataConnectorId = Codegen.empty();
        this.kind = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataConnectorId;
        private Output<Either<String,DataConnectorKind>> kind;
        private Output<String> resourceGroupName;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataConnectorId = defaults.dataConnectorId;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder dataConnectorId(@Nullable Output<String> dataConnectorId) {
            this.dataConnectorId = dataConnectorId;
            return this;
        }
        public Builder dataConnectorId(@Nullable String dataConnectorId) {
            this.dataConnectorId = Codegen.ofNullable(dataConnectorId);
            return this;
        }
        public Builder kind(Output<Either<String,DataConnectorKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,DataConnectorKind> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public DataConnectorArgs build() {
            return new DataConnectorArgs(dataConnectorId, kind, resourceGroupName, workspaceName);
        }
    }
}
