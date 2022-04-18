// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.streamanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an output column for the Azure Machine Learning web service endpoint.
 * 
 */
public final class AzureMachineLearningWebServiceOutputColumnResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureMachineLearningWebServiceOutputColumnResponse Empty = new AzureMachineLearningWebServiceOutputColumnResponse();

    /**
     * The (Azure Machine Learning supported) data type of the output column. A list of valid  Azure Machine Learning data types are described at https://msdn.microsoft.com/en-us/library/azure/dn905923.aspx .
     * 
     */
    @Import(name="dataType")
      private final @Nullable String dataType;

    public Optional<String> dataType() {
        return this.dataType == null ? Optional.empty() : Optional.ofNullable(this.dataType);
    }

    /**
     * The name of the output column.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public AzureMachineLearningWebServiceOutputColumnResponse(
        @Nullable String dataType,
        @Nullable String name) {
        this.dataType = dataType;
        this.name = name;
    }

    private AzureMachineLearningWebServiceOutputColumnResponse() {
        this.dataType = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureMachineLearningWebServiceOutputColumnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dataType;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureMachineLearningWebServiceOutputColumnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataType = defaults.dataType;
    	      this.name = defaults.name;
        }

        public Builder dataType(@Nullable String dataType) {
            this.dataType = dataType;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public AzureMachineLearningWebServiceOutputColumnResponse build() {
            return new AzureMachineLearningWebServiceOutputColumnResponse(dataType, name);
        }
    }
}
