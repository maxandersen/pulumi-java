// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.inputs.TIDataConnectorDataTypesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TIDataConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final TIDataConnectorArgs Empty = new TIDataConnectorArgs();

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
     * The available data types for the connector.
     * 
     */
    @Import(name="dataTypes")
      private final @Nullable Output<TIDataConnectorDataTypesArgs> dataTypes;

    public Output<TIDataConnectorDataTypesArgs> dataTypes() {
        return this.dataTypes == null ? Codegen.empty() : this.dataTypes;
    }

    /**
     * The kind of the data connector
     * Expected value is 'ThreatIntelligence'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tenant id to connect to, and get the data from.
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> tenantId() {
        return this.tenantId == null ? Codegen.empty() : this.tenantId;
    }

    /**
     * The lookback period for the feed to be imported.
     * 
     */
    @Import(name="tipLookbackPeriod")
      private final @Nullable Output<String> tipLookbackPeriod;

    public Output<String> tipLookbackPeriod() {
        return this.tipLookbackPeriod == null ? Codegen.empty() : this.tipLookbackPeriod;
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

    public TIDataConnectorArgs(
        @Nullable Output<String> dataConnectorId,
        @Nullable Output<TIDataConnectorDataTypesArgs> dataTypes,
        Output<String> kind,
        Output<String> resourceGroupName,
        @Nullable Output<String> tenantId,
        @Nullable Output<String> tipLookbackPeriod,
        Output<String> workspaceName) {
        this.dataConnectorId = dataConnectorId;
        this.dataTypes = dataTypes;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tenantId = tenantId;
        this.tipLookbackPeriod = tipLookbackPeriod;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private TIDataConnectorArgs() {
        this.dataConnectorId = Codegen.empty();
        this.dataTypes = Codegen.empty();
        this.kind = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tenantId = Codegen.empty();
        this.tipLookbackPeriod = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TIDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataConnectorId;
        private @Nullable Output<TIDataConnectorDataTypesArgs> dataTypes;
        private Output<String> kind;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> tenantId;
        private @Nullable Output<String> tipLookbackPeriod;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(TIDataConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataConnectorId = defaults.dataConnectorId;
    	      this.dataTypes = defaults.dataTypes;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tenantId = defaults.tenantId;
    	      this.tipLookbackPeriod = defaults.tipLookbackPeriod;
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
        public Builder dataTypes(@Nullable Output<TIDataConnectorDataTypesArgs> dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }
        public Builder dataTypes(@Nullable TIDataConnectorDataTypesArgs dataTypes) {
            this.dataTypes = Codegen.ofNullable(dataTypes);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
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
        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Codegen.ofNullable(tenantId);
            return this;
        }
        public Builder tipLookbackPeriod(@Nullable Output<String> tipLookbackPeriod) {
            this.tipLookbackPeriod = tipLookbackPeriod;
            return this;
        }
        public Builder tipLookbackPeriod(@Nullable String tipLookbackPeriod) {
            this.tipLookbackPeriod = Codegen.ofNullable(tipLookbackPeriod);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public TIDataConnectorArgs build() {
            return new TIDataConnectorArgs(dataConnectorId, dataTypes, kind, resourceGroupName, tenantId, tipLookbackPeriod, workspaceName);
        }
    }
}
