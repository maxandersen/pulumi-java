// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Template used to bootstrap the pipeline.
 * 
 */
public final class PipelineTemplateResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelineTemplateResponse Empty = new PipelineTemplateResponse();

    /**
     * Unique identifier of the pipeline template.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Dictionary of input parameters used in the pipeline template.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,String> parameters;

    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    public PipelineTemplateResponse(
        String id,
        @Nullable Map<String,String> parameters) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.parameters = parameters;
    }

    private PipelineTemplateResponse() {
        this.id = null;
        this.parameters = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable Map<String,String> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.parameters = defaults.parameters;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }        public PipelineTemplateResponse build() {
            return new PipelineTemplateResponse(id, parameters);
        }
    }
}
