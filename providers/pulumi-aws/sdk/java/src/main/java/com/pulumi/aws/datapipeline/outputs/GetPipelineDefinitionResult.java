// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline.outputs;

import com.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionParameterObject;
import com.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionParameterValue;
import com.pulumi.aws.datapipeline.outputs.GetPipelineDefinitionPipelineObject;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetPipelineDefinitionResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Parameter objects used in the pipeline definition. See below
     * 
     */
    private final List<GetPipelineDefinitionParameterObject> parameterObjects;
    /**
     * @return Parameter values used in the pipeline definition. See below
     * 
     */
    private final @Nullable List<GetPipelineDefinitionParameterValue> parameterValues;
    private final String pipelineId;
    /**
     * @return Objects defined in the pipeline. See below
     * 
     */
    private final List<GetPipelineDefinitionPipelineObject> pipelineObjects;

    @CustomType.Constructor
    private GetPipelineDefinitionResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("parameterObjects") List<GetPipelineDefinitionParameterObject> parameterObjects,
        @CustomType.Parameter("parameterValues") @Nullable List<GetPipelineDefinitionParameterValue> parameterValues,
        @CustomType.Parameter("pipelineId") String pipelineId,
        @CustomType.Parameter("pipelineObjects") List<GetPipelineDefinitionPipelineObject> pipelineObjects) {
        this.id = id;
        this.parameterObjects = parameterObjects;
        this.parameterValues = parameterValues;
        this.pipelineId = pipelineId;
        this.pipelineObjects = pipelineObjects;
    }

    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Parameter objects used in the pipeline definition. See below
     * 
     */
    public List<GetPipelineDefinitionParameterObject> parameterObjects() {
        return this.parameterObjects;
    }
    /**
     * @return Parameter values used in the pipeline definition. See below
     * 
     */
    public List<GetPipelineDefinitionParameterValue> parameterValues() {
        return this.parameterValues == null ? List.of() : this.parameterValues;
    }
    public String pipelineId() {
        return this.pipelineId;
    }
    /**
     * @return Objects defined in the pipeline. See below
     * 
     */
    public List<GetPipelineDefinitionPipelineObject> pipelineObjects() {
        return this.pipelineObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<GetPipelineDefinitionParameterObject> parameterObjects;
        private @Nullable List<GetPipelineDefinitionParameterValue> parameterValues;
        private String pipelineId;
        private List<GetPipelineDefinitionPipelineObject> pipelineObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parameterObjects = defaults.parameterObjects;
    	      this.parameterValues = defaults.parameterValues;
    	      this.pipelineId = defaults.pipelineId;
    	      this.pipelineObjects = defaults.pipelineObjects;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder parameterObjects(List<GetPipelineDefinitionParameterObject> parameterObjects) {
            this.parameterObjects = Objects.requireNonNull(parameterObjects);
            return this;
        }
        public Builder parameterObjects(GetPipelineDefinitionParameterObject... parameterObjects) {
            return parameterObjects(List.of(parameterObjects));
        }
        public Builder parameterValues(@Nullable List<GetPipelineDefinitionParameterValue> parameterValues) {
            this.parameterValues = parameterValues;
            return this;
        }
        public Builder parameterValues(GetPipelineDefinitionParameterValue... parameterValues) {
            return parameterValues(List.of(parameterValues));
        }
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = Objects.requireNonNull(pipelineId);
            return this;
        }
        public Builder pipelineObjects(List<GetPipelineDefinitionPipelineObject> pipelineObjects) {
            this.pipelineObjects = Objects.requireNonNull(pipelineObjects);
            return this;
        }
        public Builder pipelineObjects(GetPipelineDefinitionPipelineObject... pipelineObjects) {
            return pipelineObjects(List.of(pipelineObjects));
        }        public GetPipelineDefinitionResult build() {
            return new GetPipelineDefinitionResult(id, parameterObjects, parameterValues, pipelineId, pipelineObjects);
        }
    }
}
