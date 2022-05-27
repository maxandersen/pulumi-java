// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNamespaceAuthorizationRuleResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final @Nullable String namespaceId;
    private final @Nullable String namespaceName;
    /**
     * @return The primary connection string for the authorization rule.
     * 
     */
    private final String primaryConnectionString;
    /**
     * @return The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
     * 
     */
    private final String primaryConnectionStringAlias;
    /**
     * @return The primary access key for the authorization rule.
     * 
     */
    private final String primaryKey;
    private final @Nullable String resourceGroupName;
    /**
     * @return The secondary connection string for the authorization rule.
     * 
     */
    private final String secondaryConnectionString;
    /**
     * @return The alias Secondary Connection String for the ServiceBus Namespace
     * 
     */
    private final String secondaryConnectionStringAlias;
    /**
     * @return The secondary access key for the authorization rule.
     * 
     */
    private final String secondaryKey;

    @CustomType.Constructor
    private GetNamespaceAuthorizationRuleResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespaceId") @Nullable String namespaceId,
        @CustomType.Parameter("namespaceName") @Nullable String namespaceName,
        @CustomType.Parameter("primaryConnectionString") String primaryConnectionString,
        @CustomType.Parameter("primaryConnectionStringAlias") String primaryConnectionStringAlias,
        @CustomType.Parameter("primaryKey") String primaryKey,
        @CustomType.Parameter("resourceGroupName") @Nullable String resourceGroupName,
        @CustomType.Parameter("secondaryConnectionString") String secondaryConnectionString,
        @CustomType.Parameter("secondaryConnectionStringAlias") String secondaryConnectionStringAlias,
        @CustomType.Parameter("secondaryKey") String secondaryKey) {
        this.id = id;
        this.name = name;
        this.namespaceId = namespaceId;
        this.namespaceName = namespaceName;
        this.primaryConnectionString = primaryConnectionString;
        this.primaryConnectionStringAlias = primaryConnectionStringAlias;
        this.primaryKey = primaryKey;
        this.resourceGroupName = resourceGroupName;
        this.secondaryConnectionString = secondaryConnectionString;
        this.secondaryConnectionStringAlias = secondaryConnectionStringAlias;
        this.secondaryKey = secondaryKey;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }
    public Optional<String> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }
    /**
     * @return The primary connection string for the authorization rule.
     * 
     */
    public String primaryConnectionString() {
        return this.primaryConnectionString;
    }
    /**
     * @return The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
     * 
     */
    public String primaryConnectionStringAlias() {
        return this.primaryConnectionStringAlias;
    }
    /**
     * @return The primary access key for the authorization rule.
     * 
     */
    public String primaryKey() {
        return this.primaryKey;
    }
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return The secondary connection string for the authorization rule.
     * 
     */
    public String secondaryConnectionString() {
        return this.secondaryConnectionString;
    }
    /**
     * @return The alias Secondary Connection String for the ServiceBus Namespace
     * 
     */
    public String secondaryConnectionStringAlias() {
        return this.secondaryConnectionStringAlias;
    }
    /**
     * @return The secondary access key for the authorization rule.
     * 
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceAuthorizationRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable String namespaceId;
        private @Nullable String namespaceName;
        private String primaryConnectionString;
        private String primaryConnectionStringAlias;
        private String primaryKey;
        private @Nullable String resourceGroupName;
        private String secondaryConnectionString;
        private String secondaryConnectionStringAlias;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceAuthorizationRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namespaceId = defaults.namespaceId;
    	      this.namespaceName = defaults.namespaceName;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.primaryConnectionStringAlias = defaults.primaryConnectionStringAlias;
    	      this.primaryKey = defaults.primaryKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.secondaryConnectionStringAlias = defaults.secondaryConnectionStringAlias;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespaceId(@Nullable String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public Builder namespaceName(@Nullable String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }
        public Builder primaryConnectionString(String primaryConnectionString) {
            this.primaryConnectionString = Objects.requireNonNull(primaryConnectionString);
            return this;
        }
        public Builder primaryConnectionStringAlias(String primaryConnectionStringAlias) {
            this.primaryConnectionStringAlias = Objects.requireNonNull(primaryConnectionStringAlias);
            return this;
        }
        public Builder primaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public Builder secondaryConnectionString(String secondaryConnectionString) {
            this.secondaryConnectionString = Objects.requireNonNull(secondaryConnectionString);
            return this;
        }
        public Builder secondaryConnectionStringAlias(String secondaryConnectionStringAlias) {
            this.secondaryConnectionStringAlias = Objects.requireNonNull(secondaryConnectionStringAlias);
            return this;
        }
        public Builder secondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }        public GetNamespaceAuthorizationRuleResult build() {
            return new GetNamespaceAuthorizationRuleResult(id, name, namespaceId, namespaceName, primaryConnectionString, primaryConnectionStringAlias, primaryKey, resourceGroupName, secondaryConnectionString, secondaryConnectionStringAlias, secondaryKey);
        }
    }
}
