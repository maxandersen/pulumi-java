// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.inputs;

import com.pulumi.azure.datafactory.inputs.DatasetBinaryAzureBlobStorageLocationArgs;
import com.pulumi.azure.datafactory.inputs.DatasetBinaryCompressionArgs;
import com.pulumi.azure.datafactory.inputs.DatasetBinaryHttpServerLocationArgs;
import com.pulumi.azure.datafactory.inputs.DatasetBinarySftpServerLocationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetBinaryState extends com.pulumi.resources.ResourceArgs {

    public static final DatasetBinaryState Empty = new DatasetBinaryState();

    /**
     * A map of additional properties to associate with the Data Factory Binary Dataset.
     * 
     */
    @Import(name="additionalProperties")
    private @Nullable Output<Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Binary Dataset.
     * 
     */
    public Optional<Output<Map<String,String>>> additionalProperties() {
        return Optional.ofNullable(this.additionalProperties);
    }

    /**
     * List of tags that can be used for describing the Data Factory Binary Dataset.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Binary Dataset.
     * 
     */
    public Optional<Output<List<String>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * A `azure_blob_storage_location` block as defined below.
     * 
     */
    @Import(name="azureBlobStorageLocation")
    private @Nullable Output<DatasetBinaryAzureBlobStorageLocationArgs> azureBlobStorageLocation;

    /**
     * @return A `azure_blob_storage_location` block as defined below.
     * 
     */
    public Optional<Output<DatasetBinaryAzureBlobStorageLocationArgs>> azureBlobStorageLocation() {
        return Optional.ofNullable(this.azureBlobStorageLocation);
    }

    /**
     * A `compression` block as defined below.
     * 
     */
    @Import(name="compression")
    private @Nullable Output<DatasetBinaryCompressionArgs> compression;

    /**
     * @return A `compression` block as defined below.
     * 
     */
    public Optional<Output<DatasetBinaryCompressionArgs>> compression() {
        return Optional.ofNullable(this.compression);
    }

    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Import(name="dataFactoryId")
    private @Nullable Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Optional<Output<String>> dataFactoryId() {
        return Optional.ofNullable(this.dataFactoryId);
    }

    /**
     * The description for the Data Factory Dataset.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the Data Factory Dataset.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    /**
     * @return The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
     * 
     */
    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * A `http_server_location` block as defined below.
     * 
     */
    @Import(name="httpServerLocation")
    private @Nullable Output<DatasetBinaryHttpServerLocationArgs> httpServerLocation;

    /**
     * @return A `http_server_location` block as defined below.
     * 
     */
    public Optional<Output<DatasetBinaryHttpServerLocationArgs>> httpServerLocation() {
        return Optional.ofNullable(this.httpServerLocation);
    }

    /**
     * The Data Factory Linked Service name in which to associate the Binary Dataset with.
     * 
     */
    @Import(name="linkedServiceName")
    private @Nullable Output<String> linkedServiceName;

    /**
     * @return The Data Factory Linked Service name in which to associate the Binary Dataset with.
     * 
     */
    public Optional<Output<String>> linkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }

    /**
     * Specifies the name of the Data Factory Binary Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Binary Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies a list of parameters to associate with the Data Factory Binary Dataset.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,String>> parameters;

    /**
     * @return Specifies a list of parameters to associate with the Data Factory Binary Dataset.
     * 
     */
    public Optional<Output<Map<String,String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * A `sftp_server_location` block as defined below.
     * ---
     * 
     */
    @Import(name="sftpServerLocation")
    private @Nullable Output<DatasetBinarySftpServerLocationArgs> sftpServerLocation;

    /**
     * @return A `sftp_server_location` block as defined below.
     * ---
     * 
     */
    public Optional<Output<DatasetBinarySftpServerLocationArgs>> sftpServerLocation() {
        return Optional.ofNullable(this.sftpServerLocation);
    }

    private DatasetBinaryState() {}

    private DatasetBinaryState(DatasetBinaryState $) {
        this.additionalProperties = $.additionalProperties;
        this.annotations = $.annotations;
        this.azureBlobStorageLocation = $.azureBlobStorageLocation;
        this.compression = $.compression;
        this.dataFactoryId = $.dataFactoryId;
        this.description = $.description;
        this.folder = $.folder;
        this.httpServerLocation = $.httpServerLocation;
        this.linkedServiceName = $.linkedServiceName;
        this.name = $.name;
        this.parameters = $.parameters;
        this.sftpServerLocation = $.sftpServerLocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetBinaryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetBinaryState $;

        public Builder() {
            $ = new DatasetBinaryState();
        }

        public Builder(DatasetBinaryState defaults) {
            $ = new DatasetBinaryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Binary Dataset.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(@Nullable Output<Map<String,String>> additionalProperties) {
            $.additionalProperties = additionalProperties;
            return this;
        }

        /**
         * @param additionalProperties A map of additional properties to associate with the Data Factory Binary Dataset.
         * 
         * @return builder
         * 
         */
        public Builder additionalProperties(Map<String,String> additionalProperties) {
            return additionalProperties(Output.of(additionalProperties));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Binary Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<List<String>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Binary Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(List<String> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param annotations List of tags that can be used for describing the Data Factory Binary Dataset.
         * 
         * @return builder
         * 
         */
        public Builder annotations(String... annotations) {
            return annotations(List.of(annotations));
        }

        /**
         * @param azureBlobStorageLocation A `azure_blob_storage_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorageLocation(@Nullable Output<DatasetBinaryAzureBlobStorageLocationArgs> azureBlobStorageLocation) {
            $.azureBlobStorageLocation = azureBlobStorageLocation;
            return this;
        }

        /**
         * @param azureBlobStorageLocation A `azure_blob_storage_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder azureBlobStorageLocation(DatasetBinaryAzureBlobStorageLocationArgs azureBlobStorageLocation) {
            return azureBlobStorageLocation(Output.of(azureBlobStorageLocation));
        }

        /**
         * @param compression A `compression` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder compression(@Nullable Output<DatasetBinaryCompressionArgs> compression) {
            $.compression = compression;
            return this;
        }

        /**
         * @param compression A `compression` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder compression(DatasetBinaryCompressionArgs compression) {
            return compression(Output.of(compression));
        }

        /**
         * @param dataFactoryId The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
         * 
         * @return builder
         * 
         */
        public Builder dataFactoryId(@Nullable Output<String> dataFactoryId) {
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
         * @param description The description for the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the Data Factory Dataset.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param folder The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The folder that this Dataset is in. If not specified, the Dataset will appear at the root level.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param httpServerLocation A `http_server_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder httpServerLocation(@Nullable Output<DatasetBinaryHttpServerLocationArgs> httpServerLocation) {
            $.httpServerLocation = httpServerLocation;
            return this;
        }

        /**
         * @param httpServerLocation A `http_server_location` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder httpServerLocation(DatasetBinaryHttpServerLocationArgs httpServerLocation) {
            return httpServerLocation(Output.of(httpServerLocation));
        }

        /**
         * @param linkedServiceName The Data Factory Linked Service name in which to associate the Binary Dataset with.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(@Nullable Output<String> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        /**
         * @param linkedServiceName The Data Factory Linked Service name in which to associate the Binary Dataset with.
         * 
         * @return builder
         * 
         */
        public Builder linkedServiceName(String linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        /**
         * @param name Specifies the name of the Data Factory Binary Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Data Factory Binary Dataset. Changing this forces a new resource to be created. Must be globally unique. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters Specifies a list of parameters to associate with the Data Factory Binary Dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Specifies a list of parameters to associate with the Data Factory Binary Dataset.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param sftpServerLocation A `sftp_server_location` block as defined below.
         * ---
         * 
         * @return builder
         * 
         */
        public Builder sftpServerLocation(@Nullable Output<DatasetBinarySftpServerLocationArgs> sftpServerLocation) {
            $.sftpServerLocation = sftpServerLocation;
            return this;
        }

        /**
         * @param sftpServerLocation A `sftp_server_location` block as defined below.
         * ---
         * 
         * @return builder
         * 
         */
        public Builder sftpServerLocation(DatasetBinarySftpServerLocationArgs sftpServerLocation) {
            return sftpServerLocation(Output.of(sftpServerLocation));
        }

        public DatasetBinaryState build() {
            return $;
        }
    }

}
