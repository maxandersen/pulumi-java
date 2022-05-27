// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainInputMappingDefaultValues {
    /**
     * @return Specifies the default data version of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String dataVersion;
    /**
     * @return Specifies the default event type of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String eventType;
    /**
     * @return Specifies the default subject of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String subject;

    @CustomType.Constructor
    private DomainInputMappingDefaultValues(
        @CustomType.Parameter("dataVersion") @Nullable String dataVersion,
        @CustomType.Parameter("eventType") @Nullable String eventType,
        @CustomType.Parameter("subject") @Nullable String subject) {
        this.dataVersion = dataVersion;
        this.eventType = eventType;
        this.subject = subject;
    }

    /**
     * @return Specifies the default data version of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> dataVersion() {
        return Optional.ofNullable(this.dataVersion);
    }
    /**
     * @return Specifies the default event type of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> eventType() {
        return Optional.ofNullable(this.eventType);
    }
    /**
     * @return Specifies the default subject of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    public Optional<String> subject() {
        return Optional.ofNullable(this.subject);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainInputMappingDefaultValues defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataVersion;
        private @Nullable String eventType;
        private @Nullable String subject;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainInputMappingDefaultValues defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataVersion = defaults.dataVersion;
    	      this.eventType = defaults.eventType;
    	      this.subject = defaults.subject;
        }

        public Builder dataVersion(@Nullable String dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public Builder eventType(@Nullable String eventType) {
            this.eventType = eventType;
            return this;
        }
        public Builder subject(@Nullable String subject) {
            this.subject = subject;
            return this;
        }        public DomainInputMappingDefaultValues build() {
            return new DomainInputMappingDefaultValues(dataVersion, eventType, subject);
        }
    }
}
