// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybriddata;

import com.pulumi.azurenative.hybriddata.enums.State;
import com.pulumi.azurenative.hybriddata.inputs.CustomerSecretArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataStoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataStoreArgs Empty = new DataStoreArgs();

    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    @Import(name="customerSecrets")
    private @Nullable Output<List<CustomerSecretArgs>> customerSecrets;

    public Optional<Output<List<CustomerSecretArgs>>> customerSecrets() {
        return Optional.ofNullable(this.customerSecrets);
    }

    /**
     * The name of the DataManager Resource within the specified resource group. DataManager names must be between 3 and 24 characters in length and use any alphanumeric and underscore only
     * 
     */
    @Import(name="dataManagerName", required=true)
    private Output<String> dataManagerName;

    public Output<String> dataManagerName() {
        return this.dataManagerName;
    }

    /**
     * The data store/repository name to be created or updated.
     * 
     */
    @Import(name="dataStoreName")
    private @Nullable Output<String> dataStoreName;

    public Optional<Output<String>> dataStoreName() {
        return Optional.ofNullable(this.dataStoreName);
    }

    /**
     * The arm id of the data store type.
     * 
     */
    @Import(name="dataStoreTypeId", required=true)
    private Output<String> dataStoreTypeId;

    public Output<String> dataStoreTypeId() {
        return this.dataStoreTypeId;
    }

    /**
     * A generic json used differently by each data source type.
     * 
     */
    @Import(name="extendedProperties")
    private @Nullable Output<Object> extendedProperties;

    public Optional<Output<Object>> extendedProperties() {
        return Optional.ofNullable(this.extendedProperties);
    }

    /**
     * Arm Id for the manager resource to which the data source is associated. This is optional.
     * 
     */
    @Import(name="repositoryId")
    private @Nullable Output<String> repositoryId;

    public Optional<Output<String>> repositoryId() {
        return Optional.ofNullable(this.repositoryId);
    }

    /**
     * The Resource Group Name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * State of the data source.
     * 
     */
    @Import(name="state", required=true)
    private Output<State> state;

    public Output<State> state() {
        return this.state;
    }

    private DataStoreArgs() {}

    private DataStoreArgs(DataStoreArgs $) {
        this.customerSecrets = $.customerSecrets;
        this.dataManagerName = $.dataManagerName;
        this.dataStoreName = $.dataStoreName;
        this.dataStoreTypeId = $.dataStoreTypeId;
        this.extendedProperties = $.extendedProperties;
        this.repositoryId = $.repositoryId;
        this.resourceGroupName = $.resourceGroupName;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataStoreArgs $;

        public Builder() {
            $ = new DataStoreArgs();
        }

        public Builder(DataStoreArgs defaults) {
            $ = new DataStoreArgs(Objects.requireNonNull(defaults));
        }

        public Builder customerSecrets(@Nullable Output<List<CustomerSecretArgs>> customerSecrets) {
            $.customerSecrets = customerSecrets;
            return this;
        }

        public Builder customerSecrets(List<CustomerSecretArgs> customerSecrets) {
            return customerSecrets(Output.of(customerSecrets));
        }

        public Builder customerSecrets(CustomerSecretArgs... customerSecrets) {
            return customerSecrets(List.of(customerSecrets));
        }

        public Builder dataManagerName(Output<String> dataManagerName) {
            $.dataManagerName = dataManagerName;
            return this;
        }

        public Builder dataManagerName(String dataManagerName) {
            return dataManagerName(Output.of(dataManagerName));
        }

        public Builder dataStoreName(@Nullable Output<String> dataStoreName) {
            $.dataStoreName = dataStoreName;
            return this;
        }

        public Builder dataStoreName(String dataStoreName) {
            return dataStoreName(Output.of(dataStoreName));
        }

        public Builder dataStoreTypeId(Output<String> dataStoreTypeId) {
            $.dataStoreTypeId = dataStoreTypeId;
            return this;
        }

        public Builder dataStoreTypeId(String dataStoreTypeId) {
            return dataStoreTypeId(Output.of(dataStoreTypeId));
        }

        public Builder extendedProperties(@Nullable Output<Object> extendedProperties) {
            $.extendedProperties = extendedProperties;
            return this;
        }

        public Builder extendedProperties(Object extendedProperties) {
            return extendedProperties(Output.of(extendedProperties));
        }

        public Builder repositoryId(@Nullable Output<String> repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        public Builder repositoryId(String repositoryId) {
            return repositoryId(Output.of(repositoryId));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder state(Output<State> state) {
            $.state = state;
            return this;
        }

        public Builder state(State state) {
            return state(Output.of(state));
        }

        public DataStoreArgs build() {
            $.dataManagerName = Objects.requireNonNull($.dataManagerName, "expected parameter 'dataManagerName' to be non-null");
            $.dataStoreTypeId = Objects.requireNonNull($.dataStoreTypeId, "expected parameter 'dataStoreTypeId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
