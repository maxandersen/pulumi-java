// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.outputs;

import com.pulumi.azurenative.streamanalytics.outputs.AzureMachineLearningWebServiceInputColumnResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureMachineLearningWebServiceInputsResponse {
    /**
     * @return A list of input columns for the Azure Machine Learning web service endpoint.
     * 
     */
    private final @Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames;
    /**
     * @return The name of the input. This is the name provided while authoring the endpoint.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private AzureMachineLearningWebServiceInputsResponse(
        @CustomType.Parameter("columnNames") @Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames,
        @CustomType.Parameter("name") @Nullable String name) {
        this.columnNames = columnNames;
        this.name = name;
    }

    /**
     * @return A list of input columns for the Azure Machine Learning web service endpoint.
     * 
     */
    public List<AzureMachineLearningWebServiceInputColumnResponse> columnNames() {
        return this.columnNames == null ? List.of() : this.columnNames;
    }
    /**
     * @return The name of the input. This is the name provided while authoring the endpoint.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceInputsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceInputsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnNames = defaults.columnNames;
    	      this.name = defaults.name;
        }

        public Builder columnNames(@Nullable List<AzureMachineLearningWebServiceInputColumnResponse> columnNames) {
            this.columnNames = columnNames;
            return this;
        }
        public Builder columnNames(AzureMachineLearningWebServiceInputColumnResponse... columnNames) {
            return columnNames(List.of(columnNames));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public AzureMachineLearningWebServiceInputsResponse build() {
            return new AzureMachineLearningWebServiceInputsResponse(columnNames, name);
        }
    }
}
