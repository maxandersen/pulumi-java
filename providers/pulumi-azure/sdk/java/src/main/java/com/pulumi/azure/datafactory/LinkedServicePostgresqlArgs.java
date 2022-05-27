// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinkedServicePostgresqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinkedServicePostgresqlArgs Empty = new LinkedServicePostgresqlArgs();

    /**
     * A map of additional properties to associate with the Data Factory Linked Service PostgreSQL.
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service PostgreSQL.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Data Factory Linked Service PostgreSQL.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service PostgreSQL.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The connection string in which to authenticate with PostgreSQL.
     * 
     */
    @Import(name="connectionString", required=true)
    private Output<String> connectionString;

    /**
     * @return The connection string in which to authenticate with PostgreSQL.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
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
     * The description for the Data Factory Linked Service PostgreSQL.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Linked Service PostgreSQL.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The integration runtime reference to associate with the Data Factory Linked Service PostgreSQL.
     * 
     */
    @Import(name="integrationRuntimeName")
    private @Nullable Output<String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service PostgreSQL.
     * 
     */
    public Optional<Output<String>> integrationRuntimeName() {
        return Optional.ofNullable(this.integrationRuntimeName);
    }

    /**
     * Specifies the name of the Data Factory Linked Service PostgreSQL. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service PostgreSQL. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of parameters to associate with the Data Factory Linked Service PostgreSQL.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service PostgreSQL.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private LinkedServicePostgresqlArgs() {}

    private LinkedServicePostgresqlArgs(LinkedServicePostgresqlArgs $) {
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.connectionString = $.connectionString;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.integrationRuntimeName = $.integrationRuntimeName;
        this.name = $.name;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkedServicePostgresqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServicePostgresqlArgs $;

        public Builder() {
            $ = new LinkedServicePostgresqlArgs();
        }

        public Builder(LinkedServicePostgresqlArgs defaults) {
            $ = new LinkedServicePostgresqlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Linked Service PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Linked Service PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param connectionString The connection string in which to authenticate with PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The connection string in which to authenticate with PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
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
         * @param description The description for the Data Factory Linked Service PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Linked Service PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(@Nullable Output<String> integrationRuntimeName) {
            $.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        /**
         * @param integrationRuntimeName The integration runtime reference to associate with the Data Factory Linked Service PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder integrationRuntimeName(String integrationRuntimeName) {
            return integrationRuntimeName(Output.of(integrationRuntimeName));
        }

        /**
         * @param name Specifies the name of the Data Factory Linked Service PostgreSQL. Changing this forces a new resource to be created. Must be unique within a data
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
         * @param name Specifies the name of the Data Factory Linked Service PostgreSQL. Changing this forces a new resource to be created. Must be unique within a data
         * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters A map of parameters to associate with the Data Factory Linked Service PostgreSQL.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        public LinkedServicePostgresqlArgs build() {
            $.connectionString = Objects.requireNonNull($.connectionString, "expected parameter 'connectionString' to be non-null");
            $.dataFactoryId = Objects.requireNonNull($.dataFactoryId, "expected parameter 'dataFactoryId' to be non-null");
            return $;
        }
    }

}
