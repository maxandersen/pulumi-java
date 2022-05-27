// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedServiceKustoArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServiceKustoArgs Empty = new LinkedServiceKustoArgs();

    /**
     * A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId", required=true)
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }

    /**
     * The description for the Data Factory Linked Service.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Linked Service.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="integrationRuntimeName")
    private @Nullable Output<String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<String>> integrationRuntimeName() {
        return Optional.ofNullable(this.integrationRuntimeName);
    }

    /**
     * The Kusto Database Name.
     * 
     */
    @Import(name="kustoDatabaseName", required=true)
    private Output<String> kustoDatabaseName;

    /**
     * @return The Kusto Database Name.
     * 
     */
    public Output<String> kustoDatabaseName() {
        return this.kustoDatabaseName;
    }

    /**
     * The URI of the Kusto Cluster endpoint.
     * 
     */
    @Import(name="kustoEndpoint", required=true)
    private Output<String> kustoEndpoint;

    /**
     * @return The URI of the Kusto Cluster endpoint.
     * 
     */
    public Output<String> kustoEndpoint() {
        return this.kustoEndpoint;
    }

    /**
     * Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The service principal id in which to authenticate against the Kusto Database.
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<String> servicePrincipalId;

    /**
     * @return The service principal id in which to authenticate against the Kusto Database.
     * 
     */
    public Optional<Output<String>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The service principal key in which to authenticate against the Kusto Database.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Output<String> servicePrincipalKey;

    /**
     * @return The service principal key in which to authenticate against the Kusto Database.
     * 
     */
    public Optional<Output<String>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * The service principal tenant id or name in which to authenticate against the Kusto Database.
     * 
     */
    @Import(name="tenant")
    private @Nullable Output<String> tenant;

    /**
     * @return The service principal tenant id or name in which to authenticate against the Kusto Database.
     * 
     */
    public Optional<Output<String>> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    /**
     * Whether to use the Data Factory&#39;s managed identity to authenticate against the Kusto Database.
     * 
     */
    @Import(name="useManagedIdentity")
    private @Nullable Output<Boolean> useManagedIdentity;

    /**
     * @return Whether to use the Data Factory&#39;s managed identity to authenticate against the Kusto Database.
     * 
     */
    public Optional<Output<Boolean>> useManagedIdentity() {
        return Optional.ofNullable(this.useManagedIdentity);
    }

    private LinkedServiceKustoArgs() {}

    private LinkedServiceKustoArgs(LinkedServiceKustoArgs $) {
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.kustoDatabaseName = $.kustoDatabaseName;
        this.kustoEndpoint = $.kustoEndpoint;
        this.name = $.name;
        this.parameters = $.parameters;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.tenant = $.tenant;
        this.useManagedIdentity = $.useManagedIdentity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServiceKustoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceKustoArgs $;

        public Builder() {
            $ = new LinkedServiceKustoArgs();
        }

        public Builder(LinkedServiceKustoArgs defaults) {
            $ = new LinkedServiceKustoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(Output<String> dataFactoryId) {
            $.dataFactoryId = dataFactoryId;
            return this;
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(String dataFactoryId) {
            return dataFactoryId(Output.of(dataFactoryId));
        }

        /**
         * @param description The description for the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(@Nullable Output<String> integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(String integrationRuntimeName) {
            return integrationRuntimeName(Output.of(integrationRuntimeName));
        }

        /**
         * @param kustoDatabaseName The Kusto Database Name.
         * 
         * @return builder
         * 
         */
        public Builder kustoDatabaseName(Output<String> kustoDatabaseName) {
            $.kustoDatabaseName = kustoDatabaseName;
            return this;
        }

        /**
         * @param kustoDatabaseName The Kusto Database Name.
         * 
         * @return builder
         * 
         */
        public Builder kustoDatabaseName(String kustoDatabaseName) {
            return kustoDatabaseName(Output.of(kustoDatabaseName));
        }

        /**
         * @param kustoEndpoint The URI of the Kusto Cluster endpoint.
         * 
         * @return builder
         * 
         */
        public Builder kustoEndpoint(Output<String> kustoEndpoint) {
            $.kustoEndpoint = kustoEndpoint;
            return this;
        }

        /**
         * @param kustoEndpoint The URI of the Kusto Cluster endpoint.
         * 
         * @return builder
         * 
         */
        public Builder kustoEndpoint(String kustoEndpoint) {
            return kustoEndpoint(Output.of(kustoEndpoint));
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
         * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service. Changing this forces a new resource to be created. Must be unique within a data
         * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param servicePrincipalId The service principal id in which to authenticate against the Kusto Database.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(@Nullable Output<String> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        /**
         * @param servicePrincipalId The service principal id in which to authenticate against the Kusto Database.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalId(String servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        /**
         * @param servicePrincipalKey The service principal key in which to authenticate against the Kusto Database.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(@Nullable Output<String> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        /**
         * @param servicePrincipalKey The service principal key in which to authenticate against the Kusto Database.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalKey(String servicePrincipalKey) {
            return servicePrincipalKey(Output.of(servicePrincipalKey));
        }

        /**
         * @param tenant The service principal tenant id or name in which to authenticate against the Kusto Database.
         * 
         * @return builder
         * 
         */
        public Builder tenant(@Nullable Output<String> tenant) {
            $.tenant = tenant;
            return this;
        }

        /**
         * @param tenant The service principal tenant id or name in which to authenticate against the Kusto Database.
         * 
         * @return builder
         * 
         */
        public Builder tenant(String tenant) {
            return tenant(Output.of(tenant));
        }

        /**
         * @param useManagedIdentity Whether to use the Data Factory&#39;s managed identity to authenticate against the Kusto Database.
         * 
         * @return builder
         * 
         */
        public Builder useManagedIdentity(@Nullable Output<Boolean> useManagedIdentity) {
            $.useManagedIdentity = useManagedIdentity;
            return this;
        }

        /**
         * @param useManagedIdentity Whether to use the Data Factory&#39;s managed identity to authenticate against the Kusto Database.
         * 
         * @return builder
         * 
         */
        public Builder useManagedIdentity(Boolean useManagedIdentity) {
            return useManagedIdentity(Output.of(useManagedIdentity));
        }

        public LinkedServiceKustoArgs build() {
            $.dataFactoryId = Objects.requireNonNull($.dataFactoryId, "expected parameter 'dataFactoryId' to be non-null");
            $.kustoDatabaseName = Objects.requireNonNull($.kustoDatabaseName, "expected parameter 'kustoDatabaseName' to be non-null");
            $.kustoEndpoint = Objects.requireNonNull($.kustoEndpoint, "expected parameter 'kustoEndpoint' to be non-null");
            return $;
        }
    }

}
