// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetLinkedStorageAccountResult {
    /**
     * Linked storage accounts type.
     * 
     */
    private final String dataSourceType;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Linked storage accounts resources ids.
     * 
     */
    private final @Nullable List<String> storageAccountIds;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetLinkedStorageAccountResult(
        @CustomType.Parameter("dataSourceType") String dataSourceType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("storageAccountIds") @Nullable List<String> storageAccountIds,
        @CustomType.Parameter("type") String type) {
        this.dataSourceType = dataSourceType;
        this.id = id;
        this.name = name;
        this.storageAccountIds = storageAccountIds;
        this.type = type;
    }

    /**
     * Linked storage accounts type.
     * 
    */
    public String dataSourceType() {
        return this.dataSourceType;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Linked storage accounts resources ids.
     * 
    */
    public List<String> storageAccountIds() {
        return this.storageAccountIds == null ? List.of() : this.storageAccountIds;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedStorageAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSourceType;
        private String id;
        private String name;
        private @Nullable List<String> storageAccountIds;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedStorageAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceType = defaults.dataSourceType;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.storageAccountIds = defaults.storageAccountIds;
    	      this.type = defaults.type;
        }

        public Builder dataSourceType(String dataSourceType) {
            this.dataSourceType = Objects.requireNonNull(dataSourceType);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder storageAccountIds(@Nullable List<String> storageAccountIds) {
            this.storageAccountIds = storageAccountIds;
            return this;
        }
        public Builder storageAccountIds(String... storageAccountIds) {
            return storageAccountIds(List.of(storageAccountIds));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetLinkedStorageAccountResult build() {
            return new GetLinkedStorageAccountResult(dataSourceType, id, name, storageAccountIds, type);
        }
    }
}
