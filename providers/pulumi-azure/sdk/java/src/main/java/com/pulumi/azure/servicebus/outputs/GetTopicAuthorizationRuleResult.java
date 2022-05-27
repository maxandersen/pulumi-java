// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTopicAuthorizationRuleResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Boolean listen;
    private final Boolean manage;
    private final String name;
    private final @Nullable String namespaceName;
    /**
     * @return The Primary Connection String for the ServiceBus Topic authorization Rule.
     * 
     */
    private final String primaryConnectionString;
    /**
     * @return The alias Primary Connection String for the ServiceBus Namespace, if the namespace is Geo DR paired.
     * 
     */
    private final String primaryConnectionStringAlias;
    /**
     * @return The Primary Key for the ServiceBus Topic authorization Rule.
     * 
     */
    private final String primaryKey;
    private final @Nullable String queueName;
    private final @Nullable String resourceGroupName;
    /**
     * @return The Secondary Connection String for the ServiceBus Topic authorization Rule.
     * 
     */
    private final String secondaryConnectionString;
    /**
     * @return The alias Secondary Connection String for the ServiceBus Namespace
     * 
     */
    private final String secondaryConnectionStringAlias;
    /**
     * @return The Secondary Key for the ServiceBus Topic authorization Rule.
     * 
     */
    private final String secondaryKey;
    private final Boolean send;
    private final @Nullable String topicId;
    private final @Nullable String topicName;

    @CustomType.Constructor
    private GetTopicAuthorizationRuleResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("listen") Boolean listen,
        @CustomType.Parameter("manage") Boolean manage,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespaceName") @Nullable String namespaceName,
        @CustomType.Parameter("primaryConnectionString") String primaryConnectionString,
        @CustomType.Parameter("primaryConnectionStringAlias") String primaryConnectionStringAlias,
        @CustomType.Parameter("primaryKey") String primaryKey,
        @CustomType.Parameter("queueName") @Nullable String queueName,
        @CustomType.Parameter("resourceGroupName") @Nullable String resourceGroupName,
        @CustomType.Parameter("secondaryConnectionString") String secondaryConnectionString,
        @CustomType.Parameter("secondaryConnectionStringAlias") String secondaryConnectionStringAlias,
        @CustomType.Parameter("secondaryKey") String secondaryKey,
        @CustomType.Parameter("send") Boolean send,
        @CustomType.Parameter("topicId") @Nullable String topicId,
        @CustomType.Parameter("topicName") @Nullable String topicName) {
        this.id = id;
        this.listen = listen;
        this.manage = manage;
        this.name = name;
        this.namespaceName = namespaceName;
        this.primaryConnectionString = primaryConnectionString;
        this.primaryConnectionStringAlias = primaryConnectionStringAlias;
        this.primaryKey = primaryKey;
        this.queueName = queueName;
        this.resourceGroupName = resourceGroupName;
        this.secondaryConnectionString = secondaryConnectionString;
        this.secondaryConnectionStringAlias = secondaryConnectionStringAlias;
        this.secondaryKey = secondaryKey;
        this.send = send;
        this.topicId = topicId;
        this.topicName = topicName;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Boolean listen() {
        return this.listen;
    }
    public Boolean manage() {
        return this.manage;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }
    /**
     * @return The Primary Connection String for the ServiceBus Topic authorization Rule.
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
     * @return The Primary Key for the ServiceBus Topic authorization Rule.
     * 
     */
    public String primaryKey() {
        return this.primaryKey;
    }
    public Optional<String> queueName() {
        return Optional.ofNullable(this.queueName);
    }
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * @return The Secondary Connection String for the ServiceBus Topic authorization Rule.
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
     * @return The Secondary Key for the ServiceBus Topic authorization Rule.
     * 
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }
    public Boolean send() {
        return this.send;
    }
    public Optional<String> topicId() {
        return Optional.ofNullable(this.topicId);
    }
    public Optional<String> topicName() {
        return Optional.ofNullable(this.topicName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicAuthorizationRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Boolean listen;
        private Boolean manage;
        private String name;
        private @Nullable String namespaceName;
        private String primaryConnectionString;
        private String primaryConnectionStringAlias;
        private String primaryKey;
        private @Nullable String queueName;
        private @Nullable String resourceGroupName;
        private String secondaryConnectionString;
        private String secondaryConnectionStringAlias;
        private String secondaryKey;
        private Boolean send;
        private @Nullable String topicId;
        private @Nullable String topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicAuthorizationRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.listen = defaults.listen;
    	      this.manage = defaults.manage;
    	      this.name = defaults.name;
    	      this.namespaceName = defaults.namespaceName;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.primaryConnectionStringAlias = defaults.primaryConnectionStringAlias;
    	      this.primaryKey = defaults.primaryKey;
    	      this.queueName = defaults.queueName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.secondaryConnectionStringAlias = defaults.secondaryConnectionStringAlias;
    	      this.secondaryKey = defaults.secondaryKey;
    	      this.send = defaults.send;
    	      this.topicId = defaults.topicId;
    	      this.topicName = defaults.topicName;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder listen(Boolean listen) {
            this.listen = Objects.requireNonNull(listen);
            return this;
        }
        public Builder manage(Boolean manage) {
            this.manage = Objects.requireNonNull(manage);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
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
        public Builder queueName(@Nullable String queueName) {
            this.queueName = queueName;
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
        }
        public Builder send(Boolean send) {
            this.send = Objects.requireNonNull(send);
            return this;
        }
        public Builder topicId(@Nullable String topicId) {
            this.topicId = topicId;
            return this;
        }
        public Builder topicName(@Nullable String topicName) {
            this.topicName = topicName;
            return this;
        }        public GetTopicAuthorizationRuleResult build() {
            return new GetTopicAuthorizationRuleResult(id, listen, manage, name, namespaceName, primaryConnectionString, primaryConnectionStringAlias, primaryKey, queueName, resourceGroupName, secondaryConnectionString, secondaryConnectionStringAlias, secondaryKey, send, topicId, topicName);
        }
    }
}
