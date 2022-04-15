// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetComponentLinkedStorageAccountResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Linked storage account resource ID
     * 
     */
    private final @Nullable String linkedStorageAccount;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetComponentLinkedStorageAccountResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("linkedStorageAccount") @Nullable String linkedStorageAccount,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.linkedStorageAccount = linkedStorageAccount;
        this.name = name;
        this.type = type;
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Linked storage account resource ID
     * 
    */
    public Optional<String> linkedStorageAccount() {
        return Optional.ofNullable(this.linkedStorageAccount);
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
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

    public static Builder builder(GetComponentLinkedStorageAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String linkedStorageAccount;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComponentLinkedStorageAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.linkedStorageAccount = defaults.linkedStorageAccount;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder linkedStorageAccount(@Nullable String linkedStorageAccount) {
            this.linkedStorageAccount = linkedStorageAccount;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetComponentLinkedStorageAccountResult build() {
            return new GetComponentLinkedStorageAccountResult(id, linkedStorageAccount, name, type);
        }
    }
}
