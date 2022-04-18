// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appintegrations.outputs;

import com.pulumi.awsnative.appintegrations.outputs.EventIntegrationMetadata;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventIntegrationAssociation {
    /**
     * The metadata associated with the client.
     * 
     */
    private final @Nullable List<EventIntegrationMetadata> clientAssociationMetadata;
    /**
     * The identifier for the client that is associated with the event integration.
     * 
     */
    private final @Nullable String clientId;
    /**
     * The name of the Eventbridge rule.
     * 
     */
    private final @Nullable String eventBridgeRuleName;
    /**
     * The Amazon Resource Name (ARN) for the event integration association.
     * 
     */
    private final @Nullable String eventIntegrationAssociationArn;
    /**
     * The identifier for the event integration association.
     * 
     */
    private final @Nullable String eventIntegrationAssociationId;

    @CustomType.Constructor
    private EventIntegrationAssociation(
        @CustomType.Parameter("clientAssociationMetadata") @Nullable List<EventIntegrationMetadata> clientAssociationMetadata,
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("eventBridgeRuleName") @Nullable String eventBridgeRuleName,
        @CustomType.Parameter("eventIntegrationAssociationArn") @Nullable String eventIntegrationAssociationArn,
        @CustomType.Parameter("eventIntegrationAssociationId") @Nullable String eventIntegrationAssociationId) {
        this.clientAssociationMetadata = clientAssociationMetadata;
        this.clientId = clientId;
        this.eventBridgeRuleName = eventBridgeRuleName;
        this.eventIntegrationAssociationArn = eventIntegrationAssociationArn;
        this.eventIntegrationAssociationId = eventIntegrationAssociationId;
    }

    /**
     * The metadata associated with the client.
     * 
    */
    public List<EventIntegrationMetadata> clientAssociationMetadata() {
        return this.clientAssociationMetadata == null ? List.of() : this.clientAssociationMetadata;
    }
    /**
     * The identifier for the client that is associated with the event integration.
     * 
    */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The name of the Eventbridge rule.
     * 
    */
    public Optional<String> eventBridgeRuleName() {
        return Optional.ofNullable(this.eventBridgeRuleName);
    }
    /**
     * The Amazon Resource Name (ARN) for the event integration association.
     * 
    */
    public Optional<String> eventIntegrationAssociationArn() {
        return Optional.ofNullable(this.eventIntegrationAssociationArn);
    }
    /**
     * The identifier for the event integration association.
     * 
    */
    public Optional<String> eventIntegrationAssociationId() {
        return Optional.ofNullable(this.eventIntegrationAssociationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventIntegrationAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EventIntegrationMetadata> clientAssociationMetadata;
        private @Nullable String clientId;
        private @Nullable String eventBridgeRuleName;
        private @Nullable String eventIntegrationAssociationArn;
        private @Nullable String eventIntegrationAssociationId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventIntegrationAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAssociationMetadata = defaults.clientAssociationMetadata;
    	      this.clientId = defaults.clientId;
    	      this.eventBridgeRuleName = defaults.eventBridgeRuleName;
    	      this.eventIntegrationAssociationArn = defaults.eventIntegrationAssociationArn;
    	      this.eventIntegrationAssociationId = defaults.eventIntegrationAssociationId;
        }

        public Builder clientAssociationMetadata(@Nullable List<EventIntegrationMetadata> clientAssociationMetadata) {
            this.clientAssociationMetadata = clientAssociationMetadata;
            return this;
        }
        public Builder clientAssociationMetadata(EventIntegrationMetadata... clientAssociationMetadata) {
            return clientAssociationMetadata(List.of(clientAssociationMetadata));
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder eventBridgeRuleName(@Nullable String eventBridgeRuleName) {
            this.eventBridgeRuleName = eventBridgeRuleName;
            return this;
        }
        public Builder eventIntegrationAssociationArn(@Nullable String eventIntegrationAssociationArn) {
            this.eventIntegrationAssociationArn = eventIntegrationAssociationArn;
            return this;
        }
        public Builder eventIntegrationAssociationId(@Nullable String eventIntegrationAssociationId) {
            this.eventIntegrationAssociationId = eventIntegrationAssociationId;
            return this;
        }        public EventIntegrationAssociation build() {
            return new EventIntegrationAssociation(clientAssociationMetadata, clientId, eventBridgeRuleName, eventIntegrationAssociationArn, eventIntegrationAssociationId);
        }
    }
}
