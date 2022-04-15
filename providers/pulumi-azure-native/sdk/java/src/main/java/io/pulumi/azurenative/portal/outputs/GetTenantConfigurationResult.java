// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTenantConfigurationResult {
    /**
     * When flag is set to true Markdown tile will require external storage configuration (URI). The inline content configuration will be prohibited.
     * 
     */
    private final @Nullable Boolean enforcePrivateMarkdownStorage;
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
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetTenantConfigurationResult(
        @CustomType.Parameter("enforcePrivateMarkdownStorage") @Nullable Boolean enforcePrivateMarkdownStorage,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.enforcePrivateMarkdownStorage = enforcePrivateMarkdownStorage;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * When flag is set to true Markdown tile will require external storage configuration (URI). The inline content configuration will be prohibited.
     * 
    */
    public Optional<Boolean> enforcePrivateMarkdownStorage() {
        return Optional.ofNullable(this.enforcePrivateMarkdownStorage);
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
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTenantConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enforcePrivateMarkdownStorage;
        private String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTenantConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforcePrivateMarkdownStorage = defaults.enforcePrivateMarkdownStorage;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder enforcePrivateMarkdownStorage(@Nullable Boolean enforcePrivateMarkdownStorage) {
            this.enforcePrivateMarkdownStorage = enforcePrivateMarkdownStorage;
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetTenantConfigurationResult build() {
            return new GetTenantConfigurationResult(enforcePrivateMarkdownStorage, id, name, type);
        }
    }
}
