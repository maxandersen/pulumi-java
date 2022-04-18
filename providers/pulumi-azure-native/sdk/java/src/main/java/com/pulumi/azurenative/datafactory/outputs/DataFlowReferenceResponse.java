// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataFlowReferenceResponse {
    /**
     * Reference data flow parameters from dataset.
     * 
     */
    private final @Nullable Object datasetParameters;
    /**
     * Data flow parameters
     * 
     */
    private final @Nullable Map<String,Object> parameters;
    /**
     * Reference data flow name.
     * 
     */
    private final String referenceName;
    /**
     * Data flow reference type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DataFlowReferenceResponse(
        @CustomType.Parameter("datasetParameters") @Nullable Object datasetParameters,
        @CustomType.Parameter("parameters") @Nullable Map<String,Object> parameters,
        @CustomType.Parameter("referenceName") String referenceName,
        @CustomType.Parameter("type") String type) {
        this.datasetParameters = datasetParameters;
        this.parameters = parameters;
        this.referenceName = referenceName;
        this.type = type;
    }

    /**
     * Reference data flow parameters from dataset.
     * 
    */
    public Optional<Object> datasetParameters() {
        return Optional.ofNullable(this.datasetParameters);
    }
    /**
     * Data flow parameters
     * 
    */
    public Map<String,Object> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Reference data flow name.
     * 
    */
    public String referenceName() {
        return this.referenceName;
    }
    /**
     * Data flow reference type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFlowReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object datasetParameters;
        private @Nullable Map<String,Object> parameters;
        private String referenceName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataFlowReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetParameters = defaults.datasetParameters;
    	      this.parameters = defaults.parameters;
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder datasetParameters(@Nullable Object datasetParameters) {
            this.datasetParameters = datasetParameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder referenceName(String referenceName) {
            this.referenceName = Objects.requireNonNull(referenceName);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DataFlowReferenceResponse build() {
            return new DataFlowReferenceResponse(datasetParameters, parameters, referenceName, type);
        }
    }
}
