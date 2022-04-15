// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.PipelineReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExecutePipelineActivityResponse {
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Pipeline parameters.
     * 
     */
    private final @Nullable Map<String,Object> parameters;
    /**
     * Pipeline reference.
     * 
     */
    private final PipelineReferenceResponse pipeline;
    /**
     * Type of activity.
     * Expected value is 'ExecutePipeline'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;
    /**
     * Defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
     * 
     */
    private final @Nullable Boolean waitOnCompletion;

    @CustomType.Constructor
    private ExecutePipelineActivityResponse(
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parameters") @Nullable Map<String,Object> parameters,
        @CustomType.Parameter("pipeline") PipelineReferenceResponse pipeline,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties,
        @CustomType.Parameter("waitOnCompletion") @Nullable Boolean waitOnCompletion) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = name;
        this.parameters = parameters;
        this.pipeline = pipeline;
        this.type = type;
        this.userProperties = userProperties;
        this.waitOnCompletion = waitOnCompletion;
    }

    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Activity name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Pipeline parameters.
     * 
    */
    public Map<String,Object> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Pipeline reference.
     * 
    */
    public PipelineReferenceResponse pipeline() {
        return this.pipeline;
    }
    /**
     * Type of activity.
     * Expected value is 'ExecutePipeline'.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }
    /**
     * Defines whether activity execution will wait for the dependent pipeline execution to finish. Default is false.
     * 
    */
    public Optional<Boolean> waitOnCompletion() {
        return Optional.ofNullable(this.waitOnCompletion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutePipelineActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private String name;
        private @Nullable Map<String,Object> parameters;
        private PipelineReferenceResponse pipeline;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;
        private @Nullable Boolean waitOnCompletion;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutePipelineActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.pipeline = defaults.pipeline;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
    	      this.waitOnCompletion = defaults.waitOnCompletion;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder pipeline(PipelineReferenceResponse pipeline) {
            this.pipeline = Objects.requireNonNull(pipeline);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }
        public Builder waitOnCompletion(@Nullable Boolean waitOnCompletion) {
            this.waitOnCompletion = waitOnCompletion;
            return this;
        }        public ExecutePipelineActivityResponse build() {
            return new ExecutePipelineActivityResponse(dependsOn, description, name, parameters, pipeline, type, userProperties, waitOnCompletion);
        }
    }
}
