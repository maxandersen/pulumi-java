// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.securityinsights.inputs.AlertsDataTypeOfDataConnectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AATPDataConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final AATPDataConnectorArgs Empty = new AATPDataConnectorArgs();

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
     * The available data types for the connector.
     * 
     */
    @Import(name="dataTypes")
    private @Nullable Output<AlertsDataTypeOfDataConnectorArgs> dataTypes;

    public Optional<Output<AlertsDataTypeOfDataConnectorArgs>> dataTypes() {
        return Optional.ofNullable(this.dataTypes);
    }

    /**
     * The kind of the data connector
     * Expected value is &#39;AzureAdvancedThreatProtection&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
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
     * The tenant id to connect to, and get the data from.
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
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

    private AATPDataConnectorArgs() {}

    private AATPDataConnectorArgs(AATPDataConnectorArgs $) {
        this.dataConnectorId = $.dataConnectorId;
        this.dataTypes = $.dataTypes;
        this.kind = $.kind;
        this.resourceGroupName = $.resourceGroupName;
        this.tenantId = $.tenantId;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AATPDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AATPDataConnectorArgs $;

        public Builder() {
            $ = new AATPDataConnectorArgs();
        }

        public Builder(AATPDataConnectorArgs defaults) {
            $ = new AATPDataConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataConnectorId(@Nullable Output<String> dataConnectorId) {
            $.dataConnectorId = dataConnectorId;
            return this;
        }

        public Builder dataConnectorId(String dataConnectorId) {
            return dataConnectorId(Output.of(dataConnectorId));
        }

        public Builder dataTypes(@Nullable Output<AlertsDataTypeOfDataConnectorArgs> dataTypes) {
            $.dataTypes = dataTypes;
            return this;
        }

        public Builder dataTypes(AlertsDataTypeOfDataConnectorArgs dataTypes) {
            return dataTypes(Output.of(dataTypes));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public AATPDataConnectorArgs build() {
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
