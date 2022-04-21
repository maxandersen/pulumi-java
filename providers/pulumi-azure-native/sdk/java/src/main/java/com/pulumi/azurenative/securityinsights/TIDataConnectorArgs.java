// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.securityinsights.inputs.TIDataConnectorDataTypesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TIDataConnectorArgs extends com.pulumi.resources.ResourceArgs {

    public static final TIDataConnectorArgs Empty = new TIDataConnectorArgs();

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
    private @Nullable Output<TIDataConnectorDataTypesArgs> dataTypes;

    public Optional<Output<TIDataConnectorDataTypesArgs>> dataTypes() {
        return Optional.ofNullable(this.dataTypes);
    }

    /**
     * The kind of the data connector
     * Expected value is &#39;ThreatIntelligence&#39;.
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
     * The lookback period for the feed to be imported.
     * 
     */
    @Import(name="tipLookbackPeriod")
    private @Nullable Output<String> tipLookbackPeriod;

    public Optional<Output<String>> tipLookbackPeriod() {
        return Optional.ofNullable(this.tipLookbackPeriod);
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

    private TIDataConnectorArgs() {}

    private TIDataConnectorArgs(TIDataConnectorArgs $) {
        this.dataConnectorId = $.dataConnectorId;
        this.dataTypes = $.dataTypes;
        this.kind = $.kind;
        this.resourceGroupName = $.resourceGroupName;
        this.tenantId = $.tenantId;
        this.tipLookbackPeriod = $.tipLookbackPeriod;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TIDataConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TIDataConnectorArgs $;

        public Builder() {
            $ = new TIDataConnectorArgs();
        }

        public Builder(TIDataConnectorArgs defaults) {
            $ = new TIDataConnectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataConnectorId(@Nullable Output<String> dataConnectorId) {
            $.dataConnectorId = dataConnectorId;
            return this;
        }

        public Builder dataConnectorId(String dataConnectorId) {
            return dataConnectorId(Output.of(dataConnectorId));
        }

        public Builder dataTypes(@Nullable Output<TIDataConnectorDataTypesArgs> dataTypes) {
            $.dataTypes = dataTypes;
            return this;
        }

        public Builder dataTypes(TIDataConnectorDataTypesArgs dataTypes) {
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

        public Builder tipLookbackPeriod(@Nullable Output<String> tipLookbackPeriod) {
            $.tipLookbackPeriod = tipLookbackPeriod;
            return this;
        }

        public Builder tipLookbackPeriod(String tipLookbackPeriod) {
            return tipLookbackPeriod(Output.of(tipLookbackPeriod));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public TIDataConnectorArgs build() {
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
