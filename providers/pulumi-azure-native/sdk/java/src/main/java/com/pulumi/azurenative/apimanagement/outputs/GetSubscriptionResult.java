// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSubscriptionResult {
    /**
     * Determines whether tracing is enabled
     * 
     */
    private final @Nullable Boolean allowTracing;
    /**
     * Subscription creation date. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    private final String createdDate;
    /**
     * The name of the subscription, or null if the subscription has no name.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Date when subscription was cancelled or expired. The setting is for audit purposes only and the subscription is not automatically cancelled. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    private final @Nullable String endDate;
    /**
     * Subscription expiration date. The setting is for audit purposes only and the subscription is not automatically expired. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    private final @Nullable String expirationDate;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Upcoming subscription expiration notification date. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    private final @Nullable String notificationDate;
    /**
     * The user resource identifier of the subscription owner. The value is a valid relative URL in the format of /users/{userId} where {userId} is a user identifier.
     * 
     */
    private final @Nullable String ownerId;
    /**
     * Subscription primary key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    private final @Nullable String primaryKey;
    /**
     * Scope like /products/{productId} or /apis or /apis/{apiId}.
     * 
     */
    private final String scope;
    /**
     * Subscription secondary key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
     */
    private final @Nullable String secondaryKey;
    /**
     * Subscription activation date. The setting is for audit purposes only and the subscription is not automatically activated. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    private final @Nullable String startDate;
    /**
     * Subscription state. Possible states are * active – the subscription is active, * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated.
     * 
     */
    private final String state;
    /**
     * Optional subscription comment added by an administrator when the state is changed to the 'rejected'.
     * 
     */
    private final @Nullable String stateComment;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetSubscriptionResult(
        @CustomType.Parameter("allowTracing") @Nullable Boolean allowTracing,
        @CustomType.Parameter("createdDate") String createdDate,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("endDate") @Nullable String endDate,
        @CustomType.Parameter("expirationDate") @Nullable String expirationDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notificationDate") @Nullable String notificationDate,
        @CustomType.Parameter("ownerId") @Nullable String ownerId,
        @CustomType.Parameter("primaryKey") @Nullable String primaryKey,
        @CustomType.Parameter("scope") String scope,
        @CustomType.Parameter("secondaryKey") @Nullable String secondaryKey,
        @CustomType.Parameter("startDate") @Nullable String startDate,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateComment") @Nullable String stateComment,
        @CustomType.Parameter("type") String type) {
        this.allowTracing = allowTracing;
        this.createdDate = createdDate;
        this.displayName = displayName;
        this.endDate = endDate;
        this.expirationDate = expirationDate;
        this.id = id;
        this.name = name;
        this.notificationDate = notificationDate;
        this.ownerId = ownerId;
        this.primaryKey = primaryKey;
        this.scope = scope;
        this.secondaryKey = secondaryKey;
        this.startDate = startDate;
        this.state = state;
        this.stateComment = stateComment;
        this.type = type;
    }

    /**
     * Determines whether tracing is enabled
     * 
    */
    public Optional<Boolean> allowTracing() {
        return Optional.ofNullable(this.allowTracing);
    }
    /**
     * Subscription creation date. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
    */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * The name of the subscription, or null if the subscription has no name.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Date when subscription was cancelled or expired. The setting is for audit purposes only and the subscription is not automatically cancelled. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
    */
    public Optional<String> endDate() {
        return Optional.ofNullable(this.endDate);
    }
    /**
     * Subscription expiration date. The setting is for audit purposes only and the subscription is not automatically expired. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
    */
    public Optional<String> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Upcoming subscription expiration notification date. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
    */
    public Optional<String> notificationDate() {
        return Optional.ofNullable(this.notificationDate);
    }
    /**
     * The user resource identifier of the subscription owner. The value is a valid relative URL in the format of /users/{userId} where {userId} is a user identifier.
     * 
    */
    public Optional<String> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }
    /**
     * Subscription primary key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
    */
    public Optional<String> primaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    /**
     * Scope like /products/{productId} or /apis or /apis/{apiId}.
     * 
    */
    public String scope() {
        return this.scope;
    }
    /**
     * Subscription secondary key. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get the value.
     * 
    */
    public Optional<String> secondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }
    /**
     * Subscription activation date. The setting is for audit purposes only and the subscription is not automatically activated. The subscription lifecycle can be managed by using the `state` property. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
    */
    public Optional<String> startDate() {
        return Optional.ofNullable(this.startDate);
    }
    /**
     * Subscription state. Possible states are * active – the subscription is active, * suspended – the subscription is blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator, * expired – the subscription reached its expiration date and was deactivated.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Optional subscription comment added by an administrator when the state is changed to the 'rejected'.
     * 
    */
    public Optional<String> stateComment() {
        return Optional.ofNullable(this.stateComment);
    }
    /**
     * Resource type for API Management resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowTracing;
        private String createdDate;
        private @Nullable String displayName;
        private @Nullable String endDate;
        private @Nullable String expirationDate;
        private String id;
        private String name;
        private @Nullable String notificationDate;
        private @Nullable String ownerId;
        private @Nullable String primaryKey;
        private String scope;
        private @Nullable String secondaryKey;
        private @Nullable String startDate;
        private String state;
        private @Nullable String stateComment;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTracing = defaults.allowTracing;
    	      this.createdDate = defaults.createdDate;
    	      this.displayName = defaults.displayName;
    	      this.endDate = defaults.endDate;
    	      this.expirationDate = defaults.expirationDate;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.notificationDate = defaults.notificationDate;
    	      this.ownerId = defaults.ownerId;
    	      this.primaryKey = defaults.primaryKey;
    	      this.scope = defaults.scope;
    	      this.secondaryKey = defaults.secondaryKey;
    	      this.startDate = defaults.startDate;
    	      this.state = defaults.state;
    	      this.stateComment = defaults.stateComment;
    	      this.type = defaults.type;
        }

        public Builder allowTracing(@Nullable Boolean allowTracing) {
            this.allowTracing = allowTracing;
            return this;
        }
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder endDate(@Nullable String endDate) {
            this.endDate = endDate;
            return this;
        }
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
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
        public Builder notificationDate(@Nullable String notificationDate) {
            this.notificationDate = notificationDate;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }
        public Builder startDate(@Nullable String startDate) {
            this.startDate = startDate;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateComment(@Nullable String stateComment) {
            this.stateComment = stateComment;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetSubscriptionResult build() {
            return new GetSubscriptionResult(allowTracing, createdDate, displayName, endDate, expirationDate, id, name, notificationDate, ownerId, primaryKey, scope, secondaryKey, startDate, state, stateComment, type);
        }
    }
}
