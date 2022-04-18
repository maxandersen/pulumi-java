// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.SourcePropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a source based trigger.
 * 
 */
public final class SourceTriggerResponse extends com.pulumi.resources.InvokeArgs {

    public static final SourceTriggerResponse Empty = new SourceTriggerResponse();

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The properties that describes the source(code) for the task.
     * 
     */
    @Import(name="sourceRepository", required=true)
      private final SourcePropertiesResponse sourceRepository;

    public SourcePropertiesResponse sourceRepository() {
        return this.sourceRepository;
    }

    /**
     * The source event corresponding to the trigger.
     * 
     */
    @Import(name="sourceTriggerEvents", required=true)
      private final List<String> sourceTriggerEvents;

    public List<String> sourceTriggerEvents() {
        return this.sourceTriggerEvents;
    }

    /**
     * The current status of trigger.
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public SourceTriggerResponse(
        String name,
        SourcePropertiesResponse sourceRepository,
        List<String> sourceTriggerEvents,
        @Nullable String status) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sourceRepository = Objects.requireNonNull(sourceRepository, "expected parameter 'sourceRepository' to be non-null");
        this.sourceTriggerEvents = Objects.requireNonNull(sourceTriggerEvents, "expected parameter 'sourceTriggerEvents' to be non-null");
        this.status = status == null ? "Enabled" : status;
    }

    private SourceTriggerResponse() {
        this.name = null;
        this.sourceRepository = null;
        this.sourceTriggerEvents = List.of();
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private SourcePropertiesResponse sourceRepository;
        private List<String> sourceTriggerEvents;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sourceRepository = defaults.sourceRepository;
    	      this.sourceTriggerEvents = defaults.sourceTriggerEvents;
    	      this.status = defaults.status;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sourceRepository(SourcePropertiesResponse sourceRepository) {
            this.sourceRepository = Objects.requireNonNull(sourceRepository);
            return this;
        }
        public Builder sourceTriggerEvents(List<String> sourceTriggerEvents) {
            this.sourceTriggerEvents = Objects.requireNonNull(sourceTriggerEvents);
            return this;
        }
        public Builder sourceTriggerEvents(String... sourceTriggerEvents) {
            return sourceTriggerEvents(List.of(sourceTriggerEvents));
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public SourceTriggerResponse build() {
            return new SourceTriggerResponse(name, sourceRepository, sourceTriggerEvents, status);
        }
    }
}
