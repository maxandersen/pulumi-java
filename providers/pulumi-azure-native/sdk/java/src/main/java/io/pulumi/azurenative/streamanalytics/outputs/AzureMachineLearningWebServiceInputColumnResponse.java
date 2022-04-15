// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureMachineLearningWebServiceInputColumnResponse {
    /**
     * The (Azure Machine Learning supported) data type of the input column. A list of valid  Azure Machine Learning data types are described at https://msdn.microsoft.com/en-us/library/azure/dn905923.aspx .
     * 
     */
    private final @Nullable String dataType;
    /**
     * The zero based index of the function parameter this input maps to.
     * 
     */
    private final @Nullable Integer mapTo;
    /**
     * The name of the input column.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private AzureMachineLearningWebServiceInputColumnResponse(
        @CustomType.Parameter("dataType") @Nullable String dataType,
        @CustomType.Parameter("mapTo") @Nullable Integer mapTo,
        @CustomType.Parameter("name") @Nullable String name) {
        this.dataType = dataType;
        this.mapTo = mapTo;
        this.name = name;
    }

    /**
     * The (Azure Machine Learning supported) data type of the input column. A list of valid  Azure Machine Learning data types are described at https://msdn.microsoft.com/en-us/library/azure/dn905923.aspx .
     * 
    */
    public Optional<String> dataType() {
        return Optional.ofNullable(this.dataType);
    }
    /**
     * The zero based index of the function parameter this input maps to.
     * 
    */
    public Optional<Integer> mapTo() {
        return Optional.ofNullable(this.mapTo);
    }
    /**
     * The name of the input column.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceInputColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable Integer mapTo;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceInputColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.mapTo = defaults.mapTo;
    	      this.name = defaults.name;
        }

        public Builder dataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder mapTo(@Nullable Integer mapTo) {
            this.mapTo = mapTo;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public AzureMachineLearningWebServiceInputColumnResponse build() {
            return new AzureMachineLearningWebServiceInputColumnResponse(dataType, mapTo, name);
        }
    }
}
